package Polymorphism_Study;

public class Method_Overload 
{

	public static void main(String[] args) 
	{
		Method_Overload o= new Method_Overload();
		o.add(10, 20);
		o.add(10, 20, 10);
		o.add(2, 4, 2, 8);
		o.add(2, 4, 2, 2, 4);
		

	}
	
	public void add(int a,int b)
	{
		int sum=a+b;
		System.out.println("==========================================");
		System.out.println("this is overload with two argument is "+sum);
	}
	public void add(int a, int b, int c)
	{
		int sub=a-b-c;
		System.out.println("==========================================");
		System.out.println("this is overload with three arguments is "+sub);
	}
	public void add(int a, int b, int c, int d)
	{
		int mul=a*b*c*d;
		System.out.println("==========================================");
		System.out.println("this is overload with four arguments is "+mul);
	}
	public void add( int a, int b, int c, int d, int e)
	{
		int div=a/b/c/d/e;
		System.out.println("==========================================");
		System.out.println("this is overload with five arguments is "+div);
	}
	

}
