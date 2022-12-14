package accessSpecifier;

public class demo 

{
	public static void main(String[]args)
	{
		demo d= new demo();
		d.test();
		d.test1();
		d.test2();
		d.test3();
		
		System.out.println(" private member of same class" + d.a);
		System.out.println(" default member of same class "+d.b);
		System.out.println(" protected member of same class "+d.c);
		System.out.println(" public member of same class "+d.d);
	
	}
	private int a=40;
	int b=10;
	protected int c=13;
	public int d=14;
	
	private void test()
	{
		System.out.println(" this is private member");
	}
	void test1()
	{
		System.out.println(" this is default member");
	}
	protected void test2()
	{
		System.out.println(" this is protected member");
	}
	public void test3()
	{
		System.out.println(" this is public member");
	}
	
}

