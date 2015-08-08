import java.util.Scanner;
import java.io.*;
class New
	{
		void lose()throws IOException
		{
			throw new IOException("Warning");
		}
	}

public class Exec {
			static String st;
		
	public static void main(String[] args) {
		int x=1;
		
		
		{
			do
			{
			try
			{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the value of a:");
			int a=sc.nextInt();
			System.out.println("Enter the value of b:");
			int b=sc.nextInt();
			int s=a/b;
			System.out.println("The value is:"+s);
			x=2;
			}
			catch(ArithmeticException e)
			{
			System.out.println("Give it again:");
			}
			}while(x==1);
			
		
	}

	}
	}
