package Pattern;

public class star7 
{

	public static void main(String[] args) 
	{
		// * * * * *
		// * * * *
		// * * * we want this type of star pattern
		// * *
		// *
		
		// row-->5  1st row column star count is star=5
		int star=5;
				
		for(int i=1;i<=5;i++)
		{
			// inner for loop for column purpose
			for(int j=1;j<=star;j++)
			{
				System.out.print("* ");
				
			}
			System.out.println();
			star--;
			
		}

	}

}
