package Constructor;

public class constructorpractice 
{
	int num1=10;
	int num2=20;
	int num3=30;

	public static void main(String[] args) 
	{
		constructorpractice c= new constructorpractice();
		c.add();
		constructorpractice c1= new constructorpractice(80);
		c1.add();
		constructorpractice c2= new constructorpractice(30, 90);
		c2.add();
		constructorpractice c3= new constructorpractice(50, 10, 10);
		c3.add();

	}
	public constructorpractice()
	{
		int sub=num2-num3;
		System.out.println("i am constructor "+sub);
		
	}
	public void add() 
	{
		int sum=num1+num2;
	    System.out.println("my addition is "+sum);
		
	}
	public constructorpractice(int a)
	{
		num1=a;
	}
	public constructorpractice(int a,int b)
	{
		num1=a;
		num2=b;
		
	}
	public constructorpractice(int a,int b,int c)
	{
		num1=a;
		num2=b;
		num3=c;
	}

}
