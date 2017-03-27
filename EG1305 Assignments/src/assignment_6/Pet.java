package assignment_6;
//***************************************************************************
//Program: Pet.java                                                    
//Author: Gregory Flores                                                  
//Language: Java                                                            
//Description: 
//***************************************************************************

public class Pet 
{
	private String name;
	private String type;
	private int age;
	
	public Pet(String name, String type, int age)
	{
		this.name = name;
		this.type = type;
		this.age = age;
		
	}

	public String getName()
	{
		return this.name;
	}
	public String getType()
	{
		return this.type;
		
	}
	public int getAge()
	{
		return this.age;
		
	}
}
