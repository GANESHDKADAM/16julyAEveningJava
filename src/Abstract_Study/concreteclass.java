package Abstract_Study;

public class concreteclass extends test
{

	public static void main(String[] args) 
	{
		concreteclass c= new concreteclass();
		c.demo();
		c.demo1();
		c.demo3();
		c.demo4();
		c.demo7();
		c.demo8();
		c.demo9();

	}
	
	public void demo7()
	{
		int b=40;
		int c=50;
		int sub=b-c;
		System.out.println("===================================================");
		System.out.println(" this is my concrete class output");
		System.out.println("Subtraction is "+sub);
	}
	public void demo8()
	{
		int b=4;
		int c=5;
		int mul=b*c;
		System.out.println("===================================================");
		System.out.println(" this is my concrete class output");
		System.out.println(" Multiplication is "+mul);
	}
	public void demo9()
	{
		int b=20;
		int c=5;
		int div=b/c;
		System.out.println("===================================================");
		System.out.println(" this is my concrete class output");
		System.out.println(" Division is "+div);
	}

    @Override
	public void demo() 
	{
    	System.out.println("===================================================");
		System.out.println(" incomplete mehtod is override in concrete class done");
		System.out.println(" this is my abstract incomplete method but i will update in concrete class by using extends the test class");
		
	}

	@Override
	public void demo1() 
	{
		System.out.println("===================================================");
		System.out.println(" incomplete mehtod is override in concrete class done");
		System.out.println(" this is my abstract incomplete method but i will update in concrete class by using extends the test class");

		
	}



}
