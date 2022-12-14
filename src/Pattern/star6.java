package Pattern;

public class star6 
{

	public static void main(String[] args) 
	{
		// *******
		// ******
		// *****  we want this type of pattern for star
		// ****
		// ***
		// **
		// *
		
		// row-->7  1 row star count star=7
		int star=7;
		
		// outer for loop for row purpose
		for(int i=1;i<=7;i++)
		{
			// inner for loop for column
			for(int j=1;j<=star;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			star--;
			
		}

	}

}
