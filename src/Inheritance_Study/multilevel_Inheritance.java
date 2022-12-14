package Inheritance_Study;

public class multilevel_Inheritance {

	public static void main(String[] args) 
	{
		System.out.println("==========================");
		
		
		grandfather g= new grandfather();
		father f= new father();
		child c= new child();
		
		System.out.println("============================");
		System.out.println("super most grandfather class property");
		
		g.lockerkey();
		System.out.println("==================================");
		System.out.println("super father class property");
		
	   f.secondmember();
	   f.lockerkey();
	   System.out.println("=====================");
	   System.out.println("child class property");
	   
	   c.thirdgenration();
	   c.lockerkey();
	   c.secondmember();
	   
	   grandfather.management();
	   
	   father.agreculture();
	   father.management();
	   
	   child.google();
	   child.agreculture();
	   child.management();
	   
		
		

	}

}
