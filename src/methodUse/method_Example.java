package methodUse;

public class method_Example {

	public static void main(String[] args)
	{
		System.out.println("============================");
		method_Example s= new method_Example();
		s.studentinfo();
		
		System.out.println("=============================");
		studentinfor1();
		
		System.out.println("=============================");
		general g= new general();
		g.studentinfo2();
		
		System.out.println("==============================");
		g.studentinfo3();
	
		
	}
	public void studentinfo()
	{
	 String name="Ganesh D Kadam";
	 int age=53;
	 String Mobileno="9890726121";
	 String city="Sambhajinagar";
	 float weight=53.89f;
	 double height=5.10d;
	 
	 System.out.println("student name is "+name);
	 System.out.println("student age is "+age);
	 System.out.println("student mobileno is "+Mobileno);
	 System.out.println("studend city is "+city);
	 System.out.println("student weitht is "+weight);
	 System.out.println("student height is "+height);
	 
	}
	public static void studentinfor1()
	{
		int rollno=10;
		char div='A';
		String name="Ramkisan";
		
		System.out.println("studentinfo1 rollno is "+rollno);
		System.out.println("studentinfo1 div is "+div);
		System.out.println("studentinfo1 name is "+name);
	}

}
