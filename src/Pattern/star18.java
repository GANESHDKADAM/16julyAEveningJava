package Pattern;

public class star18 
{

	public static void main(String[] args) 
	{
        //   *
		//  ***
		// *****
		//*******    // we want this type of pattern
		// *****
		//  ***
		//   *
		
		// row--> 7 star-->1 space-->3
		int star=1;
		int space=3;
		//outer for loop for row purpose
		for(int i=1;i<=7;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int k=1; k<=star;k++)
			{
				System.out.print("*");
			}
			System.out.println();
			if(i<4)
			{
				star=star+2;
				space--;
			}
			else
			{
				star=star-2;
				space++;
			}
		}


	}

}
