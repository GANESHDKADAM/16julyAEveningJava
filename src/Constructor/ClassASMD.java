package Constructor;

public class ClassASMD {
	int a;
	int b;
	

	public static void main(String[] args) {
		
		ClassASMD asmd= new ClassASMD();
		asmd.addition();
		asmd.SMD();

	}
	public ClassASMD()
	{
		a=70;
		b=50;
		System.out.println(" Hi i am constructor");
		
	}
	public void addition()
	{
		int sum=a+b;
		System.out.println(" addition is "+sum);
		
		
	}
	public void SMD()
	{
		int sub=a-b;
		int mul=a*b;
		int div=a/b;
		System.out.println("subtrction is "+sub);
		System.out.println("multiplication is "+mul);
		System.out.println("divsion is "+div);
		
	}
	
	

}
