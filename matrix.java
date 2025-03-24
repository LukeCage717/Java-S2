import java.util.*;
class matrix
	{
	public static void main(String args[])	
		{
		int a,b,i,j,k;
		int[][]m1=new int[5][5];
		int[][]m2=new int[5][5];
		int[][]m3=new int[5][5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of rows and columns:");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Enter elements of 1st matrix:");
		for(i=0;i<a;i++)
			{
			for(j=0;j<b;j++)
				{
				m1[i][j]=sc.nextInt();
				}
			}
		System.out.println("Enter elements of 2nd matrix:");
		for(i=0;i<a;i++)
			{
			for(j=0;j<b;j++)
				{
				m2[i][j]=sc.nextInt();
				}
			}
		System.out.println("Sum of 2 matrices:");
		for(i=0;i<a;i++)
			{
			for(j=0;j<b;j++)
				{
				m3[i][j]=m1[i][j]+m2[i][j];
				}
			}
		for(i=0;i<a;i++)
			{
			for(j=0;j<b;j++)
				{
				System.out.print(m3[i][j]+" ");
				}
			System.out.println("\n");
			}
		System.out.println("Multiplication of 2 matrices:");
		for(i=0;i<a;i++)
			{
			for(j=0;j<b;j++)
				{
				m3[i][j]=0;
				for(k=0;k<b;k++)
					{
					m3[i][j]=m3[i][j]+m1[i][k]*m2[k][j];
					}
				}
			}
		for(i=0;i<a;i++)
			{
			for(j=0;j<b;j++)
				{
				System.out.print(m3[i][j]+" ");
				}
			System.out.println("\n");
			}
		}
	}
