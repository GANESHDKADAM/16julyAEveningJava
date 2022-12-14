package Interface_Study;

public class ImplemetClass5 implements Interface7,Interface8
{

	public static void main(String[] args) 
	{
		ImplemetClass5 i= new ImplemetClass5();
		i.demo4();
		i.demo5();
		i.demo8();
		i.demo9();

	}
	@Override
	public void demo8() 
	{
		int a=5;
		int b=10;
		int sum=a+b;
		System.out.println(" this is my interface 8 property addition is "+sum);
		
	}
	@Override
	public void demo9() 
	{
		int a=5;
		int b=10;
		int sub=a-b;
		System.out.println(" this is my interface 8 property subtraction is "+sub);
		
	}
	@Override
	public void demo4() 
	{
		int a=5;
		int b=10;
		int mul=a*b;
		System.out.println(" this is my interface 7 property multiplication is "+mul);
		
	}
	@Override
	public void demo5() 
	{
		int a=5;
		int b=10;
		int div=a/b;
		System.out.println(" this is my interface 7 property division is "+ div);
		
	}

}
