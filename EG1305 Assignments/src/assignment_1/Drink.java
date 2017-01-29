package assignment_1;




//***************************************************************************
//Program: Drink.java                                                       *
//Author: Gregory Flores                                                    *
//Language: Java                                                            *
//Description: Calculates the approximate number of customers in the survey * 
//who purchase one or more energy drinks per week, and approximate number of*
//customers in the survey who prefer citrus flavored energy drinks.         *
//out of a survey of 12,467 people.                                         *
//***************************************************************************

//import JOptionPane and DecimalFormat
import javax.swing.JOptionPane;
import java.text.DecimalFormat;
public class Drink 
{

	public static void main(String[] args)
	{
		//declare variables
		int customers = 12467;
		double percentageOneOrMoreDrinkPerWeek = 0.14;
		double percentagePreferCitrusFlavor = 0.64;
		int customersOneOrMoreDrinkPerWeek = 0;
		int customersPreferCitrusFlavor = 0;
		
		//calculate the amount of customers who purchase one or more energy drinks per week
		//calculate the amount of customers who prefer citrus flavored energy drinks
		customersOneOrMoreDrinkPerWeek = (int) (customers * percentageOneOrMoreDrinkPerWeek);
		customersPreferCitrusFlavor = (int) (customers * percentagePreferCitrusFlavor);
		
		//Last one is not correct. It should be customers * percentageOneOrMoreDrinkPerWeek * percentagePreferCitrusFlavor
		
		//create DecimalFormat Object
		DecimalFormat d = new DecimalFormat();
		
		//output information to message box
		JOptionPane.showMessageDialog(null, "The 14% of customers out of 12,467 who purchase"
				+ " one or more energy drinks per week is approximately "+d.format(customersOneOrMoreDrinkPerWeek)+
				".\nThe 64% of customers out of 12,467 who prefer citrus flavored energy drinks is approximately "
				+ d.format(customersPreferCitrusFlavor)+".");
		
		
	}
}
