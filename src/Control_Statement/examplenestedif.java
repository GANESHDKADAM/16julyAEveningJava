package Control_Statement;

public class examplenestedif 
{

	public static void main(String[] args) 
	{
		String username="velocity";
		String password="123";
		
     if(username=="velocity")
     {
    	 System.out.println("user name is correct and goes to password");
     
      if(password=="123")
     {
    	 System.out.println("password is correct");
    	 
     }
     else
     {
    	 System.out.println("incorrect password");
    	 
     }
     }
     else
      {
    	  System.out.println("user name is wrong");
      }
     
	}

}
