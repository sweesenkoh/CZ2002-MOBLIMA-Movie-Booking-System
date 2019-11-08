package Model;
import java.io.Serializable;
import java.util.ArrayList;


public class Cineplex implements Serializable {
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

	public void addCinema(Cinema cinema){
    	this.cinemas.add(cinema);
	}


}
