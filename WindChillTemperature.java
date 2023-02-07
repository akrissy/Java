/*
 * Class: CMSC 201 CRN 30417
 * Instructor: Jason Lee
 * Description: This program calculates the wind chill index
 * Due: 02/05/2023
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Andrea Almeda
*/

import java.util.Scanner;

public class WindChillTemperature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Constant variables
		final double FIRST_COEFFICIENT = 35.74;
		final double SECOND_COEFFICIENT = 0.6215;
		final double THIRD_COEFFICIENT = 35.75;
		final double FOURTH_COEFFICIENT = 0.4275;
		final double FIFTH_COEFFICIENT = 0.16;
		
		// Variables
		double ta, v, twc;
		
		// Creating Scanner object
		Scanner input = new Scanner(System.in);
		
		// Getting temperature
		System.out.print("Enter the temperature in Fahrenheit between -56 degrees and 41 degrees: ");
		ta = input.nextDouble();
		
		// Verifying user input
		while (ta > 41 || ta < -56) {
			System.out.print("Error! Please4 input a temperature between -56 and 41 degrees: ");
			ta = input.nextDouble();	
		}
		
		// Getting wind speed
		System.out.print("Enter the wind speed (>= 2) in miles per hour: ");
		v = input.nextDouble();
		
		// Verifying user input
		while (v < 2) {
			System.out.print("Error! Please enter a windspeed greater than or equal to 2: ");
			v = input.nextDouble();
		}
		
		// Calculating wind chill temperature
		twc = FIRST_COEFFICIENT + (SECOND_COEFFICIENT * ta) - (THIRD_COEFFICIENT * Math.pow(v,  FIFTH_COEFFICIENT)) + (FOURTH_COEFFICIENT * ta * Math.pow(v,  FIFTH_COEFFICIENT));
		
		// Displaying output
		System.out.print("The wind chill index is " + twc);

	}

}