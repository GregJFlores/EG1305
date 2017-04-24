package assignment_8;

import java.util.Scanner;

public class Array 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int numOfVals = 0;
		

		System.out.println("How many numbers do you want to enter?");
		
		numOfVals = input.nextInt();
		
		int[] numArray = new int[numOfVals];
		
		getValues(numArray);
		
		System.out.println("Highest Element is: "+getMax(numArray));
		System.out.println("Lowest Element is: "+getMin(numArray));
		System.out.println("The sum of the elements element is: "+getSum(numArray));
		System.out.println("The average of the elements is: "+getAverage(numArray));
		
		
		

	}



	private static void getValues(int[] array)
	{
	  
	   Scanner keyboard = new Scanner(System.in);
	
	   System.out.println("Enter a series of " +
	                 array.length + " numbers.");
	
	  
	   for (int index = 0; index < array.length; index++)
	   {
	      System.out.print("Enter number " +
	                       (index + 1) + ": ");
	      array[index] = keyboard.nextInt();
	   }
	}
	
	private static int getMax(int[] array)
	{
	
		int max = array[0];
		
		for(int i = 0; i < array.length; i++)
		{
			if(array[i] > max)
			{
				max = array[i];
			}
		}
	  
	  
		return max;
	  
	 
	}
	
	private static int getMin(int[] array)
	{
		
		int min = array[0];
		
		for(int i = 0; i < array.length; i++)
		{
			if(array[i] < min)
			{
				min = array[i];
			}
		}
	  
	  
		return min;
	  
	 
	}
	
	private static int getSum(int[] array)
	{
		int sum = 0; 
		
		for(int i = 0; i < array.length; i++)
		{
			sum += array[i];
		}
	  
	  
		return sum;
	  
	 
	}
	
	private static double getAverage(int[] array)
	{
	
	  
		return getSum(array)/array.length;
	  
	 
	}

}