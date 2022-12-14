package Pattern;

public class star16 
{

	public static void main(String[] args) 
	{
		//*****
		//****
		//***
		//**
		//*      // we want this type of star pattern
		//**
		//***
		//****
		//*****
		
		// row-->9 star-->5
		int star=5;
		
		// outer for loop for row purpose
		for(int i=1; i<=9;i++)
		{
			// inner for loop
			for(int j=1; j<=star;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			if(i<5)
			{
				star--;
			}
			else
			{
				star++;
			}
		}

	}

}
