package Interface_Study;

public class implementationClass implements InterfaceUse

{

	public static void main(String[] args) 
	{
		implementationClass ic= new implementationClass();
		ic.test();
		ic.test1();
		System.out.println("================================");
		System.out.println(" the value of interface a is "+a);
		int div=a/b;
		System.out.println("================================");
		System.out.println("my div is "+div);
		System.out.println("================================");
		System.out.println("the value of interface b is "+b);
		int mul=a*b;
		System.out.println("================================");
		System.out.println("my mul is "+mul);
		System.out.println("================================");
		
		

	}

	@Override
	public void test() 
	{
		int a=10;
		int b=20;
		int sum=a+b;
		System.out.println("=======================");
		System.out.println("this is incomplete method of interfaceuse it will be complete method by using implement keyword in my implementation class");
		System.out.println("my sum is "+sum);
		
	}

	@Override
	public void test1() 
	{
		int c=20;
		int d=50;
		int sub=c-d;
		System.out.println("============================");
		System.out.println("this is incomplete method of interfaceuse it will complete in implementation class");
		System.out.println("my sub is "+sub);
	}

}
