package accessSpecifier1;

import accessSpecifier.demo;

public class demo2 extends demo
{

	public static void main(String[] args) 
	{
		
		demo2 d2= new demo2();
		//d2.test5();
	d2.test2();
		d2.test3();
			
					
		demo d= new demo();
		//d.test();  // private specifier cannot call the another class because private class is run to within the class
		//d.test1();  // default specifier cannot call the another class because default class is run to the with in package
		d2.test2();  // protected specifier cannot call the another class because protected class is run to the with in package we can run inheritance conncept
		d2.test3();  // public can call
		
		//System.out.println(" private member of same class" + d.a); // private specifier cannot call the another class because private class is run to within the class
		//System.out.println(" default member of same class "+d.b);
		System.out.println(" protected member of same class "+d2.c);
		System.out.println(" public member of same class "+d.d);
		//System.out.println(d2.age);

	}

}
