package logicalProgram;

public class NoOfWhiteSpaceInString 
{

	public static void main(String[] args) 
	{
		String a="U n d i r w a d i";
		int count=0;
		
		for(int i=0;i<=a.length()-1;i++)

		{
			char t = a.charAt(i);
			char space=' ';
			if(t==space)
			{
				count++;
			}
		}
		System.out.println("Number of blanck space in string are "+count);
	}

}
