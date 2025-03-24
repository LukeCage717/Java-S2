import java.util.*;
class arithmetic
	{
	public static void main(String args[])
		{
		int n1,n2;
		int sum=0,diff=0,prod=0,div=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 numbers:");
		n1=sc.nextInt();
		sc.nextLine();
		n2=sc.nextInt();
		sum=n1+n2;
		diff=n1-n2;
		prod=n1*n2;
		if(n2==0)
			{
			System.out.println("The denominator cannot be 0");
			}
		else
			{
			div=n1/n2;
			}
		System.out.println("Sum="+sum+"\nDifference="+diff+"\nProduct="+prod);
		if(n2!=0)
			{
			System.out.println("Quotient="+div);
			}
		}
	}
		
			
