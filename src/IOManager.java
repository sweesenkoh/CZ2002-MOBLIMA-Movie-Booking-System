import java.util.InputMismatchException;
import java.util.Scanner;


public class IOManager {
	
	
	
	public static void printMenuOptions(String[] options) {
		int counter = 1;
		for (String option : options) {
			System.out.println(counter + ") " + option);
			counter++;
		}
	}
	
	
	
	public static String getUserInputString(String message) {
		System.out.println(message);
		Scanner sc = new Scanner(System.in);
		String userInput = sc.next();
		return userInput;
	}
	
	
	
	public static int getUserInputInt(String message) {
		System.out.println(message);
		int userInput;
		
		try {
			Scanner sc = new Scanner(System.in);
			userInput = sc.nextInt();
		}catch (InputMismatchException err) {
			System.out.println("You have input the wrong type, please input only integers");
			userInput = getUserInputInt(message);
		}
		return userInput;
	}
	
	
	
	
	//limit the integers input to be within a specified range
	public static int getUserInputInt(String message, int start, int end) {
		System.out.println(message);
		int userInput;
		
		try {
			Scanner sc = new Scanner(System.in);
			userInput = sc.nextInt();

			if (userInput < start || userInput > end) {
				throw new Exception("Invalid input. This input is not among the choices");
			}
		}catch (InputMismatchException err) {
			System.out.println("You have input the wrong type, please input only integers");
			userInput = getUserInputInt(message,start,end);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
			userInput = getUserInputInt(message,start,end);
		}
		
		return userInput;
	}
	
	
	
	
	
	public static double getUserInputDouble(String message) {
		System.out.println(message);
		double userInput;
		
		try {
			Scanner sc = new Scanner(System.in);
			userInput = sc.nextDouble();
		}catch (InputMismatchException err) {
			System.out.println("You have input the wrong type, please input only decimal numbers");
			userInput = getUserInputDouble(message);
		}
		return userInput;
	}

}
