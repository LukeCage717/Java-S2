import java.util.*;
class Employee
	{
	int eno;
	float esalary;
	String ename;
	Employee(int eno,String ename,float esalary)
		{
		this.eno=eno;
		this.esalary=esalary;
		this.ename=ename;
		}
	void display()
		{
		System.out.println("Employee No: "+eno);
		System.out.println("Employee Name: "+ename);
		System.out.println("Employee Salary: "+esalary);
		}
	}
class EmployeeData
	{
	public static void main(String args[])
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit:");
		int n=sc.nextInt();
		Employee[] employees=new Employee[n];
		for (int i=0;i<n;i++)
			{
			System.out.println("Employee Details:");
			System.out.println("Enter the Employee no:");
			int eno=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter the Employee name:");
			String ename=sc.nextLine();
			System.out.println("Enter the Employee salary:");
			float esalary=sc.nextFloat();
			employees[i]=new Employee(eno,ename,esalary);
			}
		System.out.println("Enter the Employee to search for:");
		int e=sc.nextInt();
		boolean found=false;
		for (Employee emp : employees)
			{
			if(emp.eno==e)
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
	}
