import java.util.*;
class fibonacci implements Runnable
	{
	int n;
	fibonacci(int n)
		{
		this.n=n;
		}
	public void run()
		{
		int a=0;
		int b=1;
		System.out.println("Fibonacci:"+a);
		System.out.println("Fibonacci:"+b);
		for(int i=0;i<n;i++)
			{
			int c=a+b;
			System.out.println("Fiboacci:"+c);
			a=b;
			b=c;
			}
		}
	}
class even implements Runnable
	{
	int m;
	even(int m)
		{
		this.m=m;
		}
	public void run()
		{
		for(int j=1;j<=m;j++)
			{
			if(j%2==0)
				{
				System.out.println("Even:"+j);
				}
			}
			
		}
	}
class pg13
	{
	public static void main(String args[])
		{
		Scanner sc=new Scanner(System.in);
		int m,n;
		System.out.println("Enter the range of fibonacci series of numbers:");
		n=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the range:");
		m=sc.nextInt();
		Thread t1=new Thread(new fibonacci(n));
		Thread t2=new Thread(new even(m));
		t1.start();
		t2.start();
		}
	}
