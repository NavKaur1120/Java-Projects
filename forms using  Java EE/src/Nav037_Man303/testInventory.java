package Nav037_Man303;
		import java.util.Scanner;
		import java.util.LinkedList;
		import java.util.*;
		import java.util.List;


		public class testInventory {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				LinkedList<product> productlist=new LinkedList<product>();
				Scanner s=new Scanner(System.in);
				String choice="r";
				while(choice!="x")
				{
					System.out.println("*****Inventory Management System******");
					System.out.println("Main Menu");
					System.out.println("---------------------------");
					System.out.println("a. Add");
					System.out.println("b. Update");
					System.out.println("c. Delete");
					System.out.println("d. Show All");
					System.out.println("x. Exit");
					System.out.println("---------------------------");
					System.out.println("Enter your choice   a/b/c/d");
					
					choice=s.nextLine();
				
					switch(choice)
					{
						case "a":
							while(true)
							{
							System.out.println("Enter  Product code: ");
							String code = s.nextLine();
							
							System.out.println("Enter Product name: ");
							String name = s.nextLine();
							
							System.out.println("Enter Product Quantity: ");
							int qty = s.nextInt();
							String a=s.nextLine();
							
							System.out.println("Enter Price: ");
							double price = s.nextDouble();
							String b=s.nextLine();
							
							product e=new product(code,name,qty,price);
							productlist.add(e);
					
							System.out.println("Do you have more records (y/n) : ");
							
							String ans=s.nextLine();
							if(ans.equals(new String("n")))
								{
								System.out.println("you are successfully to add record! ");
								break;
								}
							}
							
							break;
							
						case "b":
							System.out.println(" Enter the product name to edit : ");
							String  name = s.nextLine();
							 
							 System.out.println("Enter the product name to edit :"+name);
							for(int i=0;i<productlist.size();i++)
							{
								product p=new product();
							     
								 p= productlist.get(i);
								
								if(p.getName().equals(new String(name )))
								{
									System.out.println("matched   "+p.getName());
									System.out.println("Enter updated data : ");
									System.out.println("------------------  ");
									
									System.out.println("Enter  product code: ");
									String code = s.nextLine();
									
									System.out.println("Enter product name : ");
									String Name= s.nextLine();
									
									System.out.println("Enter product quantity: ");
									int qty = s.nextInt();
									String c=s.nextLine();
									
									System.out.println("Enter product price: ");
									double price = s.nextDouble();
									String d=s.nextLine();
									
									product ed= new product(code,Name,qty,price);
									productlist.set(i,ed);
								}
							}
							System.out.println("The updated item is");
							
							for(int i=0;i<productlist.size();i++)
							{
								product p=new product();
								p= productlist.get(i);
							    p.data();
							
							}
							break;
							
						case "c":
							System.out.println("Enter the name of the product you want to delete : ");
							String name1 = s.nextLine();
							
							for(int i=0;i<productlist.size();i++)
							{ 
								product p=new product();
							
								 p= productlist.get(i);
								
								if(p.getName().equals(new String(name1 )))
								{
									System.out.println("matched   "+p.getName());
									System.out.println("Do you want to remove this product(y/n)");
									String ans1=s.nextLine();
									if(ans1.equals(new String("y")))
									{
									productlist.remove(i);
									System.out.println("you successfully to delete product");
								}
							}
							}
							System.out.println("the products in your record");
							
							for(int i=0;i<productlist.size();i++)
							{
								product p=new product();
								p= productlist.get(i);
							    p.data();
							
							}
							break;
							
							
							case "d":
								System.out.println("\n User List \n ----------------\n");
								for(int i=0;i<productlist.size();i++)
								{
									product p=new product();
									p= productlist.get(i);
								    p.data();
								
								}
								break;
								
							case"x":
								System.out.println("Exit Successfully");
								System.exit(0);

					}
				}
			}
			}


			



					



	


