package Model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;

public class PriceConfiguration implements Serializable {


    private ArrayList<PublicHoliday> publicHolidays = new ArrayList<>();

    private double basePrice = 9;
    private double platinumBasePrice = 15;
    private double goldBasePrice = 20;

    private double weekendIncrement = 3;
    private double publicHolidayIncrement = 6;

    private double threeDMovieIncrement = 3;
    private double blockbusterMovieIncrement = 5;


    private double childPercentageOff = 0.5;
    private double seniorCitizenPercentageOff = 0.6; //this means 0.6 of the original price, meaning 40% discount

    private double gstPercentageIncrease = 0.07;


    public void setPublicHolidays(ArrayList<PublicHoliday> publicHolidays) {
        this.publicHolidays = publicHolidays;
    }

    public ArrayList<PublicHoliday> getPublicHolidays() {
        return publicHolidays;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public double getPlatinumBasePrice() {
        return platinumBasePrice;
    }

    public void setPlatinumBasePrice(double platinumBasePrice) {
        this.platinumBasePrice = platinumBasePrice;
    }

    public double getGoldBasePrice() {
        return goldBasePrice;
    }

    public void setGoldBasePrice(double goldBasePrice) {
        this.goldBasePrice = goldBasePrice;
    }

    public double getWeekendIncrement() {
        return weekendIncrement;
    }

    public void setWeekendIncrement(double weekendIncrement) {
        this.weekendIncrement = weekendIncrement;
    }

    public double getPublicHolidayIncrement() {
        return publicHolidayIncrement;
    }

    public void setPublicHolidayIncrement(double publicHolidayIncrement) {
        this.publicHolidayIncrement = publicHolidayIncrement;
    }

    public double getThreeDMovieIncrement() {
        return threeDMovieIncrement;
    }

    public void setThreeDMovieIncrement(double threeDMovieIncrement) {
        this.threeDMovieIncrement = threeDMovieIncrement;
    }

    public double getBlockbusterMovieIncrement() {
        return blockbusterMovieIncrement;
    }

    public void setBlockbusterMovieIncrement(double blockbusterMovieIncrement) {
        this.blockbusterMovieIncrement = blockbusterMovieIncrement;
    }

    public double getChildPercentageOff() {
        return childPercentageOff;
    }

    public void setChildPercentageOff(double childPercentageOff) {
        this.childPercentageOff = childPercentageOff;
    }

    public double getSeniorCitizenPercentageOff() {
        return seniorCitizenPercentageOff;
    }

    public void setSeniorCitizenPercentageOff(double seniorCitizenPercentageOff) {
        this.seniorCitizenPercentageOff = seniorCitizenPercentageOff;
    }

    public double getGstPercentageIncrease() {
        return gstPercentageIncrease;
    }

    public void setGstPercentageIncrease(double gstPercentageIncrease) {
        this.gstPercentageIncrease = gstPercentageIncrease;
    }
}
