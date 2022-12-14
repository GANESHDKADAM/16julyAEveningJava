package logicalProgram;

public class ReverseNumberWithoutString 
{

	public static void main(String[] args) 
	{
		int orgnumber=1234;
		int revnumber=0;
		
		//System.out.println(orgnumber/10);
		//System.out.println(orgnumber%10);
		for(int i=orgnumber;i>0;i=i/10)
		{
			int reminder = i%10;
			revnumber=revnumber*10+reminder;
			//4=0*10+4
			//43=4*10+3
			//432=43*10+2
			//4321=432*10+1
			//System.out.println(reminder);
		}
		System.out.println(revnumber);

	}

}
