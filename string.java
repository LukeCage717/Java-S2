import java.util.*;
class string
	{
	public static void main(String args[])
		{
		String a;
		String b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first string:");
		a=sc.nextLine();
		System.out.println("Enter second string:");
		b=sc.nextLine();
		if(a.equals(b))
			{
			System.out.println("They are equal");
			}
		else
			{
			System.out.println("They are not equal");
			}
		System.out.println("Length of a: "+a.length()+"\nLength of b: "+b.length());
		System.out.println("Concatenated string: "+a+b);
		b=a;
		System.out.println("Copied string:"+b);	
		}
	}
