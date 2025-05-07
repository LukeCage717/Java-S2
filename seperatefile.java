import java.io.*;
import java.util.*;
public class seperatefile
	{
	public static void main(String[] args)
		{
		String numbersFile="numbers.txt";
		String evenFile="even.txt";
		String oddFile="odd.txt";
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(numbersFile)))
			{
			for(int i=1;i<=20;i++)
				{
				writer.write(i+" ");
				}
			}
		catch(IOException e)
			{
			System.out.println("Error writing numbers into the file "+e);
			}
		try (Scanner scanner=new Scanner(new File(numbersFile));
			BufferedWriter evenWriter=new BufferedWriter(new FileWriter(evenFile));
			BufferedWriter oddWriter=new BufferedWriter(new FileWriter(oddFile)))
			{
			while(scanner.hasNextInt())
				{
				int number=scanner.nextInt();
				if(number%2==0)
					evenWriter.write(number+" ");
				else 
					oddWriter.write(number+" ");
				}
			}
		catch(IOException e)
			{
			System.out.println("Error processing files "+e);
			}
		displayFileContent("numbers.txt");
		displayFileContent("even.txt");
		displayFileContent("odd.txt");
		}
		private static void displayFileContent(String filename)
			{
			System.out.println("\nContents of "+filename+":");
			try(BufferedReader reader=new BufferedReader(new FileReader(filename)))
				{
				String line;
				while((line=reader.readLine())!=null)
					System.out.println(line);
				}
			catch(IOException e)
				{
				System.out.println("Error reading "+filename+": "+e);
				}
			}
	}
