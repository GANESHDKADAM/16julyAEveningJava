package methodUse;

public class nonStatidAddSubMulDiv {

	public static void main(String[] args) {
		System.out.println("Addition Subtraction multiplication division");
		System.out.println("non Static Same Class");
		nonStatidAddSubMulDiv asmd= new nonStatidAddSubMulDiv();
		asmd.add();
		asmd.sub();
		asmd.mul();
		asmd.div();
		
		System.out.println("      ");
		System.out.println("static with same class");
		add1();
		sub1();
		mul1();
		div1();
		
		System.out.println("      ");
		System.out.println("non static with anotherclass");
		anotherClass1 ac= new anotherClass1();
		ac.add3();
		ac.sub4();
		
		System.out.println("      ");
		System.out.println("static with another class");
		anotherClass1.add4();
		anotherClass1.sub5();
	}
public void add()
{
	int a=90;
	int b=60;
	int sum=a+b;
	System.out.println("addition "+sum);
}

public void sub()
{
	int a=90;
	int b=60;
	int sub=a-b;
	System.out.println("subtraction "+sub);
}
public void mul()
{
	int a=90;
	int b=60;
	int mul=a*b;
	System.out.println("multiplication "+mul);
}
public void div()
{
	int a=90;
	int b=60;
	int div=a/b;
	System.out.println("divsion "+div);
}
public static void add1()
{
	int a=90;
	int b=60;
	int sum=a+b;
	System.out.println(" addtition static "+sum);
}
public static void sub1()
{
	int a=90;
	int b=60;
	int sub=a-b;
	System.out.println(" subtraction static "+sub);
}
public static void mul1()
{
	int a=90;
	int b=60;
	int mul=a*b;
	System.out.println("multiplication static "+mul);
}
public static void div1()
{
	int a=90;
	int b=60;
	int div=a/b;
	System.out.println("division static "+div);
}

}
