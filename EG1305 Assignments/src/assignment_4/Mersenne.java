package assignment_4;
//***************************************************************************
//Program: Mersenne.java                                                     
//Author: Gregory Flores                                                  
//Language: Java                                                            
//Description: Display all mersenne prime numbers smaller than user input
//***************************************************************************

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Mersenne 
{
	public static void main(String[] args)
	{
		//Instantiate the Scanner Object
		Scanner input = new Scanner(System.in);
		
		//create user input variable 
		int userInput = 0;
		
		//create counter to keep track of how many times a number has a remainder that is 0
		int counter = 0;
		
		//create ArrayLists to store prime and mersenne prime numbers
		ArrayList<Integer> prime = new ArrayList<Integer>();
		ArrayList<Integer> mersenne = new ArrayList<Integer>();
		
		//ask for user input
		System.out.println("Enter a number. The program will print all the Mersenne prime numbers smaller than this number");
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
		
		
		for(int i = 1; i < prime.size(); i++)
		{
			for(int j = 0; j < prime.size(); j++)
			{
				//if 2 to the power of i minus 1 equals a  prime number from the prime ArrayList, then add to mersenne prime Array list
				if(Math.pow(2,i) - 1 == prime.get(j))
				{
					mersenne.add(prime.get(j));
				}
			}
		}
		
		//display the mersenne prime ArrayList
		for(int i = 0; i < mersenne.size(); i++)
		{
			System.out.print(mersenne.get(i)+" ");
		}
		System.out.print("\n\nThere are a total of " + mersenne.size() + " Mersenne prime numbers");
		
	}
}
