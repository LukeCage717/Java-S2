import java.util.*;
class password
	{
	public static void main(String args[])
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter password:");
		String password=sc.nextLine();
		if(password.contains("@"))
			{
			System.out.println("Password contains special characters");
			}
		else
			{
			System.out.println("Password does not contain special characters");
			}
		}
	}
