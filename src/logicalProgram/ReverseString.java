package logicalProgram;

import java.util.Scanner;

public class ReverseString 
{

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("please enter your string name");
		String orignal = sc.next();
		String rev="";
		
		for(int i=orignal.length()-1;i>=0;i--)
		{
				char t = orignal.charAt(i);
				rev=rev+t;
		}
		System.out.println("Orignal stirng is "+orignal);
		System.out.println("reverse string is "+rev);
	}

}
