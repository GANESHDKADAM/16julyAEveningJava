package Inheritance_Study;

public class multilevelson extends multilevelmother
{

	public static void main(String[] args) 
	{
		multilevelson s= new multilevelson();
		s.apple();
		s.cash();
		s.cbz();
		s.gold();
		s.makeup();
		s.wallets();
		multilevelmother m= new multilevelmother();
		m.cash();
		m.wallets();
		m.makeup();
		m.gold();
		multilevelfather f= new multilevelfather();
		f.cash();
		f.wallets();
		
		

	}
	public void cbz()
	{
		System.out.println("sons cbz");
	}
	public void apple()
	{
		System.out.println("sons apple");
	}

}
