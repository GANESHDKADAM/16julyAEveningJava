package ThisAndSuperKyeUse;

public class ThisKeyUse 
{
   int x=50;  // global variable
	public static void main(String[] args) 
	{
		ThisKeyUse t= new ThisKeyUse();
		t.test();
		

	}
	public void test()
	{
		int x=10;  // local variable
		System.out.println(" this is local variable value is "+x); //  value of local variable
		System.out.println(" this is global variable value is "+this.x);// value of global variable
		
	}

}
