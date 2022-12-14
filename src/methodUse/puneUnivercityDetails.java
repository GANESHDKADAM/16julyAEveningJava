package methodUse;

public class puneUnivercityDetails {

	public static void main(String[] args) {
		System.out.println(" Well-Come to pune unvercity");
		puneUnivercityDetails pu= new puneUnivercityDetails(); // declaration of object
		pu.studentinfo();   // calling to non static method with same class
		
		System.out.println("      ");
		studentinfo1();	
	}
		public void studentinfo()
	{
	// declaration as well as assign value
		String name="Ganesh Kadam";
		Float weight=19.5454f;
		int age=19;
		char gender='M';
		double prn=45.658875544565d;
		int rollnum=20;
		String branch="MSC Computer Science";
		String address="abcd";
		// usages 
		System.out.println(" this is non static method example");
		System.out.println(" my name is "+name);
		System.out.println("my weight is "+weight);
		System.out.println(" my age is "+age);
		System.out.println(" my gender is "+gender);
		System.out.println(" my prn is "+prn);
		System.out.println(" my rollnum is "+rollnum);
		System.out.println("my branch is "+branch);
		System.out.println("my address is "+address);
	}
		
      public static void studentinfo1()
	{
    	  //declaration as well as assign value
    	  String name="Ganesh kadam";
  		Float weight=19.5454f;
  		int age=19;
  		char gender='M';
  		double prn=45.658875544565d;
  		int rollnum=20;
  		String branch="MSC Computer Science";
  		String address="abcd";
  		//usages
  		System.out.println("this is static method example");
  		System.out.println("name is "+name);
  		System.out.println("weight is "+weight);
		System.out.println("age is "+age);
		System.out.println("gender is "+gender);
		System.out.println("prn is "+prn);
		System.out.println("rollnum is "+rollnum);
		System.out.println("branch is "+branch);
		System.out.println("address is "+address);		
  		 	
	}
}
