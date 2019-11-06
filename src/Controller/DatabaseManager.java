package Controller;

import java.util.ArrayList;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import Model.Movie;

public class DatabaseManager {
	
	//probably need to handle the case where if file is not found, we need to create file automatically
	
	public static void insertMovieToDataBase(Movie movie){
		try {
			ArrayList<Movie> movies = retrieveAllMovies();
			movies.add(movie);
			ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("Movies.txt"));
			output.writeObject(movies);
		} catch (Exception e) {
			System.out.println("Error occured while trying to save to database, try again later");
		}
	}
	
	public static ArrayList<Movie> retrieveAllMovies(){
		try {
			ObjectInputStream input = new ObjectInputStream(new FileInputStream("Movies.txt"));
			ArrayList<Movie> movies = new ArrayList<Movie>();
		    movies = (ArrayList<Movie>) input.readObject();
			return movies;
		} catch (Exception e) {
			System.out.println("Error occured while trying to retrieve movies from database, try again later");
			return (new ArrayList<Movie>());
		}
		
	}

}
