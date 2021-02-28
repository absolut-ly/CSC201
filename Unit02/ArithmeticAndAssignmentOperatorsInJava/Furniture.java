package ArithmeticAndAssignmentOperatorsInJava;

// This program calculates profits and sales prices for a furniture company. 

public class Furniture
{
	public static void main(String args[])
	{
		String itemName = "TV Stand";
		double retailPrice = 325.00;
		double wholesalePrice = 200.00;
		double salePrice = retailPrice * .75;
		double profit = retailPrice - wholesalePrice;
		double saleProfit = salePrice - wholesalePrice;
		
		// Write your assignment statements here.

		
		
		System.out.println("Item Name: " + itemName);
		System.out.println("Retail Price: $" + retailPrice);
		System.out.println("Wholesale Price: $" + wholesalePrice);
		System.out.println("Profit: $" + profit);	
		System.out.println("Sale Price: $" + salePrice);
		System.out.println("Sale Profit: $" + saleProfit);
		System.exit(0);


		System.exit(0);
	}
}
