package Controller;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.StringTokenizer;


public class IOManager {
	
	
	public static void printMenuTitle(String title) {
		System.out.println("\n\n");
		String upperBorderLine = "______________________________________________________________________________";
		System.out.println(upperBorderLine);
		
		int borderLengthHalf = (upperBorderLine.length()) / 2;
		for (int x = 0 ; x < borderLengthHalf ; x++) {
			System.out.printf("- ");
		}
		System.out.printf("\n");
		int frontSpacing = (upperBorderLine.length() - title.length()) / 2;
		for (int y = 0 ; y < frontSpacing ; y++) {
			System.out.printf(" ");
		}
		System.out.println(title);
		System.out.println(upperBorderLine + "\n");
	}
	
	
	
	public static void printMenuOptions(ArrayList<String> options) {
		int counter = 1;
		System.out.println("\n");
		for (String option : options) {
			System.out.println("  " + counter + ") " + option);
			counter++;
		}
		System.out.println("\n");
	}
	
	public static void printMenuContent(String input) {
		String upperBorderLine = "______________________________________________________________________________";
		int viewLength = upperBorderLine.length();
		StringTokenizer tok = new StringTokenizer(input, " ");
	    StringBuilder output = new StringBuilder(input.length());
	    int lineLen = 0;
	    while (tok.hasMoreTokens()) {
	        String word = tok.nextToken() + " ";

	        if (lineLen + word.length() > viewLength) {
	            output.append("\n");
	            lineLen = 0;
	        }
	        output.append(word);
	        lineLen += word.length();
	    }
		System.out.println(output);
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
