package logicalProgram;

import java.util.Scanner;

public class ReverseStringWithPalindrome 
{

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("please enter your string name");
		String orignal = sc.next();
		String rev="";
		
		for(int i=orignal.length()-1;i>=0;i--)
		{
			char mystring = orignal.charAt(i);
			rev=rev+mystring;
		}
		System.out.println("my orignal string is "+orignal);
		System.out.println("my reverse string is "+rev);
		if(orignal.equals(rev))
		{
			System.out.println("my string is palindrome");
		}
		else
		{
			System.out.println("my string is not palindrome");
		}

	}

}
