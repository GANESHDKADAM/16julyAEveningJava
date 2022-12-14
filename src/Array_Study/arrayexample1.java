package Array_Study;

import java.util.Arrays;

public class arrayexample1 
{

	public static void main(String[] args) 
	{
		// int rollnumber[]= new int[10];// old type
		int age[]={90,80,50,60,70,40,30,10,20};
		
		for(int i=0; i<=age.length-1;i++)
		{
			System.out.println(age[i]);
		}
		
		Arrays.sort(age);
		System.out.println("==========================");
		System.out.println("arrays in asending order");
		for(int i=0; i<=age.length-1;i++)
		{
			System.out.println(age[i]);
		}
		System.out.println("==========================");
		System.out.println("arrays in desending order");
		for(int i=age.length-1; i>=0;i--)
		{
			System.out.println(age[i]);
		}
		System.out.println("==========================");
		
		String colorname[]= {"Red","Blue","Black","Yellow","Green","Pink","Purpole"};
		Arrays.sort(colorname);
		System.out.println("==========================");
		System.out.println("arrays in asending order");
		for(int i=0; i<=colorname.length-1;i++)
		{
			System.out.println(colorname[i]);
		}
		System.out.println("==========================");
		System.out.println("arrays in desending order");
		for(int i=colorname.length-1; i>=0;i--)
		{
			System.out.println(colorname[i]);
		}
		
		int table[]= {2,4,6,8,10,12,14,16,18,20};
		System.out.println("==========================");
		System.out.println("arrays in asending order");
		for(int i=0;i<=table.length-1;i++)
		{
			System.out.println(table[i]);
		}
		System.out.println("==========================");
		System.out.println("arrays in desending order");
		for(int i=table.length-1;i>=0;i--)
		{
			System.out.println(table[i]);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
