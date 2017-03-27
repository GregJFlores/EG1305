package assignment_6;
//***************************************************************************
//Program: Circle.java                                                    
//Author: Gregory Flores                                                  
//Language: Java                                                            
//Description: 
//***************************************************************************

public class Circle {
	
	private double radius;
	
	public Circle()
	{
		
		
	}
	public Circle(double r)
	{
		this.radius = r;
	}
	
	public double getRadius()
	{
		return this.radius;
		
	}
	public double getArea()
	{
		return Math.PI * Math.pow(this.radius, 2);
	}
	
	public double getDiameter()
	{
		return this.radius * 2;
	}
	
	public double getCircumference()
	{
		return 2 * Math.PI * this.radius;
	}
	
	

}
