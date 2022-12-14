package Pattern;

public class star11 
{

	public static void main(String[] args) 
	{
            
		//*******
		// ******
		//  *****
		//   ****
		//    ***
		//     **
		//      *
		
		//row--> 7 star-->7 space--0;
		
		int star=7;
		int space=0;
		
		// outer for loop for row purpose
		
		for(int i=1;i<=7;i++)
		{
			//inner for loop for column purpose
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++)
			{
				System.out.print("*");
			}
			System.out.println();
			space++;
			star--;
			
		}

	}

}
