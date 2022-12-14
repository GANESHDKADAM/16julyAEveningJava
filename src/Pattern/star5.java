package Pattern;

public class star5 
{

	public static void main(String[] args) 
	{
		// *
		// **
		// ***
		// ****   we want thid type of star pattern
		// *****
		// ******
		// *******
		
		// row--> 7 star-->1;
		
		// outer for loop for row
		
		int star=1;
		
		for(int i=1;i<=7;i++)
		{
			// inner for loop for column purpose
			for(int j=1;j<=star;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			star++;

		}
		
	}

}
