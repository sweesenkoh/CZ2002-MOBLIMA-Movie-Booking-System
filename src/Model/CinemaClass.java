package Model;

import java.io.Serializable;

public enum CinemaClass implements Serializable {
		NORMAL("Normal"),
		GOLD("Gold"),
		PLATINUM("Platinum");

	    private String className;

	    CinemaClass(String className) {
	        this.className = className;
	    }
	    public String getClassName() { return className; }

	    public double getBasePrice(){
			switch (this){
				case NORMAL:
					return PriceConfiguration.getInstance().getBasePrice();
				case PLATINUM:
					return PriceConfiguration.getInstance().getPlatinumBasePrice();
				case GOLD:
					return PriceConfiguration.getInstance().getGoldBasePrice();
				default:
					return PriceConfiguration.getInstance().getBasePrice();
			}
		}
}
