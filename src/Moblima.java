
//import Model.SeatLayout;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Random;


import Model.*;

import Controller.DatabaseManager;
import Controller.IOManager;
import Controller.ViewNavigator;
import Model.MovieStatus;
import View.MainMenuView;

import javax.xml.crypto.Data;

public class Moblima {

	public static void main(String[] args) {
		

//		DatabaseManager.saveNewAdminUser(new AdminUser("admin","admin"));

		ViewNavigator.pushView(new MainMenuView());
		//generateDatabase();






	}

	public static void generateDatabase(){


		Movie movie_avatar = new Movie("Avatar",MovieStatus.ENDED);
		movie_avatar.setDirector("James Cameron");
		movie_avatar.setSynopsis("Jake, a paraplegic marine, replaces his brother on the Na'vi inhabited Pandora for a corporate mission. He is accepted by the natives as one of their own but he must decide where his loyalties lie.");
		movie_avatar.addCast("Zoe Zaldana");
		movie_avatar.addCast("Sam Worthington");

		for (int x = 1; x < 20 ; x++){
			double random = 1 + Math.random() * (5 - 1);
			movie_avatar.addReview(new Review("ReviewerName " + x,random,"This is the content number : " + x));
		}

		DatabaseManager.saveMovieToDataBase(movie_avatar);



		Movie movie_joker = new Movie("Joker",MovieStatus.ENDED);
		movie_joker.setDirector("Todd Philips");
		movie_joker.setSynopsis("Forever alone in a crowd, failed comedian Arthur Fleck seeks connection as he walks the streets of Gotham City. Arthur wears two masks -- the one he paints for his day job as a clown, and the guise he projects in a futile attempt to feel like he's part of the world around him. Isolated, bullied and disregarded by society, Fleck begins a slow descent into madness as he transforms into the criminal mastermind known as the Joker.");
		movie_joker.addCast("Joaquin Phoenix");
		movie_joker.addCast("Zazie Beetz");

		for (int x = 1; x < 20 ; x++){
			double random = 1 + Math.random() * (5 - 1);
			movie_joker.addReview(new Review("ReviewerName " + x,random,"This is the content number : " + x + " reviewing for " + movie_joker.getTitle()));
		}
		DatabaseManager.saveMovieToDataBase(movie_joker);






		Movie movie_midway = new Movie("Midway",MovieStatus.NOWSHOWING);
		movie_midway.setDirector("Roland Emmerich");
		movie_midway.setSynopsis("US soldiers and pilots change the course of World War II during the Battle of Midway in June 1942. The US and Imperial Japanese naval forces fought for four days.");
		movie_midway.addCast("Luke Evans");
		movie_midway.addCast("Patrick Wilson");

		for (int x = 1; x < 20 ; x++){
			double random = 1 + Math.random() * (5 - 1);
			movie_midway.addReview(new Review("ReviewerName " + x,random,"This is the content number : " + x + " reviewing for " + movie_midway.getTitle()));
		}

		DatabaseManager.saveMovieToDataBase(movie_midway);






		Movie movie_terminator = new Movie("Terminator: Dark Fate",MovieStatus.NOWSHOWING);
		movie_terminator.setDirector("Tim Miller");
		movie_terminator.setSynopsis("In Mexico City, a newly modified liquid Terminator -- the Rev-9 model -- arrives from the future to kill a young factory worker named Dani Ramos. Also sent back in time is Grace, a hybrid cyborg human who must protect Ramos from the seemingly indestructible robotic assassin. But the two women soon find some much-needed help from a pair of unexpected allies -- seasoned warrior Sarah Connor and the T-800 Terminator.");
		movie_terminator.addCast("Linda Hamilton");
		movie_terminator.addCast("Gabriel Luna");

		for (int x = 1; x < 20 ; x++){
			double random = 1 + Math.random() * (5 - 1);
			movie_terminator.addReview(new Review("ReviewerName " + x,random,"This is the content number : " + x + " reviewing for " + movie_terminator.getTitle()));
		}

		DatabaseManager.saveMovieToDataBase(movie_terminator);




		Movie movie_thegoodliar = new Movie("The Good Liar",MovieStatus.PREVIEW);
		movie_thegoodliar.setDirector("Bill Condon");
		movie_thegoodliar.setSynopsis("Career con artist Roy Courtnay can hardly believe his luck when he meets well-to-do widow Betty McLeish online. As Betty opens her life and home to him, Roy is surprised to find himself caring about her, turning what should be a cut-and-dry swindle into the most treacherous tightrope walk of his life.");
		movie_thegoodliar.addCast("Ian Mckellen");
		movie_thegoodliar.addCast("Helen Miren");

		for (int x = 1; x < 20 ; x++){
			double random = 1 + Math.random() * (5 - 1);
			movie_thegoodliar.addReview(new Review("ReviewerName " + x,random,"This is the content number : " + x + " reviewing for " + movie_thegoodliar.getTitle()));
		}

		DatabaseManager.saveMovieToDataBase(movie_thegoodliar);




		Movie movie_21Bridges = new Movie("21 Bridges",MovieStatus.PREVIEW);
		movie_21Bridges.setDirector("Bill Condon");
		movie_21Bridges.setSynopsis("After uncovering a massive conspiracy, an embattled NYPD detective joins a citywide manhunt for two young cop killers. As the night unfolds, he soon becomes unsure of who to pursue -- and who's in pursuit of him. When the search intensifies, authorities decide to take extreme measures by closing all of Manhattan's 21 bridges to prevent the suspects from escaping.");
		movie_21Bridges.addCast("Chadwick Boseman");
		movie_21Bridges.addCast("Taylor Kitsch");

		for (int x = 1; x < 20 ; x++){
			double random = 1 + Math.random() * (5 - 1);
			movie_21Bridges.addReview(new Review("ReviewerName " + x,random,"This is the content number : " + x + " reviewing for " + movie_21Bridges.getTitle()));
		}

		DatabaseManager.saveMovieToDataBase(movie_21Bridges);



		Movie movie_frozen2 = new Movie("Frozen 2",MovieStatus.COMINGSOON);
		movie_frozen2.setDirector("Jennifer Lee");
		movie_frozen2.setSynopsis("Elsa the Snow Queen and her sister Anna embark on an adventure far away from the kingdom of Arendelle. They are joined by friends, Kristoff, Olaf, and Sven.");
		movie_frozen2.addCast("Kristen Bell");
		movie_frozen2.addCast("Josh Gad");

		for (int x = 1; x < 20 ; x++){
			double random = 1 + Math.random() * (5 - 1);
			movie_frozen2.addReview(new Review("ReviewerName " + x,random,"This is the content number : " + x + " reviewing for " + movie_frozen2.getTitle()));
		}

		DatabaseManager.saveMovieToDataBase(movie_frozen2);




		Movie movie_darkwaters = new Movie("Dark Waters",MovieStatus.COMINGSOON);
		movie_darkwaters.setDirector("Todd Haynes");
		movie_darkwaters.setSynopsis("A tenacious attorney uncovers a dark secret that connects a growing number of unexplained deaths to one of the world's largest corporations. While trying to expose the truth, he soon finds himself risking his future, his family and his own life");
		movie_darkwaters.addCast("Mark Ruffalo");
		movie_darkwaters.addCast("Anne Hathaway");

		for (int x = 1; x < 20 ; x++){
			double random = 1 + Math.random() * (5 - 1);
			movie_darkwaters.addReview(new Review("ReviewerName " + x,random,"This is the content number : " + x + " reviewing for " + movie_darkwaters.getTitle()));
		}

		DatabaseManager.saveMovieToDataBase(movie_darkwaters);



		//generate Bishan Cineplex
		//it has 9 cinemas, 1- 3 small, gold class, 4 - 6 medium - platinum, 7 - 9 - big, normal

		SeatLayout bishanSeatLayout_Small = new SeatLayout(10,12, new Seat[] {
				new Seat(0,0),
				new Seat(0,11)
		});
//
		SeatLayout bishanSeatLayout_Medium = new SeatLayout(12,16, new Seat[] {
				new Seat(11,8),
				new Seat(11,7)
		});

		SeatLayout bishanSeatLayout_Large = new SeatLayout(15,20, new Seat[] {
				new Seat(0,0),
				new Seat(0,1),
				new Seat(0,19),
				new Seat(0,18),
				new Seat(1,0),
				new Seat(1,19)
		});

		Cineplex bishan_cineplex = new Cineplex("Bishan Cineplex",new ArrayList<>());

		Cinema bishancinema1 = new Cinema(bishan_cineplex,CinemaClass.GOLD,1,bishanSeatLayout_Small);
		Cinema bishancinema2 = new Cinema(bishan_cineplex,CinemaClass.GOLD,2,bishanSeatLayout_Small);
		Cinema bishancinema3 = new Cinema(bishan_cineplex,CinemaClass.GOLD,3,bishanSeatLayout_Small);

		Cinema bishancinema4 = new Cinema(bishan_cineplex,CinemaClass.PLATINUM,4,bishanSeatLayout_Medium);
		Cinema bishancinema5 = new Cinema(bishan_cineplex,CinemaClass.PLATINUM,5,bishanSeatLayout_Medium);
		Cinema bishancinema6 = new Cinema(bishan_cineplex,CinemaClass.PLATINUM,6,bishanSeatLayout_Medium);

		Cinema bishancinema7 = new Cinema(bishan_cineplex,CinemaClass.NORMAL,7,bishanSeatLayout_Large);
		Cinema bishancinema8 = new Cinema(bishan_cineplex,CinemaClass.NORMAL,8,bishanSeatLayout_Large);
		Cinema bishancinema9 = new Cinema(bishan_cineplex,CinemaClass.NORMAL,9,bishanSeatLayout_Large);

		bishan_cineplex.addCinema(bishancinema1);
		bishan_cineplex.addCinema(bishancinema2);
		bishan_cineplex.addCinema(bishancinema3);
		bishan_cineplex.addCinema(bishancinema4);
		bishan_cineplex.addCinema(bishancinema5);
		bishan_cineplex.addCinema(bishancinema6);
		bishan_cineplex.addCinema(bishancinema7);
		bishan_cineplex.addCinema(bishancinema8);
		bishan_cineplex.addCinema(bishancinema9);


		Cineplex jurongeast_cineplex = new Cineplex("Jurong East Cineplex",new ArrayList<>());

		Cinema jurongeastcinema1 = new Cinema(jurongeast_cineplex,CinemaClass.GOLD,1,bishanSeatLayout_Small); //i use back the same layout, too lazy
		Cinema jurongeastcinema2 = new Cinema(jurongeast_cineplex,CinemaClass.GOLD,2,bishanSeatLayout_Small);
		Cinema jurongeastcinema3 = new Cinema(jurongeast_cineplex,CinemaClass.GOLD,3,bishanSeatLayout_Medium);
		Cinema jurongeastcinema4 = new Cinema(jurongeast_cineplex,CinemaClass.PLATINUM,4,bishanSeatLayout_Medium);
		Cinema jurongeastcinema5 = new Cinema(jurongeast_cineplex,CinemaClass.PLATINUM,5,bishanSeatLayout_Large);
		Cinema jurongeastcinema6 = new Cinema(jurongeast_cineplex,CinemaClass.PLATINUM,6,bishanSeatLayout_Large);


		jurongeast_cineplex.addCinema(jurongeastcinema1);
		jurongeast_cineplex.addCinema(jurongeastcinema2);
		jurongeast_cineplex.addCinema(jurongeastcinema3);
		jurongeast_cineplex.addCinema(jurongeastcinema4);
		jurongeast_cineplex.addCinema(jurongeastcinema5);
		jurongeast_cineplex.addCinema(jurongeastcinema6);


		Cineplex bedok_cineplex = new Cineplex("Bedok Cineplex",new ArrayList<>());

		Cinema bedokcinema1 = new Cinema(bedok_cineplex,CinemaClass.GOLD,1,bishanSeatLayout_Small); //i use back the same layout, too lazy
		Cinema bedokcinema2 = new Cinema(bedok_cineplex,CinemaClass.GOLD,2,bishanSeatLayout_Small);
		Cinema bedokcinema3 = new Cinema(bedok_cineplex,CinemaClass.GOLD,3,bishanSeatLayout_Medium);
		Cinema bedokcinema4 = new Cinema(bedok_cineplex,CinemaClass.PLATINUM,4,bishanSeatLayout_Medium);
		Cinema bedokcinema5 = new Cinema(bedok_cineplex,CinemaClass.PLATINUM,5,bishanSeatLayout_Large);
		Cinema bedokcinema6 = new Cinema(bedok_cineplex,CinemaClass.PLATINUM,6,bishanSeatLayout_Large);


		bedok_cineplex.addCinema(bedokcinema1);
		bedok_cineplex.addCinema(bedokcinema2);
		bedok_cineplex.addCinema(bedokcinema3);
		bedok_cineplex.addCinema(bedokcinema4);
		bedok_cineplex.addCinema(bedokcinema5);
		bedok_cineplex.addCinema(bedokcinema6);



		ArrayList<Movie> allMovies = new ArrayList<>();
		allMovies.add(movie_21Bridges);
		allMovies.add(movie_avatar);
		allMovies.add(movie_darkwaters);
		allMovies.add(movie_frozen2);
		allMovies.add(movie_joker);
		allMovies.add(movie_midway);
		allMovies.add(movie_terminator);
		allMovies.add(movie_thegoodliar);







		/////////////////////////////////////////////// Add Showtime here ///////////////////////////////////////////////
		//adding showtime

		Showtime showtime = new Showtime(LocalDateTime.of(year,month,day,hour,minute),moviename,cinemanamevariable,MovieTypeEnumChooseOne);
		cinemanamevariable.addShowTime(showtime);  //need to add to the same cinema


		//only add showtime for those movies that are in now showing or preview
		//use the movies variable created above
		
		//example:
		Showtime showtime1 = new Showtime(LocalDateTime.of(2019,12,3,20,30),movie_avatar,bishancinema1,MovieType.THREED);
		bishancinema1.addShowTime(showtime1);
		//this two line is adding one showtime


		//1. Adding showtime for bishan cineplex



		//2. Adding showtime for jurongeast cineplex



		//3. Adding showtime for bedok cineplex


	///////////////////////////////////////////////////////////////////////////////////////////////////////////////







		ArrayList<Cineplex> cineplexes = new ArrayList<>();
		cineplexes.add(bishan_cineplex);
		cineplexes.add(jurongeast_cineplex);
		cineplexes.add(bedok_cineplex);
		DatabaseManager.saveCineplexes(cineplexes);









		//ignore this code, was trying to randomly generate showtime but failed


//		int increment = 0;
//		int hour = 17;
//		for (int x = 15 ; x < 30 ; x++){
//			for (int y = 0 ; y < 2 ; y++){
//				Random random = new Random();
//				int randomNum= random.nextInt(8 + 0 - 1) + 0;
//				Cinema chosenCinema = bishan_cineplex.getCinemas().get(randomNum);
//				for (Movie movie : allMovies){
//					if (movie.getStatus() == MovieStatus.PREVIEW){
//						int randomNumber = random.nextInt(3 + 1 - 1) + 1;
//						MovieType movieType;
//						if (randomNumber == 1){
//							movieType = MovieType.NORMAL;
//						}else if (randomNumber == 2){
//							movieType = MovieType.THREED;
//						}else{
//							movieType = MovieType.BLOCKBUSTER;
//						}
//						int minute = (increment * 20) % 60;
//						hour += (increment % 3 == 0 ? 1 : 0);
//						System.out.println(hour);
//						Showtime showtime = new Showtime(LocalDateTime.of(2019,12,x,hour,minute),movie,chosenCinema,movieType);
//						chosenCinema.addShowTime(showtime);
//						increment++;
//						if (hour > 22) {hour = 17;}
//					}
//				}
//			}
//		}

	}

}
