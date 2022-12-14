package Pattern;

public class star4 
{

	public static void main(String[] args) 
	{
		// * * * * * * * * * *
		// * * * * * * * * * *
		// * * * * * * * * * * we want this type of patter with space
		// * * * * * * * * * *
		// * * * * * * * * * *
		// * * * * * * * * * *
		// * * * * * * * * * *
		// * * * * * * * * * *
		
		// row-->8  column=10
		
		// outer for loop for row purpose
		
		for(int i=1; i<=8;i++)
		{
			//inner for loop for column purpose
			for(int j=1;j<=10;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
