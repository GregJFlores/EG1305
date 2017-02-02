package assignment_2;
//***************************************************************************
//Program: SumDigits.java                                                     
//Author: Gregory Flores                                                  
//Language: Java                                                            
//Description: intakes a number between 0-1000 and outputs the sum of the digits
//***************************************************************************

//import Scanner
import java.util.Scanner;

public class SumDigits 
{
	public static void main(String[] args)
	{
		//declare variables
		Scanner input = new Scanner(System.in);
		String digits = "";
		boolean flag = false;
		int digitsInt = 0;
		int sum = 0;
		
		//catch user input error using do while loop
		do
		{
		//ask user for input	
		System.out.println("Enter a number between 0 - 1000: ");
		digits = input.next();
		
		//convert digits to an integer 
		digitsInt = Integer.parseInt(digits);
		//check if digits is over 1000
		if(digitsInt > 1000)
		{
			System.out.println("Error: number cannot be above 1000, please try again.");
			flag = false;
		}
		//check if digits is below 0
		else if(digitsInt < 0)
		{
				System.out.println("Error: number cannot be negative, please try again.");
				flag = false;
		}
		//if input is between 0-1000 exit loop
		else
			flag = true;
		}while(flag == false);	//loop until user enters correct values
		
		//loop through each index of digits and convert to a digit while checking if it is a digit between 0-9
		//add each index to sum, every iteration of the loop
		for(int i = 0; i < (digits.length()); i++)
		{
			sum += Character.digit(digits.charAt(i), 10);
			
		}
		
		//output sum to console
		System.out.println("The sum of the digits in " + digitsInt +" is "+ sum);
		
		
	}

}
