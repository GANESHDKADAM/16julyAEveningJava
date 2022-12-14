package Control_Statement;

public class if_else {

	public static void main(String[] args) 
	{
		// if temp is grater than 40 then AC is on else ac is off
		// if gender is male then i am in male else i am in female
		// if city is pune then i am in hadapsar else i am in nor hadapsar
		
		float temp=100;
		if(temp>105)
		{
			System.out.println(" AC is on");
		}
		else
		{
			System.out.println(" AC is off");
		}
		
		char gender='M';
		if(gender=='M')
		{
			System.out.println(" i am male");
		}
		else
		{
			System.out.println(" i am female");
		}
		String city="Aurangabad";
		if(city=="Aurangabad")
		{
			System.out.println(" i am in aurabgabad kar");
		}
		else
		{
			System.out.println(" i am not in aurangabad kar");
		}
			
	}

}
