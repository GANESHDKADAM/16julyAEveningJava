package Array_Study;

public class arraymultidimentional 
{

	public static void main(String[] args) 
	{
		//Study multidimentional array
		// declaration of array
		
		int rollnum[][]= new int[3][3];
		
		// array intialisation
		rollnum[0][0]=10;
		rollnum[0][1]=20;
		rollnum[0][2]=30;
		rollnum[1][0]=40;
		rollnum[1][1]=50;
		rollnum[1][2]=60;
		rollnum[2][0]=70;
		rollnum[2][1]=80;
		rollnum[2][2]=90;
		// array usages
		System.out.println("Using old method out put multidimentional array");
		System.out.println("=========================");
		System.out.print(rollnum[0][0]+" ");
		System.out.print(rollnum[0][1]+" ");
		System.out.println(rollnum[0][2]);
		System.out.print(rollnum[1][0]+" ");
		System.out.print(rollnum[1][1]+" ");
		System.out.println(rollnum[1][2]);
		System.out.print(rollnum[2][0]+" ");
		System.out.print(rollnum[2][1]+" ");
		System.out.println(rollnum[2][2]);
		System.out.println("=================================");
		// use for loop
		System.out.println("Using for loop multidimentional array");
		System.out.println("=================================");
		for(int i=0; i<=2;i++)
		{
			for(int j=0;j<=2;j++)
			{
				System.out.print(rollnum[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("=================================");
		System.out.println("old method use multidimentional array secound example");
		
		String name[][]= new String[3][2];
		
		name[0][0]="Ganesh";
		name[0][1]="Ashok";
		name[1][0]="Sarika";
		name[1][1]="Deepali";
		name[2][0]="Priyanka";
		name[2][1]="Fivemember";
		
		System.out.print(name[0][0]+"   ");
		System.out.println(name[0][1]);
		System.out.print(name[1][0]+"   ");
		System.out.println(name[1][1]);
		System.out.print(name[2][0]+"   ");
		System.out.println(name[2][1]);
		System.out.println("=================================");
		System.out.println("for loop use multidimentional array secound example");
		for(int i=0; i<=2;i++)
		{
			for(int j=0;j<=1;j++)
			{
				System.out.print(name[i][j]+ "  ");
			}
			System.out.println();
		}
		System.out.println("=================================");
		System.out.println("new method use multidimentional array third example");
		int age[][]= {{10,20,30,40},{50,60,70,80},{90,100,110,120},{130,140,150,160}};
		System.out.print(age[0][0]+"  ");
		System.out.print(age[0][1]+"  ");
		System.out.print(age[0][2]+"  ");
		System.out.println(age[0][3]);
		System.out.print(age[1][0]+"  ");
		System.out.print(age[1][1]+"  ");
		System.out.print(age[1][2]+"  ");
		System.out.println(age[1][3]);
		System.out.print(age[2][0]+"  ");
		System.out.print(age[2][1]+"  ");
		System.out.print(age[2][2]+"  ");
		System.out.println(age[2][3]);
		System.out.print(age[3][0]+"  ");
		System.out.print(age[3][1]+"  ");
		System.out.print(age[3][2]+"  ");
		System.out.println(age[3][3]);
		
		System.out.println("=================================");
		System.out.println("for loop new use multidimentional array third example");
		for(int i=0;i<=3;i++)
		{
			for(int j=0; j<=3;j++)
			{
				System.out.print(age[i][j]+"  ");
			}
			System.out.println();
		}
		System.out.println("=================================");
		String starpattern[][]= {{"*","*","*","*"},{"*","*","*","*"},{"*","*","*","*"},{"*","*","*","*"}};
		for(int i=0;i<=3;i++)
		{
			for(int j=0;j<=3;j++)
			{
				System.out.print(starpattern[i][j]+"  ");
			}
			System.out.println();
			
		}
		
		
		
		
		
	}

}
