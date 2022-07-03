package classes;
import java.lang.*;
import interfaces.*;


public class Shop implements ProductOperations
{
	private String sid;
	private String name;
	private Product products[] = new Product [20];
	
	public void setName(String name)
	{
		this.name = name;
	}
	public void setSid(String sid)
	{
		this.sid = sid;
	}
	
	public String getName()
	{
		return name;
	}
	public String getSid()
	{
		return sid;
	}
	
	public boolean insertProduct(Product p)
	{
		boolean flag = false;
		for(int i=0; i<products.length; i++)
		{
			if(products[i] == null)
			{
				products[i] = p;
				flag = true;
				break;
			}
		}
		return flag;
	}
	
	public boolean removeProduct(Product p)
	{
		boolean flag = false;
		for(int i=0; i<products.length; i++)
		{
			if(products[i] == p)
			{
				products[i] = null;
				flag = true;
				break;
			}
		}
		return flag;
	}
	public void showAllProducts()
	{
		for(int i =0; i<products.length; i++)
		{
			if(products[i] != null)
			{
				products[i].showInfo();
			}
		}
	}
	public Product searchProduct(String pid)
	{
		Product p = null;
		
		for(int i=0; i<products.length; i++)
		{
			if(products[i] != null)
			{
				if(products[i].getPid().equals(pid))
				{
					p = products[i];
					break;
				}
			}
		}
		return p;
	}
}
		