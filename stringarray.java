import java.util.*;
class stringarray
	{
	public static void main(String args[])
		{
		int n,i,c;
		String m;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit:");
		n=sc.nextInt();
		sc.nextLine();
		String a[]=new String[n];
		for(i=0;i<n;i++)
			{
			System.out.println("Enter a string:");
			m=sc.nextLine();
			a[i]=m;
			}
		System.out.println("Array of strings:");
		for(i=0;i<n;i++)
			{
			System.out.println(a[i]);
			}
		System.out.println("Choose an operation:\n1.Search\n2.Sort\n3.Exit");
		c=sc.nextInt();
		switch(c)
			{
			case 1:
			search(a,n);
			break;
			case 2:
			Arrays.sort(a);
			System.out.println("The sorted array is: "+Arrays.toString(a));
			break;
			case 3:
			System.out.println("Exiting...");
			break;
			default:
			System.out.println("Invalid choice!");
			break;
			}
		}
	public static void search(String a[],int n)
		{
		int i,j;
		String b;
		Scanner sc=new Scanner(System.in);
		j=0;
		System.out.println("Enter a string to check whether it is available in array:");
		b=sc.nextLine();
		for(i=0;i<n;i++)
			{
				if(a[i].equals(b))
					{						
					j=1;
					break;
					}
			}	
		if(j==0)
			{
			System.out.println("String is not present in array");
			}
		else
			System.out.println("String is present at position "+(i+1));
		}
	}
