package varibale_Study;

public class examplegl 
{
	int a=10;
	static int b=20;

	public static void main(String[] args)
	{
		examplegl gl= new examplegl();
		gl.add();
		sub();
		System.out.println("the non static global variable value is "+gl.a);
		int mul=5*gl.a;
		System.out.println("the multiplication of non static global variable is "+mul);
		System.out.println("the static global variable is "+b);
		int div=6*b;
		System.out.println("the division of static variable is "+div);
		exampleglanotherclass an= new exampleglanotherclass();
		an.test();
		exampleglanotherclass.test2();
		System.out.println("the another class non static variable is "+an.g);
		int mul1=b*an.g;
		System.out.println("the another class mul1 is "+mul1);
		

	}
	public void add()
	{
		int c=25;
		int d=15;
		int sum=c+d;
		System.out.println("the addition of non static method "+sum);
		
	}
	public static void sub()
	{
		int a=5;
		int b=2;
		int sub=a-b;
		System.out.println("the subtraction of static method "+sub);
		
		
	}

}
