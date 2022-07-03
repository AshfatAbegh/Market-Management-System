package interfaces;
import java.lang.*;
import classes.Product;


public interface ProductOperations
{
	boolean insertProduct(Product p);
	boolean removeProduct(Product p);
	Product searchProduct(String pid);
	void showAllProducts();
}