package assignment_2;
//***************************************************************************
//Program: CountMoney.java                                                    
//Author: Gregory Flores                                                  
//Language: Java                                                            
//Description: computes the amount of dollars, quarters, dimes, nickels and pennies the user enters 
//***************************************************************************

//import scanner
import java.util.Scanner;

public class CountMoney 
{
	public static void main(String[] args)
	{
		//Instantiate scanner object for user input
		Scanner input = new Scanner(System.in);
		
		//declare variable to assign to user input
		int currency = 0;
		
		//ask user for input
		System.out.println("Enter an amount of money in a single digit, for "
				+ "example 1156 represents 11 dollars and 56 cents: ");
		
		//read input from keyboard
		currency = input.nextInt();
		
		//declare dollars and get substring from the first half of the string excluding the last two digits of the user input
		String dollars = (String) String.valueOf(currency).subSequence(0,String.valueOf(currency).length() - 2 );
		
		//declare cents and get substring from the second to last digit to the last digit of the user input
		String cents = (String) String.valueOf(currency).subSequence(String.valueOf(currency).length() - 2,String.valueOf(currency).length());
		
		/* Calculations: First- parse the string cents to an integer then divide by the amount of a quarters and assign to quarters.
		 * Second- parse the string cents to an integer then subtract the amount of quarters, finally divide by the amount of a 
		 * dime and assign to dimes.
		 * Third parse the string cents to an integer then subtract the amount of quarters, subtract the amount of dimes, finally divide 
		 * by the amount of a nickel and assign to nickels.
		 * Fourth- parse the string cents to an integer then subtract the amount of quarters, subtract the amount of dimes,
		 * subtract the amount of nickels, finally divide by the amount of a penny and assign to pennies.
		 */
		int quarters = Integer.parseInt(cents)/25;
		int dimes = (Integer.parseInt(cents)-(quarters*25))/10;
		int nickels = (Integer.parseInt(cents)-(dimes*10)-(quarters*25))/5;
		int pennies = (Integer.parseInt(cents)-(nickels*5)-(dimes*10)-(quarters*25))/1;
		
		//output result to console
		System.out.println("You entered "+currency+" which is $"+dollars+"."+cents
				+ "\nWhich consits of:\n"+quarters+" quarters\n"
						+ dimes+ " dimes\n"+nickels+" nickels\n"+ pennies+" pennies");
		
	}

}
