import java.util.*;
class table extends Thread
	{
	public void run()
		{
		for(int i=1;i<=10;i++)
			{
			int a=5*i;
			System.out.println("5 x "+i+" = "+a);
			}
		}
	}
class prime extends Thread
	{
	public void run()
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit:");
		int n=sc.nextInt();
		sc.nextLine();
		int count=0,num=2;
		while(count<n)
			{
			boolean isPrime=true;
			for(int i=2;i*i<=num;i++)
				{
				if(num%i==0)
					{
					isPrime=false;
					break;
					}
				}
			if(isPrime)
				{
				System.out.println(num+" ");
				count++;
				}
			num++;
			}
		}
	}
class pg12
	{
	public static void main(String args[])
		{
		table t=new table();
		prime p=new prime();
		t.start();
		p.start();
		}
	}
	
