package Loops;

public class dowhile_loop {

	public static void main(String[] args)
	{
		// we create the table of 5 in incremental process
		// start....>5    condition....<=50    updation
		
		int a=5;
		do
		{
			System.out.println(a);
			a=a+5;
		}
		while(a<=50);
		
		
		// we create the table of 5 in decremental process
				// start....>50    condition..... >=5    updation
		System.out.println("000000000000000000000000");
		int b=50;
		do
		{
			System.out.println(b);
			b=b-5;
		}
		while(b>=5);

	}

}
