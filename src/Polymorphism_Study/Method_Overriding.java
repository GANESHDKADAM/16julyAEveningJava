package Polymorphism_Study;

public class Method_Overriding 
{

	public static void main(String[] args)
	{
		father f= new father();
		f.mother();
		f.motherrecipelikefather();
		
		son s= new son();
		s.mother();
		s.motherrecipefather();
		s.motherrecipelikefather();

	}

}
