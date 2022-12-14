package exceptionStudy;

public class exception1 
{

	public static void main(String[] args) 
	{
		String s=null;
		//System.out.println(s.charAt(12)); // without handle the null pointer exception we cant move to the next stage we use try and catch method
		
		try 
		{
			System.out.println(s.charAt(12));
			
		}
		catch (NullPointerException e) 
		{
			System.out.println("we can work on null value");
		}
		catch (StringIndexOutOfBoundsException e) 
		{
		   System.out.println("we handle indexout of bound exception please enter valid index");
		}
		System.out.println("Hi we handle all exception");
		

	}

}
