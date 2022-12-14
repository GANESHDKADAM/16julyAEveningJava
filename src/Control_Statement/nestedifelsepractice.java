package Control_Statement;

public class nestedifelsepractice 
{

	public static void main(String[] args) 
	{
		String name="aarav";
		String pass="12345698";
		if(name=="Aarav")
		{
			System.out.println("user name is correct");
			if(pass=="12345698")
			{
				System.out.println("please enter your password");
			}
			else
			{
				System.out.println("please enter correct password");
			}
		}
		
		else
		{
			System.out.println("user name is invalid");
		}
		

	}

}
