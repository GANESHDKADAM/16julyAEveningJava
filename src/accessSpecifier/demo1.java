package accessSpecifier;

public class demo1 {

	public static void main(String[] args) 
	{
		demo d= new demo();
		//d.test();  // private specifier cannot call the another class because private class is run to within the class
		d.test1();  // default can call
		d.test2();  // protected can call
		d.test3();  // public can call
		
		//System.out.println(" private member of same class" + d.a); // private specifier cannot call the another class because private class is run to within the class
		System.out.println(" default member of same class "+d.b);
		System.out.println(" protected member of same class "+d.c);
		System.out.println(" public member of same class "+d.d);

	}
	//protected int age=50;
//	protected void test5()
	//{
	//	System.out.println(" i am just try to run demo1 class "+age);
	//}

}
