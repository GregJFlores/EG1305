package assignment_5;
//***************************************************************************
//Program:                                                     
//Author: Gregory Flores                                                  
//Language: Java                                                            
//Description: 
//***************************************************************************

import java.util.Random;
import java.util.Scanner;

public class GeneratePassword 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int lengthOfPwd = 0;
		
		System.out.println("How many digits would you like to use for a numeric password?");
		lengthOfPwd = input.nextInt();
		
		for(int i = 0; i < lengthOfPwd; i++)
		{
			System.out.print(randomGenerator()+" ");
		}
		
		
		
	}
	
	public static int randomGenerator()
	{

		Random rand = new Random();
		
		int randomNum = rand.nextInt((9 - 0) + 1);

		return randomNum;
		
	}

}
