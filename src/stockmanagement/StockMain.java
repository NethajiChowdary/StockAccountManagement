package stockmanagement;

import java.util.Scanner;



public class StockMain 
{

	public static void main(String[] args)
	{
		StockAccountManagementImplement stockservice = new StockAccountManagementImplement();
		Scanner scanner = new Scanner(System.in);
		System.out.println("welcome to Stock management");
		System.out.println("Enter the num of shares to add: ");
		int numOfShares = scanner.nextInt();
		
		for (int index = 0; index < numOfShares; index++)
		{
			
			Stock newItem = new Stock();
			
			System.out.println("Enter Share name: ");
			newItem.setShareName(scanner.next());
			System.out.println("Enter share Price: ");
			newItem.setSharePrice(scanner.nextInt());
			System.out.println("Enter no. of share taken: ");
			newItem.setShareCount(scanner.nextInt());	
			stockservice.addStock(newItem);
		}
		stockservice.getStockDetails();
		stockservice.calculateShareValue();

	}

}
