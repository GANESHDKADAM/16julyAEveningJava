package varibale_Study;

public class varibaleGloableAndLocal {
	
	int a=10;  // this is non static gloable variable
	static int b=45; // this is static gloable variable

	public static void main(String[] args) {
		
		varibaleGloableAndLocal va= new varibaleGloableAndLocal();
		va.addition();
		// calling from variable
		System.out.println(" non static variable is "+va.a); // calling non static variable in same class
		// variable in same class
		int sum=10+va.a;
		System.out.println(" addition is "+sum);
		// calling static variable in same class
		System.out.println("static variable is "+b); // calling static variable in same class
		int sub=10-b;
		System.out.println(" subtraction is "+sub);
		demo ba= new demo();
		System.out.println(" calling to non static variable in another class "+ba.a);
		int sum1=30+ba.a;
		System.out.println(" additition is "+sum1);
		int sum2=ba.a+b;
		System.out.println(" addition is "+sum2);
		int sum3=ba.a+demo.b;
		System.out.println("addition is "+sum3);
		System.out.println("calling to static gloable variable in another class "+demo.b);
		int sub1=ba.a-demo.b;
		System.out.println("subtraction is "+sub1);
		
	}
	public varibaleGloableAndLocal()
	{
		//a=15;
		//b=25;
		//System.out.println(a);
	}
	public void addition()
	{
		
		 int sum=a+b;
		
		 
		 System.out.println("addition is "+sum);
		 
	}
	public static void test1()
	{
		//Static int c=10;
		System.out.println(" Runing Static method");
	}
	

}
