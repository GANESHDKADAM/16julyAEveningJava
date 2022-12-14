package Interface_Study;

public class FinalKeyUse // we can use the final key word in our class we cant use to extend the class
{

	public static void main(String[] args) 
	{
		FinalKeyUse f= new FinalKeyUse();
		f.add();

	}
	
	public final void add() // we can use the final key word in our method we cant use to extend other class
	{
		final int a=10;
		//a=a+20;  // we can use final keyword in first object then we cant resuer the same object
		System.out.println("sum is "+a);
	}

}
