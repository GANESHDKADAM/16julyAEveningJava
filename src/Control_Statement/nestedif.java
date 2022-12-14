package Control_Statement;

public class nestedif {

	public static void main(String[] args) {
		// if your name is correct--> correct name-->> please enter your mobile no
		// if mobile no is correct--> correct mobile no--> then call to another person
		// else mobile no wrong--> please check your mobile no unable to call
		// else incorrect name
		
		String name="Ganesh";
		String number="9890726121";
		if(name=="Ganesh")
		{
			System.out.println("Correct Name");
		if(number!="9890726121") 
			{
			   System.out.println("Correct mobile no");
 			}
		else
		{
			System.out.println("please check your mobile no is unable to call");
		}
		
		}
		else
		{
			System.out.println("incorrect name");
		}

	}

}
