package Model;

import java.util.ArrayList;
public class Cineplex {
	private String cineplex;
	private ArrayList<Cinema> cinemas;
	
	public Cineplex(String name, ArrayList<Cinema> cinemaList) {
		cineplex = name;
		cinemas = cinemaList;
	}
	
	public String getName() {
		return cineplex;
	}
	
	public void setName(String n) {
		cineplex = n;
	}
	
	public ArrayList<Cinema> getCinemas(){
		return cinemas;
	}
	
	
}
