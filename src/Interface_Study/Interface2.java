package Interface_Study;

public interface Interface2 
{
	void test4();
	void test5();
	 default void test3()
	{
		System.out.println(" this is father interface property");
	}
	
	static void test6()
	{
		System.out.println(" this is static keywrod use");
	}
	

}
