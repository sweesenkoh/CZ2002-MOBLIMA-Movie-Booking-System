package Controller;

import Model.*;
import com.sun.xml.internal.ws.api.ha.StickyFeature;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Date;

import static Model.CinemaClass.NORMAL;

public class TicketPriceManager {

    //next time need to fetch from database
    private static PriceConfiguration priceConfiguration = new PriceConfiguration();


    //factors:
    //age
    //cinema class
    //day of week
    //type of movie


    public static double calculateTicketPrice(Ticket ticket){

        double finalPrice = 0.0;
        //the order of applying these factors matters!
        finalPrice = applyCinemaClassFactor(ticket.getShowtime().getCinema().getCinemaClass());

        finalPrice = applyDayOfWeekOrPHFactor(finalPrice,ticket.getShowtime().getShowDatetime().toLocalDate());
        finalPrice = applyMovieTypeFactor(finalPrice,ticket.getShowtime().getMovieType());

        finalPrice = applyAgeFactor(finalPrice,ticket.getTicketType());
        return finalPrice;
    }


    private static double applyCinemaClassFactor(CinemaClass cinemaClass){

        switch (cinemaClass){
            case NORMAL:
                return priceConfiguration.getBasePrice();
            case PLATINUM:
                return priceConfiguration.getPlatinumBasePrice();
            case GOLD:
                return priceConfiguration.getGoldBasePrice();
            default:
                return priceConfiguration.getBasePrice();
        }
    }

    private static double applyDayOfWeekOrPHFactor(double price, LocalDate date){

        //first check whether is in public holiday
        for (PublicHoliday ph:priceConfiguration.getPublicHolidays()){
            if (ph.getDate().isEqual(date)){
                return price + priceConfiguration.getPublicHolidayIncrement();
            }
        }

        //if not in public holiday, check if is in weekend
        if ((date.getDayOfWeek() == DayOfWeek.SATURDAY) || (date.getDayOfWeek() == DayOfWeek.SUNDAY)){
            return price + priceConfiguration.getWeekendIncrement();
        }

        return price;
    }

    private static double applyMovieTypeFactor(double price, MovieType movieType){

        switch (movieType){
            case NORMAL:
                return price;
            case THREED:
                return price + priceConfiguration.getThreeDMovieIncrement();
            case BLOCKBUSTER:
                return price + priceConfiguration.getBlockbusterMovieIncrement();
            default:
                return price;
        }
    }

    private static double applyAgeFactor(double price,TicketType ticketType){

        switch (ticketType){
            case ADULT:
                return price;
            case CHILD:
                return price * priceConfiguration.getChildPercentageOff();
            case SENIORCITIZEN:
                return price * priceConfiguration.getSeniorCitizenPercentageOff();
            default:
                return price;
        }
    }


    //this is for the order
    public static double applyGSTFactor(double price){
        return (price + price * priceConfiguration.getGstPercentageIncrease());
    }
}
