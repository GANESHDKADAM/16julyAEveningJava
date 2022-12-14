package methodUse;

public class anotherClass1 {

	public static void main(String[] args) {
	
		System.out.println(" main class");
		anotherClass1 ac= new anotherClass1();
		ac.add3();
		ac.sub4();
		 add4();
		 sub5();
		 
		

	}
public void add3()
{
	int a=100;
	int b=200;
	int sum=a+b;
	System.out.println("another class addition "+sum);
}

	public void sub4()
	{
		int a=100;
		int b=200;
		int sub=a-b;
		System.out.println(" another class substraction "+sub);
	}
	public static void add4()
	{
		int a=100;
		int b=200;
		int sum=a+b;
		System.out.println(" another class addition with static "+sum);
	}
	public static void sub5()
	{
		int a=100;
		int b=200;
		int sub=a-b;
		System.out.println("another class substraction static "+sub);
		
	}
}
