package classes;
import java.lang.*;

public class ImportedProduct extends Product
{
	private String countryName;
	
	public void setCountryName(String countryName)
	{
		this.countryName = countryName;
	}
	public String getCountryName()
	{
		return countryName;
	}
	public void showInfo()
	{
		System.out.println("Imported Product Pid : "+getPid());
		System.out.println("Imporoted Product Name : "+getName());
		System.out.println("Imported Product availableQuantity : "+getAvailableQuantity());
		System.out.println("Imported Product Price : "+getPrice());
		System.out.println("Country Name : "+getCountryName());
		System.out.println("-------------------------------");
	}
}