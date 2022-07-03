import java.lang.*;
import java.util.Scanner;
import classes.*;
import fileio.*;

public class Start
{
	public static void main (String args[])
	{
		Scanner sc= new Scanner(System.in);
		Market m = new Market();
		FileReadWrite frw = new FileReadWrite();
		
		System.out.println("-->>");
		System.out.println("Welcome to Market Management Application.");
		System.out.println("------------------------");
		
		boolean repeat = true;
		
		while (repeat)
		{
			System.out.println("What do you want to do?");
			System.out.println("\t1. Empolyee Management.");
			System.out.println("\t2. Shop Management.");
			System.out.println("\t3. Shop Product Management.");
			System.out.println("\t4. Product Quantity Add-sell.");
			System.out.println("\t5. Exit.");
			System.out.println("------------------------");
			
			System.out.print("Enter your choice : ");
			int choice = sc.nextInt();
			
			switch(choice)
			{
				case 1:
					System.out.println("------------------------");
					System.out.println("You have chosen Employee Management.");
					System.out.println("------------------------");
					
					System.out.println("You have following options : ");
					System.out.println("\t1. Insert New Employee.");
					System.out.println("\t2. Remove Existing Employee.");
					System.out.println("\t3. Show All Employees.");
					System.out.println("\t4. Search An Employee.");
					System.out.println("\t5. Go Back.");
					
					System.out.print("Enter your option : ");
					int option1 = sc.nextInt();
					
					switch(option1)
					{
						case 1:
						    System.out.println("------------------------");
					        System.out.println("You have chosen to Insert New Employee.");
					        System.out.println("------------------------");
					
					        System.out.print("Enter Employee ID : ");
					        String empId1 = sc.next();
					        System.out.print("Enter Employee Name : ");
					        String name1 = sc.next();
					        System.out.print("Enter Employee Salary : ");
					        double salary1 =  sc.nextDouble();
					
					        Employee e1 = new Employee();
					        e1.setEmpId(empId1);
					        e1.setName(name1);
					        e1.setSalary(salary1);
					
					        if(m.insertEmployee(e1))
					        {
								System.out.println("------------------------");
						        System.out.println("Empolyee Inserted With ID : "+e1.getEmpId());
								System.out.println("------------------------");
					        }
					        else
					        {
						        System.out.println("Cannot Insert  An Empolyee.");
								System.out.println("------------------------");
				            }
					        break; 
						
						case 2:
						    System.out.println("-----------------------------------------------");
					        System.out.println("You have chosen to Remove An Exixting Employee.");
					        System.out.println("------------------------");
					
					        System.out.print("Enter an Employee ID to Remove : ");
							String empId2 = sc.next();
                            
                            Employee e2 = m.searchEmployee(empId2);
                            
                            if(e2 != null)
							{
								if(m.removeEmployee(e2))
								{
									System.out.println("Employee Removed with ID : "+e2.getEmpId());
									System.out.println("------------------------");
							    }
								else
								{
									System.out.println("Employee Can Not be Removed.");
									System.out.println("------------------------");
							    }
							}
                            else
						    {
								System.out.println("Employee Does Not Exist.");
								System.out.println("------------------------");
							}	
							break;
							
						case 3:
							System.out.println("------------------------");
							System.out.println("You Have Chosen to See All Employee");
							System.out.println("------------------------");
							m.showAllEmployees();
							break;
							
						case 4:
							System.out.println("------------------------");
							System.out.println("You Have Chosen to Search An Employee");
							System.out.println("------------------------");
							
							System.out.print("Enter an Employee ID to Search : ");
							String empId3 = sc.next();
							
							Employee e3 = m.searchEmployee(empId3);
							
							if(e3 != null)
							{
								System.out.println("------------------------");
								System.out.println("Employee Found.");
								System.out.println("-->");
								System.out.println("Employee ID : "+e3.getEmpId());
								System.out.println("Employee Name : "+e3.getName());
								System.out.println("Employee Salary : "+e3.getSalary());
								System.out.println("------------------------");
							}
							else
							{
								System.out.println("------------------------");
								System.out.println("Employee Does Not Exist");
								System.out.println("------------------------");
							}
							break;
							
						case 5:
							System.out.println("------------------------");
							System.out.println("You have Chosen to Go Back.");
							System.out.println("------------------------");
							
							break;
					}
					
					break; 
					
				case 2:
					System.out.println("------------------------");
					System.out.println("You Have Chosen Shop Management.");
					System.out.println("------------------------");
					
					System.out.println("You have following options : ");
					System.out.println("\t1. Insert New Shop.");
					System.out.println("\t2. Remove Existing Shop.");
					System.out.println("\t3. Show All Shops.");
					System.out.println("\t4. Search A Shop.");
					System.out.println("\t5. Go Back.");
					
					System.out.print("Enter your option : ");
					int option2 = sc.nextInt();
					
					switch(option2)
					{
						case 1:
						    System.out.println("------------------------");
							System.out.println("You Have Chosen to Insert A Shop");
							System.out.println("------------------------");
							
							System.out.print("Enter Shop ID : ");
						    String sid1 = sc.next();
							System.out.print("Enter Shop Name : ");
							String name1 = sc.next();
							
							Shop s1 = new Shop();
							s1.setSid(sid1);
							s1.setName(name1);
							
							if(m.insertShop(s1))
							{
								System.out.println("Shop Inserted with ID: "+s1.getSid());
								System.out.println("------------------------");
						    }
							else
							{
								System.out.println("Shop can not be inserted");
								System.out.println("------------------------");
						    }
							
							break; 
						
						case 2:
						    System.out.println("------------------------");
					        System.out.println("You have chosen to Remove an Existing Shop.");
					        System.out.println("------------------------");
					
					        System.out.print("Enter a Shop ID to Remove : ");
							String sid2 = sc.next();
                            
                            Shop s2 = m.searchShop(sid2);
                            
                            if(s2 != null)
							{
								if(m.removeShop(s2))
								{
									System.out.println("Shop Removed with ID : "+s2.getSid());
									System.out.println("------------------------");
							    }
								else
								{
									System.out.println("Shop Can Not be Removed.");
									System.out.println("------------------------");
								}
							}
                            else
						    {
								System.out.println("Shop Does Not Exist.");
							}	
							break;
							
						case 3:
							System.out.println("------------------------");
							System.out.println("You Have Chosen See All Shops.");
							System.out.println("------------------------");
							m.showAllShops();
							break;
							
						case 4:
							System.out.println("------------------------");
							System.out.println("You Have Chosen to Search Shop");
							System.out.println("------------------------");
							
							System.out.print("Enter a Shop ID to Search : ");
							String sid3 = sc.next();
							
							Shop s3 = m.searchShop(sid3);
							
							if(s3 != null)
							{
								System.out.println("Shop Found.");
								System.out.println("Shop ID : "+s3.getSid());
								System.out.println("Shop Name : "+s3.getName());
						
							}
							else
							{
								System.out.println("Shop Does Not Exist");
								System.out.println("------------------------");
							}
						    break;
							
						case 5:
							System.out.println("------------------------");
							System.out.println("You Have Chosen to Go Back.");
							System.out.println("------------------------");
							
							break;
					}
					
					break;
				
				case 3:
				    System.out.println("------------------------");
					System.out.println("You have chosen Shop Product Management.");
					System.out.println("------------------------");
					
					System.out.println("You have following options : \n");
					System.out.println("\t1. Insert New PRoduct.");
					System.out.println("\t2. Remove Existing Product.");
					System.out.println("\t3. Show All Product.");
					System.out.println("\t4. Search A Product.");
					System.out.println("\t5. Go Back.");
					
					System.out.print("Enter your option : ");
					int option3 = sc.nextInt();
					
					switch(option3)
					{
						case 1:
							
							System.out.println("------------------------");
							System.out.println("You have chose to Insert a Product for Shop.");
							System.out.println("------------------------");
							
							System.out.print("Enter Shop ID : ");
							String sid1 = sc.next();
							
							if(m.searchShop(sid1)!=null)
							{
								System.out.println("Which type Of Product do you want?");
								System.out.println("\t1. Local Product.");
								System.out.println("\t2. Imported Product.");
								System.out.println("\t3. Go Back.");
								
								System.out.print("Enter Product Type: ");
								int productType = sc.nextInt();
								
								if(productType == 1)
								{
									System.out.print("Enter Product ID : ");
									String pid5 = sc.next();
									System.out.print("Enter Product Name : ");
									String pm1 = sc.next();
									System.out.print("Enter Available Quantity : ");
									int aq1 = sc.nextInt();
									System.out.print("Enter Price : ");
									double pr1 = sc.nextDouble();
									System.out.print("Enter Discount Rate : ");
									double dr1 = sc.nextDouble();
									
									LocalProduct lp1 = new LocalProduct();
									lp1.setPid(pid5);
									lp1.setName(pm1);
									lp1.setAvailableQuantity(aq1);
									lp1.setPrice(pr1);
									
									if(m.searchShop(sid1).insertProduct(lp1))
									{
										System.out.println("Product name  "+pm1+"  inserted for Shop ID  "+sid1);
										System.out.println("------------------------");
									}
									else
									{
										System.out.println("ProductCan NOt be inserted");
										System.out.println("------------------------");
									}
								}
								else if(productType == 2)
								{
			                        System.out.print("Enter Product ID : ");
									String pid6 = sc.next();
									System.out.print("Enter Product Name : ");
									String pm1 = sc.next();
									System.out.print("Enter Availabe Quantity : ");
									int aq1 = sc.nextInt();
									System.out.print("Enter Price : ");
									double pr2 = sc.nextDouble();
									System.out.print("Enter Country NAme : ");
									String cn1 = sc.next();
									
									ImportedProduct ip1 = new ImportedProduct();
									ip1.setPid(pid6);
									ip1.setName(pm1);
									ip1.setAvailableQuantity(aq1);
									ip1.setCountryName(cn1);
									
									if(m.searchShop(sid1).insertProduct(ip1))
									{
										System.out.println("Product Name  "+pm1+"  inserted for  Shop  ID  "+sid1);
										System.out.println("------------------------");
									}
									else
									{
										System.out.println("Product Can NOt be inserted");
										System.out.println("------------------------");
									}
								}
								else if(productType == 3)
								{
									System.out.println("------------------------");
									System.out.println("Going Back.............");
									System.out.println("------------------------");
								}
								else
								{
									System.out.println("------------------------");
									System.out.println("Invalid Type.");
									System.out.println("------------------------");
								}
									
							}
							else
							{
								System.out.println("No Shop ID Found.");
								System.out.println("------------------------");
							}
							
							break;
							
							
					    case 2:
						
						    System.out.println("------------------------");
							System.out.println("You Have Chosen to Remove an Existing Product.");
							System.out.println("------------------------");
							
							System.out.print("Enter Shop ID : ");
							String sid4= sc.next();
							
							if(m.searchShop(sid4)!=null)
							{
								System.out.print("Enter Product ID : ");
								String pid2=sc.next();
								if(m.searchShop(sid4).searchProduct(pid2)!=null)
								{
									System.out.print("Enter ID to Remove Product.");
									String pid3= sc.next();
									
									Product p4 = m.searchShop(sid4).searchProduct(pid2);
									if(m.searchShop(sid4).removeProduct(p4))
									{
										System.out.println("Product ID Removed With ID : "+p4.getPid());
										System.out.println("------------------------");
									}
									else
									{
										System.out.println("Can not Removed.");
										System.out.println("------------------------");
									}
								}
								else
								{
									System.out.println("No Product ID Found.");
									System.out.println("------------------------");
								}
							}
						    else
							{
								System.out.println("No Shop ID Found.");
							}	
					    
						    
					    case 3:
							System.out.println("------------------------");
							System.out.println("You Have Chosen See All Products.");
							System.out.println("------------------------");
							System.out.println("Enetr Shop ID : ");
							String sid6=sc.next();
							Shop s4 = m.searchShop(sid6);
							if(s4!=null)
							{
								s4.showAllProducts();
							}
							else
							{
								System.out.println("No Prouct Available.");
								System.out.println("------------------------");
							}
							break;
							
						case 4:
							System.out.println("------------------------");
							System.out.println("You Have Chosen to Search a Product.");
							System.out.println("------------------------");
							
							System.out.print("Enter Shop ID : ");
							String sid5=sc.next();
							if(sid5!=null)
							{
							    System.out.print("Enter a Product ID to Search : ");
							    String pid4 = sc.next();
							
							    Product p3 = m.searchShop(sid5).searchProduct(pid4);
							
							 if(p3 != null)
							 { 
								System.out.println("Product Found.");
								System.out.println("Product Name : "+p3.getName());
								System.out.println("Product Available Quantity : "+p3.getAvailableQuantity());
								System.out.println("Product Price : "+p3.getPrice());
							 }
							 else
							 {
								System.out.println("Product Does Not Exist");
								System.out.println("------------------------");
							 }
							 
							}
							
							break;
							
						case 5:
							System.out.println("------------------------");
							System.out.println("You Have Chosen to Go Back.");
							System.out.println("------------------------");
							
							break;
							
					}

					break;
					
				case 4:
					System.out.println("------------------------");
					System.out.println("You Have Chosen Product Quantity Add-sell.");
					System.out.println("------------------------");
					
					System.out.println("You have following options: \n");
					System.out.println("\t1. Add Product.");
					System.out.println("\t2. Sell Product.");
					System.out.println("\t3. Show Add Sell History.");
					System.out.println("\t4. Go Back");
					
					System.out.print("Enter Your Option : ");
					int option4 = sc.nextInt();
					
					switch(option4)
					{
						case 1: 
							
							System.out.println("------------------------");
							System.out.println("You Choose to Add a Product.");
							System.out.println("------------------------");
							
							System.out.print("Enter Shop ID: ");
							String sid1 = sc.next();
							
							if(m.searchShop(sid1) != null)
							{
								System.out.print("Enter  Product ID : ");
								String pid1 = sc.next();
								
								if(m.searchShop(sid1).searchProduct(pid1) != null)
								{
									System.out.print("Enter Amount to Add : ");
									int am1 = sc.nextInt();
									
									if(m.searchShop(sid1).searchProduct(pid1).addQauntity(am1))
									{
										System.out.println("------------------------");
										System.out.println("Added Successfully.");
										frw.writeInFile("Added :  $"+am1+"  in Product ID  "+pid1+"  in Shop ID  "+sid1);
										System.out.println("------------------------");
									}
									else
									{
										System.out.println("Can Not Add");
										System.out.println("------------------------");
									}
								}
								else
								{
									System.out.println("No Product ID Found.");
									System.out.println("------------------------");
								}
								
							}
							else
							{
								System.out.println("No Shop ID Found");
								System.out.println("------------------------");
							}
							
							break;
							
						case 2:
						    System.out.println("------------------------");
							System.out.println("You Choose to Sell a Product.");
							System.out.println("------------------------");
							
							System.out.print("Enter Shop ID : ");
							String sid6 = sc.next();
							
							if(m.searchShop(sid6) != null)
							{
								System.out.print("Enter  Product ID : ");
								String pid1 = sc.next();
								
								if(m.searchShop(sid6).searchProduct(pid1) != null)
								{
									System.out.print("Enter Amount to Sell : ");
									int am2 = sc.nextInt();
									
									if(m.searchShop(sid6).searchProduct(pid1).sellQuantity(am2))
									{
										System.out.println("------------------------");
										System.out.println("Sold Successfully.");
										System.out.println("------------------------");
										frw.writeInFile("Sold :  $"+am2+"  in Product ID  "+pid1+"  by Shop ID  "+sid6);
									}
									else
									{
										System.out.println("Can Not Sell");
										System.out.println("------------------------");
									}
								}
								else
								{
									System.out.println("No Product ID Found.");
									System.out.println("------------------------");
								}
								
							}
							else
							{
								System.out.println("No Shop ID Found.");
								System.out.println("------------------------");
							}
							
			
						
							break;
							
						case 3:
							
							System.out.println("------------------------");
							System.out.println("You Have Chosen to Show All Sell History.");
							System.out.println("------------------------");
							
							frw.readFromFile();
							
							break;
							
						case 4:
						    
							System.out.println("------------------------");
							System.out.println("You Have Chosen to Go Back.");
							System.out.println("------------------------");
						
							break;
							
						default:
						
							break;
					}
					
					break;
				
				case 5:
					System.out.println("------------------------");
					System.out.println("You Have Chosen to Exit");
					System.out.println("------------------------");
					repeat = false;
					break;
				
				    default:
					System.out.println("------------------------");
					System.out.println("Invalid Choice.");
					System.out.println("------------------------");
					break;
			
			 
					
				
				    
			}
		}
	}
}