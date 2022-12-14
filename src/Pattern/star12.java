package Pattern;

public class star12 
{

	public static void main(String[] args) 
	{
	//    *
	// 	 ****
	//  *******
	// *********
	//***********   	
		
		
		// row-->5 star-->1 space-->4
		// row-->5 star-->6 space-->0
		int star=1;
		int star1=13;
		int space=4;
		int space1=0;
		
		// outer for loop for row purpose
		for(int i=1;i<=5;i++)
		{
			// inner for loop for column purpose
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++)
			{
				System.out.print("*");
			}
			System.out.println();
			star=star+2;
			space--;
		}
		// outer for loop for row purpose
				for(int i=1;i<=5;i++)
				{
					// inner for loop for column purpose
					for(int j=1;j<=space;j++)
					{
						System.out.print(" ");
					}
					for(int k=1;k<=star;k++)
					{
						System.out.print("*");
					}
					System.out.println();
					star=star-2;
					space++;
				}

	}
	

}
