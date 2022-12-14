package exceptionStudy;

public class exception 
{

	public static void main(String[] args) 
	{
		int a=10;
		int b=0;
		
		//System.out.println(a/b); // not execute without using try catch exception method.
		
		try 
		{
			System.out.println(a/b);
		} 
		catch (ArithmeticException e) 
		{
			System.out.println("we cant handle the operation it mean o is not divide by 10");
		}
		System.out.println("Hi Good Night All Friends");



	}

}
