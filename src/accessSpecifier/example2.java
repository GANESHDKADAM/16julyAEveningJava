package accessSpecifier;

public class example2 
{

	public static void main(String[] args) 
	{
		example e= new example();
		//e.demo(); // not access another package
		e.demo1();
		e.demo2();
		e.demo3();
		//System.out.println("private "+e.a); //not access another packabe private access specifier
		System.out.println("default "+e.b);
		System.out.println("protected "+e.c);
		System.out.println("public "+e.d);
	}

}
