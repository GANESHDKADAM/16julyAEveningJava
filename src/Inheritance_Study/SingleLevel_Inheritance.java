package Inheritance_Study;

public class SingleLevel_Inheritance {

	public static void main(String[] args) 
	{
		Mother m= new Mother();
		m.home();
		m.money();
			
System.out.println("=======================");
	
		Son s= new Son();
		s.mobile();
		s.laptop();
		m.money();
		m.home();
	}

}
