package assignment_7;

import java.util.Date;

//***************************************************************************
//Program: Account.java                                                    
//Author: Gregory Flores                                                  
//Language: Java                                                            
//Description: 
//***************************************************************************

public class Account 
{
	
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated = new Date();
	
	public Account()
	{
		
		
	}
	
	public Account(int id, double balance, double annualInterestRate, Date dateCreated)
	{
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
		this.dateCreated = dateCreated;
		
	}
	
	public Account(int id, double balance, double annualInterestRate)
	{
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
		
		
	}

	public int getId() 
	{
		return id;
	}

	public void setId(int id) 
	{
		this.id = id;
	}

	public double getBalance() 
	{
		return balance;
	}

	public void setBalance(double balance) 
	{
		this.balance = balance;
	}

	public double getAnnualInterestRate() 
	{
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) 
	{
		this.annualInterestRate = annualInterestRate;
	}

	public Date getDateCreated() 
	{
		return dateCreated;
	}
	
	public double getMonthlyInterestRate()
	{
		
		return annualInterestRate/12;
	}
	
	public void withdraw(double w)
	{
		System.out.println("You withdrew $"+w+"\n");
		balance = balance - w;
	}
	
	public void deposit(double d)
	{
		System.out.println("You deposited $"+d+"\n");
		balance = balance + d;
	}
	
	
	
	
	
	

}
