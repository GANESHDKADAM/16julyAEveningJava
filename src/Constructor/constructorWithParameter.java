package Constructor;

public class constructorWithParameter {
	int a;
	int b;
	public static void main(String[] args)
	{
		constructorWithParameter cwp= new constructorWithParameter();
		cwp.addition();
		constructorWithParameter cp1= new constructorWithParameter(100);
		cp1.addition();
		constructorWithParameter cp2= new constructorWithParameter(100,50);
		cp2.addition();
		cwp.subtraction();
		constructorWithParameter cp3=new constructorWithParameter(100);
		cp3.subtraction();
		constructorWithParameter Cp4= new constructorWithParameter(100,25);
		Cp4.subtraction();
		cwp.multiplication();
		constructorWithParameter cp5=new constructorWithParameter(100);
		cp5.multiplication();
		constructorWithParameter Cp6= new constructorWithParameter(100,25);
		Cp6.multiplication();
		cwp.division();
		constructorWithParameter cp7= new constructorWithParameter(40,20);
		cp7.division();
		
				}
	public constructorWithParameter()
	{
		a=10;
		b=20;
	}
		public void addition()
	{
		int sum=a+b;
		System.out.println(" addition is "+sum);
	}
	public void subtraction()
	{
		int sub=a-b;
		System.out.println(" subtraction is "+sub);
	}
	public void multiplication()
	{
		int mul=a*b;
		System.out.println(" multiplication is "+mul);
	}
	public void division()
	{
		int div=a/b;
		System.out.println("div is "+div);
	}
	
	
	
			public constructorWithParameter(int num1)
	{
		a=num1;
	}
	public constructorWithParameter(int num1,int num2)
	{
		a=num1;
		b=num2;
	}
	
	

}
