package assignment_7;
//***************************************************************************
//Program: TestAccont.java                                                     
//Author: Gregory Flores                                                  
//Language: Java                                                            
//Description: 
//***************************************************************************

public class TestAccount 
{

	public static void main(String[] args) 
	{
		Account a = new Account(1122,20000,.045);
		
		System.out.println("ID: "+a.getId());
		System.out.println("Balance: $"+a.getBalance());
		System.out.println("Annual Interest Rate: "+100*a.getAnnualInterestRate()+"%");
		System.out.println("Date Created: "+a.getDateCreated()+"\n");
		
		a.withdraw(2500);
		System.out.println("Balance: $"+a.getBalance()+"\n");
		
		a.deposit(3000);
		System.out.println("Balance: $"+a.getBalance());
		System.out.println("Monthly Interest Rate: "+100*a.getMonthlyInterestRate()+"%");
		System.out.println("Date Created: "+a.getDateCreated());
		
		

	}

}
