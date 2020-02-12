import java.util.Scanner;

/**
   This program demonstrates how numeric types and operators behave in Java
*/



public class NumericTypes {
	public static void main (String [] args) {
		//TASK #2 Create a Scanner object here 
		//identifier declarations
		Scanner input= new Scanner(System.in);
		final int NUMBER = 2; // number of scores
		int score1 = 100; // first test score
		int score2 = 95; // second test score
		double BOILING_IN_F = 212; // boiling temperature
		double fToC; // temperature in Celsius
		double Fahrenheit;
		double Celsius;
		double average; // arithmetic average
		String output; // line of output to print out
		//Task #2 declare a variable to hold the user’s temperature
		//Task #2 prompt user to input score1
		System.out.print("Please input your first score:");
		//Task #2 read score1 
		score1 = input.nextInt();
		//Task #2 prompt user to input score2
		System.out.print("Please input your second score:");
		//Task #2 read score2 
		score2 = input.nextInt();
		// Find an arithmetic average
		average = (score1 + score2) / NUMBER;
		output = score1 + " and " + score2 + " have an average of " + average;	
		System.out.println(output);
		// Convert Fahrenheit temperatures to Celsius
		fToC = (5.0/9.0) * (BOILING_IN_F - 32);
		output = BOILING_IN_F + " in Fahrenheit is " + fToC + " in Celsius.";
		System.out.println(output);
		//Task #2 prompt user to input another temperature
		System.out.print("Please input the Fahrenheit you wish to convert to Celsius:");
		//Task #2 read the user’s temperature in Fahrenheit
		Fahrenheit= input.nextDouble();
		//Task #2 convert the user’s temperature to Celsius
		Celsius = (5.0/9.0) * ( Fahrenheit - 32);
		//Task #2 print the user’s temperature in Celsius
		output = Fahrenheit + " in Fahrenheit is " + Celsius + " in Celsius.";
		System.out.println(output);
		System.out.println("Goodbye"); // to show that the program is ended	
	}
}