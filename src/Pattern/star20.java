package Pattern;

public class star20 
{

	public static void main(String[] args) 
	{
		//**********
		//****  ****
		//***    ***
		//**      **
		//*        *
		//**      **
		//***    ***
		//****  ****
		//**********
		
		// row -->9 star-->5 space-->0
		int star1=5;
		int space1=0;
		int star2=5;
		int space2=0;
		
		//outer for loop for row purpose
		for(int i=1; i<=9; i++)
		{
			// for loop star1
			for(int j=1;j<=star1;j++)
			{
				System.out.print("*");
			}
			// for loop space1
			for(int k=1;k<=space1;k++)
			{
				System.out.print(" ");
			}
			// for loop space2
			for(int l=1;l<=space2;l++)
			{
				System.out.print(" ");
			}
			//for looo star2
			for(int m=1;m<=star2;m++)
			{
				System.out.print("*");
			}
			if(i<5)
			{
				star1--;
				space1++;
				star2--;
				space2++;
			}
			else
			{
				star1++;
				space1--;
				star2++;
				space2--;
			}
			System.out.println();
		}

	}

}
