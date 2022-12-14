package Constructor;

public class ClassCC1 {
	String name="Ganesh";
	String city="Aurangabad";

	

	public static void main(String[] args)
	{
		ClassCC1 c= new ClassCC1();
		c.dispaly();
		display1();
		
	
		

	}
	public ClassCC1()
	{
		System.out.println(" this is user define constructor ");
	}
	public void dispaly()
	{
		System.out.println(" hi i am non static menthod");
		System.out.println(" name is "+name);
		System.out.println(" city is "+city);
		
	}
	public static void display1()
	{
		System.out.println(" hi i am static method");

		
		
	}
	
}
