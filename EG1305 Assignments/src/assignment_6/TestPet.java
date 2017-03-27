package assignment_6;

import java.util.Scanner;

//***************************************************************************
//Program: TestPet.java                                                    
//Author: Gregory Flores                                                  
//Language: Java                                                            
//Description: 
//***************************************************************************

public class TestPet 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		String name = "";
		String type ="";
		int age = 0;
		
		System.out.println("Please enter the name of your pet: ");
		name = input.nextLine();
		
		System.out.println("Please enter the type of pet you own: ");
		type = input.nextLine();
		
		System.out.println("Please enter you pet's age: ");
		age = input.nextInt();
		
		Pet p = new Pet(name,type,age);
		
		System.out.println("Pet Object Created");
		
		System.out.println("Your pet's name is "+p.getName());
		System.out.println("Your pet's type is "+p.getType());
		System.out.println("Your pet's age is "+p.getAge());
		
		

	}

}
