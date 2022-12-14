package Control_Statement;

public class nestedifexample {

	public static void main(String[] args)
	{
		String username="Ganesh";
		String password="14";
		if(username=="Ganesh")
		{
			System.out.println("user name is correct");
			System.out.println("enter your password");
			if(password=="143")
			{
				System.out.println("pass word is correct");
			}
			else
			{
				System.out.println("please enter correct password");
				
			}
			
		}
		else
		{
			System.out.println("please enter correct user name");
		}

	}

}
