package assignment_6;
//***************************************************************************
//Program: TestCircle.java                                                    
//Author: Gregory Flores                                                  
//Language: Java                                                            
//Description: 
//***************************************************************************

import java.text.DecimalFormat;
import java.util.Scanner;

public class TestCircle 
{

	public static void main(String[] args) 
	{
		DecimalFormat f = new DecimalFormat("#0.0000");
		Scanner input = new Scanner(System.in);
		
		double radius = 0;
		
		System.out.println("Enter a radius: ");
		radius = input.nextDouble();
		
		Circle c = new Circle(radius);
		
		System.out.println("The radius of the Circle is: "+f.format(c.getRadius()));
		System.out.println("The diameter of the Circle is: "+f.format(c.getDiameter()));
		System.out.println("The area of the Circle is: "+f.format(c.getArea()));
		System.out.println("The circumference of the Circle is: "+f.format(c.getCircumference()));
		
		

	}

}
