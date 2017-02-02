package assignment_2;
//***************************************************************************
//Program: MilesPerGallon.java                                                    
//Author: Gregory Flores                                                  
//Language: Java                                                            
//Description: computes the miles-per-gallon of a car
//***************************************************************************

//import scanner and DecimalFormat
import java.text.DecimalFormat;
import java.util.Scanner;

public class MilesPerGallon 
{
	public static void main(String[] args)
	{
		//instantiate scanner object for user input
		Scanner input = new Scanner(System.in);
		
		//instantiate DecimalFormat object to format result to 2 decimal places only
		DecimalFormat format = new DecimalFormat("#0.00");
		
		//declare variables
		double miles = 0;
		double gallons = 0;
		
		//ask user for miles driven
		System.out.println("Enter the miles driven: ");
		miles = input.nextDouble();
		
		//ask user for gallons used
		System.out.println("Enter the gallons of fuel used: ");
		gallons = input.nextDouble();
		
		//output result to console
		System.out.println("The miles-per-gallon is " +format.format(miles/gallons));
		
		
		
		
	}

}
