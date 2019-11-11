package Controller;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

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
	
	//the type must have toString method ready
	//this function just display the list, cannot handle selecting them'
	public static <E> void printMultipageOptions(ArrayList<E> array,int numOfOptionsPerPage,String endOptionsChoosingSessionMessage) {
		int numOfReviewsPerPage = numOfOptionsPerPage;
		int multiplier = 0;
		boolean isLastPage = false;
		boolean isFirstPage = true;
		
		while (true) {
			System.out.println("\nPage " + (multiplier + 1) + ": \n");
			isLastPage = false;
			isFirstPage = false;
			for (int x = 1 + (numOfReviewsPerPage*multiplier); x <= array.size() ; x++) {
				if ((x-1) % (numOfReviewsPerPage*(multiplier+1)) == 0 && (x != 1)) {
					break;
				}
				if (x <= numOfReviewsPerPage) {
					isFirstPage = true;
				}
				if (x == array.size()) {
					isLastPage = true;
				}
				System.out.println(x + ") " + array.get(x - 1).toString());
				System.out.println(" ");
			}
			
			ArrayList<String> userChoices = new ArrayList<>();
			userChoices.add(endOptionsChoosingSessionMessage);
			if (!(isLastPage && isFirstPage) && array.size() != 0) {
				if (!isFirstPage){userChoices.add("Previous page");}
				if (!isLastPage) {userChoices.add("Next Page");}
			}
			if (array.size() == 0){
				System.out.println("    " + "There is no available items");
			}
			IOManager.printMenuOptions(userChoices);
			int userChoice = IOManager.getUserInputInt("Please choose an option: ",1,userChoices.size());
			
			if (userChoice == 1) {
				return;
			}else if (userChoice == 2) {
				if (!isFirstPage) {
					multiplier--;
					continue;
				}
			}
			multiplier++;
		}
	}
	
	//return -1 if user wants to return to previous menu
	public static <E> int printMultipageOptionsWithReturnedChoice(ArrayList<E> array,int numOfOptionsPerPage) {
		int numOfReviewsPerPage = numOfOptionsPerPage;
		int multiplier = 0;
		boolean isLastPage = false;
		boolean isFirstPage = true;
		
		while (true) {
			System.out.println("\nPage " + (multiplier + 1) + ": \n");
			isLastPage = false;
			isFirstPage = false;
			int x;
			for (x = 1 + (numOfReviewsPerPage*multiplier); x <= array.size() ; x++) {
				if ((x-1) % (numOfReviewsPerPage*(multiplier+1)) == 0 && (x != 1)) {
					break;
				}
				if (x <= numOfReviewsPerPage) {
					isFirstPage = true;
				}
				if (x == array.size()) {
					isLastPage = true;
				}
				System.out.println("    " + x + ") " + array.get(x - 1).toString());
			}
			
			if (((isFirstPage) && (isLastPage)) || array.size() == 0) {
				int start = 1;
				int end = array.size() + 1;
				if (array.size() == 0){
					System.out.println("    " + "There is no available items\n");
				}
				System.out.println("    " + x + ") " + "Return to previous menu");
				int userChoice = IOManager.getUserInputInt("\nInput your choice: ",start,end);
				if (userChoice == end) {return -1;} else {return userChoice;}
			}
			
			System.out.println("\n\nOptions: ");
			ArrayList<String> userChoices = new ArrayList<>();
			userChoices.add("Choose one of the item");
			userChoices.add("Return to previous menu");
			if (!isFirstPage){userChoices.add("Previous page");}
			if (!isLastPage) {userChoices.add("Next Page");}
			IOManager.printMenuOptions(userChoices);
			int userChoice = IOManager.getUserInputInt("Please choose an option: ",1,userChoices.size());
			
			if (userChoice == 1) {
				int start = 1;
				int end = array.size();
				return IOManager.getUserInputInt("Input your choice: ",start,end);
			}else if (userChoice == 2) {
				return -1;
			}
			else if (userChoice == 3) {
				if (!isFirstPage) {
					multiplier--;
					continue;
				}
			}
			multiplier++;
		}
	}
	
	
	//have to enter empty string
	public static String getUserInputString(String message) {
		System.out.println(message);
		Scanner sc = new Scanner(System.in);
		String userInput = sc.nextLine();
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
	


	public static LocalDate getUserInputDate(String message){

		System.out.println(message);

		try{
			System.out.println("Format: day/month/year, example: 1/12/2019");
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/M/yyyy");
			String userDate = IOManager.getUserInputString("");
			LocalDate localDate = LocalDate.parse(userDate, formatter);
			return localDate;
		}catch (Exception e){
			System.out.println("Wrong format, try again");
			return getUserInputDate(message);
		}
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
	
	
	
	
	
	public static double getUserInputDouble(String message,double start,double end) {
		System.out.println(message);
		double userInput;
		
		try {
			Scanner sc = new Scanner(System.in);
			userInput = sc.nextDouble();
			
			if (userInput < start || userInput > end) {
				throw new Exception("Invalid input. This input is not in the specified range");
			}
		}catch (InputMismatchException err) {
			System.out.println("You have input the wrong type, please input only numbers numbers");
			userInput = getUserInputDouble(message,start,end);
		}catch (Exception e) {
			System.out.println(e.getMessage());
			userInput = getUserInputDouble(message,start,end);
		}
		return userInput;
	}


}
