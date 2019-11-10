
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
	//	generateDatabase();






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
		Showtime showtime47= new Showtime(LocalDateTime.of(2019,11,16,12,30),movie_midway,bishancinema1,MovieType.NORMAL);
		Showtime showtime48 = new Showtime(LocalDateTime.of(2019,11,16,15,30),movie_midway,bishancinema1,MovieType.NORMAL);
		bishancinema1.addShowTime(showtime46);
		bishancinema1.addShowTime(showtime47);
		bishancinema1.addShowTime(showtime48);

		//BishanCinema2(terminator) 16/11

		Showtime showtime49 = new Showtime(LocalDateTime.of(2019,11,16,10,00),movie_terminator,bishancinema2,MovieType.BLOCKBUSTER);
		Showtime showtime50 = new Showtime(LocalDateTime.of(2019,11,16,12,30),movie_terminator,bishancinema2,MovieType.BLOCKBUSTER);
		Showtime showtime51 = new Showtime(LocalDateTime.of(2019,11,16,18,30),movie_terminator,bishancinema2,MovieType.BLOCKBUSTER);
		bishancinema2.addShowTime(showtime49);
		bishancinema2.addShowTime(showtime50);
		bishancinema2.addShowTime(showtime51);

		//BishanCinema3(thegoodliar) 16/11

		Showtime showtime52 = new Showtime(LocalDateTime.of(2019,11,16,9,00),movie_thegoodliar,bishancinema3,MovieType.NORMAL);
		Showtime showtime53 = new Showtime(LocalDateTime.of(2019,11,16,10,30),movie_thegoodliar,bishancinema3,MovieType.NORMAL);
		Showtime showtime54 = new Showtime(LocalDateTime.of(2019,11,16,17,30),movie_thegoodliar,bishancinema3,MovieType.NORMAL);

		bishancinema3.addShowTime(showtime52);
		bishancinema3.addShowTime(showtime53);
		bishancinema3.addShowTime(showtime54);

		//////////////////////////////////////////////      17/11 	//////////////////////////////////////////////////////

		//BishanCinema1(Midway) 17/11
		Showtime showtime55 = new Showtime(LocalDateTime.of(2019,11,17,9,00),movie_midway,bishancinema1,MovieType.THREED);
		Showtime showtime56= new Showtime(LocalDateTime.of(2019,11,17,12,30),movie_midway,bishancinema1,MovieType.NORMAL);
		Showtime showtime57 = new Showtime(LocalDateTime.of(2019,11,17,15,30),movie_midway,bishancinema1,MovieType.NORMAL);
		bishancinema1.addShowTime(showtime55);
		bishancinema1.addShowTime(showtime56);
		bishancinema1.addShowTime(showtime57);

		//BishanCinema2(terminator) 17/11

		Showtime showtime58 = new Showtime(LocalDateTime.of(2019,11,17,10,00),movie_terminator,bishancinema2,MovieType.BLOCKBUSTER);
		Showtime showtime59 = new Showtime(LocalDateTime.of(2019,11,17,12,30),movie_terminator,bishancinema2,MovieType.BLOCKBUSTER);
		Showtime showtime60 = new Showtime(LocalDateTime.of(2019,11,17,18,30),movie_terminator,bishancinema2,MovieType.BLOCKBUSTER);
		bishancinema2.addShowTime(showtime58);
		bishancinema2.addShowTime(showtime59);
		bishancinema2.addShowTime(showtime60);

		//BishanCinema6(thegoodliar) 17/11

		Showtime showtime61 = new Showtime(LocalDateTime.of(2019,11,17,9,00),movie_thegoodliar,bishancinema6,MovieType.NORMAL);
		Showtime showtime62 = new Showtime(LocalDateTime.of(2019,11,17,10,30),movie_thegoodliar,bishancinema6,MovieType.NORMAL);
		Showtime showtime63 = new Showtime(LocalDateTime.of(2019,11,17,17,30),movie_thegoodliar,bishancinema6,MovieType.NORMAL);

		bishancinema6.addShowTime(showtime61);
		bishancinema6.addShowTime(showtime62);
		bishancinema6.addShowTime(showtime63);

		//////////////////////////////////////////////      18/11 	//////////////////////////////////////////////////////

		//bishancinema1(midway) 18/11
		Showtime showtime64 = new Showtime(LocalDateTime.of(2019,11,18,9,00),movie_midway,bishancinema1,MovieType.THREED);
		Showtime showtime65= new Showtime(LocalDateTime.of(2019,11,18,12,30),movie_midway,bishancinema1,MovieType.NORMAL);
		Showtime showtime66 = new Showtime(LocalDateTime.of(2019,11,18,15,30),movie_midway,bishancinema1,MovieType.NORMAL);
		bishancinema1.addShowTime(showtime64);
		bishancinema1.addShowTime(showtime65);
		bishancinema1.addShowTime(showtime66);

		//BishanCinema4(terminator) 18/11

		Showtime showtime67 = new Showtime(LocalDateTime.of(2019,11,18,10,00),movie_terminator,bishancinema4,MovieType.BLOCKBUSTER);
		Showtime showtime68 = new Showtime(LocalDateTime.of(2019,11,18,12,30),movie_terminator,bishancinema4,MovieType.BLOCKBUSTER);
		Showtime showtime69 = new Showtime(LocalDateTime.of(2019,11,18,18,30),movie_terminator,bishancinema4,MovieType.BLOCKBUSTER);
		bishancinema4.addShowTime(showtime67);
		bishancinema4.addShowTime(showtime68);
		bishancinema4.addShowTime(showtime69);

		//BishanCinema8(thegoodliar) 18/11

		Showtime showtime70 = new Showtime(LocalDateTime.of(2019,11,18,9,00),movie_thegoodliar,bishancinema8,MovieType.NORMAL);
		Showtime showtime71 = new Showtime(LocalDateTime.of(2019,11,18,10,30),movie_thegoodliar,bishancinema8,MovieType.NORMAL);
		Showtime showtime72 = new Showtime(LocalDateTime.of(2019,11,18,17,30),movie_thegoodliar,bishancinema8,MovieType.NORMAL);

		bishancinema8.addShowTime(showtime70);
		bishancinema8.addShowTime(showtime71);
		bishancinema8.addShowTime(showtime72);

		//////////////////////////////////////////////     19/11 	//////////////////////////////////////////////////////

		//BishanCinema1(midway) 19/11
		Showtime showtime73 = new Showtime(LocalDateTime.of(2019,11,19,9,00),movie_midway,bishancinema1,MovieType.THREED);
		Showtime showtime74= new Showtime(LocalDateTime.of(2019,11,19,12,30),movie_midway,bishancinema1,MovieType.NORMAL);
		Showtime showtime75 = new Showtime(LocalDateTime.of(2019,11,19,15,30),movie_midway,bishancinema1,MovieType.NORMAL);
		bishancinema1.addShowTime(showtime73);
		bishancinema1.addShowTime(showtime74);
		bishancinema1.addShowTime(showtime75);

		//BishanCinema4(terminator) 19/11

		Showtime showtime76 = new Showtime(LocalDateTime.of(2019,11,19,10,00),movie_terminator,bishancinema4,MovieType.BLOCKBUSTER);
		Showtime showtime77 = new Showtime(LocalDateTime.of(2019,11,19,12,30),movie_terminator,bishancinema4,MovieType.BLOCKBUSTER);
		Showtime showtime78 = new Showtime(LocalDateTime.of(2019,11,19,18,30),movie_terminator,bishancinema4,MovieType.BLOCKBUSTER);
		bishancinema4.addShowTime(showtime76);
		bishancinema4.addShowTime(showtime77);
		bishancinema4.addShowTime(showtime78);

		//BishanCinema8(thegoodliar) 19/11

		Showtime showtime79 = new Showtime(LocalDateTime.of(2019,11,19,9,00),movie_thegoodliar,bishancinema8,MovieType.NORMAL);
		Showtime showtime80 = new Showtime(LocalDateTime.of(2019,11,19,10,30),movie_thegoodliar,bishancinema8,MovieType.NORMAL);
		Showtime showtime81 = new Showtime(LocalDateTime.of(2019,11,19,17,30),movie_thegoodliar,bishancinema8,MovieType.NORMAL);

		bishancinema8.addShowTime(showtime79);
		bishancinema8.addShowTime(showtime80);
		bishancinema8.addShowTime(showtime81);

		//////////////////////////////////////////////      20/11 	//////////////////////////////////////////////////////

		//BishanCinema1(midway) 20/11
		Showtime showtime82 = new Showtime(LocalDateTime.of(2019,11,20,9,00),movie_midway,bishancinema1,MovieType.THREED);
		Showtime showtime83= new Showtime(LocalDateTime.of(2019,11,20,12,30),movie_midway,bishancinema1,MovieType.NORMAL);
		Showtime showtime84 = new Showtime(LocalDateTime.of(2019,11,20,15,30),movie_midway,bishancinema1,MovieType.NORMAL);
		bishancinema1.addShowTime(showtime82);
		bishancinema1.addShowTime(showtime83);
		bishancinema1.addShowTime(showtime84);

		//BishanCinema4(terminator) 20/11

		Showtime showtime85 = new Showtime(LocalDateTime.of(2019,11,20,10,00),movie_terminator,bishancinema4,MovieType.BLOCKBUSTER);
		Showtime showtime86 = new Showtime(LocalDateTime.of(2019,11,20,12,30),movie_terminator,bishancinema4,MovieType.BLOCKBUSTER);
		Showtime showtime87 = new Showtime(LocalDateTime.of(2019,11,20,18,30),movie_terminator,bishancinema4,MovieType.BLOCKBUSTER);
		bishancinema4.addShowTime(showtime85);
		bishancinema4.addShowTime(showtime86);
		bishancinema4.addShowTime(showtime87);

		//BishanCinema6(thegoodliar) 20/11

		Showtime showtime88 = new Showtime(LocalDateTime.of(2019,11,20,9,00),movie_thegoodliar,bishancinema6,MovieType.NORMAL);
		Showtime showtime89 = new Showtime(LocalDateTime.of(2019,11,20,10,30),movie_thegoodliar,bishancinema6,MovieType.NORMAL);
		Showtime showtime90 = new Showtime(LocalDateTime.of(2019,11,20,17,30),movie_thegoodliar,bishancinema6,MovieType.NORMAL);
		bishancinema6.addShowTime(showtime88);
		bishancinema6.addShowTime(showtime89);
		bishancinema6.addShowTime(showtime90);


















		//2. Adding showtime for jurongeast cineplex

		//JurongEastCinema1(midway) 15/11
		Showtime showtime200 = new Showtime(LocalDateTime.of(2019,11,15,9,00),movie_thegoodliar,jurongeastcinema1,MovieType.NORMAL);
		Showtime showtime201 = new Showtime(LocalDateTime.of(2019,11,15,14,30),movie_thegoodliar,jurongeastcinema1,MovieType.NORMAL);
		Showtime showtime202 = new Showtime(LocalDateTime.of(2019,11,15,17,30),movie_thegoodliar,jurongeastcinema1,MovieType.NORMAL);
		jurongeastcinema1.addShowTime(showtime200);
		jurongeastcinema1.addShowTime(showtime201);
		jurongeastcinema1.addShowTime(showtime202);

		//JurongEastCinema2(terminator) 15/11
		Showtime showtime203 = new Showtime(LocalDateTime.of(2019,11,15,10,00),movie_terminator,jurongeastcinema2,MovieType.BLOCKBUSTER);
		Showtime showtime204 = new Showtime(LocalDateTime.of(2019,11,15,15,30),movie_terminator,jurongeastcinema2,MovieType.BLOCKBUSTER);
		Showtime showtime205 = new Showtime(LocalDateTime.of(2019,11,15,21,30),movie_terminator,jurongeastcinema2,MovieType.BLOCKBUSTER);
		jurongeastcinema2.addShowTime(showtime203);
		jurongeastcinema2.addShowTime(showtime204);
		jurongeastcinema2.addShowTime(showtime205);


		//JurongEastCinema3(thegoodliar) 15/11
		Showtime showtime206 = new Showtime(LocalDateTime.of(2019,11,15,10,00),movie_thegoodliar,jurongeastcinema3,MovieType.NORMAL);
		Showtime showtime207 = new Showtime(LocalDateTime.of(2019,11,15,12,30),movie_thegoodliar,jurongeastcinema3,MovieType.NORMAL);
		Showtime showtime208 = new Showtime(LocalDateTime.of(2019,11,15,22,30),movie_thegoodliar,jurongeastcinema3,MovieType.NORMAL);
		jurongeastcinema3.addShowTime(showtime206);
		jurongeastcinema3.addShowTime(showtime207);
		jurongeastcinema3.addShowTime(showtime208);









		//3. Adding showtime for bedok cineplex

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
