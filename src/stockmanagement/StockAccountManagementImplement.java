package stockmanagement;

import java.util.LinkedList;

public class StockAccountManagementImplement
{
LinkedList<Stock> sharesList = new LinkedList<Stock>();
	
	//method to Add Stock
	public void addStock(Stock share)
	{
		if (sharesList.contains(share))
		{
			System.err.println("Inventory Item Exists");
		}
		else
		{
		sharesList.add(share);
		}
		
	}

	//method to get details of stock/share
	public void getStockDetails()
	{
		for (Stock stocks : sharesList)
		{
			System.out.println(stocks);
		}		
	}

	//method to calculate values
	public void calculateShareValue()
	{
		int totalvalue = 0;
		for (Stock stock : sharesList)
		{
			int value = stock.getShareCount() *stock.getSharePrice();
			System.out.println("Value of "+stock.getShareName()+" is "+value);
			totalvalue = totalvalue + value;
		}
		System.out.println("Total value is: "+totalvalue);
	}
}
