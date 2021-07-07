package stockmanagement;

public class Stock
{

	private String shareName;
	private int sharePrice;
	private int shareCount;
	
	//generating getters and setters
	public String getShareName()
	{
		return shareName;
	}
	
	public void setShareName(String shareName) 
	{
		this.shareName = shareName;
	}
	
	public int getSharePrice() 
	{
		return sharePrice;
	}
	
	public void setSharePrice(int sharePrice) 
	{
		if (sharePrice < 0) {
			System.err.println("Price cannot be zero");
		}
		else {
		this.sharePrice = sharePrice;
		}
	}
	
	public int getShareCount()
	{
		return shareCount;
	}
	
	public void setShareCount(int shareCount)
	{
		if (shareCount < 0)
		{
			System.err.println("Share cannot be zero");
		}
		else 
		{
		this.shareCount = shareCount;
		}
	}

	@Override
	public String toString() 
	{
		return "Stocks [shareName=" + shareName + ", sharePrice=" + sharePrice + ", shareCount=" + shareCount + "]";
	}
}
