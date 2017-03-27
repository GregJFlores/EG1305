package assignment_7;
//***************************************************************************
//Program: Fan.java                                                    
//Author: Gregory Flores                                                  
//Language: Java                                                            
//Description: 
//***************************************************************************

public class Fan 
{
	private int speed;
	private boolean fanStatus = false;
	private double radius = 5;
	private String color = "blue";
	
	public Fan()
	{
		
	}
	
	public Fan(int speed, boolean fanStatus, double radius, String color)
	{
		this.speed = speed;
		this.fanStatus = fanStatus;
		this.radius = radius;
		this.color = color;
	}
	
	public String toString()
	{
		if(fanStatus == false)
		{
		return	"Fan Speed: "+speed+
			"\nFan Status: Off"+
			"\nFan Radius: "+radius+
			"\nFan Color: "+color+"\n";
		}
		else
		{
			return	"Fan Speed: "+speed+
					"\nFan Status: On"+
					"\nFan Radius: "+radius+
					"\nFan Color: "+color+"\n";
		}
		
		
	}

}
