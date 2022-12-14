package exceptionStudy;

public class TryAndFinally 
{

	public static void main(String[] args) 
	{
		String s=null;//"aurangabad";
		
		//System.out.println(s.charAt(2)); // we cant execute the operation we got nullpoint exception
		try 
		{
			System.out.println(s.charAt(2));
			
		} 
		finally 
		{
			System.out.println("Hi Good Night");
		}
	}

}
