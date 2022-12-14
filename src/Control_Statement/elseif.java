package Control_Statement;

public class elseif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// i have a money greater than or equel to 30000 i have purchase i phone
				// i have a money greater than or equel to 20000 i have purchase samsung
				// i have a money greater than or equel to 10000 i have purchase lenovo
				// i have a money grater than or equal to 5000 i have purchase lava
				// i have a no money 

	int money=4000;
	if (money>=30000)
	{
		System.out.println(" i have purchase i phone ");
	}
	else if (money>=20000)
	{
		System.out.println("i have purchase samsung");
	}
	else if (money>=10000)
	{
		System.out.println("i have purchase lenovo");
	}
	else if (money>=5000)
	{
		System.out.println("i have purchase lava");
	}
	else
	{
		System.out.println("i have a no money");
	}
	}
}
