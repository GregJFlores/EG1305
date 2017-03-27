package assignment_6;
//***************************************************************************
//Program: Distance.java                                                    
//Author: Gregory Flores                                                  
//Language: Java                                                            
//Description: 
//***************************************************************************

import java.text.DecimalFormat;
import java.util.Scanner;

public class Distance 
{

	public static void main(String[] args) 
	{
		
Scanner input = new Scanner(System.in);
		
		//should have been integers
		int x1 = 0, x2 = 0, y1 = 0, y2 =0;
		
		
		DecimalFormat f = new DecimalFormat("#0.00");
		
		System.out.println("This program will calculate the distance between two points\n");
		
		System.out.println("Please enter the x and y values for the first point");
		System.out.println("X: ");
		x1 = input.nextInt();
		System.out.println("Y: ");
		y1 = input.nextInt();
		
		System.out.println("Please enter the x and y values for the second point");
		System.out.println("X: ");
		x2 = input.nextInt();
		System.out.println("Y: ");
		y2 = input.nextInt();
		
		
		System.out.println("The distance between these two points is: "+f.format(getDistance(x1,y1,x2,y2)));
		
		

	}
	
	public static double getDistance(int x1, int y1, int x2, int y2)
	{
		
		double distance = 0;
		
		distance = Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
		
		return distance;
		
	}

}
