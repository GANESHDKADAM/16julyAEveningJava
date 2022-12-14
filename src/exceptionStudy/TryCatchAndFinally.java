package exceptionStudy;

public class TryCatchAndFinally 
{

	public static void main(String[] args) 
	{
		String s= null;
		
		//System.out.println(s.charAt(2));
		
		try 
		{
			System.out.println(s.charAt(2));
			
		} 
		catch (NullPointerException e) 
		{
			System.out.println("we are handling the null pointer exception");
			e.printStackTrace();
		}
		catch (StringIndexOutOfBoundsException e) 
		{
			System.out.println("we are handling the string index outof bounds exeception");
			
		}
		finally 
		{
			System.out.println("Hi This Is My Try Catch Finally method run");
		}

	}

}
