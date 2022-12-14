package Array_Study;

public class arrayaSingalAndMultidimentional 
{

	public static void main(String[] args) 
	{
		String star[][]= {{"*","*","*","*","*","*","*","*"},{"*","*","*","*","*","*","*","*"},{"*","*","*","*","*","*","*","*"},{"*","*","*","*","*","*","*","*"},{"*","*","*","*","*","*","*","*"}};
		for(int i=0;i<=4;i++)
		{
			for(int j=0;j<=7;j++)
			{
				System.out.print(star[i][j]+"  ");
			}
			System.out.println();
		}

	}

}
