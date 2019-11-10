
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
	//	generateAdminUsersToDatabase();
		ViewNavigator.pushView(new MainMenuView());
	   // generateDatabase();






	}

	public static void generateAdminUsersToDatabase(){
		AdminUser adminUser = new AdminUser("admin","admin");
		DatabaseManager.saveNewAdminUser(adminUser);
	}

	public static void generateDatabase(){


		Movie movie_avatar = new Movie("Avatar",MovieStatus.ENDED,MovieCensorshipRating.PG13);
		movie_avatar.setDirector("James Cameron");
		movie_avatar.setSynopsis("Jake, a paraplegic marine, replaces his brother on the Na'vi inhabited Pandora for a corporate mission. He is accepted by the natives as one of their own but he must decide where his loyalties lie.");
		movie_avatar.addCast("Zoe Zaldana");
		movie_avatar.addCast("Sam Worthington");

		for (int x = 1; x < 20 ; x++){
			double random = 1 + Math.random() * (5 - 1);
			movie_avatar.addReview(new Review("ReviewerName " + x,random,"This is the content number : " + x));
		}

		DatabaseManager.saveMovieToDataBase(movie_avatar);



		Movie movie_joker = new Movie("Joker",MovieStatus.ENDED,MovieCensorshipRating.PG13);
		movie_joker.setDirector("Todd Philips");
		movie_joker.setSynopsis("Forever alone in a crowd, failed comedian Arthur Fleck seeks connection as he walks the streets of Gotham City. Arthur wears two masks -- the one he paints for his day job as a clown, and the guise he projects in a futile attempt to feel like he's part of the world around him. Isolated, bullied and disregarded by society, Fleck begins a slow descent into madness as he transforms into the criminal mastermind known as the Joker.");
		movie_joker.addCast("Joaquin Phoenix");
		movie_joker.addCast("Zazie Beetz");

		for (int x = 1; x < 20 ; x++){
			double random = 1 + Math.random() * (5 - 1);
			movie_joker.addReview(new Review("ReviewerName " + x,random,"This is the content number : " + x + " reviewing for " + movie_joker.getTitle()));
		}
		DatabaseManager.saveMovieToDataBase(movie_joker);






		Movie movie_midway = new Movie("Midway",MovieStatus.NOWSHOWING,MovieCensorshipRating.PG);
		movie_midway.setDirector("Roland Emmerich");
		movie_midway.setSynopsis("US soldiers and pilots change the course of World War II during the Battle of Midway in June 1942. The US and Imperial Japanese naval forces fought for four days.");
		movie_midway.addCast("Luke Evans");
		movie_midway.addCast("Patrick Wilson");

		for (int x = 1; x < 20 ; x++){
			double random = 1 + Math.random() * (5 - 1);
			movie_midway.addReview(new Review("ReviewerName " + x,random,"This is the content number : " + x + " reviewing for " + movie_midway.getTitle()));
		}

		DatabaseManager.saveMovieToDataBase(movie_midway);






		Movie movie_terminator = new Movie("Terminator: Dark Fate",MovieStatus.NOWSHOWING,MovieCensorshipRating.PG13);
		movie_terminator.setDirector("Tim Miller");
		movie_terminator.setSynopsis("In Mexico City, a newly modified liquid Terminator -- the Rev-9 model -- arrives from the future to kill a young factory worker named Dani Ramos. Also sent back in time is Grace, a hybrid cyborg human who must protect Ramos from the seemingly indestructible robotic assassin. But the two women soon find some much-needed help from a pair of unexpected allies -- seasoned warrior Sarah Connor and the T-800 Terminator.");
		movie_terminator.addCast("Linda Hamilton");
		movie_terminator.addCast("Gabriel Luna");

		for (int x = 1; x < 20 ; x++){
			double random = 1 + Math.random() * (5 - 1);
			movie_terminator.addReview(new Review("ReviewerName " + x,random,"This is the content number : " + x + " reviewing for " + movie_terminator.getTitle()));
		}

		DatabaseManager.saveMovieToDataBase(movie_terminator);




		Movie movie_thegoodliar = new Movie("The Good Liar",MovieStatus.PREVIEW,MovieCensorshipRating.M18);
		movie_thegoodliar.setDirector("Bill Condon");
		movie_thegoodliar.setSynopsis("Career con artist Roy Courtnay can hardly believe his luck when he meets well-to-do widow Betty McLeish online. As Betty opens her life and home to him, Roy is surprised to find himself caring about her, turning what should be a cut-and-dry swindle into the most treacherous tightrope walk of his life.");
		movie_thegoodliar.addCast("Ian Mckellen");
		movie_thegoodliar.addCast("Helen Miren");

		for (int x = 1; x < 20 ; x++){
			double random = 1 + Math.random() * (5 - 1);
			movie_thegoodliar.addReview(new Review("ReviewerName " + x,random,"This is the content number : " + x + " reviewing for " + movie_thegoodliar.getTitle()));
		}

		DatabaseManager.saveMovieToDataBase(movie_thegoodliar);




		Movie movie_21Bridges = new Movie("21 Bridges",MovieStatus.PREVIEW,MovieCensorshipRating.PG);
		movie_21Bridges.setDirector("Bill Condon");
		movie_21Bridges.setSynopsis("After uncovering a massive conspiracy, an embattled NYPD detective joins a citywide manhunt for two young cop killers. As the night unfolds, he soon becomes unsure of who to pursue -- and who's in pursuit of him. When the search intensifies, authorities decide to take extreme measures by closing all of Manhattan's 21 bridges to prevent the suspects from escaping.");
		movie_21Bridges.addCast("Chadwick Boseman");
		movie_21Bridges.addCast("Taylor Kitsch");

		for (int x = 1; x < 20 ; x++){
			double random = 1 + Math.random() * (5 - 1);
			movie_21Bridges.addReview(new Review("ReviewerName " + x,random,"This is the content number : " + x + " reviewing for " + movie_21Bridges.getTitle()));
		}

		DatabaseManager.saveMovieToDataBase(movie_21Bridges);



		Movie movie_frozen2 = new Movie("Frozen 2",MovieStatus.COMINGSOON,MovieCensorshipRating.G);
		movie_frozen2.setDirector("Jennifer Lee");
		movie_frozen2.setSynopsis("Elsa the Snow Queen and her sister Anna embark on an adventure far away from the kingdom of Arendelle. They are joined by friends, Kristoff, Olaf, and Sven.");
		movie_frozen2.addCast("Kristen Bell");
		movie_frozen2.addCast("Josh Gad");

//		for (int x = 1; x < 20 ; x++){
//			double random = 1 + Math.random() * (5 - 1);
//			movie_frozen2.addReview(new Review("ReviewerName " + x,random,"This is the content number : " + x + " reviewing for " + movie_frozen2.getTitle()));
//		}

		DatabaseManager.saveMovieToDataBase(movie_frozen2);




		Movie movie_darkwaters = new Movie("Dark Waters",MovieStatus.COMINGSOON,MovieCensorshipRating.PG);
		movie_darkwaters.setDirector("Todd Haynes");
		movie_darkwaters.setSynopsis("A tenacious attorney uncovers a dark secret that connects a growing number of unexplained deaths to one of the world's largest corporations. While trying to expose the truth, he soon finds himself risking his future, his family and his own life");
		movie_darkwaters.addCast("Mark Ruffalo");
		movie_darkwaters.addCast("Anne Hathaway");

//		for (int x = 1; x < 20 ; x++){
//			double random = 1 + Math.random() * (5 - 1);
//			movie_darkwaters.addReview(new Review("ReviewerName " + x,random,"This is the content number : " + x + " reviewing for " + movie_darkwaters.getTitle()));
//		}

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

//		Showtime showtime = new Showtime(LocalDateTime.of(year,month,day,hour,minute),moviename,cinemanamevariable,MovieTypeEnumChooseOne);
//		cinemanamevariable.addShowTime(showtime);  //need to add to the same cinema
//

		//only add showtime for those movies that are in now showing or preview
		//use the movies variable created above
		
		//example:
//		Showtime showtime1 = new Showtime(LocalDateTime.of(2019,12,3,20,30),movie_avatar,bishancinema1,MovieType.THREED);
//		bishancinema1.addShowTime(showtime1);
		//this two line is adding one showtime


//only add showtime for those movies that are in now showing or preview
		//use the movies variable created above



		//1. Adding showtime for bishan cineplex


		//////////////////////////////////////////////    15/11 	//////////////////////////////////////////////////////
		//BishanCinema1(Midway) 15/11
		Showtime showtime1 = new Showtime(LocalDateTime.of(2019,11,15,10,00),movie_midway,bishancinema1,MovieType.THREED);
		Showtime showtime2 = new Showtime(LocalDateTime.of(2019,11,15,12,30),movie_midway,bishancinema1,MovieType.NORMAL);
		Showtime showtime3 = new Showtime(LocalDateTime.of(2019,11,15,15,30),movie_midway,bishancinema1,MovieType.NORMAL);
		Showtime showtime4 = new Showtime(LocalDateTime.of(2019,11,15,17,00),movie_midway,bishancinema1,MovieType.NORMAL);
		Showtime showtime5 = new Showtime(LocalDateTime.of(2019,11,15,19,30),movie_midway,bishancinema1,MovieType.THREED);
		bishancinema1.addShowTime(showtime1);
		bishancinema1.addShowTime(showtime2);
		bishancinema1.addShowTime(showtime3);
		bishancinema1.addShowTime(showtime4);
		bishancinema1.addShowTime(showtime5);

		//BishanCinema2(Terminator) 15/11
		Showtime showtime6 = new Showtime(LocalDateTime.of(2019,11,15,10,00),movie_terminator,bishancinema2,MovieType.BLOCKBUSTER);
		Showtime showtime7 = new Showtime(LocalDateTime.of(2019,11,15,12,30),movie_terminator,bishancinema2,MovieType.BLOCKBUSTER);
		Showtime showtime8 = new Showtime(LocalDateTime.of(2019,11,15,15,30),movie_terminator,bishancinema2,MovieType.BLOCKBUSTER);
		Showtime showtime9 = new Showtime(LocalDateTime.of(2019,11,15,17,30),movie_terminator,bishancinema2,MovieType.BLOCKBUSTER);
		Showtime showtime10 = new Showtime(LocalDateTime.of(2019,11,15,20,00),movie_terminator,bishancinema2,MovieType.BLOCKBUSTER);
		bishancinema2.addShowTime(showtime6);
		bishancinema2.addShowTime(showtime7);
		bishancinema2.addShowTime(showtime8);
		bishancinema2.addShowTime(showtime9);
		bishancinema2.addShowTime(showtime10);

		//BishanCinema3(thegoodliar) 15/11
		Showtime showtime11 = new Showtime(LocalDateTime.of(2019,11,15,9,00),movie_thegoodliar,bishancinema3,MovieType.NORMAL);
		Showtime showtime12 = new Showtime(LocalDateTime.of(2019,11,15,10,30),movie_thegoodliar,bishancinema3,MovieType.NORMAL);
		Showtime showtime13 = new Showtime(LocalDateTime.of(2019,11,15,13,30),movie_thegoodliar,bishancinema3,MovieType.NORMAL);
		Showtime showtime14 = new Showtime(LocalDateTime.of(2019,11,15,16,00),movie_thegoodliar,bishancinema3,MovieType.NORMAL);
		Showtime showtime15 = new Showtime(LocalDateTime.of(2019,11,15,20,00),movie_thegoodliar,bishancinema3,MovieType.THREED);
		bishancinema3.addShowTime(showtime11);
		bishancinema3.addShowTime(showtime12);
		bishancinema3.addShowTime(showtime13);
		bishancinema3.addShowTime(showtime14);
		bishancinema3.addShowTime(showtime15);

		//BishanCinema4(terminator) 15/11
		Showtime showtime16 = new Showtime(LocalDateTime.of(2019,11,15,9,30),movie_terminator,bishancinema4,MovieType.BLOCKBUSTER);
		Showtime showtime17 = new Showtime(LocalDateTime.of(2019,11,15,11,30),movie_terminator,bishancinema4,MovieType.BLOCKBUSTER);
		Showtime showtime18 = new Showtime(LocalDateTime.of(2019,11,15,13,30),movie_terminator,bishancinema4,MovieType.BLOCKBUSTER);
		Showtime showtime19 = new Showtime(LocalDateTime.of(2019,11,15,16,00),movie_terminator,bishancinema4,MovieType.BLOCKBUSTER);
		Showtime showtime20 = new Showtime(LocalDateTime.of(2019,11,15,20,00),movie_terminator,bishancinema4,MovieType.BLOCKBUSTER);
		bishancinema4.addShowTime(showtime16);
		bishancinema4.addShowTime(showtime17);
		bishancinema4.addShowTime(showtime18);
		bishancinema4.addShowTime(showtime19);
		bishancinema4.addShowTime(showtime20);

		//BishanCinema5(midway) 15/11
		Showtime showtime21 = new Showtime(LocalDateTime.of(2019,11,15,9,30),movie_midway,bishancinema5,MovieType.BLOCKBUSTER);
		Showtime showtime22 = new Showtime(LocalDateTime.of(2019,11,15,11,30),movie_midway,bishancinema5,MovieType.BLOCKBUSTER);
		Showtime showtime23 = new Showtime(LocalDateTime.of(2019,11,15,13,30),movie_midway,bishancinema5,MovieType.BLOCKBUSTER);
		Showtime showtime24 = new Showtime(LocalDateTime.of(2019,11,15,16,00),movie_midway,bishancinema5,MovieType.BLOCKBUSTER);
		Showtime showtime25 = new Showtime(LocalDateTime.of(2019,11,15,21,00),movie_midway,bishancinema5,MovieType.BLOCKBUSTER);
		bishancinema5.addShowTime(showtime21);
		bishancinema5.addShowTime(showtime22);
		bishancinema5.addShowTime(showtime23);
		bishancinema5.addShowTime(showtime24);
		bishancinema5.addShowTime(showtime25);

		//BishanCinema6(thegoodliar) 15/11
		Showtime showtime26 = new Showtime(LocalDateTime.of(2019,11,15,10,00),movie_thegoodliar,bishancinema6,MovieType.NORMAL);
		Showtime showtime27 = new Showtime(LocalDateTime.of(2019,11,15,12,30),movie_thegoodliar,bishancinema6,MovieType.NORMAL);
		Showtime showtime28 = new Showtime(LocalDateTime.of(2019,11,15,14,30),movie_thegoodliar,bishancinema6,MovieType.THREED);
		Showtime showtime29 = new Showtime(LocalDateTime.of(2019,11,15,16,00),movie_thegoodliar,bishancinema6,MovieType.THREED);
		Showtime showtime30 = new Showtime(LocalDateTime.of(2019,11,15,21,00),movie_thegoodliar,bishancinema6,MovieType.NORMAL);
		bishancinema6.addShowTime(showtime26);
		bishancinema6.addShowTime(showtime27);
		bishancinema6.addShowTime(showtime28);
		bishancinema6.addShowTime(showtime29);
		bishancinema6.addShowTime(showtime30);

		//BishanCinema7(midway) 15/11
		Showtime showtime31 = new Showtime(LocalDateTime.of(2019,11,15,10,00),movie_midway,bishancinema7,MovieType.NORMAL);
		Showtime showtime32 = new Showtime(LocalDateTime.of(2019,11,15,12,30),movie_midway,bishancinema7,MovieType.NORMAL);
		Showtime showtime33 = new Showtime(LocalDateTime.of(2019,11,15,14,30),movie_midway,bishancinema7,MovieType.THREED);
		Showtime showtime34 = new Showtime(LocalDateTime.of(2019,11,15,16,00),movie_midway,bishancinema7,MovieType.THREED);
		Showtime showtime35 = new Showtime(LocalDateTime.of(2019,11,15,21,00),movie_midway,bishancinema7,MovieType.NORMAL);
		bishancinema7.addShowTime(showtime31);
		bishancinema7.addShowTime(showtime32);
		bishancinema7.addShowTime(showtime33);
		bishancinema7.addShowTime(showtime34);
		bishancinema7.addShowTime(showtime35);

		////BishanCinema8(midway) 15/11
		Showtime showtime36 = new Showtime(LocalDateTime.of(2019,11,15,10,00),movie_midway,bishancinema8,MovieType.NORMAL);
		Showtime showtime37 = new Showtime(LocalDateTime.of(2019,11,15,12,30),movie_midway,bishancinema8,MovieType.NORMAL);
		Showtime showtime38 = new Showtime(LocalDateTime.of(2019,11,15,14,30),movie_midway,bishancinema8,MovieType.THREED);
		Showtime showtime39 = new Showtime(LocalDateTime.of(2019,11,15,16,00),movie_midway,bishancinema8,MovieType.THREED);
		Showtime showtime40 = new Showtime(LocalDateTime.of(2019,11,15,21,00),movie_midway,bishancinema8,MovieType.NORMAL);
		bishancinema8.addShowTime(showtime36);
		bishancinema8.addShowTime(showtime37);
		bishancinema8.addShowTime(showtime38);
		bishancinema8.addShowTime(showtime39);
		bishancinema8.addShowTime(showtime40);

		//BishanCinema9(terminator) 15/11
		Showtime showtime41 = new Showtime(LocalDateTime.of(2019,11,15,9,30),movie_terminator,bishancinema9,MovieType.BLOCKBUSTER);
		Showtime showtime42 = new Showtime(LocalDateTime.of(2019,11,15,11,30),movie_terminator,bishancinema9,MovieType.BLOCKBUSTER);
		Showtime showtime43 = new Showtime(LocalDateTime.of(2019,11,15,13,30),movie_terminator,bishancinema9,MovieType.BLOCKBUSTER);
		Showtime showtime44 = new Showtime(LocalDateTime.of(2019,11,15,16,00),movie_terminator,bishancinema9,MovieType.BLOCKBUSTER);
		Showtime showtime45 = new Showtime(LocalDateTime.of(2019,11,15,20,00),movie_terminator,bishancinema9,MovieType.BLOCKBUSTER);
		bishancinema9.addShowTime(showtime41);
		bishancinema9.addShowTime(showtime42);
		bishancinema9.addShowTime(showtime43);
		bishancinema9.addShowTime(showtime44);
		bishancinema9.addShowTime(showtime45);

		//////////////////////////////////////////////		16/11 	//////////////////////////////////////////////////////

		//BishanCinema1(Midway) 16/11
		Showtime showtime46 = new Showtime(LocalDateTime.of(2019,11,16,10,00),movie_midway,bishancinema1,MovieType.THREED);
		Showtime showtime47= new Showtime(LocalDateTime.of(2019,11,16,17,30),movie_midway,bishancinema2,MovieType.NORMAL);
		Showtime showtime48 = new Showtime(LocalDateTime.of(2019,11,16,15,30),movie_midway,bishancinema3,MovieType.NORMAL);
		bishancinema1.addShowTime(showtime46);
		bishancinema2.addShowTime(showtime47);
		bishancinema3.addShowTime(showtime48);

		//BishanCinema2(terminator) 16/11

		Showtime showtime49 = new Showtime(LocalDateTime.of(2019,11,16,10,00),movie_terminator,bishancinema4,MovieType.BLOCKBUSTER);
		Showtime showtime50 = new Showtime(LocalDateTime.of(2019,11,16,15,30),movie_terminator,bishancinema5,MovieType.BLOCKBUSTER);
		Showtime showtime51 = new Showtime(LocalDateTime.of(2019,11,16,18,30),movie_terminator,bishancinema6,MovieType.BLOCKBUSTER);
		bishancinema4.addShowTime(showtime49);
		bishancinema5.addShowTime(showtime50);
		bishancinema6.addShowTime(showtime51);

		//BishanCinema3(thegoodliar) 16/11

		Showtime showtime52 = new Showtime(LocalDateTime.of(2019,11,16,9,00),movie_thegoodliar,bishancinema7,MovieType.NORMAL);
		Showtime showtime53 = new Showtime(LocalDateTime.of(2019,11,16,16,30),movie_thegoodliar,bishancinema8,MovieType.NORMAL);
		Showtime showtime54 = new Showtime(LocalDateTime.of(2019,11,16,17,30),movie_thegoodliar,bishancinema9,MovieType.NORMAL);

		bishancinema7.addShowTime(showtime52);
		bishancinema8.addShowTime(showtime53);
		bishancinema9.addShowTime(showtime54);

		//////////////////////////////////////////////      17/11 	//////////////////////////////////////////////////////

		//BishanCinema1(Midway) 17/11
		Showtime showtime55 = new Showtime(LocalDateTime.of(2019,11,17,9,00),movie_midway,bishancinema1,MovieType.THREED);
		Showtime showtime56= new Showtime(LocalDateTime.of(2019,11,17,15,30),movie_midway,bishancinema2,MovieType.NORMAL);
		Showtime showtime57 = new Showtime(LocalDateTime.of(2019,11,17,15,30),movie_midway,bishancinema3,MovieType.NORMAL);
		bishancinema1.addShowTime(showtime55);
		bishancinema2.addShowTime(showtime56);
		bishancinema3.addShowTime(showtime57);

		//BishanCinema2(terminator) 17/11

		Showtime showtime58 = new Showtime(LocalDateTime.of(2019,11,17,10,00),movie_terminator,bishancinema4,MovieType.BLOCKBUSTER);
		Showtime showtime59 = new Showtime(LocalDateTime.of(2019,11,17,14,30),movie_terminator,bishancinema5,MovieType.BLOCKBUSTER);
		Showtime showtime60 = new Showtime(LocalDateTime.of(2019,11,17,18,30),movie_terminator,bishancinema6,MovieType.BLOCKBUSTER);
		bishancinema4.addShowTime(showtime58);
		bishancinema5.addShowTime(showtime59);
		bishancinema6.addShowTime(showtime60);

		//BishanCinema6(thegoodliar) 17/11

		Showtime showtime61 = new Showtime(LocalDateTime.of(2019,11,17,9,00),movie_thegoodliar,bishancinema7,MovieType.NORMAL);
		Showtime showtime62 = new Showtime(LocalDateTime.of(2019,11,17,16,30),movie_thegoodliar,bishancinema8,MovieType.NORMAL);
		Showtime showtime63 = new Showtime(LocalDateTime.of(2019,11,17,17,30),movie_thegoodliar,bishancinema9,MovieType.NORMAL);

		bishancinema7.addShowTime(showtime61);
		bishancinema8.addShowTime(showtime62);
		bishancinema9.addShowTime(showtime63);

		//////////////////////////////////////////////      18/11 	//////////////////////////////////////////////////////

		//bishancinema1(midway) 18/11
		Showtime showtime64 = new Showtime(LocalDateTime.of(2019,11,18,9,00),movie_midway,bishancinema1,MovieType.THREED);
		Showtime showtime65= new Showtime(LocalDateTime.of(2019,11,18,15,30),movie_midway,bishancinema2,MovieType.NORMAL);
		Showtime showtime66 = new Showtime(LocalDateTime.of(2019,11,18,15,30),movie_midway,bishancinema3,MovieType.NORMAL);
		bishancinema1.addShowTime(showtime64);
		bishancinema2.addShowTime(showtime65);
		bishancinema3.addShowTime(showtime66);

		//BishanCinema4(terminator) 18/11

		Showtime showtime67 = new Showtime(LocalDateTime.of(2019,11,18,10,00),movie_terminator,bishancinema4,MovieType.BLOCKBUSTER);
		Showtime showtime68 = new Showtime(LocalDateTime.of(2019,11,18,16,30),movie_terminator,bishancinema5,MovieType.BLOCKBUSTER);
		Showtime showtime69 = new Showtime(LocalDateTime.of(2019,11,18,18,30),movie_terminator,bishancinema6,MovieType.BLOCKBUSTER);
		bishancinema4.addShowTime(showtime67);
		bishancinema5.addShowTime(showtime68);
		bishancinema6.addShowTime(showtime69);

		//BishanCinema8(thegoodliar) 18/11

		Showtime showtime70 = new Showtime(LocalDateTime.of(2019,11,18,9,00),movie_thegoodliar,bishancinema7,MovieType.NORMAL);
		Showtime showtime71 = new Showtime(LocalDateTime.of(2019,11,18,16,30),movie_thegoodliar,bishancinema8,MovieType.NORMAL);
		Showtime showtime72 = new Showtime(LocalDateTime.of(2019,11,18,17,30),movie_thegoodliar,bishancinema9,MovieType.NORMAL);

		bishancinema7.addShowTime(showtime70);
		bishancinema8.addShowTime(showtime71);
		bishancinema9.addShowTime(showtime72);

		//////////////////////////////////////////////     19/11 	//////////////////////////////////////////////////////

		//BishanCinema1(midway) 19/11
		Showtime showtime73 = new Showtime(LocalDateTime.of(2019,11,19,9,00),movie_midway,bishancinema1,MovieType.THREED);
		Showtime showtime74= new Showtime(LocalDateTime.of(2019,11,19,14,30),movie_midway,bishancinema2,MovieType.NORMAL);
		Showtime showtime75 = new Showtime(LocalDateTime.of(2019,11,19,21,30),movie_midway,bishancinema3,MovieType.NORMAL);
		bishancinema1.addShowTime(showtime73);
		bishancinema2.addShowTime(showtime74);
		bishancinema3.addShowTime(showtime75);

		//BishanCinema4(terminator) 19/11

		Showtime showtime76 = new Showtime(LocalDateTime.of(2019,11,19,10,00),movie_terminator,bishancinema4,MovieType.BLOCKBUSTER);
		Showtime showtime77 = new Showtime(LocalDateTime.of(2019,11,19,15,30),movie_terminator,bishancinema5,MovieType.BLOCKBUSTER);
		Showtime showtime78 = new Showtime(LocalDateTime.of(2019,11,19,18,30),movie_terminator,bishancinema6,MovieType.BLOCKBUSTER);
		bishancinema4.addShowTime(showtime76);
		bishancinema5.addShowTime(showtime77);
		bishancinema6.addShowTime(showtime78);

		//BishanCinema8(thegoodliar) 19/11

		Showtime showtime79 = new Showtime(LocalDateTime.of(2019,11,19,9,00),movie_thegoodliar,bishancinema7,MovieType.NORMAL);
		Showtime showtime80 = new Showtime(LocalDateTime.of(2019,11,19,10,30),movie_thegoodliar,bishancinema8,MovieType.NORMAL);
		Showtime showtime81 = new Showtime(LocalDateTime.of(2019,11,19,17,30),movie_thegoodliar,bishancinema9,MovieType.NORMAL);

		bishancinema7.addShowTime(showtime79);
		bishancinema8.addShowTime(showtime80);
		bishancinema9.addShowTime(showtime81);

		//////////////////////////////////////////////      20/11 	//////////////////////////////////////////////////////

		//BishanCinema1(midway) 20/11
		Showtime showtime82 = new Showtime(LocalDateTime.of(2019,11,20,9,00),movie_midway,bishancinema1,MovieType.THREED);
		Showtime showtime83= new Showtime(LocalDateTime.of(2019,11,20,14,30),movie_midway,bishancinema2,MovieType.NORMAL);
		Showtime showtime84 = new Showtime(LocalDateTime.of(2019,11,20,15,30),movie_midway,bishancinema3,MovieType.NORMAL);
		bishancinema1.addShowTime(showtime82);
		bishancinema2.addShowTime(showtime83);
		bishancinema3.addShowTime(showtime84);

		//BishanCinema4(terminator) 20/11

		Showtime showtime85 = new Showtime(LocalDateTime.of(2019,11,20,10,20),movie_terminator,bishancinema4,MovieType.BLOCKBUSTER);
		Showtime showtime86 = new Showtime(LocalDateTime.of(2019,11,20,14,30),movie_terminator,bishancinema5,MovieType.BLOCKBUSTER);
		Showtime showtime87 = new Showtime(LocalDateTime.of(2019,11,20,18,30),movie_terminator,bishancinema6,MovieType.BLOCKBUSTER);
		bishancinema4.addShowTime(showtime85);
		bishancinema5.addShowTime(showtime86);
		bishancinema6.addShowTime(showtime87);

		//BishanCinema6(thegoodliar) 20/11

		Showtime showtime88 = new Showtime(LocalDateTime.of(2019,11,20,9,00),movie_thegoodliar,bishancinema7,MovieType.NORMAL);
		Showtime showtime89 = new Showtime(LocalDateTime.of(2019,11,20,15,30),movie_thegoodliar,bishancinema8,MovieType.NORMAL);
		Showtime showtime90 = new Showtime(LocalDateTime.of(2019,11,20,22,30),movie_thegoodliar,bishancinema9,MovieType.NORMAL);
		bishancinema7.addShowTime(showtime88);
		bishancinema8.addShowTime(showtime89);
		bishancinema9.addShowTime(showtime90);

		/////////////////////////////////////////////    21/11  	////////////////////////////////////////////////////////////////

		//BishanCinema2(midway) 21/11
		Showtime showtime91 = new Showtime(LocalDateTime.of(2019,11,21,9,00),movie_midway,bishancinema1,MovieType.THREED);
		Showtime showtime92= new Showtime(LocalDateTime.of(2019,11,21,12,30),movie_midway,bishancinema2,MovieType.NORMAL);
		Showtime showtime93 = new Showtime(LocalDateTime.of(2019,11,21,23,30),movie_midway,bishancinema3,MovieType.NORMAL);
		bishancinema1.addShowTime(showtime91);
		bishancinema2.addShowTime(showtime92);
		bishancinema3.addShowTime(showtime93);

		//BishanCinema4(terminator) 21/11

		Showtime showtime94 = new Showtime(LocalDateTime.of(2019,11,21,10,00),movie_terminator,bishancinema4,MovieType.BLOCKBUSTER);
		Showtime showtime95 = new Showtime(LocalDateTime.of(2019,11,21,12,30),movie_terminator,bishancinema5,MovieType.BLOCKBUSTER);
		Showtime showtime96 = new Showtime(LocalDateTime.of(2019,11,21,21,30),movie_terminator,bishancinema6,MovieType.BLOCKBUSTER);
		bishancinema4.addShowTime(showtime94);
		bishancinema5.addShowTime(showtime95);
		bishancinema6.addShowTime(showtime96);

		//BishanCinema6(thegoodliar) 21/11

		Showtime showtime97 = new Showtime(LocalDateTime.of(2019,11,21,9,00),movie_thegoodliar,bishancinema7,MovieType.NORMAL);
		Showtime showtime98 = new Showtime(LocalDateTime.of(2019,11,21,10,30),movie_thegoodliar,bishancinema8,MovieType.NORMAL);
		Showtime showtime99 = new Showtime(LocalDateTime.of(2019,11,21,20,30),movie_thegoodliar,bishancinema9,MovieType.NORMAL);
		bishancinema7.addShowTime(showtime97);
		bishancinema8.addShowTime(showtime98);
		bishancinema9.addShowTime(showtime99);

		/////////////////////////////////////////////    22/11  	////////////////////////////////////////////////////////////////

		//BishanCinema2(midway) 22/11
		Showtime showtime100 = new Showtime(LocalDateTime.of(2019,11,22,9,00),movie_midway,bishancinema1,MovieType.THREED);
		Showtime showtime101= new Showtime(LocalDateTime.of(2019,11,22,12,30),movie_midway,bishancinema2,MovieType.NORMAL);
		Showtime showtime102 = new Showtime(LocalDateTime.of(2019,11,22,20,30),movie_midway,bishancinema3,MovieType.NORMAL);
		bishancinema1.addShowTime(showtime100);
		bishancinema2.addShowTime(showtime101);
		bishancinema3.addShowTime(showtime102);

		//BishanCinema4(terminator) 22/11

		Showtime showtime103 = new Showtime(LocalDateTime.of(2019,11,22,10,00),movie_terminator,bishancinema4,MovieType.BLOCKBUSTER);
		Showtime showtime104 = new Showtime(LocalDateTime.of(2019,11,22,12,30),movie_terminator,bishancinema5,MovieType.BLOCKBUSTER);
		Showtime showtime105 = new Showtime(LocalDateTime.of(2019,11,22,22,30),movie_terminator,bishancinema6,MovieType.BLOCKBUSTER);
		bishancinema4.addShowTime(showtime103);
		bishancinema5.addShowTime(showtime104);
		bishancinema6.addShowTime(showtime105);

		//BishanCinema6(thegoodliar) 22/11

		Showtime showtime106 = new Showtime(LocalDateTime.of(2019,11,22,9,00),movie_thegoodliar,bishancinema7,MovieType.NORMAL);
		Showtime showtime107 = new Showtime(LocalDateTime.of(2019,11,22,10,30),movie_thegoodliar,bishancinema8,MovieType.NORMAL);
		Showtime showtime108 = new Showtime(LocalDateTime.of(2019,11,22,21,30),movie_thegoodliar,bishancinema9,MovieType.NORMAL);
		bishancinema7.addShowTime(showtime106);
		bishancinema8.addShowTime(showtime107);
		bishancinema9.addShowTime(showtime108);

		/////////////////////////////////////////////    23/11  	////////////////////////////////////////////////////////////////

		//BishanCinema1(midway) 23/11
		Showtime showtime109 = new Showtime(LocalDateTime.of(2019,11,23,9,00),movie_midway,bishancinema1,MovieType.THREED);
		Showtime showtime110= new Showtime(LocalDateTime.of(2019,11,23,13,30),movie_midway,bishancinema2,MovieType.NORMAL);
		Showtime showtime111 = new Showtime(LocalDateTime.of(2019,11,23,15,30),movie_midway,bishancinema3,MovieType.NORMAL);
		bishancinema1.addShowTime(showtime109);
		bishancinema2.addShowTime(showtime110);
		bishancinema3.addShowTime(showtime111);

		//BishanCinema4(terminator) 23/11

		Showtime showtime112 = new Showtime(LocalDateTime.of(2019,11,23,10,00),movie_terminator,bishancinema4,MovieType.BLOCKBUSTER);
		Showtime showtime113 = new Showtime(LocalDateTime.of(2019,11,23,15,30),movie_terminator,bishancinema5,MovieType.BLOCKBUSTER);
		Showtime showtime114 = new Showtime(LocalDateTime.of(2019,11,23,18,30),movie_terminator,bishancinema6,MovieType.BLOCKBUSTER);
		bishancinema4.addShowTime(showtime112);
		bishancinema5.addShowTime(showtime113);
		bishancinema6.addShowTime(showtime114);

		//BishanCinema6(thegoodliar) 23/11

		Showtime showtime115 = new Showtime(LocalDateTime.of(2019,11,23,9,00),movie_thegoodliar,bishancinema7,MovieType.NORMAL);
		Showtime showtime116 = new Showtime(LocalDateTime.of(2019,11,23,15,30),movie_thegoodliar,bishancinema8,MovieType.NORMAL);
		Showtime showtime117 = new Showtime(LocalDateTime.of(2019,11,23,21,30),movie_thegoodliar,bishancinema9,MovieType.NORMAL);
		bishancinema7.addShowTime(showtime115);
		bishancinema8.addShowTime(showtime116);
		bishancinema9.addShowTime(showtime117);

		///////////////////////////////////////////////    24/11  	////////////////////////////////////////////////////////////////

		//BishanCinema1(midway) 24/11
		Showtime showtime118 = new Showtime(LocalDateTime.of(2019,11,24,9,00),movie_midway,bishancinema1,MovieType.THREED);
		Showtime showtime119 = new Showtime(LocalDateTime.of(2019,11,24,12,30),movie_midway,bishancinema2,MovieType.NORMAL);
		Showtime showtime120 = new Showtime(LocalDateTime.of(2019,11,24,19,30),movie_midway,bishancinema3,MovieType.NORMAL);
		bishancinema1.addShowTime(showtime118);
		bishancinema2.addShowTime(showtime119);
		bishancinema3.addShowTime(showtime120);

		//BishanCinema3(terminator) 24/11

		Showtime showtime121 = new Showtime(LocalDateTime.of(2019,11,24,10,00),movie_terminator,bishancinema4,MovieType.BLOCKBUSTER);
		Showtime showtime122 = new Showtime(LocalDateTime.of(2019,11,24,12,30),movie_terminator,bishancinema5,MovieType.BLOCKBUSTER);
		Showtime showtime123 = new Showtime(LocalDateTime.of(2019,11,24,19,30),movie_terminator,bishancinema6,MovieType.BLOCKBUSTER);
		bishancinema4.addShowTime(showtime121);
		bishancinema5.addShowTime(showtime122);
		bishancinema6.addShowTime(showtime123);

		//BishanCinema6(thegoodliar) 24/11

		Showtime showtime124 = new Showtime(LocalDateTime.of(2019,11,24,9,00),movie_thegoodliar,bishancinema7,MovieType.NORMAL);
		Showtime showtime125 = new Showtime(LocalDateTime.of(2019,11,24,10,30),movie_thegoodliar,bishancinema8,MovieType.NORMAL);
		Showtime showtime126 = new Showtime(LocalDateTime.of(2019,11,24,20,30),movie_thegoodliar,bishancinema9,MovieType.NORMAL);
		bishancinema7.addShowTime(showtime124);
		bishancinema8.addShowTime(showtime125);
		bishancinema9.addShowTime(showtime126);

		///////////////////////////////////////////////    25/11  	////////////////////////////////////////////////////////////////

		//BishanCinema1(midway) 25/11
		Showtime showtime127 = new Showtime(LocalDateTime.of(2019,11,25,9,00),movie_midway,bishancinema1,MovieType.THREED);
		Showtime showtime128 = new Showtime(LocalDateTime.of(2019,11,25,12,30),movie_midway,bishancinema2,MovieType.NORMAL);
		Showtime showtime129 = new Showtime(LocalDateTime.of(2019,11,25,21,30),movie_midway,bishancinema3,MovieType.NORMAL);
		bishancinema1.addShowTime(showtime127);
		bishancinema2.addShowTime(showtime128);
		bishancinema3.addShowTime(showtime129);

		//BishanCinema3(terminator) 25/11

		Showtime showtime130 = new Showtime(LocalDateTime.of(2019,11,25,10,00),movie_terminator,bishancinema4,MovieType.BLOCKBUSTER);
		Showtime showtime131 = new Showtime(LocalDateTime.of(2019,11,25,12,30),movie_terminator,bishancinema5,MovieType.BLOCKBUSTER);
		Showtime showtime132 = new Showtime(LocalDateTime.of(2019,11,25,18,30),movie_terminator,bishancinema6,MovieType.BLOCKBUSTER);
		bishancinema4.addShowTime(showtime130);
		bishancinema5.addShowTime(showtime131);
		bishancinema6.addShowTime(showtime132);

		//BishanCinema6(thegoodliar) 25/11

		Showtime showtime133 = new Showtime(LocalDateTime.of(2019,11,25,9,00),movie_thegoodliar,bishancinema7,MovieType.NORMAL);
		Showtime showtime134 = new Showtime(LocalDateTime.of(2019,11,25,17,30),movie_thegoodliar,bishancinema8,MovieType.NORMAL);
		Showtime showtime135 = new Showtime(LocalDateTime.of(2019,11,25,21,30),movie_thegoodliar,bishancinema9,MovieType.NORMAL);
		bishancinema7.addShowTime(showtime133);
		bishancinema8.addShowTime(showtime134);
		bishancinema9.addShowTime(showtime135);

		///////////////////////////////////////////////    26/11  	////////////////////////////////////////////////////////////////

		//BishanCinema1(midway) 26/11
		Showtime showtime136 = new Showtime(LocalDateTime.of(2019,11,26,9,00),movie_midway,bishancinema1,MovieType.THREED);
		Showtime showtime137 = new Showtime(LocalDateTime.of(2019,11,26,14,30),movie_midway,bishancinema2,MovieType.NORMAL);
		Showtime showtime138 = new Showtime(LocalDateTime.of(2019,11,26,16,30),movie_midway,bishancinema3,MovieType.NORMAL);
		bishancinema1.addShowTime(showtime136);
		bishancinema2.addShowTime(showtime137);
		bishancinema3.addShowTime(showtime138);

		//BishanCinema3(terminator) 26/11

		Showtime showtime139 = new Showtime(LocalDateTime.of(2019,11,26,10,00),movie_terminator,bishancinema4,MovieType.BLOCKBUSTER);
		Showtime showtime140 = new Showtime(LocalDateTime.of(2019,11,26,12,30),movie_terminator,bishancinema5,MovieType.BLOCKBUSTER);
		Showtime showtime141 = new Showtime(LocalDateTime.of(2019,11,26,15,30),movie_terminator,bishancinema6,MovieType.BLOCKBUSTER);
		bishancinema4.addShowTime(showtime139);
		bishancinema5.addShowTime(showtime140);
		bishancinema6.addShowTime(showtime141);

		//BishanCinema6(thegoodliar) 26/11

		Showtime showtime142 = new Showtime(LocalDateTime.of(2019,11,26,9,00),movie_thegoodliar,bishancinema7,MovieType.NORMAL);
		Showtime showtime143 = new Showtime(LocalDateTime.of(2019,11,26,15,20),movie_thegoodliar,bishancinema8,MovieType.NORMAL);
		Showtime showtime144 = new Showtime(LocalDateTime.of(2019,11,26,21,30),movie_thegoodliar,bishancinema9,MovieType.NORMAL);
		bishancinema7.addShowTime(showtime142);
		bishancinema8.addShowTime(showtime143);
		bishancinema9.addShowTime(showtime144);

		///////////////////////////////////////////////    27/11  	////////////////////////////////////////////////////////////////

		//BishanCinema1(midway) 27/11
		Showtime showtime145 = new Showtime(LocalDateTime.of(2019,11,27,9,00),movie_midway,bishancinema1,MovieType.THREED);
		Showtime showtime146 = new Showtime(LocalDateTime.of(2019,11,27,14,30),movie_midway,bishancinema2,MovieType.NORMAL);
		Showtime showtime147 = new Showtime(LocalDateTime.of(2019,11,27,18,30),movie_midway,bishancinema3,MovieType.NORMAL);
		bishancinema1.addShowTime(showtime145);
		bishancinema2.addShowTime(showtime146);
		bishancinema3.addShowTime(showtime147);

		//BishanCinema3(terminator) 27/11

		Showtime showtime148 = new Showtime(LocalDateTime.of(2019,11,27,9,40),movie_terminator,bishancinema4,MovieType.BLOCKBUSTER);
		Showtime showtime149 = new Showtime(LocalDateTime.of(2019,11,27,15,30),movie_terminator,bishancinema5,MovieType.BLOCKBUSTER);
		Showtime showtime150 = new Showtime(LocalDateTime.of(2019,11,27,18,30),movie_terminator,bishancinema6,MovieType.BLOCKBUSTER);
		bishancinema4.addShowTime(showtime148);
		bishancinema5.addShowTime(showtime149);
		bishancinema6.addShowTime(showtime150);

		//BishanCinema6(thegoodliar) 27/11

		Showtime showtime151 = new Showtime(LocalDateTime.of(2019,11,27,9,40),movie_thegoodliar,bishancinema7,MovieType.NORMAL);
		Showtime showtime152 = new Showtime(LocalDateTime.of(2019,11,27,10,30),movie_thegoodliar,bishancinema8,MovieType.NORMAL);
		Showtime showtime153 = new Showtime(LocalDateTime.of(2019,11,27,17,30),movie_thegoodliar,bishancinema9,MovieType.NORMAL);
		bishancinema7.addShowTime(showtime151);
		bishancinema8.addShowTime(showtime152);
		bishancinema9.addShowTime(showtime153);

		/////////////////////////////////////////////////    28/11  	////////////////////////////////////////////////////////////////

		//BishanCinema1(midway) 28/11
		Showtime showtime154 = new Showtime(LocalDateTime.of(2019,11,28,9,50),movie_midway,bishancinema1,MovieType.THREED);
		Showtime showtime155 = new Showtime(LocalDateTime.of(2019,11,28,13,30),movie_midway,bishancinema2,MovieType.NORMAL);
		Showtime showtime156 = new Showtime(LocalDateTime.of(2019,11,28,15,30),movie_midway,bishancinema3,MovieType.NORMAL);
		bishancinema1.addShowTime(showtime154);
		bishancinema2.addShowTime(showtime155);
		bishancinema3.addShowTime(showtime156);

		//BishanCinema3(terminator) 28/11

		Showtime showtime157 = new Showtime(LocalDateTime.of(2019,11,28,10,40),movie_terminator,bishancinema4,MovieType.BLOCKBUSTER);
		Showtime showtime158 = new Showtime(LocalDateTime.of(2019,11,28,15,30),movie_terminator,bishancinema5,MovieType.BLOCKBUSTER);
		Showtime showtime159 = new Showtime(LocalDateTime.of(2019,11,28,18,30),movie_terminator,bishancinema6,MovieType.BLOCKBUSTER);
		bishancinema4.addShowTime(showtime157);
		bishancinema5.addShowTime(showtime158);
		bishancinema6.addShowTime(showtime159);

		//BishanCinema6(thegoodliar) 28/11

		Showtime showtime160 = new Showtime(LocalDateTime.of(2019,11,28,9,00),movie_thegoodliar,bishancinema7,MovieType.NORMAL);
		Showtime showtime161 = new Showtime(LocalDateTime.of(2019,11,28,15,30),movie_thegoodliar,bishancinema8,MovieType.NORMAL);
		Showtime showtime162 = new Showtime(LocalDateTime.of(2019,11,28,16,30),movie_thegoodliar,bishancinema9,MovieType.NORMAL);
		bishancinema7.addShowTime(showtime160);
		bishancinema8.addShowTime(showtime161);
		bishancinema9.addShowTime(showtime162);

		//////////////////////////////////////////////////    29/11  	////////////////////////////////////////////////////////////////

		//BishanCinema1(midway) 29/11
		Showtime showtime163 = new Showtime(LocalDateTime.of(2019,11,29,9,00),movie_midway,bishancinema1,MovieType.THREED);
		Showtime showtime164 = new Showtime(LocalDateTime.of(2019,11,29,12,30),movie_midway,bishancinema2,MovieType.NORMAL);
		Showtime showtime165 = new Showtime(LocalDateTime.of(2019,11,29,20,30),movie_midway,bishancinema3,MovieType.NORMAL);
		bishancinema1.addShowTime(showtime163);
		bishancinema2.addShowTime(showtime164);
		bishancinema3.addShowTime(showtime165);

		//BishanCinema3(terminator) 29/11

		Showtime showtime166 = new Showtime(LocalDateTime.of(2019,11,29,10,00),movie_terminator,bishancinema4,MovieType.BLOCKBUSTER);
		Showtime showtime167 = new Showtime(LocalDateTime.of(2019,11,29,14,30),movie_terminator,bishancinema5,MovieType.BLOCKBUSTER);
		Showtime showtime168 = new Showtime(LocalDateTime.of(2019,11,29,18,30),movie_terminator,bishancinema6,MovieType.BLOCKBUSTER);
		bishancinema4.addShowTime(showtime166);
		bishancinema5.addShowTime(showtime167);
		bishancinema6.addShowTime(showtime168);

		//BishanCinema6(thegoodliar) 29/11

		Showtime showtime169 = new Showtime(LocalDateTime.of(2019,11,29,9,00),movie_thegoodliar,bishancinema7,MovieType.NORMAL);
		Showtime showtime170 = new Showtime(LocalDateTime.of(2019,11,29,15,30),movie_thegoodliar,bishancinema8,MovieType.NORMAL);
		Showtime showtime171 = new Showtime(LocalDateTime.of(2019,11,29,18,30),movie_thegoodliar,bishancinema9,MovieType.NORMAL);
		bishancinema7.addShowTime(showtime169);
		bishancinema8.addShowTime(showtime170);
		bishancinema9.addShowTime(showtime171);

		///////////////////////////////////////////////////    30/11  	////////////////////////////////////////////////////////////////

		//BishanCinema1(midway) 30/11
		Showtime showtime172 = new Showtime(LocalDateTime.of(2019,11,30,9,00),movie_midway,bishancinema1,MovieType.THREED);
		Showtime showtime173 = new Showtime(LocalDateTime.of(2019,11,30,14,30),movie_midway,bishancinema2,MovieType.NORMAL);
		Showtime showtime174 = new Showtime(LocalDateTime.of(2019,11,30,13,30),movie_midway,bishancinema3,MovieType.NORMAL);
		bishancinema1.addShowTime(showtime172);
		bishancinema2.addShowTime(showtime173);
		bishancinema3.addShowTime(showtime174);

		//BishanCinema3(terminator) 30/11

		Showtime showtime175 = new Showtime(LocalDateTime.of(2019,11,30,10,00),movie_terminator,bishancinema4,MovieType.BLOCKBUSTER);
		Showtime showtime176 = new Showtime(LocalDateTime.of(2019,11,30,15,30),movie_terminator,bishancinema5,MovieType.BLOCKBUSTER);
		Showtime showtime177 = new Showtime(LocalDateTime.of(2019,11,30,16,30),movie_terminator,bishancinema6,MovieType.BLOCKBUSTER);
		bishancinema4.addShowTime(showtime175);
		bishancinema5.addShowTime(showtime176);
		bishancinema6.addShowTime(showtime177);

		//BishanCinema6(thegoodliar) 30/11

		Showtime showtime178 = new Showtime(LocalDateTime.of(2019,11,30,9,00),movie_thegoodliar,bishancinema7,MovieType.NORMAL);
		Showtime showtime179 = new Showtime(LocalDateTime.of(2019,11,30,13,30),movie_thegoodliar,bishancinema8,MovieType.NORMAL);
		Showtime showtime180 = new Showtime(LocalDateTime.of(2019,11,30,18,30),movie_thegoodliar,bishancinema9,MovieType.NORMAL);
		bishancinema7.addShowTime(showtime178);
		bishancinema8.addShowTime(showtime179);
		bishancinema9.addShowTime(showtime180);







		//2. Adding showtime for jurongeast cineplex

		////////////////////////////////////////////////	15/11 	//////////////////////////////////////////////////////////////////

		//JurongEastCinema1(midway) 15/11
		Showtime showtime200 = new Showtime(LocalDateTime.of(2019,11,15,9,20),movie_thegoodliar,jurongeastcinema1,MovieType.NORMAL);
		Showtime showtime201 = new Showtime(LocalDateTime.of(2019,11,15,14,30),movie_thegoodliar,jurongeastcinema1,MovieType.NORMAL);
		Showtime showtime202 = new Showtime(LocalDateTime.of(2019,11,15,17,30),movie_thegoodliar,jurongeastcinema4,MovieType.THREED);
		jurongeastcinema1.addShowTime(showtime200);
		jurongeastcinema1.addShowTime(showtime201);
		jurongeastcinema4.addShowTime(showtime202);

		//JurongEastCinema2(terminator) 15/11
		Showtime showtime203 = new Showtime(LocalDateTime.of(2019,11,15,10,00),movie_terminator,jurongeastcinema2,MovieType.BLOCKBUSTER);
		Showtime showtime204 = new Showtime(LocalDateTime.of(2019,11,15,14,20),movie_terminator,jurongeastcinema2,MovieType.BLOCKBUSTER);
		Showtime showtime205 = new Showtime(LocalDateTime.of(2019,11,15,22,30),movie_terminator,jurongeastcinema5,MovieType.BLOCKBUSTER);
		jurongeastcinema2.addShowTime(showtime203);
		jurongeastcinema2.addShowTime(showtime204);
		jurongeastcinema5.addShowTime(showtime205);


		//JurongEastCinema3(thegoodliar) 15/11
		Showtime showtime206 = new Showtime(LocalDateTime.of(2019,11,15,10,00),movie_thegoodliar,jurongeastcinema3,MovieType.NORMAL);
		Showtime showtime207 = new Showtime(LocalDateTime.of(2019,11,15,12,30),movie_thegoodliar,jurongeastcinema3,MovieType.NORMAL);
		Showtime showtime208 = new Showtime(LocalDateTime.of(2019,11,15,22,30),movie_thegoodliar,jurongeastcinema6,MovieType.THREED);
		jurongeastcinema3.addShowTime(showtime206);
		jurongeastcinema3.addShowTime(showtime207);
		jurongeastcinema6.addShowTime(showtime208);

		/////////////////////////////////////////////////	16/11 	//////////////////////////////////////////////////////////////////

		//JurongEastCinema1(midway) 16/11
		Showtime showtime209 = new Showtime(LocalDateTime.of(2019,11,16,9,50),movie_thegoodliar,jurongeastcinema1,MovieType.NORMAL);
		Showtime showtime210 = new Showtime(LocalDateTime.of(2019,11,16,14,30),movie_thegoodliar,jurongeastcinema1,MovieType.NORMAL);
		Showtime showtime211 = new Showtime(LocalDateTime.of(2019,11,16,17,30),movie_thegoodliar,jurongeastcinema4,MovieType.NORMAL);
		jurongeastcinema1.addShowTime(showtime209);
		jurongeastcinema1.addShowTime(showtime210);
		jurongeastcinema4.addShowTime(showtime211);

		//JurongEastCinema2(terminator) 16/11
		Showtime showtime212 = new Showtime(LocalDateTime.of(2019,11,16,10,20),movie_terminator,jurongeastcinema2,MovieType.BLOCKBUSTER);
		Showtime showtime213 = new Showtime(LocalDateTime.of(2019,11,16,15,30),movie_terminator,jurongeastcinema2,MovieType.BLOCKBUSTER);
		Showtime showtime214 = new Showtime(LocalDateTime.of(2019,11,16,21,30),movie_terminator,jurongeastcinema5,MovieType.BLOCKBUSTER);
		jurongeastcinema2.addShowTime(showtime212);
		jurongeastcinema2.addShowTime(showtime213);
		jurongeastcinema5.addShowTime(showtime214);


		//JurongEastCinema3(21Bridges) 16/11
		Showtime showtime215 = new Showtime(LocalDateTime.of(2019,11,16,10,00),movie_21Bridges,jurongeastcinema3,MovieType.NORMAL);
		Showtime showtime216 = new Showtime(LocalDateTime.of(2019,11,16,12,30),movie_21Bridges,jurongeastcinema3,MovieType.NORMAL);
		Showtime showtime217 = new Showtime(LocalDateTime.of(2019,11,16,18,30),movie_21Bridges,jurongeastcinema6,MovieType.NORMAL);
		jurongeastcinema3.addShowTime(showtime215);
		jurongeastcinema3.addShowTime(showtime216);
		jurongeastcinema6.addShowTime(showtime217);

		//////////////////////////////////////////////////	17/11 	//////////////////////////////////////////////////////////////////

		//JurongEastCinema1(midway) 17/11
		Showtime showtime218 = new Showtime(LocalDateTime.of(2019,11,17,9,00),movie_thegoodliar,jurongeastcinema1,MovieType.NORMAL);
		Showtime showtime219 = new Showtime(LocalDateTime.of(2019,11,17,14,30),movie_thegoodliar,jurongeastcinema1,MovieType.NORMAL);
		Showtime showtime220 = new Showtime(LocalDateTime.of(2019,11,17,17,30),movie_thegoodliar,jurongeastcinema4,MovieType.THREED);
		jurongeastcinema1.addShowTime(showtime218);
		jurongeastcinema1.addShowTime(showtime219);
		jurongeastcinema4.addShowTime(showtime220);

		//JurongEastCinema2(terminator) 17/11
		Showtime showtime221 = new Showtime(LocalDateTime.of(2019,11,17,10,00),movie_terminator,jurongeastcinema2,MovieType.BLOCKBUSTER);
		Showtime showtime222 = new Showtime(LocalDateTime.of(2019,11,17,15,30),movie_terminator,jurongeastcinema2,MovieType.BLOCKBUSTER);
		Showtime showtime223 = new Showtime(LocalDateTime.of(2019,11,17,21,30),movie_terminator,jurongeastcinema5,MovieType.BLOCKBUSTER);
		jurongeastcinema2.addShowTime(showtime221);
		jurongeastcinema2.addShowTime(showtime222);
		jurongeastcinema5.addShowTime(showtime223);


		//JurongEastCinema3(21Bridges) 17/11
		Showtime showtime224 = new Showtime(LocalDateTime.of(2019,11,17,10,00),movie_21Bridges,jurongeastcinema3,MovieType.NORMAL);
		Showtime showtime225 = new Showtime(LocalDateTime.of(2019,11,17,12,30),movie_21Bridges,jurongeastcinema3,MovieType.NORMAL);
		Showtime showtime226 = new Showtime(LocalDateTime.of(2019,11,17,21,30),movie_21Bridges,jurongeastcinema6,MovieType.NORMAL);
		jurongeastcinema3.addShowTime(showtime224);
		jurongeastcinema3.addShowTime(showtime225);
		jurongeastcinema6.addShowTime(showtime226);


		///////////////////////////////////////////////////	18/11 	//////////////////////////////////////////////////////////////////

		//JurongEastCinema1(midway) 18/11
		Showtime showtime227 = new Showtime(LocalDateTime.of(2019,11,18,9,15),movie_thegoodliar,jurongeastcinema1,MovieType.NORMAL);
		Showtime showtime228 = new Showtime(LocalDateTime.of(2019,11,18,14,30),movie_thegoodliar,jurongeastcinema1,MovieType.NORMAL);
		Showtime showtime229 = new Showtime(LocalDateTime.of(2019,11,18,17,30),movie_thegoodliar,jurongeastcinema4,MovieType.NORMAL);
		jurongeastcinema1.addShowTime(showtime227);
		jurongeastcinema1.addShowTime(showtime228);
		jurongeastcinema4.addShowTime(showtime229);

		//JurongEastCinema2(terminator) 18/11
		Showtime showtime230 = new Showtime(LocalDateTime.of(2019,11,18,10,25),movie_terminator,jurongeastcinema2,MovieType.BLOCKBUSTER);
		Showtime showtime231 = new Showtime(LocalDateTime.of(2019,11,18,15,30),movie_terminator,jurongeastcinema2,MovieType.BLOCKBUSTER);
		Showtime showtime232 = new Showtime(LocalDateTime.of(2019,11,18,21,30),movie_terminator,jurongeastcinema5,MovieType.BLOCKBUSTER);
		jurongeastcinema2.addShowTime(showtime230);
		jurongeastcinema2.addShowTime(showtime231);
		jurongeastcinema5.addShowTime(showtime232);


		//JurongEastCinema3(21Bridges) 18/11
		Showtime showtime233 = new Showtime(LocalDateTime.of(2019,11,18,10,50),movie_21Bridges,jurongeastcinema3,MovieType.NORMAL);
		Showtime showtime234 = new Showtime(LocalDateTime.of(2019,11,18,13,30),movie_21Bridges,jurongeastcinema3,MovieType.THREED);
		Showtime showtime235 = new Showtime(LocalDateTime.of(2019,11,18,22,30),movie_21Bridges,jurongeastcinema6,MovieType.NORMAL);
		jurongeastcinema3.addShowTime(showtime233);
		jurongeastcinema3.addShowTime(showtime234);
		jurongeastcinema6.addShowTime(showtime235);

		//////////////////////////////////////////////////	 19/11 	  //////////////////////////////////////////////////////////////////

		//JurongEastCinema1(midway) 19/11
		Showtime showtime236 = new Showtime(LocalDateTime.of(2019,11,19,9,40),movie_thegoodliar,jurongeastcinema1,MovieType.NORMAL);
		Showtime showtime237 = new Showtime(LocalDateTime.of(2019,11,19,14,30),movie_thegoodliar,jurongeastcinema1,MovieType.NORMAL);
		Showtime showtime238 = new Showtime(LocalDateTime.of(2019,11,19,17,30),movie_thegoodliar,jurongeastcinema4,MovieType.NORMAL);
		jurongeastcinema1.addShowTime(showtime236);
		jurongeastcinema1.addShowTime(showtime237);
		jurongeastcinema4.addShowTime(showtime238);

		//JurongEastCinema2(terminator) 19/11
		Showtime showtime239 = new Showtime(LocalDateTime.of(2019,11,19,10,40),movie_terminator,jurongeastcinema2,MovieType.BLOCKBUSTER);
		Showtime showtime240 = new Showtime(LocalDateTime.of(2019,11,19,15,30),movie_terminator,jurongeastcinema2,MovieType.BLOCKBUSTER);
		Showtime showtime241 = new Showtime(LocalDateTime.of(2019,11,19,21,30),movie_terminator,jurongeastcinema5,MovieType.BLOCKBUSTER);
		jurongeastcinema2.addShowTime(showtime239);
		jurongeastcinema2.addShowTime(showtime240);
		jurongeastcinema5.addShowTime(showtime241);


		//JurongEastCinema3(21Bridges) 19/11
		Showtime showtime242 = new Showtime(LocalDateTime.of(2019,11,19,10,00),movie_21Bridges,jurongeastcinema3,MovieType.NORMAL);
		Showtime showtime243 = new Showtime(LocalDateTime.of(2019,11,19,12,30),movie_21Bridges,jurongeastcinema3,MovieType.THREED);
		Showtime showtime244 = new Showtime(LocalDateTime.of(2019,11,19,19,30),movie_21Bridges,jurongeastcinema6,MovieType.NORMAL);
		jurongeastcinema3.addShowTime(showtime242);
		jurongeastcinema3.addShowTime(showtime243);
		jurongeastcinema6.addShowTime(showtime244);

		////////////////////////////////////////////////////	 20/11 	  //////////////////////////////////////////////////////////////////

		//JurongEastCinema1(midway) 20/11
		Showtime showtime245 = new Showtime(LocalDateTime.of(2019,11,20,9,00),movie_thegoodliar,jurongeastcinema1,MovieType.NORMAL);
		Showtime showtime246 = new Showtime(LocalDateTime.of(2019,11,20,13,30),movie_thegoodliar,jurongeastcinema1,MovieType.THREED);
		Showtime showtime247 = new Showtime(LocalDateTime.of(2019,11,20,17,30),movie_thegoodliar,jurongeastcinema4,MovieType.NORMAL);
		jurongeastcinema1.addShowTime(showtime245);
		jurongeastcinema1.addShowTime(showtime246);
		jurongeastcinema4.addShowTime(showtime247);

		//JurongEastCinema2(terminator) 20/11
		Showtime showtime248 = new Showtime(LocalDateTime.of(2019,11,20,10,15),movie_terminator,jurongeastcinema2,MovieType.BLOCKBUSTER);
		Showtime showtime249 = new Showtime(LocalDateTime.of(2019,11,20,15,30),movie_terminator,jurongeastcinema2,MovieType.BLOCKBUSTER);
		Showtime showtime250 = new Showtime(LocalDateTime.of(2019,11,20,21,30),movie_terminator,jurongeastcinema5,MovieType.BLOCKBUSTER);
		jurongeastcinema2.addShowTime(showtime248);
		jurongeastcinema2.addShowTime(showtime249);
		jurongeastcinema5.addShowTime(showtime250);


		//JurongEastCinema4(21Bridges) 20/11
		Showtime showtime251 = new Showtime(LocalDateTime.of(2019,11,20,10,00),movie_21Bridges,jurongeastcinema4,MovieType.NORMAL);
		Showtime showtime252 = new Showtime(LocalDateTime.of(2019,11,20,12,30),movie_21Bridges,jurongeastcinema4,MovieType.NORMAL);
		Showtime showtime253 = new Showtime(LocalDateTime.of(2019,11,20,22,30),movie_21Bridges,jurongeastcinema6,MovieType.NORMAL);
		jurongeastcinema4.addShowTime(showtime251);
		jurongeastcinema4.addShowTime(showtime252);
		jurongeastcinema6.addShowTime(showtime253);

		//////////////////////////////////////////////////////	 21/11 	  //////////////////////////////////////////////////////////////////

		//JurongEastCinema1(midway) 21/11
		Showtime showtime254 = new Showtime(LocalDateTime.of(2019,11,21,9,15),movie_thegoodliar,jurongeastcinema1,MovieType.NORMAL);
		Showtime showtime255 = new Showtime(LocalDateTime.of(2019,11,21,14,30),movie_thegoodliar,jurongeastcinema1,MovieType.NORMAL);
		Showtime showtime256 = new Showtime(LocalDateTime.of(2019,11,21,17,30),movie_thegoodliar,jurongeastcinema4,MovieType.NORMAL);
		jurongeastcinema1.addShowTime(showtime254);
		jurongeastcinema1.addShowTime(showtime255);
		jurongeastcinema4.addShowTime(showtime256);

		//JurongEastCinema2(terminator) 21/11
		Showtime showtime257 = new Showtime(LocalDateTime.of(2019,11,21,10,00),movie_terminator,jurongeastcinema2,MovieType.BLOCKBUSTER);
		Showtime showtime258 = new Showtime(LocalDateTime.of(2019,11,21,15,30),movie_terminator,jurongeastcinema2,MovieType.BLOCKBUSTER);
		Showtime showtime259 = new Showtime(LocalDateTime.of(2019,11,21,21,30),movie_terminator,jurongeastcinema5,MovieType.BLOCKBUSTER);
		jurongeastcinema2.addShowTime(showtime257);
		jurongeastcinema2.addShowTime(showtime258);
		jurongeastcinema5.addShowTime(showtime259);


		//JurongEastCinema4(21Bridges) 21/11
		Showtime showtime260 = new Showtime(LocalDateTime.of(2019,11,21,11,00),movie_21Bridges,jurongeastcinema4,MovieType.NORMAL);
		Showtime showtime261 = new Showtime(LocalDateTime.of(2019,11,21,12,30),movie_21Bridges,jurongeastcinema4,MovieType.NORMAL);
		Showtime showtime262 = new Showtime(LocalDateTime.of(2019,11,21,22,30),movie_21Bridges,jurongeastcinema6,MovieType.THREED);
		jurongeastcinema4.addShowTime(showtime260);
		jurongeastcinema4.addShowTime(showtime261);
		jurongeastcinema6.addShowTime(showtime262);

		////////////////////////////////////////////////////////	 22/11 	  //////////////////////////////////////////////////////////////////

		//JurongEastCinema1(midway) 21/11
		Showtime showtime263 = new Showtime(LocalDateTime.of(2019,11,22,9,00),movie_thegoodliar,jurongeastcinema1,MovieType.NORMAL);
		Showtime showtime264 = new Showtime(LocalDateTime.of(2019,11,22,14,30),movie_thegoodliar,jurongeastcinema1,MovieType.NORMAL);
		Showtime showtime265 = new Showtime(LocalDateTime.of(2019,11,22,17,30),movie_thegoodliar,jurongeastcinema4,MovieType.THREED);
		jurongeastcinema1.addShowTime(showtime263);
		jurongeastcinema1.addShowTime(showtime264);
		jurongeastcinema4.addShowTime(showtime265);

		//JurongEastCinema2(terminator) 21/11
		Showtime showtime266 = new Showtime(LocalDateTime.of(2019,11,22,11,20),movie_terminator,jurongeastcinema2,MovieType.BLOCKBUSTER);
		Showtime showtime267 = new Showtime(LocalDateTime.of(2019,11,22,15,30),movie_terminator,jurongeastcinema2,MovieType.BLOCKBUSTER);
		Showtime showtime268 = new Showtime(LocalDateTime.of(2019,11,22,21,30),movie_terminator,jurongeastcinema5,MovieType.BLOCKBUSTER);
		jurongeastcinema2.addShowTime(showtime266);
		jurongeastcinema2.addShowTime(showtime267);
		jurongeastcinema5.addShowTime(showtime268);


		//JurongEastCinema4(21Bridges) 21/11
		Showtime showtime269 = new Showtime(LocalDateTime.of(2019,11,22,10,00),movie_21Bridges,jurongeastcinema4,MovieType.NORMAL);
		Showtime showtime270 = new Showtime(LocalDateTime.of(2019,11,22,12,30),movie_21Bridges,jurongeastcinema4,MovieType.NORMAL);
		Showtime showtime271 = new Showtime(LocalDateTime.of(2019,11,22,22,30),movie_21Bridges,jurongeastcinema6,MovieType.NORMAL);
		jurongeastcinema4.addShowTime(showtime269);
		jurongeastcinema4.addShowTime(showtime270);
		jurongeastcinema6.addShowTime(showtime271);

		////////////////////////////////////////////////////////	 23/11 	  /////////////////////////////////////////////////////////////////

		//JurongEastCinema1(midway) 23/11
		Showtime showtime272 = new Showtime(LocalDateTime.of(2019,11,23,9,20),movie_thegoodliar,jurongeastcinema1,MovieType.NORMAL);
		Showtime showtime273 = new Showtime(LocalDateTime.of(2019,11,23,14,30),movie_thegoodliar,jurongeastcinema1,MovieType.THREED);
		Showtime showtime274 = new Showtime(LocalDateTime.of(2019,11,23,17,30),movie_thegoodliar,jurongeastcinema4,MovieType.NORMAL);
		jurongeastcinema1.addShowTime(showtime272);
		jurongeastcinema1.addShowTime(showtime273);
		jurongeastcinema4.addShowTime(showtime274);

		//JurongEastCinema2(terminator) 23/11
		Showtime showtime275 = new Showtime(LocalDateTime.of(2019,11,23,10,15),movie_terminator,jurongeastcinema2,MovieType.BLOCKBUSTER);
		Showtime showtime276 = new Showtime(LocalDateTime.of(2019,11,23,15,30),movie_terminator,jurongeastcinema2,MovieType.BLOCKBUSTER);
		Showtime showtime277 = new Showtime(LocalDateTime.of(2019,11,23,21,30),movie_terminator,jurongeastcinema5,MovieType.BLOCKBUSTER);
		jurongeastcinema2.addShowTime(showtime275);
		jurongeastcinema2.addShowTime(showtime276);
		jurongeastcinema5.addShowTime(showtime277);


		//JurongEastCinema4(21Bridges) 23/11
		Showtime showtime278 = new Showtime(LocalDateTime.of(2019,11,23,10,00),movie_21Bridges,jurongeastcinema4,MovieType.NORMAL);
		Showtime showtime279 = new Showtime(LocalDateTime.of(2019,11,23,12,30),movie_21Bridges,jurongeastcinema4,MovieType.NORMAL);
		Showtime showtime280 = new Showtime(LocalDateTime.of(2019,11,23,22,30),movie_21Bridges,jurongeastcinema6,MovieType.NORMAL);
		jurongeastcinema4.addShowTime(showtime278);
		jurongeastcinema4.addShowTime(showtime279);
		jurongeastcinema6.addShowTime(showtime280);

		//////////////////////////////////////////////////////////	 24/11 	  /////////////////////////////////////////////////////////////////

		//JurongEastCinema1(midway) 24/11
		Showtime showtime281 = new Showtime(LocalDateTime.of(2019,11,24,9,30),movie_thegoodliar,jurongeastcinema1,MovieType.NORMAL);
		Showtime showtime282 = new Showtime(LocalDateTime.of(2019,11,24,14,30),movie_thegoodliar,jurongeastcinema1,MovieType.NORMAL);
		Showtime showtime283 = new Showtime(LocalDateTime.of(2019,11,24,17,30),movie_thegoodliar,jurongeastcinema4,MovieType.NORMAL);
		jurongeastcinema1.addShowTime(showtime281);
		jurongeastcinema1.addShowTime(showtime282);
		jurongeastcinema4.addShowTime(showtime283);

		//JurongEastCinema2(terminator) 24/11
		Showtime showtime284 = new Showtime(LocalDateTime.of(2019,11,24,10,00),movie_terminator,jurongeastcinema2,MovieType.BLOCKBUSTER);
		Showtime showtime285 = new Showtime(LocalDateTime.of(2019,11,24,15,30),movie_terminator,jurongeastcinema2,MovieType.BLOCKBUSTER);
		Showtime showtime286 = new Showtime(LocalDateTime.of(2019,11,24,21,30),movie_terminator,jurongeastcinema5,MovieType.BLOCKBUSTER);
		jurongeastcinema2.addShowTime(showtime284);
		jurongeastcinema2.addShowTime(showtime285);
		jurongeastcinema5.addShowTime(showtime286);


		//JurongEastCinema4(21Bridges) 24/11
		Showtime showtime287 = new Showtime(LocalDateTime.of(2019,11,24,10,30),movie_21Bridges,jurongeastcinema4,MovieType.THREED);
		Showtime showtime288 = new Showtime(LocalDateTime.of(2019,11,24,12,20),movie_21Bridges,jurongeastcinema4,MovieType.NORMAL);
		Showtime showtime289 = new Showtime(LocalDateTime.of(2019,11,24,22,30),movie_21Bridges,jurongeastcinema6,MovieType.NORMAL);
		jurongeastcinema4.addShowTime(showtime287);
		jurongeastcinema4.addShowTime(showtime288);
		jurongeastcinema6.addShowTime(showtime289);

		////////////////////////////////////////////////////////////	 25/11 	  /////////////////////////////////////////////////////////////////

		//JurongEastCinema1(midway) 25/11
		Showtime showtime290 = new Showtime(LocalDateTime.of(2019,11,25,10,30),movie_thegoodliar,jurongeastcinema1,MovieType.THREED);
		Showtime showtime291 = new Showtime(LocalDateTime.of(2019,11,25,14,30),movie_thegoodliar,jurongeastcinema1,MovieType.NORMAL);
		Showtime showtime292 = new Showtime(LocalDateTime.of(2019,11,25,17,30),movie_thegoodliar,jurongeastcinema4,MovieType.NORMAL);
		jurongeastcinema1.addShowTime(showtime290);
		jurongeastcinema1.addShowTime(showtime291);
		jurongeastcinema4.addShowTime(showtime292);

		//JurongEastCinema2(terminator) 25/11
		Showtime showtime293 = new Showtime(LocalDateTime.of(2019,11,25,10,00),movie_terminator,jurongeastcinema2,MovieType.BLOCKBUSTER);
		Showtime showtime294 = new Showtime(LocalDateTime.of(2019,11,25,13,30),movie_terminator,jurongeastcinema2,MovieType.BLOCKBUSTER);
		Showtime showtime295 = new Showtime(LocalDateTime.of(2019,11,25,21,40),movie_terminator,jurongeastcinema5,MovieType.BLOCKBUSTER);
		jurongeastcinema2.addShowTime(showtime293);
		jurongeastcinema2.addShowTime(showtime294);
		jurongeastcinema5.addShowTime(showtime295);


		//JurongEastCinema4(21Bridges) 25/11
		Showtime showtime296 = new Showtime(LocalDateTime.of(2019,11,25,10,00),movie_21Bridges,jurongeastcinema4,MovieType.NORMAL);
		Showtime showtime297 = new Showtime(LocalDateTime.of(2019,11,25,12,30),movie_21Bridges,jurongeastcinema4,MovieType.NORMAL);
		Showtime showtime298 = new Showtime(LocalDateTime.of(2019,11,25,22,30),movie_21Bridges,jurongeastcinema6,MovieType.NORMAL);
		jurongeastcinema4.addShowTime(showtime296);
		jurongeastcinema4.addShowTime(showtime297);
		jurongeastcinema6.addShowTime(showtime298);

		//////////////////////////////////////////////////////////////	 26/11 	  /////////////////////////////////////////////////////////////////

		//JurongEastCinema1(midway) 26/11
		Showtime showtime299 = new Showtime(LocalDateTime.of(2019,11,26,9,00),movie_thegoodliar,jurongeastcinema1,MovieType.THREED);
		Showtime showtime300 = new Showtime(LocalDateTime.of(2019,11,26,14,30),movie_thegoodliar,jurongeastcinema1,MovieType.NORMAL);
		Showtime showtime301 = new Showtime(LocalDateTime.of(2019,11,26,17,30),movie_thegoodliar,jurongeastcinema4,MovieType.NORMAL);
		jurongeastcinema1.addShowTime(showtime299);
		jurongeastcinema1.addShowTime(showtime300);
		jurongeastcinema4.addShowTime(showtime301);

		//JurongEastCinema2(terminator) 26/11
		Showtime showtime302 = new Showtime(LocalDateTime.of(2019,11,26,10,00),movie_terminator,jurongeastcinema2,MovieType.BLOCKBUSTER);
		Showtime showtime303 = new Showtime(LocalDateTime.of(2019,11,26,13,30),movie_terminator,jurongeastcinema2,MovieType.BLOCKBUSTER);
		Showtime showtime304 = new Showtime(LocalDateTime.of(2019,11,26,21,50),movie_terminator,jurongeastcinema5,MovieType.BLOCKBUSTER);
		jurongeastcinema2.addShowTime(showtime302);
		jurongeastcinema2.addShowTime(showtime303);
		jurongeastcinema5.addShowTime(showtime304);


		//JurongEastCinema4(21Bridges) 26/11
		Showtime showtime305 = new Showtime(LocalDateTime.of(2019,11,26,10,00),movie_21Bridges,jurongeastcinema4,MovieType.NORMAL);
		Showtime showtime306 = new Showtime(LocalDateTime.of(2019,11,26,16,30),movie_21Bridges,jurongeastcinema4,MovieType.NORMAL);
		Showtime showtime307 = new Showtime(LocalDateTime.of(2019,11,26,22,30),movie_21Bridges,jurongeastcinema6,MovieType.NORMAL);
		jurongeastcinema4.addShowTime(showtime305);
		jurongeastcinema4.addShowTime(showtime306);
		jurongeastcinema6.addShowTime(showtime307);

		/////////////////////////////////////////////////////////////	 27/11 	  /////////////////////////////////////////////////////////////////

		//JurongEastCinema1(midway) 27/11
		Showtime showtime308 = new Showtime(LocalDateTime.of(2019,11,27,9,00),movie_thegoodliar,jurongeastcinema1,MovieType.NORMAL);
		Showtime showtime309 = new Showtime(LocalDateTime.of(2019,11,27,14,30),movie_thegoodliar,jurongeastcinema1,MovieType.THREED);
		Showtime showtime310 = new Showtime(LocalDateTime.of(2019,11,27,17,30),movie_thegoodliar,jurongeastcinema4,MovieType.NORMAL);
		jurongeastcinema1.addShowTime(showtime308);
		jurongeastcinema1.addShowTime(showtime309);
		jurongeastcinema4.addShowTime(showtime310);

		//JurongEastCinema2(terminator) 27/11
		Showtime showtime311 = new Showtime(LocalDateTime.of(2019,11,27,10,00),movie_terminator,jurongeastcinema2,MovieType.BLOCKBUSTER);
		Showtime showtime312 = new Showtime(LocalDateTime.of(2019,11,27,16,30),movie_terminator,jurongeastcinema2,MovieType.BLOCKBUSTER);
		Showtime showtime313 = new Showtime(LocalDateTime.of(2019,11,27,21,30),movie_terminator,jurongeastcinema5,MovieType.BLOCKBUSTER);
		jurongeastcinema2.addShowTime(showtime311);
		jurongeastcinema2.addShowTime(showtime312);
		jurongeastcinema5.addShowTime(showtime313);


		//JurongEastCinema4(21Bridges) 27/11
		Showtime showtime314 = new Showtime(LocalDateTime.of(2019,11,27,10,00),movie_21Bridges,jurongeastcinema4,MovieType.NORMAL);
		Showtime showtime315 = new Showtime(LocalDateTime.of(2019,11,27,12,30),movie_21Bridges,jurongeastcinema4,MovieType.NORMAL);
		Showtime showtime316 = new Showtime(LocalDateTime.of(2019,11,27,22,30),movie_21Bridges,jurongeastcinema6,MovieType.NORMAL);
		jurongeastcinema4.addShowTime(showtime314);
		jurongeastcinema4.addShowTime(showtime315);
		jurongeastcinema6.addShowTime(showtime316);

		///////////////////////////////////////////////////	    28/11 	  /////////////////////////////////////////////////////////////////

		//JurongEastCinema1(midway) 28/11
		Showtime showtime317 = new Showtime(LocalDateTime.of(2019,11,28,9,00),movie_thegoodliar,jurongeastcinema1,MovieType.NORMAL);
		Showtime showtime318 = new Showtime(LocalDateTime.of(2019,11,28,12,30),movie_thegoodliar,jurongeastcinema1,MovieType.NORMAL);
		Showtime showtime319 = new Showtime(LocalDateTime.of(2019,11,28,17,30),movie_thegoodliar,jurongeastcinema4,MovieType.THREED);
		jurongeastcinema1.addShowTime(showtime317);
		jurongeastcinema1.addShowTime(showtime318);
		jurongeastcinema4.addShowTime(showtime319);

		//JurongEastCinema2(terminator) 28/11
		Showtime showtime320 = new Showtime(LocalDateTime.of(2019,11,28,10,00),movie_terminator,jurongeastcinema2,MovieType.BLOCKBUSTER);
		Showtime showtime321 = new Showtime(LocalDateTime.of(2019,11,28,15,30),movie_terminator,jurongeastcinema2,MovieType.BLOCKBUSTER);
		Showtime showtime322 = new Showtime(LocalDateTime.of(2019,11,28,19,30),movie_terminator,jurongeastcinema5,MovieType.BLOCKBUSTER);
		jurongeastcinema2.addShowTime(showtime320);
		jurongeastcinema2.addShowTime(showtime321);
		jurongeastcinema5.addShowTime(showtime322);


		//JurongEastCinema4(21Bridges) 28/11
		Showtime showtime323 = new Showtime(LocalDateTime.of(2019,11,28,10,00),movie_21Bridges,jurongeastcinema4,MovieType.NORMAL);
		Showtime showtime324 = new Showtime(LocalDateTime.of(2019,11,28,12,30),movie_21Bridges,jurongeastcinema4,MovieType.NORMAL);
		Showtime showtime325 = new Showtime(LocalDateTime.of(2019,11,28,22,30),movie_21Bridges,jurongeastcinema6,MovieType.NORMAL);
		jurongeastcinema4.addShowTime(showtime323);
		jurongeastcinema4.addShowTime(showtime324);
		jurongeastcinema6.addShowTime(showtime325);

		////////////////////////////////////////////////	 29/11 	  /////////////////////////////////////////////////////////////////

		//JurongEastCinema1(midway) 29/11
		Showtime showtime326 = new Showtime(LocalDateTime.of(2019,11,29,9,00),movie_thegoodliar,jurongeastcinema1,MovieType.NORMAL);
		Showtime showtime327 = new Showtime(LocalDateTime.of(2019,11,29,15,30),movie_thegoodliar,jurongeastcinema1,MovieType.NORMAL);
		Showtime showtime328 = new Showtime(LocalDateTime.of(2019,11,29,17,30),movie_thegoodliar,jurongeastcinema4,MovieType.NORMAL);
		jurongeastcinema1.addShowTime(showtime326);
		jurongeastcinema1.addShowTime(showtime327);
		jurongeastcinema4.addShowTime(showtime328);

		//JurongEastCinema2(terminator) 29/11
		Showtime showtime329 = new Showtime(LocalDateTime.of(2019,11,29,10,00),movie_terminator,jurongeastcinema2,MovieType.BLOCKBUSTER);
		Showtime showtime330 = new Showtime(LocalDateTime.of(2019,11,29,16,30),movie_terminator,jurongeastcinema2,MovieType.BLOCKBUSTER);
		Showtime showtime331 = new Showtime(LocalDateTime.of(2019,11,29,21,30),movie_terminator,jurongeastcinema5,MovieType.BLOCKBUSTER);
		jurongeastcinema2.addShowTime(showtime329);
		jurongeastcinema2.addShowTime(showtime330);
		jurongeastcinema5.addShowTime(showtime331);


		//JurongEastCinema4(21Bridges) 29/11
		Showtime showtime332 = new Showtime(LocalDateTime.of(2019,11,29,10,00),movie_21Bridges,jurongeastcinema4,MovieType.NORMAL);
		Showtime showtime333 = new Showtime(LocalDateTime.of(2019,11,29,13,30),movie_21Bridges,jurongeastcinema4,MovieType.THREED);
		Showtime showtime334 = new Showtime(LocalDateTime.of(2019,11,29,18,30),movie_21Bridges,jurongeastcinema6,MovieType.NORMAL);
		jurongeastcinema4.addShowTime(showtime332);
		jurongeastcinema4.addShowTime(showtime333);
		jurongeastcinema6.addShowTime(showtime334);

		//////////////////////////////////////////////////////	 30/11 	  /////////////////////////////////////////////////////////////////

		//JurongEastCinema1(midway) 30/11
		Showtime showtime335 = new Showtime(LocalDateTime.of(2019,11,30,9,00),movie_thegoodliar,jurongeastcinema1,MovieType.NORMAL);
		Showtime showtime336 = new Showtime(LocalDateTime.of(2019,11,30,14,30),movie_thegoodliar,jurongeastcinema1,MovieType.NORMAL);
		Showtime showtime337 = new Showtime(LocalDateTime.of(2019,11,30,17,30),movie_thegoodliar,jurongeastcinema4,MovieType.NORMAL);
		jurongeastcinema1.addShowTime(showtime335);
		jurongeastcinema1.addShowTime(showtime336);
		jurongeastcinema4.addShowTime(showtime337);

		//JurongEastCinema2(terminator) 30/11
		Showtime showtime338 = new Showtime(LocalDateTime.of(2019,11,30,10,00),movie_terminator,jurongeastcinema2,MovieType.BLOCKBUSTER);
		Showtime showtime339 = new Showtime(LocalDateTime.of(2019,11,30,12,30),movie_terminator,jurongeastcinema2,MovieType.BLOCKBUSTER);
		Showtime showtime340 = new Showtime(LocalDateTime.of(2019,11,30,21,30),movie_terminator,jurongeastcinema5,MovieType.BLOCKBUSTER);
		jurongeastcinema2.addShowTime(showtime338);
		jurongeastcinema2.addShowTime(showtime339);
		jurongeastcinema5.addShowTime(showtime340);


		//JurongEastCinema4(21Bridges) 30/11
		Showtime showtime341 = new Showtime(LocalDateTime.of(2019,11,30,10,00),movie_21Bridges,jurongeastcinema4,MovieType.NORMAL);
		Showtime showtime342 = new Showtime(LocalDateTime.of(2019,11,30,12,30),movie_21Bridges,jurongeastcinema4,MovieType.THREED);
		Showtime showtime343 = new Showtime(LocalDateTime.of(2019,11,30,21,30),movie_21Bridges,jurongeastcinema6,MovieType.NORMAL);
		jurongeastcinema4.addShowTime(showtime341);
		jurongeastcinema4.addShowTime(showtime342);
		jurongeastcinema6.addShowTime(showtime343);






















		//3. Adding showtime for bedok cineplex

		///////////////////////////////////////////////      15/11 	//////////////////////////////////////////////////////

		//BedokCinema1(midway) 15/11
		Showtime showtime400 = new Showtime(LocalDateTime.of(2019,11,15,9,00),movie_thegoodliar,bedokcinema1,MovieType.NORMAL);
		Showtime showtime401 = new Showtime(LocalDateTime.of(2019,11,15,10,30),movie_thegoodliar,bedokcinema1,MovieType.NORMAL);
		Showtime showtime402 = new Showtime(LocalDateTime.of(2019,11,15,17,30),movie_thegoodliar,bedokcinema1,MovieType.NORMAL);
		bedokcinema1.addShowTime(showtime400);
		bedokcinema1.addShowTime(showtime401);
		bedokcinema1.addShowTime(showtime402);

		//BedokCinema2(terminator) 15/11
		Showtime showtime403 = new Showtime(LocalDateTime.of(2019,11,15,10,00),movie_terminator,bedokcinema2,MovieType.BLOCKBUSTER);
		Showtime showtime404 = new Showtime(LocalDateTime.of(2019,11,15,12,30),movie_terminator,bedokcinema2,MovieType.BLOCKBUSTER);
		Showtime showtime405 = new Showtime(LocalDateTime.of(2019,11,15,18,30),movie_terminator,bedokcinema2,MovieType.BLOCKBUSTER);
		bedokcinema2.addShowTime(showtime403);
		bedokcinema2.addShowTime(showtime404);
		bedokcinema2.addShowTime(showtime405);


		//BedokCinema3(thegoodliar) 15/11
		Showtime showtime406 = new Showtime(LocalDateTime.of(2019,11,15,10,00),movie_thegoodliar,bedokcinema4,MovieType.THREED);
		Showtime showtime407 = new Showtime(LocalDateTime.of(2019,11,15,12,30),movie_thegoodliar,bedokcinema4,MovieType.NORMAL);
		Showtime showtime408 = new Showtime(LocalDateTime.of(2019,11,15,18,30),movie_thegoodliar,bedokcinema4,MovieType.NORMAL);
		bedokcinema4.addShowTime(showtime406);
		bedokcinema4.addShowTime(showtime407);
		bedokcinema4.addShowTime(showtime408);

		//bedokcinema4(movie_21Bridges) 15/11
		Showtime showtime409 = new Showtime(LocalDateTime.of(2019,11,15,10,00),movie_21Bridges,bedokcinema3,MovieType.THREED);
		Showtime showtime410 = new Showtime(LocalDateTime.of(2019,11,15,12,30),movie_21Bridges,bedokcinema5,MovieType.NORMAL);
		Showtime showtime411 = new Showtime(LocalDateTime.of(2019,11,15,18,30),movie_21Bridges,bedokcinema6,MovieType.NORMAL);
		bedokcinema3.addShowTime(showtime409);
		bedokcinema5.addShowTime(showtime410);
		bedokcinema6.addShowTime(showtime411);

		//////////////////////////////////////////////      16/11 	//////////////////////////////////////////////////////

		//BedokCinema(midway) 16/11
		Showtime showtime412 = new Showtime(LocalDateTime.of(2019,11,16,9,00),movie_thegoodliar,bedokcinema1,MovieType.NORMAL);
		Showtime showtime413 = new Showtime(LocalDateTime.of(2019,11,16,10,30),movie_thegoodliar,bedokcinema1,MovieType.NORMAL);
		Showtime showtime414 = new Showtime(LocalDateTime.of(2019,11,16,17,30),movie_thegoodliar,bedokcinema1,MovieType.NORMAL);
		bedokcinema1.addShowTime(showtime412);
		bedokcinema1.addShowTime(showtime413);
		bedokcinema1.addShowTime(showtime414);

		//BedokCinema(terminator) 16/11
		Showtime showtime415 = new Showtime(LocalDateTime.of(2019,11,16,10,00),movie_terminator,bedokcinema2,MovieType.BLOCKBUSTER);
		Showtime showtime416 = new Showtime(LocalDateTime.of(2019,11,16,12,30),movie_terminator,bedokcinema2,MovieType.BLOCKBUSTER);
		Showtime showtime417 = new Showtime(LocalDateTime.of(2019,11,16,18,30),movie_terminator,bedokcinema2,MovieType.BLOCKBUSTER);
		bedokcinema2.addShowTime(showtime415);
		bedokcinema2.addShowTime(showtime416);
		bedokcinema2.addShowTime(showtime417);


		//BedokCinema(thegoodliar) 16/11
		Showtime showtime418 = new Showtime(LocalDateTime.of(2019,11,16,10,00),movie_thegoodliar,bedokcinema4,MovieType.THREED);
		Showtime showtime419 = new Showtime(LocalDateTime.of(2019,11,16,12,30),movie_thegoodliar,bedokcinema4,MovieType.NORMAL);
		Showtime showtime420 = new Showtime(LocalDateTime.of(2019,11,16,18,30),movie_thegoodliar,bedokcinema4,MovieType.NORMAL);
		bedokcinema4.addShowTime(showtime418);
		bedokcinema4.addShowTime(showtime419);
		bedokcinema4.addShowTime(showtime420);

		//bedokcinema(movie_21Bridges) 16/11
		Showtime showtime421 = new Showtime(LocalDateTime.of(2019,11,15,10,00),movie_21Bridges,bedokcinema3,MovieType.THREED);
		Showtime showtime422 = new Showtime(LocalDateTime.of(2019,11,15,12,30),movie_21Bridges,bedokcinema5,MovieType.NORMAL);
		Showtime showtime423 = new Showtime(LocalDateTime.of(2019,11,15,18,30),movie_21Bridges,bedokcinema6,MovieType.NORMAL);
		bedokcinema3.addShowTime(showtime421);
		bedokcinema5.addShowTime(showtime422);
		bedokcinema6.addShowTime(showtime423);


		//////////////////////////////////////////////      17/11 	//////////////////////////////////////////////////////

		//BedokCinema(midway) 17/11
		Showtime showtime424 = new Showtime(LocalDateTime.of(2019,11,17,9,00),movie_thegoodliar,bedokcinema1,MovieType.NORMAL);
		Showtime showtime425 = new Showtime(LocalDateTime.of(2019,11,17,10,30),movie_thegoodliar,bedokcinema1,MovieType.NORMAL);
		Showtime showtime426 = new Showtime(LocalDateTime.of(2019,11,17,17,30),movie_thegoodliar,bedokcinema1,MovieType.NORMAL);
		bedokcinema1.addShowTime(showtime424);
		bedokcinema1.addShowTime(showtime425);
		bedokcinema1.addShowTime(showtime426);

		//BedokCinema(terminator) 17/11
		Showtime showtime427 = new Showtime(LocalDateTime.of(2019,11,17,10,00),movie_terminator,bedokcinema2,MovieType.BLOCKBUSTER);
		Showtime showtime428 = new Showtime(LocalDateTime.of(2019,11,17,12,30),movie_terminator,bedokcinema2,MovieType.BLOCKBUSTER);
		Showtime showtime429 = new Showtime(LocalDateTime.of(2019,11,17,18,30),movie_terminator,bedokcinema2,MovieType.BLOCKBUSTER);
		bedokcinema2.addShowTime(showtime427);
		bedokcinema2.addShowTime(showtime428);
		bedokcinema2.addShowTime(showtime429);


		//BedokCinema(thegoodliar) 17/11
		Showtime showtime430 = new Showtime(LocalDateTime.of(2019,11,17,10,00),movie_thegoodliar,bedokcinema4,MovieType.THREED);
		Showtime showtime431 = new Showtime(LocalDateTime.of(2019,11,17,12,30),movie_thegoodliar,bedokcinema4,MovieType.NORMAL);
		Showtime showtime432 = new Showtime(LocalDateTime.of(2019,11,17,18,30),movie_thegoodliar,bedokcinema4,MovieType.NORMAL);
		bedokcinema4.addShowTime(showtime430);
		bedokcinema4.addShowTime(showtime431);
		bedokcinema4.addShowTime(showtime432);

		//bedokcinema(movie_21Bridges) 17/11
		Showtime showtime433 = new Showtime(LocalDateTime.of(2019,11,17,10,00),movie_21Bridges,bedokcinema3,MovieType.THREED);
		Showtime showtime434 = new Showtime(LocalDateTime.of(2019,11,17,15,00),movie_21Bridges,bedokcinema5,MovieType.NORMAL);
		Showtime showtime435 = new Showtime(LocalDateTime.of(2019,11,17,20,30),movie_21Bridges,bedokcinema6,MovieType.NORMAL);
		bedokcinema3.addShowTime(showtime433);
		bedokcinema5.addShowTime(showtime434);
		bedokcinema6.addShowTime(showtime435);

		//////////////////////////////////////////////      18/11 	//////////////////////////////////////////////////////

		//BedokCinema(midway) 18/11
		Showtime showtime436 = new Showtime(LocalDateTime.of(2019,11,18,9,00),movie_thegoodliar,bedokcinema1,MovieType.NORMAL);
		Showtime showtime437 = new Showtime(LocalDateTime.of(2019,11,18,10,30),movie_thegoodliar,bedokcinema1,MovieType.NORMAL);
		Showtime showtime438 = new Showtime(LocalDateTime.of(2019,11,18,17,30),movie_thegoodliar,bedokcinema1,MovieType.NORMAL);
		bedokcinema1.addShowTime(showtime436);
		bedokcinema1.addShowTime(showtime437);
		bedokcinema1.addShowTime(showtime438);

		//BedokCinema(terminator) 18/11
		Showtime showtime439 = new Showtime(LocalDateTime.of(2019,11,18,10,00),movie_terminator,bedokcinema2,MovieType.BLOCKBUSTER);
		Showtime showtime440 = new Showtime(LocalDateTime.of(2019,11,18,12,30),movie_terminator,bedokcinema2,MovieType.BLOCKBUSTER);
		Showtime showtime441 = new Showtime(LocalDateTime.of(2019,11,18,18,30),movie_terminator,bedokcinema2,MovieType.BLOCKBUSTER);
		bedokcinema2.addShowTime(showtime439);
		bedokcinema2.addShowTime(showtime440);
		bedokcinema2.addShowTime(showtime441);


		//BedokCinema(thegoodliar) 18/11
		Showtime showtime442 = new Showtime(LocalDateTime.of(2019,11,18,10,00),movie_thegoodliar,bedokcinema4,MovieType.THREED);
		Showtime showtime443 = new Showtime(LocalDateTime.of(2019,11,18,12,30),movie_thegoodliar,bedokcinema4,MovieType.NORMAL);
		Showtime showtime444 = new Showtime(LocalDateTime.of(2019,11,18,18,30),movie_thegoodliar,bedokcinema4,MovieType.NORMAL);
		bedokcinema4.addShowTime(showtime442);
		bedokcinema4.addShowTime(showtime443);
		bedokcinema4.addShowTime(showtime444);

		//bedokcinema(movie_21Bridges) 18/11
		Showtime showtime445 = new Showtime(LocalDateTime.of(2019,11,18,10,00),movie_21Bridges,bedokcinema3,MovieType.THREED);
		Showtime showtime446 = new Showtime(LocalDateTime.of(2019,11,18,15,00),movie_21Bridges,bedokcinema5,MovieType.NORMAL);
		Showtime showtime447 = new Showtime(LocalDateTime.of(2019,11,18,20,30),movie_21Bridges,bedokcinema6,MovieType.NORMAL);
		bedokcinema3.addShowTime(showtime445);
		bedokcinema5.addShowTime(showtime446);
		bedokcinema6.addShowTime(showtime447);

		//////////////////////////////////////////////      19/11 	//////////////////////////////////////////////////////

		//BedokCinema(midway) 19/11
		Showtime showtime580 = new Showtime(LocalDateTime.of(2019,11,19,10,00),movie_thegoodliar,bedokcinema1,MovieType.NORMAL);
		Showtime showtime581 = new Showtime(LocalDateTime.of(2019,11,19,16,30),movie_thegoodliar,bedokcinema1,MovieType.NORMAL);
		Showtime showtime582 = new Showtime(LocalDateTime.of(2019,11,19,19,30),movie_thegoodliar,bedokcinema1,MovieType.NORMAL);
		bedokcinema1.addShowTime(showtime580);
		bedokcinema1.addShowTime(showtime581);
		bedokcinema1.addShowTime(showtime582);

		//BedokCinema(terminator) 19/11
		Showtime showtime583 = new Showtime(LocalDateTime.of(2019,11,19,11,00),movie_terminator,bedokcinema2,MovieType.BLOCKBUSTER);
		Showtime showtime584 = new Showtime(LocalDateTime.of(2019,11,19,14,30),movie_terminator,bedokcinema2,MovieType.BLOCKBUSTER);
		Showtime showtime585 = new Showtime(LocalDateTime.of(2019,11,19,17,30),movie_terminator,bedokcinema2,MovieType.BLOCKBUSTER);
		bedokcinema2.addShowTime(showtime583);
		bedokcinema2.addShowTime(showtime584);
		bedokcinema2.addShowTime(showtime585);


		//BedokCinema(thegoodliar) 19/11
		Showtime showtime586 = new Showtime(LocalDateTime.of(2019,11,19,11,00),movie_thegoodliar,bedokcinema4,MovieType.THREED);
		Showtime showtime587 = new Showtime(LocalDateTime.of(2019,11,19,13,30),movie_thegoodliar,bedokcinema4,MovieType.NORMAL);
		Showtime showtime588 = new Showtime(LocalDateTime.of(2019,11,19,19,30),movie_thegoodliar,bedokcinema4,MovieType.NORMAL);
		bedokcinema4.addShowTime(showtime586);
		bedokcinema4.addShowTime(showtime587);
		bedokcinema4.addShowTime(showtime588);

		//bedokcinema(movie_21Bridges) 19/11
		Showtime showtime589 = new Showtime(LocalDateTime.of(2019,11,19,10,30),movie_21Bridges,bedokcinema3,MovieType.THREED);
		Showtime showtime590 = new Showtime(LocalDateTime.of(2019,11,19,16,00),movie_21Bridges,bedokcinema5,MovieType.NORMAL);
		Showtime showtime591 = new Showtime(LocalDateTime.of(2019,11,19,18,30),movie_21Bridges,bedokcinema6,MovieType.NORMAL);
		bedokcinema3.addShowTime(showtime589);
		bedokcinema5.addShowTime(showtime590);
		bedokcinema6.addShowTime(showtime591);

		//////////////////////////////////////////////      20/11 	//////////////////////////////////////////////////////

		//BedokCinema(midway) 20/11
		Showtime showtime448 = new Showtime(LocalDateTime.of(2019,11,20,10,00),movie_thegoodliar,bedokcinema1,MovieType.NORMAL);
		Showtime showtime449 = new Showtime(LocalDateTime.of(2019,11,20,16,30),movie_thegoodliar,bedokcinema1,MovieType.NORMAL);
		Showtime showtime450 = new Showtime(LocalDateTime.of(2019,11,20,19,30),movie_thegoodliar,bedokcinema1,MovieType.NORMAL);
		bedokcinema1.addShowTime(showtime448);
		bedokcinema1.addShowTime(showtime449);
		bedokcinema1.addShowTime(showtime450);

		//BedokCinema(terminator) 20/11
		Showtime showtime451 = new Showtime(LocalDateTime.of(2019,11,20,11,00),movie_terminator,bedokcinema2,MovieType.BLOCKBUSTER);
		Showtime showtime452 = new Showtime(LocalDateTime.of(2019,11,20,14,30),movie_terminator,bedokcinema2,MovieType.BLOCKBUSTER);
		Showtime showtime453 = new Showtime(LocalDateTime.of(2019,11,20,17,30),movie_terminator,bedokcinema2,MovieType.BLOCKBUSTER);
		bedokcinema2.addShowTime(showtime451);
		bedokcinema2.addShowTime(showtime452);
		bedokcinema2.addShowTime(showtime453);


		//BedokCinema(thegoodliar) 20/11
		Showtime showtime454 = new Showtime(LocalDateTime.of(2019,11,20,11,00),movie_thegoodliar,bedokcinema4,MovieType.THREED);
		Showtime showtime455 = new Showtime(LocalDateTime.of(2019,11,20,13,30),movie_thegoodliar,bedokcinema4,MovieType.NORMAL);
		Showtime showtime456 = new Showtime(LocalDateTime.of(2019,11,20,19,30),movie_thegoodliar,bedokcinema4,MovieType.NORMAL);
		bedokcinema4.addShowTime(showtime454);
		bedokcinema4.addShowTime(showtime455);
		bedokcinema4.addShowTime(showtime456);

		//bedokcinema(movie_21Bridges) 20/11
		Showtime showtime457 = new Showtime(LocalDateTime.of(2019,11,20,10,30),movie_21Bridges,bedokcinema3,MovieType.THREED);
		Showtime showtime458 = new Showtime(LocalDateTime.of(2019,11,20,16,00),movie_21Bridges,bedokcinema5,MovieType.NORMAL);
		Showtime showtime459 = new Showtime(LocalDateTime.of(2019,11,20,18,30),movie_21Bridges,bedokcinema6,MovieType.NORMAL);
		bedokcinema3.addShowTime(showtime457);
		bedokcinema5.addShowTime(showtime458);
		bedokcinema6.addShowTime(showtime459);

		//////////////////////////////////////////////      21/11 	//////////////////////////////////////////////////////

		//BedokCinema(midway) 21/11
		Showtime showtime460 = new Showtime(LocalDateTime.of(2019,11,21,9,00),movie_thegoodliar,bedokcinema1,MovieType.NORMAL);
		Showtime showtime461 = new Showtime(LocalDateTime.of(2019,11,21,10,30),movie_thegoodliar,bedokcinema1,MovieType.NORMAL);
		Showtime showtime462 = new Showtime(LocalDateTime.of(2019,11,21,17,30),movie_thegoodliar,bedokcinema1,MovieType.NORMAL);
		bedokcinema1.addShowTime(showtime460);
		bedokcinema1.addShowTime(showtime461);
		bedokcinema1.addShowTime(showtime462);

		//BedokCinema(terminator) 21/11
		Showtime showtime463 = new Showtime(LocalDateTime.of(2019,11,21,10,00),movie_terminator,bedokcinema2,MovieType.BLOCKBUSTER);
		Showtime showtime464 = new Showtime(LocalDateTime.of(2019,11,21,12,30),movie_terminator,bedokcinema2,MovieType.BLOCKBUSTER);
		Showtime showtime465 = new Showtime(LocalDateTime.of(2019,11,21,18,30),movie_terminator,bedokcinema2,MovieType.BLOCKBUSTER);
		bedokcinema2.addShowTime(showtime463);
		bedokcinema2.addShowTime(showtime464);
		bedokcinema2.addShowTime(showtime465);


		//BedokCinema(thegoodliar) 21/11
		Showtime showtime466 = new Showtime(LocalDateTime.of(2019,11,21,10,00),movie_thegoodliar,bedokcinema4,MovieType.THREED);
		Showtime showtime467 = new Showtime(LocalDateTime.of(2019,11,21,12,30),movie_thegoodliar,bedokcinema4,MovieType.NORMAL);
		Showtime showtime468 = new Showtime(LocalDateTime.of(2019,11,21,18,30),movie_thegoodliar,bedokcinema4,MovieType.NORMAL);
		bedokcinema4.addShowTime(showtime466);
		bedokcinema4.addShowTime(showtime467);
		bedokcinema4.addShowTime(showtime468);

		//bedokcinema(movie_21Bridges) 21/11
		Showtime showtime469 = new Showtime(LocalDateTime.of(2019,11,21,10,00),movie_21Bridges,bedokcinema3,MovieType.THREED);
		Showtime showtime470 = new Showtime(LocalDateTime.of(2019,11,21,15,00),movie_21Bridges,bedokcinema5,MovieType.NORMAL);
		Showtime showtime471 = new Showtime(LocalDateTime.of(2019,11,21,20,30),movie_21Bridges,bedokcinema6,MovieType.NORMAL);
		bedokcinema3.addShowTime(showtime469);
		bedokcinema5.addShowTime(showtime470);
		bedokcinema6.addShowTime(showtime471);

		//////////////////////////////////////////////      22/11 	//////////////////////////////////////////////////////

		//BedokCinema(midway) 22/11
		Showtime showtime472 = new Showtime(LocalDateTime.of(2019,11,22,10,00),movie_thegoodliar,bedokcinema1,MovieType.NORMAL);
		Showtime showtime473 = new Showtime(LocalDateTime.of(2019,11,22,16,30),movie_thegoodliar,bedokcinema1,MovieType.NORMAL);
		Showtime showtime474 = new Showtime(LocalDateTime.of(2019,11,22,19,30),movie_thegoodliar,bedokcinema1,MovieType.NORMAL);
		bedokcinema1.addShowTime(showtime472);
		bedokcinema1.addShowTime(showtime473);
		bedokcinema1.addShowTime(showtime474);

		//BedokCinema(terminator) 22/11
		Showtime showtime475 = new Showtime(LocalDateTime.of(2019,11,22,11,00),movie_terminator,bedokcinema2,MovieType.BLOCKBUSTER);
		Showtime showtime476 = new Showtime(LocalDateTime.of(2019,11,22,14,30),movie_terminator,bedokcinema2,MovieType.BLOCKBUSTER);
		Showtime showtime477 = new Showtime(LocalDateTime.of(2019,11,22,17,30),movie_terminator,bedokcinema2,MovieType.BLOCKBUSTER);
		bedokcinema2.addShowTime(showtime475);
		bedokcinema2.addShowTime(showtime476);
		bedokcinema2.addShowTime(showtime477);


		//BedokCinema(thegoodliar) 22/11
		Showtime showtime478 = new Showtime(LocalDateTime.of(2019,11,22,11,00),movie_thegoodliar,bedokcinema4,MovieType.THREED);
		Showtime showtime479 = new Showtime(LocalDateTime.of(2019,11,22,13,30),movie_thegoodliar,bedokcinema4,MovieType.NORMAL);
		Showtime showtime480 = new Showtime(LocalDateTime.of(2019,11,22,19,30),movie_thegoodliar,bedokcinema4,MovieType.NORMAL);
		bedokcinema4.addShowTime(showtime478);
		bedokcinema4.addShowTime(showtime479);
		bedokcinema4.addShowTime(showtime480);

		//bedokcinema(movie_21Bridges) 22/11
		Showtime showtime481 = new Showtime(LocalDateTime.of(2019,11,22,10,30),movie_21Bridges,bedokcinema3,MovieType.THREED);
		Showtime showtime482 = new Showtime(LocalDateTime.of(2019,11,22,16,00),movie_21Bridges,bedokcinema5,MovieType.NORMAL);
		Showtime showtime483 = new Showtime(LocalDateTime.of(2019,11,22,18,30),movie_21Bridges,bedokcinema6,MovieType.NORMAL);
		bedokcinema3.addShowTime(showtime481);
		bedokcinema5.addShowTime(showtime482);
		bedokcinema6.addShowTime(showtime483);

		//////////////////////////////////////////////      23/11 	//////////////////////////////////////////////////////

		//BedokCinema(midway) 23/11
		Showtime showtime484 = new Showtime(LocalDateTime.of(2019,11,23,9,00),movie_thegoodliar,bedokcinema1,MovieType.NORMAL);
		Showtime showtime485 = new Showtime(LocalDateTime.of(2019,11,23,10,30),movie_thegoodliar,bedokcinema1,MovieType.NORMAL);
		Showtime showtime486 = new Showtime(LocalDateTime.of(2019,11,23,17,30),movie_thegoodliar,bedokcinema1,MovieType.NORMAL);
		bedokcinema1.addShowTime(showtime484);
		bedokcinema1.addShowTime(showtime485);
		bedokcinema1.addShowTime(showtime486);

		//BedokCinema(terminator) 23/11
		Showtime showtime487 = new Showtime(LocalDateTime.of(2019,11,23,10,00),movie_terminator,bedokcinema2,MovieType.BLOCKBUSTER);
		Showtime showtime488 = new Showtime(LocalDateTime.of(2019,11,23,12,30),movie_terminator,bedokcinema2,MovieType.BLOCKBUSTER);
		Showtime showtime489 = new Showtime(LocalDateTime.of(2019,11,23,18,30),movie_terminator,bedokcinema2,MovieType.BLOCKBUSTER);
		bedokcinema2.addShowTime(showtime487);
		bedokcinema2.addShowTime(showtime488);
		bedokcinema2.addShowTime(showtime489);


		//BedokCinema(thegoodliar) 23/11
		Showtime showtime490 = new Showtime(LocalDateTime.of(2019,11,23,10,00),movie_thegoodliar,bedokcinema4,MovieType.THREED);
		Showtime showtime491 = new Showtime(LocalDateTime.of(2019,11,23,12,30),movie_thegoodliar,bedokcinema4,MovieType.NORMAL);
		Showtime showtime492 = new Showtime(LocalDateTime.of(2019,11,23,18,30),movie_thegoodliar,bedokcinema4,MovieType.NORMAL);
		bedokcinema4.addShowTime(showtime490);
		bedokcinema4.addShowTime(showtime491);
		bedokcinema4.addShowTime(showtime492);

		//bedokcinema(movie_21Bridges) 23/11
		Showtime showtime493 = new Showtime(LocalDateTime.of(2019,11,23,10,00),movie_21Bridges,bedokcinema3,MovieType.THREED);
		Showtime showtime494 = new Showtime(LocalDateTime.of(2019,11,23,15,00),movie_21Bridges,bedokcinema5,MovieType.NORMAL);
		Showtime showtime495 = new Showtime(LocalDateTime.of(2019,11,23,20,30),movie_21Bridges,bedokcinema6,MovieType.NORMAL);
		bedokcinema3.addShowTime(showtime493);
		bedokcinema5.addShowTime(showtime494);
		bedokcinema6.addShowTime(showtime495);

		//////////////////////////////////////////////      24/11 	//////////////////////////////////////////////////////

		//BedokCinema(midway) 24/11
		Showtime showtime496 = new Showtime(LocalDateTime.of(2019,11,24,10,00),movie_thegoodliar,bedokcinema1,MovieType.NORMAL);
		Showtime showtime497 = new Showtime(LocalDateTime.of(2019,11,24,16,30),movie_thegoodliar,bedokcinema1,MovieType.NORMAL);
		Showtime showtime498 = new Showtime(LocalDateTime.of(2019,11,24,19,30),movie_thegoodliar,bedokcinema1,MovieType.NORMAL);
		bedokcinema1.addShowTime(showtime496);
		bedokcinema1.addShowTime(showtime497);
		bedokcinema1.addShowTime(showtime498);

		//BedokCinema(terminator) 24/11
		Showtime showtime499 = new Showtime(LocalDateTime.of(2019,11,24,11,00),movie_terminator,bedokcinema2,MovieType.BLOCKBUSTER);
		Showtime showtime500 = new Showtime(LocalDateTime.of(2019,11,24,14,30),movie_terminator,bedokcinema2,MovieType.BLOCKBUSTER);
		Showtime showtime501 = new Showtime(LocalDateTime.of(2019,11,24,17,30),movie_terminator,bedokcinema2,MovieType.BLOCKBUSTER);
		bedokcinema2.addShowTime(showtime499);
		bedokcinema2.addShowTime(showtime500);
		bedokcinema2.addShowTime(showtime501);


		//BedokCinema(thegoodliar) 24/11
		Showtime showtime502 = new Showtime(LocalDateTime.of(2019,11,24,11,00),movie_thegoodliar,bedokcinema4,MovieType.THREED);
		Showtime showtime503 = new Showtime(LocalDateTime.of(2019,11,24,13,30),movie_thegoodliar,bedokcinema4,MovieType.NORMAL);
		Showtime showtime504 = new Showtime(LocalDateTime.of(2019,11,24,19,30),movie_thegoodliar,bedokcinema4,MovieType.NORMAL);
		bedokcinema4.addShowTime(showtime502);
		bedokcinema4.addShowTime(showtime503);
		bedokcinema4.addShowTime(showtime504);

		//bedokcinema(movie_21Bridges) 24/11
		Showtime showtime505 = new Showtime(LocalDateTime.of(2019,11,24,10,30),movie_21Bridges,bedokcinema3,MovieType.THREED);
		Showtime showtime506 = new Showtime(LocalDateTime.of(2019,11,24,16,00),movie_21Bridges,bedokcinema5,MovieType.NORMAL);
		Showtime showtime507 = new Showtime(LocalDateTime.of(2019,11,24,18,30),movie_21Bridges,bedokcinema6,MovieType.NORMAL);
		bedokcinema3.addShowTime(showtime505);
		bedokcinema5.addShowTime(showtime506);
		bedokcinema6.addShowTime(showtime507);

		//////////////////////////////////////////////      25/11 	//////////////////////////////////////////////////////

		//BedokCinema(midway) 25/11
		Showtime showtime508 = new Showtime(LocalDateTime.of(2019,11,25,9,00),movie_thegoodliar,bedokcinema1,MovieType.NORMAL);
		Showtime showtime509 = new Showtime(LocalDateTime.of(2019,11,25,10,30),movie_thegoodliar,bedokcinema1,MovieType.NORMAL);
		Showtime showtime510 = new Showtime(LocalDateTime.of(2019,11,25,17,30),movie_thegoodliar,bedokcinema1,MovieType.NORMAL);
		bedokcinema1.addShowTime(showtime508);
		bedokcinema1.addShowTime(showtime509);
		bedokcinema1.addShowTime(showtime510);

		//BedokCinema(terminator) 25/11
		Showtime showtime511 = new Showtime(LocalDateTime.of(2019,11,25,10,00),movie_terminator,bedokcinema2,MovieType.BLOCKBUSTER);
		Showtime showtime512 = new Showtime(LocalDateTime.of(2019,11,25,12,30),movie_terminator,bedokcinema2,MovieType.BLOCKBUSTER);
		Showtime showtime513 = new Showtime(LocalDateTime.of(2019,11,25,18,30),movie_terminator,bedokcinema2,MovieType.BLOCKBUSTER);
		bedokcinema2.addShowTime(showtime511);
		bedokcinema2.addShowTime(showtime512);
		bedokcinema2.addShowTime(showtime513);


		//BedokCinema(thegoodliar) 25/11
		Showtime showtime514 = new Showtime(LocalDateTime.of(2019,11,25,10,00),movie_thegoodliar,bedokcinema4,MovieType.THREED);
		Showtime showtime515 = new Showtime(LocalDateTime.of(2019,11,25,12,30),movie_thegoodliar,bedokcinema4,MovieType.NORMAL);
		Showtime showtime516 = new Showtime(LocalDateTime.of(2019,11,25,18,30),movie_thegoodliar,bedokcinema4,MovieType.NORMAL);
		bedokcinema4.addShowTime(showtime514);
		bedokcinema4.addShowTime(showtime515);
		bedokcinema4.addShowTime(showtime516);

		//bedokcinema(movie_21Bridges) 25/11
		Showtime showtime517 = new Showtime(LocalDateTime.of(2019,11,25,10,00),movie_21Bridges,bedokcinema3,MovieType.THREED);
		Showtime showtime518 = new Showtime(LocalDateTime.of(2019,11,25,15,00),movie_21Bridges,bedokcinema5,MovieType.NORMAL);
		Showtime showtime519 = new Showtime(LocalDateTime.of(2019,11,25,20,30),movie_21Bridges,bedokcinema6,MovieType.NORMAL);
		bedokcinema3.addShowTime(showtime517);
		bedokcinema5.addShowTime(showtime518);
		bedokcinema6.addShowTime(showtime519);

		//////////////////////////////////////////////      26/11 	//////////////////////////////////////////////////////

		//BedokCinema(midway) 26/11
		Showtime showtime520 = new Showtime(LocalDateTime.of(2019,11,26,10,00),movie_thegoodliar,bedokcinema1,MovieType.NORMAL);
		Showtime showtime521 = new Showtime(LocalDateTime.of(2019,11,26,16,30),movie_thegoodliar,bedokcinema1,MovieType.NORMAL);
		Showtime showtime522 = new Showtime(LocalDateTime.of(2019,11,26,19,30),movie_thegoodliar,bedokcinema1,MovieType.NORMAL);
		bedokcinema1.addShowTime(showtime520);
		bedokcinema1.addShowTime(showtime521);
		bedokcinema1.addShowTime(showtime522);

		//BedokCinema(terminator) 26/11
		Showtime showtime523 = new Showtime(LocalDateTime.of(2019,11,26,11,00),movie_terminator,bedokcinema2,MovieType.BLOCKBUSTER);
		Showtime showtime524 = new Showtime(LocalDateTime.of(2019,11,26,14,30),movie_terminator,bedokcinema2,MovieType.BLOCKBUSTER);
		Showtime showtime525 = new Showtime(LocalDateTime.of(2019,11,26,17,30),movie_terminator,bedokcinema2,MovieType.BLOCKBUSTER);
		bedokcinema2.addShowTime(showtime523);
		bedokcinema2.addShowTime(showtime524);
		bedokcinema2.addShowTime(showtime525);


		//BedokCinema(thegoodliar) 26/11
		Showtime showtime526 = new Showtime(LocalDateTime.of(2019,11,26,11,00),movie_thegoodliar,bedokcinema4,MovieType.THREED);
		Showtime showtime527 = new Showtime(LocalDateTime.of(2019,11,26,13,30),movie_thegoodliar,bedokcinema4,MovieType.NORMAL);
		Showtime showtime528 = new Showtime(LocalDateTime.of(2019,11,26,19,30),movie_thegoodliar,bedokcinema4,MovieType.NORMAL);
		bedokcinema4.addShowTime(showtime526);
		bedokcinema4.addShowTime(showtime527);
		bedokcinema4.addShowTime(showtime528);

		//bedokcinema(movie_21Bridges) 26/11
		Showtime showtime529 = new Showtime(LocalDateTime.of(2019,11,26,10,30),movie_21Bridges,bedokcinema3,MovieType.THREED);
		Showtime showtime530 = new Showtime(LocalDateTime.of(2019,11,26,16,00),movie_21Bridges,bedokcinema5,MovieType.NORMAL);
		Showtime showtime531 = new Showtime(LocalDateTime.of(2019,11,26,18,30),movie_21Bridges,bedokcinema6,MovieType.NORMAL);
		bedokcinema3.addShowTime(showtime529);
		bedokcinema5.addShowTime(showtime530);
		bedokcinema6.addShowTime(showtime531);

		//////////////////////////////////////////////      27/11 	//////////////////////////////////////////////////////

		//BedokCinema(midway) 27/11
		Showtime showtime532 = new Showtime(LocalDateTime.of(2019,11,27,9,00),movie_thegoodliar,bedokcinema1,MovieType.NORMAL);
		Showtime showtime533 = new Showtime(LocalDateTime.of(2019,11,27,10,30),movie_thegoodliar,bedokcinema1,MovieType.NORMAL);
		Showtime showtime534 = new Showtime(LocalDateTime.of(2019,11,27,17,30),movie_thegoodliar,bedokcinema1,MovieType.NORMAL);
		bedokcinema1.addShowTime(showtime532);
		bedokcinema1.addShowTime(showtime533);
		bedokcinema1.addShowTime(showtime534);

		//BedokCinema(terminator) 27/11
		Showtime showtime535 = new Showtime(LocalDateTime.of(2019,11,27,10,00),movie_terminator,bedokcinema2,MovieType.BLOCKBUSTER);
		Showtime showtime536 = new Showtime(LocalDateTime.of(2019,11,27,13,30),movie_terminator,bedokcinema2,MovieType.BLOCKBUSTER);
		Showtime showtime537 = new Showtime(LocalDateTime.of(2019,11,27,18,30),movie_terminator,bedokcinema2,MovieType.BLOCKBUSTER);
		bedokcinema2.addShowTime(showtime535);
		bedokcinema2.addShowTime(showtime536);
		bedokcinema2.addShowTime(showtime537);


		//BedokCinema(thegoodliar) 27/11
		Showtime showtime538 = new Showtime(LocalDateTime.of(2019,11,27,10,00),movie_thegoodliar,bedokcinema4,MovieType.THREED);
		Showtime showtime539 = new Showtime(LocalDateTime.of(2019,11,27,13,30),movie_thegoodliar,bedokcinema4,MovieType.NORMAL);
		Showtime showtime540 = new Showtime(LocalDateTime.of(2019,11,27,18,30),movie_thegoodliar,bedokcinema4,MovieType.NORMAL);
		bedokcinema4.addShowTime(showtime538);
		bedokcinema4.addShowTime(showtime539);
		bedokcinema4.addShowTime(showtime540);

		//bedokcinema(movie_21Bridges) 27/11
		Showtime showtime541 = new Showtime(LocalDateTime.of(2019,11,27,10,00),movie_21Bridges,bedokcinema3,MovieType.THREED);
		Showtime showtime542 = new Showtime(LocalDateTime.of(2019,11,27,15,00),movie_21Bridges,bedokcinema5,MovieType.NORMAL);
		Showtime showtime543 = new Showtime(LocalDateTime.of(2019,11,27,20,30),movie_21Bridges,bedokcinema6,MovieType.NORMAL);
		bedokcinema3.addShowTime(showtime541);
		bedokcinema5.addShowTime(showtime542);
		bedokcinema6.addShowTime(showtime543);

		//////////////////////////////////////////////      28/11 	//////////////////////////////////////////////////////

		//BedokCinema(midway) 28/11
		Showtime showtime544 = new Showtime(LocalDateTime.of(2019,11,28,10,00),movie_thegoodliar,bedokcinema1,MovieType.NORMAL);
		Showtime showtime545 = new Showtime(LocalDateTime.of(2019,11,28,16,30),movie_thegoodliar,bedokcinema1,MovieType.NORMAL);
		Showtime showtime546 = new Showtime(LocalDateTime.of(2019,11,28,19,30),movie_thegoodliar,bedokcinema1,MovieType.NORMAL);
		bedokcinema1.addShowTime(showtime544);
		bedokcinema1.addShowTime(showtime545);
		bedokcinema1.addShowTime(showtime546);

		//BedokCinema(terminator) 28/11
		Showtime showtime547 = new Showtime(LocalDateTime.of(2019,11,28,11,00),movie_terminator,bedokcinema2,MovieType.BLOCKBUSTER);
		Showtime showtime548 = new Showtime(LocalDateTime.of(2019,11,28,14,30),movie_terminator,bedokcinema2,MovieType.BLOCKBUSTER);
		Showtime showtime549 = new Showtime(LocalDateTime.of(2019,11,28,17,30),movie_terminator,bedokcinema2,MovieType.BLOCKBUSTER);
		bedokcinema2.addShowTime(showtime547);
		bedokcinema2.addShowTime(showtime548);
		bedokcinema2.addShowTime(showtime549);


		//BedokCinema(thegoodliar) 28/11
		Showtime showtime550 = new Showtime(LocalDateTime.of(2019,11,28,11,00),movie_thegoodliar,bedokcinema4,MovieType.THREED);
		Showtime showtime551 = new Showtime(LocalDateTime.of(2019,11,28,13,30),movie_thegoodliar,bedokcinema4,MovieType.NORMAL);
		Showtime showtime552 = new Showtime(LocalDateTime.of(2019,11,28,19,30),movie_thegoodliar,bedokcinema4,MovieType.NORMAL);
		bedokcinema4.addShowTime(showtime550);
		bedokcinema4.addShowTime(showtime551);
		bedokcinema4.addShowTime(showtime552);

		//bedokcinema(movie_21Bridges) 28/11
		Showtime showtime553 = new Showtime(LocalDateTime.of(2019,11,28,10,30),movie_21Bridges,bedokcinema3,MovieType.THREED);
		Showtime showtime554 = new Showtime(LocalDateTime.of(2019,11,28,16,00),movie_21Bridges,bedokcinema5,MovieType.NORMAL);
		Showtime showtime555 = new Showtime(LocalDateTime.of(2019,11,28,18,30),movie_21Bridges,bedokcinema6,MovieType.NORMAL);
		bedokcinema3.addShowTime(showtime553);
		bedokcinema5.addShowTime(showtime554);
		bedokcinema6.addShowTime(showtime555);

		//////////////////////////////////////////////      29/11 	//////////////////////////////////////////////////////

		//BedokCinema(midway) 29/11
		Showtime showtime556 = new Showtime(LocalDateTime.of(2019,11,29,9,00),movie_thegoodliar,bedokcinema1,MovieType.NORMAL);
		Showtime showtime557 = new Showtime(LocalDateTime.of(2019,11,29,10,30),movie_thegoodliar,bedokcinema1,MovieType.NORMAL);
		Showtime showtime558 = new Showtime(LocalDateTime.of(2019,11,29,17,30),movie_thegoodliar,bedokcinema1,MovieType.NORMAL);
		bedokcinema1.addShowTime(showtime556);
		bedokcinema1.addShowTime(showtime557);
		bedokcinema1.addShowTime(showtime558);

		//BedokCinema(terminator) 29/11
		Showtime showtime559 = new Showtime(LocalDateTime.of(2019,11,29,10,00),movie_terminator,bedokcinema2,MovieType.BLOCKBUSTER);
		Showtime showtime560 = new Showtime(LocalDateTime.of(2019,11,29,13,30),movie_terminator,bedokcinema2,MovieType.BLOCKBUSTER);
		Showtime showtime561 = new Showtime(LocalDateTime.of(2019,11,29,18,30),movie_terminator,bedokcinema2,MovieType.BLOCKBUSTER);
		bedokcinema2.addShowTime(showtime559);
		bedokcinema2.addShowTime(showtime560);
		bedokcinema2.addShowTime(showtime561);


		//BedokCinema(thegoodliar) 29/11
		Showtime showtime562 = new Showtime(LocalDateTime.of(2019,11,29,10,00),movie_thegoodliar,bedokcinema4,MovieType.THREED);
		Showtime showtime563 = new Showtime(LocalDateTime.of(2019,11,29,13,30),movie_thegoodliar,bedokcinema4,MovieType.NORMAL);
		Showtime showtime564 = new Showtime(LocalDateTime.of(2019,11,29,18,30),movie_thegoodliar,bedokcinema4,MovieType.NORMAL);
		bedokcinema4.addShowTime(showtime562);
		bedokcinema4.addShowTime(showtime563);
		bedokcinema4.addShowTime(showtime564);

		//bedokcinema(movie_21Bridges) 29/11
		Showtime showtime565 = new Showtime(LocalDateTime.of(2019,11,29,10,00),movie_21Bridges,bedokcinema3,MovieType.THREED);
		Showtime showtime566 = new Showtime(LocalDateTime.of(2019,11,29,15,00),movie_21Bridges,bedokcinema5,MovieType.NORMAL);
		Showtime showtime567 = new Showtime(LocalDateTime.of(2019,11,29,20,30),movie_21Bridges,bedokcinema6,MovieType.NORMAL);
		bedokcinema3.addShowTime(showtime565);
		bedokcinema5.addShowTime(showtime566);
		bedokcinema6.addShowTime(showtime567);

		//////////////////////////////////////////////      30/11 	//////////////////////////////////////////////////////

		//BedokCinema(midway) 30/11
		Showtime showtime568 = new Showtime(LocalDateTime.of(2019,11,30,10,00),movie_thegoodliar,bedokcinema1,MovieType.NORMAL);
		Showtime showtime569 = new Showtime(LocalDateTime.of(2019,11,30,16,30),movie_thegoodliar,bedokcinema1,MovieType.NORMAL);
		Showtime showtime570 = new Showtime(LocalDateTime.of(2019,11,30,19,30),movie_thegoodliar,bedokcinema1,MovieType.NORMAL);
		bedokcinema1.addShowTime(showtime568);
		bedokcinema1.addShowTime(showtime569);
		bedokcinema1.addShowTime(showtime570);

		//BedokCinema(terminator) 30/11
		Showtime showtime571 = new Showtime(LocalDateTime.of(2019,11,30,11,00),movie_terminator,bedokcinema2,MovieType.BLOCKBUSTER);
		Showtime showtime572 = new Showtime(LocalDateTime.of(2019,11,30,14,30),movie_terminator,bedokcinema2,MovieType.BLOCKBUSTER);
		Showtime showtime573 = new Showtime(LocalDateTime.of(2019,11,30,17,30),movie_terminator,bedokcinema2,MovieType.BLOCKBUSTER);
		bedokcinema2.addShowTime(showtime571);
		bedokcinema2.addShowTime(showtime572);
		bedokcinema2.addShowTime(showtime573);


		//BedokCinema(thegoodliar) 30/11
		Showtime showtime574 = new Showtime(LocalDateTime.of(2019,11,30,11,00),movie_thegoodliar,bedokcinema4,MovieType.THREED);
		Showtime showtime575 = new Showtime(LocalDateTime.of(2019,11,30,13,30),movie_thegoodliar,bedokcinema4,MovieType.NORMAL);
		Showtime showtime576 = new Showtime(LocalDateTime.of(2019,11,30,19,30),movie_thegoodliar,bedokcinema4,MovieType.NORMAL);
		bedokcinema4.addShowTime(showtime574);
		bedokcinema4.addShowTime(showtime575);
		bedokcinema4.addShowTime(showtime576);

		//bedokcinema(movie_21Bridges) 30/11
		Showtime showtime577 = new Showtime(LocalDateTime.of(2019,11,30,10,30),movie_21Bridges,bedokcinema3,MovieType.THREED);
		Showtime showtime578 = new Showtime(LocalDateTime.of(2019,11,30,16,00),movie_21Bridges,bedokcinema5,MovieType.NORMAL);
		Showtime showtime579 = new Showtime(LocalDateTime.of(2019,11,30,18,30),movie_21Bridges,bedokcinema6,MovieType.NORMAL);
		bedokcinema3.addShowTime(showtime577);
		bedokcinema5.addShowTime(showtime578);
		bedokcinema6.addShowTime(showtime579);





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
