package methodUse;

public class nonstaticandstaticmethodsuday 
{

	public static void main(String[] args) 
	{
		nonstaticandstaticmethodsuday ns= new nonstaticandstaticmethodsuday();
		ns.test();
		test2();
		
		

	}
	
	public void test()
	{
		int rollno=10;
		int age=50;
		String name="Ravi";
		String vilage="undirwadi";
		Float weight=10.5f;
		double height=50.5564d;
		
		System.out.println("my roll no is "+rollno);
		System.out.println("my age is "+age);
		System.out.println("my name is "+name);
		System.out.println("my vilage is "+vilage);
		System.out.println("my weight is "+weight);
		System.out.println("my height is "+height);
	}
	public static void test2()
	{
		int rollno=80;
		int age=70;
		String name="vijay";
		String vilage="kanad";
		Float weight=55.5f;
		double height=58.5555864d;
		
	    System.out.println("=====================");
		System.out.println("my roll no is "+rollno);
		System.out.println("my age is "+age);
		System.out.println("my name is "+name);
		System.out.println("my vilage is "+vilage);
		System.out.println("my weight is "+weight);
		System.out.println("my height is "+height);
	}

}
