package Model;

import Controller.DatabaseManager;

import javax.xml.crypto.Data;
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


    private static PriceConfiguration single_instance = null;

    private PriceConfiguration() { } //singleton, make constructor private


    public static PriceConfiguration getInstance()
    {
        if (single_instance == null){
            if (DatabaseManager.loadPriceConfiguration() == null){
                return new PriceConfiguration();
            }else{
                return DatabaseManager.loadPriceConfiguration(); //loading price configuration stored in text file
            }
        }
        return single_instance;
    }



    public void setPublicHolidays(ArrayList<PublicHoliday> publicHolidays) {
        this.publicHolidays = publicHolidays;
        DatabaseManager.savePriceConfiguration(this);
    }

    public ArrayList<PublicHoliday> getPublicHolidays() {
        return publicHolidays;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
        DatabaseManager.savePriceConfiguration(this);
    }

    public double getPlatinumBasePrice() {
        return platinumBasePrice;
    }

    public void setPlatinumBasePrice(double platinumBasePrice) {
        this.platinumBasePrice = platinumBasePrice;
        DatabaseManager.savePriceConfiguration(this);
    }

    public double getGoldBasePrice() {
        return goldBasePrice;
    }

    public void setGoldBasePrice(double goldBasePrice) {
        this.goldBasePrice = goldBasePrice;
        DatabaseManager.savePriceConfiguration(this);
    }

    public double getWeekendIncrement() {
        return weekendIncrement;
    }

    public void setWeekendIncrement(double weekendIncrement) {
        this.weekendIncrement = weekendIncrement;
        DatabaseManager.savePriceConfiguration(this);
    }

    public double getPublicHolidayIncrement() {
        return publicHolidayIncrement;
    }

    public void setPublicHolidayIncrement(double publicHolidayIncrement) {
        this.publicHolidayIncrement = publicHolidayIncrement;
        DatabaseManager.savePriceConfiguration(this);
    }

    public double getThreeDMovieIncrement() {
        return threeDMovieIncrement;
    }

    public void setThreeDMovieIncrement(double threeDMovieIncrement) {
        this.threeDMovieIncrement = threeDMovieIncrement;
        DatabaseManager.savePriceConfiguration(this);
    }

    public double getBlockbusterMovieIncrement() {
        return blockbusterMovieIncrement;
    }

    public void setBlockbusterMovieIncrement(double blockbusterMovieIncrement) {
        this.blockbusterMovieIncrement = blockbusterMovieIncrement;
        DatabaseManager.savePriceConfiguration(this);
    }

    public double getChildPercentageOff() {
        return childPercentageOff;
    }

    public void setChildPercentageOff(double childPercentageOff) {
        this.childPercentageOff = childPercentageOff;
        DatabaseManager.savePriceConfiguration(this);
    }

    public double getSeniorCitizenPercentageOff() {
        return seniorCitizenPercentageOff;
    }

    public void setSeniorCitizenPercentageOff(double seniorCitizenPercentageOff) {
        this.seniorCitizenPercentageOff = seniorCitizenPercentageOff;
        DatabaseManager.savePriceConfiguration(this);
    }

    public double getGstPercentageIncrease() {
        return gstPercentageIncrease;
    }

    public void setGstPercentageIncrease(double gstPercentageIncrease) {
        this.gstPercentageIncrease = gstPercentageIncrease;
        DatabaseManager.savePriceConfiguration(this);
    }
}
