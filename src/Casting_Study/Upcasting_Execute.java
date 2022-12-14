package Casting_Study;

public class Upcasting_Execute 
{

	public static void main(String[] args) 
	{
		
		FatherUpcasting fc= new FatherUpcasting();
		fc.bike();
		fc.watch();
		System.out.println(" =======================");
		
		SonUpcasting sc= new SonUpcasting();
		sc.bike();
		sc.watch();
		sc.mobile();
		System.out.println(" =======================");
		
	    FatherUpcasting su=new SonUpcasting();
	    su.bike();
	    su.watch();
	    //su.mobile();  // it cannot run because there is no same method in father and son class that why it cannot be the run this method
	    
	    
	}

}
