package Pattern;

public class star19 
{

	public static void main(String[] args) 
	{
		//   *
		//  *  *
		// *    *
		//*      *  // we want this pattern
		// *     *
		//  *   *
		//    *
		
		// row--> 7 star-->1 space-->3
		int star=1;
		int space=3;
		// out for loop for row purpose
		for(int i=1; i<=7;i++)
		{
			// for space
			for(int j=1; j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
			if(i<4)
			{
				star++;
				space--;
			}
			else
			{
				star--;
				space++;
			}
		}

	}

}
