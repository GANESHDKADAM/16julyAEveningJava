package logicalProgram;

import java.util.Scanner;

public class ReverseTheNumberUsingString 
{

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter any Number");
		int orgnumber = sc.nextInt();
		String orgstring = Integer.toString(orgnumber);
		String revstring="";
		for(int i=orgstring.length()-1;i>=0;i--)
		{
			char t = orgstring.charAt(i);
			revstring=revstring+t;
		}
		System.out.println("revers string is "+revstring);
		int revnumber = Integer.parseInt(revstring);
		System.out.println("revers number is "+revnumber);
	}

}
