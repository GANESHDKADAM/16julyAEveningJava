package ThisAndSuperKyeUse;

public class SuperKeyUse extends thisuse
{
	int y=5;  // global variable
	int z=10; // global variable

	public static void main(String[] args) 
	{
		SuperKeyUse s= new SuperKeyUse();
		s.display();

	}
	public void display()
	{
		int y=6; // local variable
		int z=4; // local variable
		System.out.println("this is local variable value is "+y); // local variable value
		System.out.println("this is local variable value is "+z);  // local variable value 
		System.out.println("this is global variable value is "+this.y);  // global variable value
		System.out.println("this is global variable value is "+this.z);  // global variable value
		System.out.println("this is global variable value in super class is "+super.a); // global variable value in super class
		System.out.println("this is global variable value in super class is "+super.b);  // global variable value is super class
		int sum=y+this.y;
		System.out.println("sum of local variable and global variable is "+sum);
		int sub=this.z-super.a;
		System.out.println("sub of global variable and global variable in super class is "+sub);
		 int mul=super.b*z;
		 System.out.println("multiplication of global super class and local variable is "+mul);
		 int div=super.a*super.b;
		 System.out.println("division of gloabal variable A super class and gloabal ariable B super class is "+div);
		 
		
	}

}
