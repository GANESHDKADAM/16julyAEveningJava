package Interface_Study;

public class Implements1 implements Interface3, Interface2
{

	public static void main(String[] args) 
	{
		Implements1 im= new Implements1();
		im.test1();
		im.test2();
		im.test3();
		im.test4();
		im.test5();
		InterFace1.test();
		Interface2.test6();

	}

	@Override
	public void test4() 
	{
		int a=10;
		int b=2;
		int sum=a+b;
		System.out.println(" this is interface 2 property "+sum);
		
	}

	@Override
	public void test5() 
	{
		float a=5.5f;
		float b=5.3f;
		float sub=a-b;
		System.out.println(" this is interface 2 property "+sub);
		
	}

	@Override
	public void test1() 
	{
		String name="Ganesh Kadam";
		char gender='M';
		System.out.println(" this is interface 1 property "+name);
		System.out.println(" this is interface 1 property "+gender);
		
	}

	@Override
	public void test2() 
	{
		int a=5;
		int b=6;
		int mul=a*b;
		System.out.println(" this is interface 1 property "+mul);
		
	}

	@Override
	public void test3() 
	{
		Interface3.super.test3();
		Interface2.super.test3();
		
	}

	

}
