package accessSpecifier;

public class example 
{

	public static void main(String[] args) 
	{
		example e= new example();
		e.demo();
		e.demo1();
		e.demo2();
		e.demo3();
		System.out.println("private "+e.a);
		System.out.println("default "+e.b);
		System.out.println("protected "+e.c);
		System.out.println("public "+e.d);
		

	}
	private int a=10;
	int b=20;
	protected int c=30;
	public int d=40;
	
	private void demo()
	{
		System.out.println("this is my private access specifier");
	}
	void demo1()
	{
		System.out.println("this is my defualt access specifirer");
	}
	protected void demo2()
	{
		System.out.println("this is my protected access specifier");
		
	}
	public void demo3()
	{
		System.out.println("this is my public access specifier");
	}
	
}

