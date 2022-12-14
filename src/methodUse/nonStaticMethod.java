package methodUse;

public class nonStaticMethod {

	public static void main(String[] args) 
	{
		                                                // first we create the object of non static method
		nonStaticMethod obj=new nonStaticMethod();      // first create the obj with same class
		obj.test();                                     // calling non static method from same class                      
		test1();                                        // second we calling the static method in same class
	                                             	    // first we create the object of not static method with another class
		anotherClass differentclass=new anotherClass(); // first we create the obj with another class
		differentclass.test3();                         // calling non static method with another class
	    anotherClass.test4();                           // second we calling the static method in another class
	}
                                   
	public void test()                                 // first we create not static example
	{
		System.out.println(" this is my non static example with same class");
		
	}
	
	public static void test1()                        // second we create static example
	{
		System.out.println(" this is my static example with same class");
		
	}
	
}

