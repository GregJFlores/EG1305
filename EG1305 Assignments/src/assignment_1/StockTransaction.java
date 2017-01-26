package assignment_1;


//***************************************************************************
//Program: StockTransaction.java                                            *
//Author: Gregory Flores                                                    *
//Language: Java                                                            *
//Description: Calculates the profit Joe made buying and selling stocks     *
//***************************************************************************
public class StockTransaction 
{
	public static void main(String[] args)
	{
		//declare commission constant
		final double COMMISSION_RATE = 0.2;
		
		//Declare variables
		int sharesJoePurchased = 1000;
		double initialPricePerShare = 32.87;
		
		int sharesJoeSold = 1000;
		double finalPricePerShare = 33.92;
		
		//calculate prices of Joe's stock transactions
		double initialStockbrokerCommissionPay = (sharesJoeSold * finalPricePerShare) * COMMISSION_RATE;
		double amountPaidForStock = sharesJoePurchased * initialPricePerShare;
		
		double finalStockbrokerCommissionPay = (sharesJoePurchased * initialPricePerShare) * COMMISSION_RATE;
		double amountStockSoldFor = sharesJoeSold * finalPricePerShare;
		
		double profit = ((sharesJoePurchased * initialPricePerShare) - (sharesJoeSold * finalPricePerShare)) - 
				(finalStockbrokerCommissionPay + initialStockbrokerCommissionPay);
		
		//output to console
		System.out.println("Joe paid $"+amountPaidForStock+" for the initial stock price. He paid the stockbroker $"+initialStockbrokerCommissionPay+
				" for commission.\nJoe sold the stock for $"+amountStockSoldFor+". He paid the stockbroker "
				+ "$"+finalStockbrokerCommissionPay+" for commission. \nJoe profited $"+profit);
	}

}
