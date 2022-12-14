package Pattern;

public class star17 
{

	public static void main(String[] args) 
	{
		//*         *
		//**       **             
		//***     ***      
		//****   ****    
		//***** *****   // we want this type of star pattern    
		//****   ****
		//***     ***
		//**       **
		//*         *
		
			
		//row-->9 star1-->1 space1-->5  
		int star1=1;
		int space1=5;
		int star2=1;
		int space2=4;
		
		//outer for loop for row purpose
		for(int i=1;i<=9;i++)
		{
			// inner for loop star
			for(int j=1;j<=star1;j++)
			{
				System.out.print("*");
			}
			// inner for loop space1
			for(int k=1;k<=space1;k++)
			{
				System.out.print(" ");
			}
			// inner for loop space2 
			for(int l=1;l<=space2;l++)
			{
				System.out.print(" ");
			}
			// inner for loop star2
			for(int m=1;m<=star2;m++)
			{
				System.out.print("*");
			}
			System.out.println();
			if(i<5)
			{
				star1++;
				star2++;
				space1--;
				space2--;
			}
			else
			{
				star1--;
				star2--;
				space1++;
				space2++;
			}
			
		}
		
		

	}

}
