package assignment_4;

import java.util.Random;
import java.util.Scanner;

//***************************************************************************
//Program: NumberGuess.java                                                    
//Author: Gregory Flores                                                  
//Language: Java                                                            
//Description: User trys to guess the random number that is generated
//***************************************************************************

public class NumberGuess 
{
	public static void main(String[] args)
	{
		//Instantiate Scanner Object
		Scanner input = new Scanner(System.in);
		
		//Instantiate Random Object
		Random rand = new Random();
		
		//define max and min for rand
		int max = 100;
		int min = 1;
		
		//create flag for program to end
		boolean endFlag = false;
		
		//create user input and ai input variables
		int userInput = 0;
		int aiInput = rand.nextInt((max - min) + 1) + min;
		
		//ask user to enter a number
		System.out.println("Enter a number between 1 - 100: ");
		userInput = input.nextInt();
		
		
		do
		{
		
		//test if user entered a number less than 1
		if(userInput < 1)
		{
			System.out.println("Invalid number try again");
			userInput = input.nextInt();
		}
		//test if user entered a number greater than 100
		else if(userInput > 100)
		{
			System.out.println("Invalid number try again");
			userInput = input.nextInt();
		}
		else
		{
			//test if user's input is greater than ai's random number
			if(userInput > aiInput)
			{
				System.out.println("Guess Lower");
				userInput = input.nextInt();
			}
			//test if user's input is less than ai's random number
			else if(userInput < aiInput)
			{
				System.out.println("Guess Higher");
				userInput = input.nextInt();
			}
			//test if the user's input matches the ai's random number 
			else if(userInput == aiInput)
			{
				System.out.println("You guessed right!");
				//trigger flag to end program
				endFlag = true;
			}
		}
		
		
		}while(endFlag == false);
	}

}
