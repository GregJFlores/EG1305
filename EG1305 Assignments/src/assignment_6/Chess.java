package assignment_6;
//***************************************************************************
//Program: Chess.java                                                    
//Author: Gregory Flores                                                  
//Language: Java                                                            
//Description: 
//***************************************************************************
import java.math.BigInteger;
import java.text.DecimalFormat;


public class Chess 
{
	
		public static void main(String[] args)
		{
			
			DecimalFormat f = new DecimalFormat();
			
			System.out.println("Number of wheat grains on whole chessboard = " + f.format(calculateGrains()));
			System.out.println("Number of wheat grains on square 64 = " + f.format(calculateGrainsOnLast()));
			
			
		}
		
		public static BigInteger calculateGrains()
		{
			 BigInteger grains = new BigInteger("1");
			
			for(int i = 0; i < 64; i++)
			{
				
				grains = grains.add(BigInteger.valueOf((long) Math.pow(2, i)) );
				
				
			}
			
			return grains;
		}
		
		public static BigInteger calculateGrainsOnLast()
		{
			 BigInteger grains = new BigInteger("1");
			
			
				
				grains = grains.add(BigInteger.valueOf((long) Math.pow(2, 63)) );
				
				
			
			return grains;
		}

}
