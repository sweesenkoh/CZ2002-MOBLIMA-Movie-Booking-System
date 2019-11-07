package Model;
import java.util.ArrayList;


public class Cineplex {
    private String cineplexName;
    private ArrayList<Cinema> cinemas;


    public Cineplex(String cineplexName, ArrayList<Cinema> cinemaList){
        this.cineplexName = cineplexName;
        this.cinemas = new ArrayList<>();
    }
    
    public String getName() {
		return cineplexName;
	}
	
	public void setName(String n) {
		cineplexName = n;
	}
	
	public ArrayList<Cinema> getCinemas(){
		return cinemas;
	}


}
