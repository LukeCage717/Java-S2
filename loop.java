import java.util.*;
class loop
	{
	public static void main(String args[])
		{
		int a,i,fact=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		a=sc.nextInt();
		for(i=1;i<=a;i++)
			{
			fact*=i;
			}
		System.out.println("Factorial of "+a+" is "+fact);
		i=1;
		int fact2=1;
		while(i<=a)
			{
			fact2*=i;
			i++;
			}
		System.out.println("Factorial of "+a+" is "+fact2);
		i=1;
		int fact3=1;
		do
			{
			fact3*=i;
			i++;
			}
		while(i<=a);
		System.out.println("Factorial of "+a+" is "+fact3);
		}
	}
