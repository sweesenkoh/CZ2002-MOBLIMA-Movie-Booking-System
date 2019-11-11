package Controller;

import Model.*;

import java.time.DayOfWeek;
import java.time.LocalDate;


public class TicketPriceManager {

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
                return DatabaseManager.loadPriceConfiguration().getBasePrice();
            case PLATINUM:
                return DatabaseManager.loadPriceConfiguration().getPlatinumBasePrice();
            case GOLD:
                return DatabaseManager.loadPriceConfiguration().getGoldBasePrice();
            default:
                return DatabaseManager.loadPriceConfiguration().getBasePrice();
        }
    }

    private static double applyDayOfWeekOrPHFactor(double price, LocalDate date){

        //first check whether is in public holiday
        for (PublicHoliday ph:DatabaseManager.loadPriceConfiguration().getPublicHolidays()){
            if (ph.getDate().isEqual(date)){
                return price + DatabaseManager.loadPriceConfiguration().getPublicHolidayIncrement();
            }
        }

        //if not in public holiday, check if is in weekend
        if ((date.getDayOfWeek() == DayOfWeek.SATURDAY) || (date.getDayOfWeek() == DayOfWeek.SUNDAY)){
            return price + DatabaseManager.loadPriceConfiguration().getWeekendIncrement();
        }

        return price;
    }

    private static double applyMovieTypeFactor(double price, MovieType movieType){

        switch (movieType){
            case NORMAL:
                return price;
            case THREED:
                return price + DatabaseManager.loadPriceConfiguration().getThreeDMovieIncrement();
            case BLOCKBUSTER:
                return price + DatabaseManager.loadPriceConfiguration().getBlockbusterMovieIncrement();
            default:
                return price;
        }
    }

    private static double applyAgeFactor(double price,TicketType ticketType){

        switch (ticketType){
            case ADULT:
                return price;
            case CHILD:
                return price * DatabaseManager.loadPriceConfiguration().getChildPercentageOff();
            case SENIORCITIZEN:
                return price * DatabaseManager.loadPriceConfiguration().getSeniorCitizenPercentageOff();
            default:
                return price;
        }
    }


    //this is for the order
    public static double applyGSTFactor(double price){
        return (price + price * DatabaseManager.loadPriceConfiguration().getGstPercentageIncrease());
    }
}
