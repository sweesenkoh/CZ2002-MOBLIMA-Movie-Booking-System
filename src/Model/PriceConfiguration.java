package Model;

import java.time.LocalDate;
import java.util.ArrayList;

public class PriceConfiguration {


    private ArrayList<PublicHoliday> publicHolidays = new ArrayList<>();

    private double basePrice = 9;
    private double platinumBasePrice = 15;
    private double goldBasePrice = 20;

    private double weekendIncrement = 3;
    private double publicHolidayIncrement = 6;

    private double threeDMovieIncrement = 3;
    private double blockbusterMovieIncrement = 5;


    private double childPercentageOff = 0.5;
    private double seniorCitizenPercentageOff = 0.6;


    public void setPublicHolidays(ArrayList<PublicHoliday> publicHolidays) {
        this.publicHolidays = publicHolidays;
    }

    public ArrayList<PublicHoliday> getPublicHolidays() {
        return publicHolidays;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public double getPlatinumBasePrice() {
        return platinumBasePrice;
    }

    public double getGoldBasePrice() {
        return goldBasePrice;
    }

    public double getWeekendIncrement() {
        return weekendIncrement;
    }

    public double getPublicHolidayIncrement() {
        return publicHolidayIncrement;
    }

    public double getThreeDMovieIncrement() {
        return threeDMovieIncrement;
    }

    public double getBlockbusterMovieIncrement() {
        return blockbusterMovieIncrement;
    }

    public double getChildPercentageOff() {
        return childPercentageOff;
    }

    public double getSeniorCitizenPercentageOff() {
        return seniorCitizenPercentageOff;
    }
}
