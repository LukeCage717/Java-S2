import java.util.*;
class Employee
	{
	static void getdata()
		{
		int eno,n,e;
		float esalary;
		String ename;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit:");
		prgrm6[] employee=new prgrm6[n];
		for (int i=1;i<=n;i++)
			{
			System.out.println("Enter the Employee no:");
			eno=sc.nextInt();
			System.out.println("Enter the Employee name:");
			ename=sc.nextLine();
			System.out.println("Enter the Employee salary:");
			esalary=sc.nextFloat();
			employee[i]=new prgrm6(eno,ename,esalary);
			}
		System.out.println("Enter the Employee to search for:");
		e=sc.nextInt();
		boolean found=false;
		for (prgrm6 emp : employee)
			{
			if(emp.eno=e)
				{
				System.out.println("Employee details found");
				emp.display();
				found=true;
				break;
				}
			}
		if (!found)
			{
			System.out.println("Eno: "+e+" not found");
			}
		}
	void display()
		{
		System.out.println("Employee No: "+eno);
		System.out.println("Employee Name: "+ename);
		System.out.println("Employee Salary: "+esalary);
		}
	}
		
