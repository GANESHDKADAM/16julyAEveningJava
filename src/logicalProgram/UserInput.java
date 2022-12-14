package logicalProgram;

import java.util.Scanner;

public class UserInput 
{

	public static void main(String[] args) 
	{
		//int a=10;
		//int b=20;
		//int c=a+b;
		//System.out.println(" my sum is "+c);
		
		// we use to create scaner object to use of use input purpose
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("please enter value of a");
		int a = sc.nextInt();	
		System.out.println("Please enter value of b");
		int b = sc.nextInt();
		int c=a+b;
		System.out.println("my sum is "+c);
		System.out.println("=============================================");
		
		System.out.println("please enter your string name");
		String mystring = sc.next();
		System.out.println("my string is "+mystring);
		
	}

}
