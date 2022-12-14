package Inheritance_Study;

public class sonsingle extends mothersingle
{

	public static void main(String[] args) 
	{
		sonsingle s= new sonsingle();
		s.mobile();
		s.laptop();
		s.recipe();
		s.housewife();
		mothersingle m= new mothersingle();
		m.recipe();
		m.housewife();
		

	}
	public void laptop()
	{
		System.out.println("son laptop");
	}
	public void mobile()
	{
		System.out.println("son mobile");
		
	}
	

}
