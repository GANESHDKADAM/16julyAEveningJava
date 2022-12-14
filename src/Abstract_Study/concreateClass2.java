package Abstract_Study;

public class concreateClass2 extends test2
{

	public static void main(String[] args) 
	{
		concreateClass2 c2= new concreateClass2();
		c2.demo();
		
		c2.demo1();
		
		c2.demo3();
		
		c2.demo4();
		
		c2.demo5();
		
		c2.demo2();

	}
	public void demo4()
	{
		int e=5;
		int f=10;
		int mul=e*f;
		System.out.println("my multiplication is "+mul);
	}
	public void demo5()
	{
		int s=6;
		int n=3;
		int div=s/n;
		System.out.println("my division is "+div);
	}
	@Override
	public void demo() 
	{
		System.out.println("this is my incompleted method in abstract class");
		
	}
	@Override
	public void demo1() 
	{
		System.out.println("this is my incompleted method in abstract class 2");
		
	}

}
