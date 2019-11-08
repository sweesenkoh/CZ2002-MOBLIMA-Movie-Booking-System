package Controller;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import Model.AdminUser;
import Model.Cineplex;
import Model.Movie;

public class DatabaseManager {
	
	//probably need to handle the case where if file is not found, we need to create file automatically
	
	public static void saveMovieToDataBase(Movie movie){
		try {
			ArrayList<Movie> movies = retrieveAllMovies();
			movies.add(movie);
			ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("Movies.txt"));
			output.writeObject(movies);
		} catch (Exception e) {
			System.out.println("Error occured while trying to save to database, try again later");
		}
	}

	public static void overwriteMoviesDatabaseWithMovies(ArrayList<Movie> movies){
		try {
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
		}

		catch (FileNotFoundException ne){
			return (new ArrayList<Movie>());
		}

		catch (Exception e) {
			System.out.println("Error occured while trying to retrieve movies from database, try again later");
			return (new ArrayList<Movie>());
		}
	}
	
	public static void deleteMovieByName(String movieName){
		try{
			ArrayList<Movie> originalMovies = retrieveAllMovies();
			ArrayList<Movie> filteredMovies= (ArrayList<Movie>) originalMovies.stream().filter(movie -> !movie.getTitle().equals(movieName)).collect(Collectors.toList());
			overwriteMoviesDatabaseWithMovies(filteredMovies);
		}catch(Exception e){
			System.out.println("Error occured while trying to delete from database, try again later");
		}
	}
	
	public static void modifyMovieWithNewValues(Movie movie) {
		try{
			deleteMovieByName(movie.getTitle());
			saveMovieToDataBase(movie);
		}catch(Exception e){
			System.out.println("Error occured while trying to save to database, try again later");
		}
	}





	//admin user

	public static void saveNewAdminUser(AdminUser adminUser){
		try {
			ArrayList<AdminUser> adminUsers = retrieveAllAdminUsers();

			boolean userIsAlreadyIn = false;

			for (AdminUser adminUserObj:adminUsers){
				if (adminUserObj.equals(adminUser)){
					System.out.println("User already in the system");
					break;
				}
			}
			if (!userIsAlreadyIn) {
				adminUsers.add(adminUser);
				ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("AdminUsers.txt"));
				output.writeObject(adminUsers);
			}
		} catch (Exception e) {
			System.out.println("Error occured while trying to save admin user to database, try again later");
		}
	}

	public static ArrayList<AdminUser> retrieveAllAdminUsers(){
		try {
			ObjectInputStream input = new ObjectInputStream(new FileInputStream("AdminUsers.txt"));
			ArrayList<AdminUser> adminUsers = new ArrayList<AdminUser>();
			adminUsers = (ArrayList<AdminUser>) input.readObject();
			return adminUsers;

		} catch (FileNotFoundException fileE){
			return (new ArrayList<AdminUser>());
		}

		catch (Exception e) {
			System.out.println("Error occured while trying to retrieve admin users from database, try again later");
			return (new ArrayList<AdminUser>());
		}
	}



	//Storing cineplexes

	public static void saveCineplexes(ArrayList<Cineplex> cineplexes){
		try {
			ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("Cineplexes.txt"));
			output.writeObject(cineplexes);

		} catch (Exception e) {
			System.out.println("Error occured while trying to save cineplexes to database, try again later");
		}
	}

	public static ArrayList<Cineplex> retrieveAllCineplexes(){
		try {
			ObjectInputStream input = new ObjectInputStream(new FileInputStream("Cineplexes.txt"));
			ArrayList<Cineplex> cineplexes = new ArrayList<Cineplex>();
			cineplexes = (ArrayList<Cineplex>) input.readObject();
			return cineplexes;

		} catch (FileNotFoundException fileE){
			return (new ArrayList<Cineplex>());
		}

		catch (Exception e) {
			System.out.println("Error occured while trying to retrieve cineplexes from database, try again later");
			return (new ArrayList<Cineplex>());
		}
	}
}
