package assignment_7;
//***************************************************************************
//Program: TestCoin.java                                                    
//Author: Gregory Flores                                                  
//Language: Java                                                            
//Description: 
//***************************************************************************

public class TestCoin {

	public static void main(String[] args) 
	{
		Coin c = new Coin();
		
		int headsCounter = 0;
		int tailsCounter = 0;
		
		System.out.println("Starting coin face "+c.getSideUp());
		
		System.out.println("\nWe will toss the coin 20 times now");
		
		for(int i = 0; i < 20; i++)
		{
			c.toss();
			
			if(c.getSideUp() == "heads")
			{
				headsCounter++;
				System.out.println(c.getSideUp());
			}
			else
			{
				tailsCounter++;
				System.out.println(c.getSideUp());
			}
			
			
		}
		
		System.out.println("\n# of Heads: "+headsCounter);
		System.out.println("# of Tails: "+tailsCounter);
	}

}
