package Pattern;

public class star21 
{

	public static void main(String[] args) 
	{
		//*
		//*  *
		//*  *  *
		//*  *  *  *
		//*  *  *  *  *
		
		//row-->5 star-->1 space-->0
		int star=1;
		int space=0;
		
		//outer for loop for row purpose
		for(int i=1; i<=5;i++)
		{
			//for loop for star
			for(int j=1;j<=star;j++)
			{
				System.out.print("*  ");
			}
			// for loop for space
			for(int k=1;k<=space;k++)
			{
				System.out.print(" ");
			}
			System.out.println();
			star++;
			
			
		}

	}

}
