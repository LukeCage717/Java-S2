import java.util.*;
class comparison
	{
	public static void main(String args[])
		{
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 3 values:");
		a=sc.nextInt();
		sc.nextLine();
		b=sc.nextInt();
		sc.nextLine();
		c=sc.nextInt();
		if(a>b && a>c)
			{
			System.out.println(a+" is the largest");
			}
		else if(b>c)
			 {
			System.out.println(b+" is the largest");
			}
		else
			{
			System.out.println(c+" is the largest");
			}
		}
	}
