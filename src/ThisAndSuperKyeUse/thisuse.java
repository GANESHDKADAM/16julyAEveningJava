package ThisAndSuperKyeUse;

public class thisuse 
{
  int a=10; // global variable
  int b=20;  // global variable
	public static void main(String[] args)
	{
		thisuse t1= new thisuse();
		t1.test1();

	}
	public void test1()
	{
		int a=25;  // local variable
		int b=5;  // localvariable
		System.out.println(" this is local variable value is "+a);  // local variable value
		System.out.println("this is local variable value is "+b);   // local variable value
		System.out.println("this is global variable value is "+ this.a);  // global variable value
		System.out.println("this is global variable value is "+ this.b);  // global variable value
		
	}
	
	
	

}
