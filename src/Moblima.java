
//import Model.SeatLayout;
import java.time.LocalDateTime;
import java.util.ArrayList;


import Model.*;

import Controller.DatabaseManager;
import Controller.IOManager;
import Controller.ViewNavigator;
import Model.MovieStatus;
import View.MainMenuView;

import javax.xml.crypto.Data;

public class Moblima {

	public static void main(String[] args) {
		
//		DatabaseManager.overwriteMoviesDatabaseWithMovies(new ArrayList<Movie>());
//	DatabaseManager.saveMovieToDataBase(new Movie("AvatarEnded11",MovieStatus.ENDED));
//		DatabaseManager.saveMovieToDataBase(new Movie("AvatarEnded12",MovieStatus.ENDED));
//		DatabaseManager.saveMovieToDataBase(new Movie("AvatarEnded13",MovieStatus.ENDED));

//		DatabaseManager.saveNewAdminUser(new AdminUser("admin","admin"));2

		ViewNavigator.pushView(new MainMenuView());
//
//		SeatLayout seatLayout = new SeatLayout(10,19, new Seat[] {
//				new Seat(0,0),
//				new Seat(0,1),
//				new Seat(0,17),
//				new Seat(0,18)
//		});
////
//		SeatLayout seatLayout2 = new SeatLayout(10,19, new Seat[] {
//				new Seat(0,0),
//				new Seat(0,17)
//		});
//		seatLayout.printSeatLayout();
//
//		Cineplex cineplex = new Cineplex("NTU Cineplex",new ArrayList<>());
//
//		Cinema cinema1 = new Cinema(cineplex,CinemaClass.NORMAL,1,seatLayout);
//		Cinema cinema2 = new Cinema(cineplex,CinemaClass.GOLD,2,seatLayout2);
//		cineplex.addCinema(cinema1);
//		cineplex.addCinema(cinema2);
//
//		cineplex.getCinemas().get(0).getLayout().printSeatLayout();
//
//		Movie tempMovie = DatabaseManager.retrieveAllMovies().get(0);
//
//		Showtime showtime = new Showtime(LocalDateTime.of(2019,12,2,10,20),tempMovie,cinema1,MovieType.NORMAL);
//
//		if (showtime.getSeatLayout().getSeat(4,1) != null){
//			showtime.getSeatLayout().getSeat(4,1).bookSeat();
//		}
//
//		Showtime showtime2 = new Showtime(LocalDateTime.of(2019,12,2,12,20),tempMovie,cinema2,MovieType.THREED);
//
//		if (showtime2.getSeatLayout().getSeat(4,5) != null){
//			showtime2.getSeatLayout().getSeat(4,6).bookSeat();
//		}
//
//		showtime.getSeatLayout().printSeatLayout();
//
//		cinema1.addShowTime(showtime);
//		cinema2.addShowTime(showtime2);
//
//		cineplex.getCinemas().get(0).getLayout().printSeatLayout();
//
//		Ticket ticket = new Ticket(new Seat(3,4),showtime,TicketType.CHILD);
//		System.out.println(ticket.getPrice());
//
//		ArrayList<Cineplex> cineplexes = new ArrayList<>();
//		cineplexes.add(cineplex);
//		DatabaseManager.saveCineplexes(cineplexes);

//		ArrayList<Cineplex> cineplexes = DatabaseManager.retrieveAllCineplexes();
//		cineplexes.get(0).getCinemas().get(0).getLayout().printSeatLayout();

		//create a bunch of cineplex
		//for each cineplex, insert a bunch of cinemas
		//write code for saving and retrieving using array of cineplex
		//write a io function to get LocalDate
		//write a io function to get LocalDateTime



	}

}
