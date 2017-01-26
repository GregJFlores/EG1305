package assignment_1;

//************************************************************************
//Program: Circle.java                                                   *
//Author: Gregory Flores                                                 *
//Language: Java                                                         *
//Description: Calculates the parameter, diameter and area of the Circle *
//************************************************************************

//import appropriate packages for Scanner and Decimal Format
import java.text.DecimalFormat;
import java.util.Scanner;

public class Circle 
{
	public static void main(String[] args)
	{
		//define variables
		int radius = 0;
		double area = 0;
		double perimeter = 0;
		int diameter = 0;
		
		//Declare Scanner object for user input
		Scanner input = new Scanner(System.in);
		
		//format to only two numbers after decimal place
		DecimalFormat f = new DecimalFormat();
		f.setMaximumFractionDigits(2);
		
		//Ask user for a radius
		System.out.println("Enter a radius: ");
		
		//Scanner reads user input from keyboard and assigns the value to radius
		radius = input.nextInt();
		
		//calculates the parameter and area of the Circle using the Math.PI and MAth.pow class
		area = Math.PI * Math.pow(radius, 2);
		perimeter = 2 * Math.PI * radius;
		diameter = 2 * radius;
		
		//Print out results to console
		System.out.println("Diameter is: "+diameter+"\nPerimeter is: "+f.format(perimeter)+"\nArea is: "+f.format(area));
		
		
	}

}
