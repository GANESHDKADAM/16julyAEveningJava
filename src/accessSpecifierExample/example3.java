package accessSpecifierExample;

import accessSpecifier.example;

public class example3 extends example
{

	public static void main(String[] args) 
	{
		example3 e= new example3();
		//e.demo();  not access another package
		//e.demo1();  not access defualt specifier in another package
		e.demo2();
		e.demo3();
		//System.out.println("private "+e.a); //not access another packabe private access specifier
		//System.out.println("default "+e.b);  not access defualt specifier
		System.out.println("protected "+e.c);
		System.out.println("public "+e.d);

	}

}
