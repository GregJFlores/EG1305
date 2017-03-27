package assignment_7;
//***************************************************************************
//Program: Coin.java                                                    
//Author: Gregory Flores                                                  
//Language: Java                                                            
//Description: 
//***************************************************************************

public class Coin 
{
	private String sideUp;
	
	public Coin()
	{
		int rand = (int)(Math.random() * 100) +1;
		
		if(rand % 2 == 0)
		{
			this.sideUp = "heads";
		}
		else
		{
			this.sideUp = "tails";
		}
	}
	
	public void toss()
	{
		int rand = (int)(Math.random() * 100) +1;
		
		if(rand % 2 == 0)
		{
			this.sideUp = "heads";
		}
		else
		{
			this.sideUp = "tails";
		}
		
	}
	
	public String getSideUp()
	{
		return sideUp;
	}

}
