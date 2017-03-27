package assignment_7;
//***************************************************************************
//Program: TestFan.java                                                    
//Author: Gregory Flores                                                  
//Language: Java                                                            
//Description: 
//***************************************************************************

public class TestFan 
{

	public static void main(String[] args) 
	{
		Fan f = new Fan();
		Fan f2 = new Fan(30,true,10.0,"red");
		
		System.out.println(f.toString());
		
		System.out.println(f2.toString());
		
	}

}
