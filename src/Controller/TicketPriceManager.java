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

//        finalPrice = applyAgeFactor(finalPrice,ticket.getTicketType());
        finalPrice = applyAgeFactor(finalPrice,ticket);
        return finalPrice;
    }


    private static double applyCinemaClassFactor(CinemaClass cinemaClass){
        return cinemaClass.getBasePrice();
//        switch (cinemaClass){
//            case NORMAL:
//                return PriceConfiguration.getInstance().getBasePrice();
//            case PLATINUM:
//                return PriceConfiguration.getInstance().getPlatinumBasePrice();
//            case GOLD:
//                return PriceConfiguration.getInstance().getGoldBasePrice();
//            default:
//                return PriceConfiguration.getInstance().getBasePrice();
//        }
    }

    private static double applyDayOfWeekOrPHFactor(double price, LocalDate date){

        //first check whether is in public holiday
        for (PublicHoliday ph:PriceConfiguration.getInstance().getPublicHolidays()){
            if (ph.getDate().isEqual(date)){
                return price + PriceConfiguration.getInstance().getPublicHolidayIncrement();
            }
        }

        //if not in public holiday, check if is in weekend
        if ((date.getDayOfWeek() == DayOfWeek.SATURDAY) || (date.getDayOfWeek() == DayOfWeek.SUNDAY)){
            return price + PriceConfiguration.getInstance().getWeekendIncrement();
        }

        return price;
    }

    private static double applyMovieTypeFactor(double price, MovieType movieType){

        return price + movieType.getPriceIncrement();

//        switch (movieType){
//            case NORMAL:
//                return price;
//            case THREED:
//                return price + PriceConfiguration.getInstance().getThreeDMovieIncrement();
//            case BLOCKBUSTER:
//                return price + PriceConfiguration.getInstance().getBlockbusterMovieIncrement();
//            default:
//                return price;
//        }
    }
//
//    private static double applyAgeFactor(double price,TicketType ticketType){
//
//        switch (ticketType){
//            case ADULT:
//                return price;
//            case CHILD:
//                return price * DatabaseManager.loadPriceConfiguration().getChildPercentageOff();
//            case SENIORCITIZEN:
//                return price * DatabaseManager.loadPriceConfiguration().getSeniorCitizenPercentageOff();
//            default:
//                return price;
//        }
//    }


    private static double applyAgeFactor(double price,Ticket ticket){
        return price*ticket.getFractionalCostOutOfOriginal();
    }


    //this is for the order
    public static double applyGSTFactor(double price){
        return (price + price * DatabaseManager.loadPriceConfiguration().getGstPercentageIncrease());
    }
}
