package Pattern;

public class star13 
{

	public static void main(String[] args) 
	{
		//     *
		//    * *
		//   * * *    // we wnat this type of star patter
		//  * * * *
		// * * * * *
		
		// row-->5  star-->1  space-->5
		int star=1;
		int space=4;
		
		// out for loop for row purpose
		for(int i=1;i<=5;i++)
		{
			// inner for loop for column purpose
			for(int j=1; j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
			star++;
			space--;
		}

	}

}
