package Interface_Study;

public class ImplementClass1 implements Interface6
{

	public static void main(String[] args) 
	{
		ImplementClass1 i= new ImplementClass1();
		i.aarav1();
		i.aarav2();
		i.aarav3();
		i.aarav4();

	}

	@Override
	public void aarav1() 
	{
		System.out.println(" this property is interface 5");
	
	}

	@Override
	public void aarav2() 
	{
		System.out.println(" this property is interface 5");
		
	}

	@Override
	public void aarav3() 
	{
		System.out.println(" this property is interface 6");
		
	}

	@Override
	public void aarav4() 
	{
		System.out.println(" this property is interface 6");
		
	}

}
