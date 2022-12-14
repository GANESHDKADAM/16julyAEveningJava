package varibale_Study;

public class variableexample 
{
	int a=10;
	static int b=5;

	public static void main(String[] args)
	{
		System.out.println("==============================");
		variableexample v= new variableexample();
		v.addition();
		test1();
		System.out.println("=============================================");
	   System.out.println("calling non static variable in same class "+v.a);
	   int sum=v.a+b;
	   System.out.println("addition is non static variable and static variable is "+sum);
	   System.out.println("==================================================");
	 System.out.println("calling static variable in same class is "+b);
	 int sub=v.a-b;
	System.out.println("subtraction is not stati and static variable in same class is "+sub);
	
	System.out.println("======================================================");
	
	demo1 d=new demo1();
	System.out.println("===========================================================");
	System.out.println("calling non static variable in different class is "+ d.c);
	int mul=v.a*d.c;
	System.out.println("multiplication non static and another non static class is "+mul);
	System.out.println("===============================================================");
	System.out.println("calling static variable in different class is "+d.d);
	int div=v.b/d.d;
	System.out.println("divssion is static variable and static variable in different class "+div);
	
	
	
	
	
    
	
	
	
	

	}
	public variableexample()
	{
		System.out.println("i am constructor");
	}
	public void addition()
	{
		int a=15;
		int sum=a+b;
		System.out.println("this is non static method");
	}
	public static void test1()
	{
	
		
		System.out.println("this is static method");
	}
	

}
