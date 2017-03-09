package assignment_5;
//***************************************************************************
//Program:                                                     
//Author: Gregory Flores                                                  
//Language: Java                                                            
//Description: 
//***************************************************************************

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class GeneratePasswordChallenge 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int lengthOfPwd = 0;
	
		System.out.println("How many digits would you like to use for a numeric password?");
		lengthOfPwd = input.nextInt();

	

		System.out.print(pwdCreate(lengthOfPwd));
		

		
		
	}
	
	public static int randomGenerator()
	{

		Random rand = new Random();
		
		int randomNum = rand.nextInt((9 - 0) + 1);

		return randomNum;
		
	}
	
	public static HashSet<Integer> pwdCreate(int lengthOfPwd)
	{
		HashSet<Integer> pwd = new HashSet<Integer>();
		
		for(int i = 0; i < lengthOfPwd; i++)
		{
			pwd.add(randomGenerator());
			
		}
		while(pwd.size() != lengthOfPwd)
		{
			pwd.add(randomGenerator());
			
		}
		
		return pwd;
		
	}

}
