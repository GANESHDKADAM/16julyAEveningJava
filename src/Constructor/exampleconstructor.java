package Constructor;

public class exampleconstructor 
{
    int a=20;
    static int b=5;
    
	public static void main(String[] args) 
	{
		exampleconstructor ec= new exampleconstructor();
		ec.sub();
		exampleconstructor cc= new exampleconstructor(20,5);
	   cc.mul();
	   
	   

	}
	public exampleconstructor()
	{
		int sum=a+b;
		System.out.println("this is my constructor output is "+sum);
		
	}
	public void sub()
	{
		int sub=a-b;
		System.out.println("this is non static method output is "+sub);
		
	}
	public void mul()
	{
		int a=5;
		int b=2;
		int mul=a*b;
		System.out.println("this is non static method output is "+mul);
	}
	 public exampleconstructor(int num1, int num2)
	    {
	       int mul= num1*num2;
	       System.out.println(" this is my mul is "+mul);
	       
	       
	    }
	   

}
