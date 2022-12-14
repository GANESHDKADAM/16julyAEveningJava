package Constructor;

public class constructorsunday 
{
	int a=10;
	int b=20;
	
	constructorsunday(int num1)
	{
		num1=a;
		
		System.out.println("this is my constructor a value is "+a);
	}
	constructorsunday(int num2,int num3)
	{
		num2=a;
		num3=b;
		 int sum=a+b;
			System.out.println("this is my constructor with two parameter value is "+sum);	
	}

	public static void main(String[] args)
	{
		constructorsunday s= new constructorsunday();
		s.dispaly();
		System.out.println("===========================");
		constructorsunday cp= new constructorsunday(10);
		cp.dispaly();
		System.out.println("=============================");
		constructorsunday cp2= new constructorsunday(10,20);
		cp2.dispaly();
		
		

	}
	constructorsunday()
	{
		int sum=a+b;
		System.out.println("this is my constructor addition "+sum);
	}
	public void dispaly()
	{
		int sub=a-b;
		int mul=a*b;
		int div=a/b;
		
		System.out.println("this is my subtraction with nonstatic method "+sub);
		System.out.println("this is my multiplication with nonstatic method "+mul);
		System.out.println("this is my division with nonstatic method "+div);
		
	}
	

}
