package Interface_Study;

public interface InterFace1 
{
	
	void test1();
	void test2();
     default void test3()
	{
		
		System.out.println(" this is interface 1 with complete method output");
		
		
	}
	static void test()
	{
		System.out.println(" this is my static interface use");
	}

}
