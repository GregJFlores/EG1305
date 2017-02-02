package assignment_2;
//***************************************************************************
//Program: ComputeBMI.java                                                   
//Author: Gregory Flores                                                  
//Language: Java                                                            
//Description: computes the Body Mass Index of the user
//***************************************************************************

//import JOptionPane
import javax.swing.JOptionPane;

public class ComputeBMI 
{
	public static void main(String[] args)
	{
		//declare variables
		int weightInPounds = 0;
		int heightInInches = 0;
		
		//prompt user with a input dialog box
		String weight = JOptionPane.showInputDialog("Enter your weight in pounds");
		
		String height = JOptionPane.showInputDialog("Enter your height in inches");
		
		//convert strings to integers
		weightInPounds = Integer.parseInt(weight);
		heightInInches = Integer.parseInt(height);
		
		//calculate weight in Kg and height in meters
		double weightInKg = 0.45359237 * (double)weightInPounds;
		double heightInMeters = 0.0254 * (double)heightInInches;
		
		//output result to message dialog box
		JOptionPane.showMessageDialog(null, "Your Body Mass Index is " + weightInKg/Math.pow(heightInMeters, 2));
	}

}
