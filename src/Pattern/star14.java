package Pattern;

public class star14 
{

	public static void main(String[] args) 
	{
		//* * * * *
		// * * * *
		//  * * *    // we want this type of pattern
		//   * *
		//    *
		
		// row--> 5   star-->5 space-->0
		
		int star=5;
		int space=0;
		
		// outer for loop for row purpose
		for(int i=1;i<=5;i++)
		{
			// inner for loop 
			for(int j=1; j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int k=1; k<=star;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
			star--;
			space++;
		}

	}

}
