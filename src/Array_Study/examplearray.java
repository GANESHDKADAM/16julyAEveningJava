package Array_Study;

public class examplearray 
{

	public static void main(String[] args) 
	{
		String name[][]=new String[3][2];
		name[0][0]="Ganesh";
		name[0][1]="Ashok";
		name[1][0]="Sarika";
		name[1][1]="Deepali";
		name[2][0]="Priya";
		name[2][1]="Ganesh";
		
		System.out.print(name[0][0]+" ");
		System.out.println(name[0][1]);
		System.out.print(name[1][0]+" ");
		System.out.println(name[1][1]);
		System.out.print(name[2][0]+" ");
		System.out.println(name[2][1]);
		System.out.println("=======================================");
		
		for(int i=0;i<=2;i++)
		{
			for(int j=0; j<=1;j++)
			{
				System.out.print(name[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("=======================================");
		
		String star[][]= {{"*","*","*","*"},{"*","*","*","*"},{"*","*","*","*"},{"*","*","*","*"}};
		for(int i=0;i<=3;i++)
		{
			for(int j=0; j<=3;j++)
			{
				System.out.print(star[i][j]+"  ");
			}
			System.out.println();
		}
		
		

	}

}
