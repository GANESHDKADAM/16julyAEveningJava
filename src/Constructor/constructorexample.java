package Constructor;

public class constructorexample 
{
  int a=10;
  int b=20;
  public constructorexample(int num1)
  {
	  num1=a;
	  
  }
  public constructorexample(int num1,int num2)
  {
	  num1=a;
	  num2=b;
  }
	public static void main(String[] args)
	{
		constructorexample c= new constructorexample();
		c.addition();
		c.subtraction();
		c.multiplication();
		c.division();
		constructorexample cp= new constructorexample(10);
		cp.addition();
		/*cp.subtraction();
		cp.multiplication();
		cp.division();*/
		constructorexample cp1= new constructorexample(10,20);
		
		cp1.multiplication();
		

	}
	public constructorexample()
	{
		
		int sum=a+b;
		
		System.out.println("i am constructor");
		System.out.println("sum is "+sum);
	}
	  public void addition()
	  {
		  int add=a+b;
		  int sub=a-b;
		  int mul=a*b;
		  int div=a/b;
		  
		  System.out.println("addition is "+add);
		  
	  }
	  public void subtraction()
	  {
		  int sub=a-b;
		 System.out.println("subtraction is "+sub);
		  
	  }
	  public void multiplication()
	  {
		  int mul=a*b;		  
		  System.out.println("multiplication is "+mul);
		  
	  }
	  public void division()
	  {
		  		  int div=a/b;
		  
		  System.out.println("divssion is "+div);
		  
	  }
	

}
