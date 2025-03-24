import java.util.*;
class Person
	{
	String name,gender,address;
	int age;
	Person(String name,String gender,String address,int age)
		{
		this.name=name;
		this.gender=gender;
		this.address=address;
		this.age=age;
		}
	}
class Employee extends Person
	{
	String cname,qual;
	int empid,salary;
	Employee(String name,String gender,String address,int age,int empid,String cname,String qual,int salary)
		{
		super(name,gender,address,age);
		this.empid=empid;
		this.cname=cname;
		this.qual=qual;
		this.salary=salary;
		}
	}
class Teacher extends Employee
	{
	String sub,dept;
	int tid;
	Teacher(String name,String gender,String address,int age,int empid,String cname,String qual,int salary,String sub,String dept,int tid)
		{
		super(name,gender,address,age,empid,cname,qual,salary);
		this.sub=sub;
		this.dept=dept;
		this.tid=tid;
		}
	void display()
		{
		System.out.println("Name: "+name);
		System.out.println("Gender: "+gender);
		System.out.println("Address: "+address);
		System.out.println("Age: "+age);
		System.out.println("Employee ID: "+empid);
		System.out.println("Company Name: "+cname);
		System.out.println("Qualification: "+qual);
		System.out.println("Salary: "+salary);
		System.out.println("Subject: "+sub);
		System.out.println("Department: "+dept);
		System.out.println("Teacher ID: "+tid);
		System.out.println("\n");	
		}
	}
class Inheritance
	{
	public static void main(String args[])
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit:");
		int n=sc.nextInt();
		sc.nextLine();
		Teacher[] teachers=new Teacher[n];
		for (int i=0;i<n;i++)
			{
			System.out.println("Personal Details:");
			System.out.print("Name: ");
			String name=sc.nextLine();
			System.out.print("Gender: ");
			String gender=sc.nextLine();
			System.out.print("Address: ");
			String address=sc.nextLine();
			System.out.print("Age: ");
			int age=sc.nextInt();
			sc.nextLine();
			System.out.println("Employent Details:");
			System.out.print("Employee ID: ");
			int empid=sc.nextInt();
			sc.nextLine();
			System.out.print("Company Name: ");
			String cname=sc.nextLine();
			System.out.print("Qualification: ");
			String qual=sc.nextLine();
			System.out.print("Salary: ");
			int salary=sc.nextInt();
			sc.nextLine();
			System.out.println("Teacher Details:");
			System.out.print("Subject: ");
			String sub=sc.nextLine();
			System.out.print("Department: ");
			String dept=sc.nextLine();
			System.out.print("Teacher ID: ");
			int tid=sc.nextInt();
			sc.nextLine();
			teachers[i]=new Teacher(name,gender,address,age,empid,cname,qual,salary,sub,dept,tid);
			}
		for (Teacher teach : teachers)
			{
			System.out.println("--------------");
			System.out.println("Person Details");
			System.out.println("--------------");
			teach.display();
			}
		}
	}
