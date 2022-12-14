package Abstract_Study;

public abstract class test 
{

	public static void main(String[] args) 
	{
		
     // test t= new test()  // we cant create the object of abstract class
      //t.demo1();          // we cant call the direct method to the abstract class
		
	}
	public abstract void demo();  // this is incomplete method in abstract class
	public abstract void demo1();  // this is incomplete method in abstract class
	public void demo3() // this is complete method in abstract class
	{
		int a=10;
		int b=20;
		int sum=a+b;
		System.out.println("====================================");
		System.out.println(" this is my abstract class out put");
		System.out.println(" my additon is "+sum);
		
	}
	public void demo4()  // this is complete method in abstract class
	{
		String name="Ganesh";
		char gender='M';
		String mobileno="9890726121";
		System.out.println("======================================");
		System.out.println(" this is abstract class details info");
		System.out.println(" my name is "+name);
		System.out.println(" my gender is "+gender);
		System.out.println(" my mobileno is "+mobileno);
	}

}
