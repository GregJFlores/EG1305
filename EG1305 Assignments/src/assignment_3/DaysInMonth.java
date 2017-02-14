package assignment_3;

//import scanner 
import java.util.Scanner;

//***************************************************************************
//Program: DaysInMonrh.java                                                    
//Author: Gregory Flores                                                  
//Language: Java                                                            
//Description: Calculate the number of days in any month of any year
//***************************************************************************

public class DaysInMonth 
{
	public static void main(String[] args)
	{
		//instantiate Scanner object
		Scanner input = new Scanner(System.in);
		
		//declare variables 
		int jan,mar,may,jul,aug,oct,dec;
		int apr,jun, sept, nov;
		int feb = 28;
		int days = 0;
		
		//keep track of leap year
		int leapFeb = 29;
		boolean leapYear = false;
		
		
		//always 31 days in these months
		jan = mar = may = jul = aug = oct = dec = 31;
		//always 30 days in these months
		apr = jun = sept = nov = 30;
		
		//ask user for year
		System.out.println("Enter a year: ");
		int year = input.nextInt();
		
		//ask user for month
		System.out.println("Enter a month");
		int month = input.nextInt();
		
		//calculate leap year
		if((year % 4 == 0 && year % 100 != 0)|| year % 400 == 0)
		{
			
			leapYear = true;
			
		}
		else
		{
			leapYear = false;
		}
		
		//check for which month
		if(month == 4 ||month == 6 ||month == 9 || month ==11)
		{
			days = 30;
		}
		else if(month == 1 ||month == 3 ||month == 5 || month ==7 ||month == 8 ||month == 10 || month ==12)
		{
			days = 31;
		}	
		//check if February is in a leap year
		else if(leapYear == true && month == 2)
		{
			
			days = 29;
			
		}
		else
		{
			days = 28;
		}
		
		//output results
		System.out.println("There are "+days+" days in "+month+"/"+year);
		
		
		}
		
	}


