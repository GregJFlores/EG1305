package assignment_4;
//***************************************************************************
//Program: Prime.java                                                    
//Author: Gregory Flores                                                  
//Language: Java                                                            
//Description: display all prime numbers smaller than user inputs
//***************************************************************************

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Prime 
{
	public static void main(String[] args)
	{
		//instantiate Scanner Obkect
		Scanner input = new Scanner(System.in);
		
		//create user input variable 
		int userInput = 0;
		
		//create counter to keep track of how many times a number has a remainder that is 0
		int counter = 0;
		
		//create an ArrayList to store each prime number
		ArrayList<Integer> prime = new ArrayList<Integer>();
		
		//ask for user input
		System.out.println("Enter a number. The program will print all the prime numbers smaller than this number");
		userInput = input.nextInt();
		
		//start from user input and count down
		for(int i = userInput; i >= 1; i--)
		{
			//start from 1 and count up until i
			for(int j = 1; j <= i; j++)
			{	
				//if i/j has a remainder of zero then add 1 to counter
				if( i % j == 0)
				{
					counter++;
					
				}
			
			}
			//if counter is equal to 2 (therefore divisible by 1 and itself) add number to prime ArrayList
			if(counter == 2)
			{
				
				prime.add(i);
			}
			
			counter = 0;
		}
		//sort prime ArrayList in Ascending order 
		Collections.sort(prime);
		
		//display the array
		for(int i = 0; i < prime.size(); i++)
		{
			
			System.out.print(prime.get(i) + " ");
			
		}
		
		System.out.println("\n\nThere are a total of "+ prime.size()+" prime numbers");
		
	}
}
