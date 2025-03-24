import java.util.*;
class Product 
	{
	int pcode;
	String pname;
	float price;
	void getdata()
		{
		System.out.println("Enter the pcode, pname and price:");
		Scanner sc=new Scanner(System.in);
		this.pcode=sc.nextInt();
		sc.nextLine();
		this.pname=sc.nextLine();
		this.price=sc.nextFloat();
		}
	void display()
		{
		System.out.println("Pcode:"+pcode+"\nPname:"+pname+"\nPrice:"+price);
		}
	}
class product
	{
	public static void main(String args[])
		{
		Scanner sc=new Scanner(System.in);
		Product p1=new Product();
		p1.getdata();
		System.out.println("Product 1:");
		p1.display();
		Product p2=new Product();
		p2.getdata();
		System.out.println("Product 2:");
		p2.display();
		Product p3=new Product();
		p3.getdata();
		System.out.println("Product 3:");
		p3.display();
		if(p1.price<p2.price && p1.price<p3.price)
			{
			System.out.println(p1.pname+"has the lowest price");
			}
		else if(p2.price<p3.price)
			{
			 System.out.println(p2.pname+"has the lowest price");
			}	
		else
			{
			System.out.println(p3.pname+"has the lowest price");
			}
		}
	}
		
