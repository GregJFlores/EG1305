package assignment_3;

//import Scanner 
import java.util.Scanner;

//***************************************************************************
//Program: PaperRockScissors.java                                                   
//Author: Gregory Flores                                                  
//Language: Java                                                            
//Description: A game that plays paper,rock,scissors with the user 
//***************************************************************************

public class PaperRockScissors 
{
	public static void main(String[] args)
	{
		//instantiate Scanner object 
		Scanner input = new Scanner(System.in);
		
		//declare player and ai variables
		int player = 0;
		
		int ai = (int)( Math.random() * 3);
		
		//ask user for input
		System.out.println("scissors(0), rock (1), paper (2) Enter a number: ");
		player = input.nextInt();
		
			//calculate the winner and prints result to console
			if((player == 0 && ai == 2))
			{
				System.out.println("You won: Scissors beats Paper");
			
			}
			else if((player == 1 && ai == 0))
			{
				System.out.println("You won: Rock beats Scissors");
			
			}

			else if((player == 2 && ai == 1))
			{
				System.out.println("You won: Paper beats Rock");
			
			}

			else if((player == 0 && ai == 1))
			{
				System.out.println("You lost: Rock beats Scissors");
				
			}
			else if((player == 1 && ai == 2))
			{
				System.out.println("You lost: Paper beats Rock");
				
			}
			else if((player == 2 && ai == 0))
			{
				System.out.println("You lost: Scissors beats Paper");
			}

			else
			{
			
				System.out.println("Tied");
			}
	}	

}
