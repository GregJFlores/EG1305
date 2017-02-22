package assignment_3;
//***************************************************************************
//Program: CompareNumbers.java                                                     
//Author: Gregory Flores                                                  
//Language: Java                                                            
//Description: Takes in 3 numbers and calculates min,max,average,product,sum
//***************************************************************************

//import Scanner
import java.util.Scanner;

public class CompareNumbers 
{
	public static void main(String[] args)
	{
		//instantiate Scanner Object
		Scanner input = new Scanner(System.in);
		
		//declare variable
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		
		//ask user for first input
		System.out.println("Enter the first number: ");
		num1 = input.nextInt();
		
		//ask user for second input
		System.out.println("Enter the second number: ");
		num2 = input.nextInt();
		
		//ask user for third input
		System.out.println("Enter the third number: ");
		num3 = input.nextInt();
		
		//decalre max 
		int max = 0;
		
		//calculate max 
		if(num1 >= num2)
		{
			max = num1;
			
		}
		else
		{
			
			max = num2;
		}
		if(num3 >= max)
		{
			
			max = num3;
			
		}
		else //this else block is redundant
		{
			max = max; 
		}
		
		//declare min
		int min = 0;
		
		
		//Calculate min
		if(num1 <= num2)
		{
			min = num1;
			
		}
		else
		{
			
			min = num2;
		}
		if(num3 <= min)
		{
			
			min = num3;
			
		}
		else //this else block is redundant
		{
			min = min;
		}
		//calculate average
		int average = (num1+num2+num3)/3; //Use spaces around operators
		//calculate product
		int product = num1*num2*num3;
		//calculate sum
		int sum = num1+num2+num3;
		
		//output result
		System.out.println("Largest is: " +max+"\nSmallest is: "+min+"\nSum is: "+sum+"\nProduct is: "+product+"\nAverage is: "+average);
	}

}
