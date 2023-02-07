/*
 * Class: CMSC 201 CRN 30417
 * Instructor: Jason Lee
 * Description: This program calculates the cost of driving
 * Due: 02/05/2023
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Andrea Almeda
*/

import java.util.Scanner;

public class CostOfDriving {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Creating Scanner object
		Scanner input = new Scanner(System.in);
		
		// Variables to hold user input
		double distance, milesPerGallon, pricePerGallon, costDriving;
		
		// Getting driving distance
		System.out.print("Enter the driving distance: ");
		distance = input.nextDouble();
		
		// Getting miles per gallon
		System.out.print("Enter miles per gallon: ");
		milesPerGallon = input.nextDouble();
		
		// Getting price per gallon
		System.out.print("Enter price per gallon: ");
		pricePerGallon = input.nextDouble();
		
		// Calculations to find the cost of driving
		costDriving = (distance / milesPerGallon) * pricePerGallon;
		
		// Display output
		System.out.print("The cost of driving is $" + costDriving);
	
	}

}
