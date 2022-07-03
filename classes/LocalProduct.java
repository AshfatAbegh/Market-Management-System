package classes;
import java.lang.*;

public class LocalProduct extends Product
{
	private double discountRate;
	
	public void setDiscountRate(double discountRate)
	{
		this.discountRate = discountRate;
	}
	public double getDiscountRate()
	{
		return discountRate;
	}
	public void showInfo()
	{
		System.out.println("Local Product Pid : "+getPid());
		System.out.println("Local Product Name : "+getName());
		System.out.println("Local Product availableQuantity : "+getAvailableQuantity());
		System.out.println("Local Product Price : "+getPrice());
		System.out.println("Local Product Discount Rate : "+getDiscountRate());
		System.out.println("-------------------------------");
	}
}