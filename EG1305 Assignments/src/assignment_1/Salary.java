package assignment_1;
//************************************************************************
//Program: Salary.java                                                   *
//Author: Gregory Flores                                                 *
//Language: Java                                                         *
//Description: Displays name, age, and desired salary                    *
//************************************************************************




//import JOptionPane
import javax.swing.JOptionPane;

public class Salary 
{
	public static void main(String[] args)
	{
		//declare variables
		String name = "Gregory Flores";
		int age = 22;
		double annualPay = 100000.0;

		//output information to message box using JOptionPane
		JOptionPane.showMessageDialog(null, "My name "
				+ "is "+name+", my age is "+age+" and \n"
				+ "I hope to earn $"+annualPay+" per year.");
		
		
		
		
		
	}

}
