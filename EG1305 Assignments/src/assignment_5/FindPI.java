package assignment_5;


import java.text.DecimalFormat;
import java.util.Scanner;

//***************************************************************************
//Program:                                                     
//Author: Gregory Flores                                                  
//Language: Java                                                            
//Description: 
//***************************************************************************

public class FindPI 
{

	public static void main(String[] args) 
	{
		DecimalFormat f = new DecimalFormat("#0.00");
		Scanner input = new Scanner(System.in);
		
		double pi = 0;
		int iterations = 0;
		
		System.out.println("How many iterations would you like to use?");
		iterations = input.nextInt();
		
		long startTime = System.nanoTime();
		
		for(int i = 0; i < iterations; i++)
		{
			pi += 4*((Math.pow((-1), i))/(2*i + 1));
			
			
		}
		
		long endTime = System.nanoTime();
		
		//not accurate past 10 digits
		System.out.println("PI = "+pi+" after "+iterations+" iterations\nElapsed Time: "+f.format((double)(endTime-startTime)/Math.pow(10, 9))+" seconds");

	}

}
