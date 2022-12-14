package Generalization_Study;

public class GeneralizationUse 
{

	public static void main(String[] args) 
	{
		AurangabadBranch ab= new AurangabadBranch(); 
		System.out.println("===============Aurangabad Branch=====================");
		ab.backendsupport();
		ab.branchmanager();
		ab.cashier();
		ab.loadingstaff();
		ab.maintaneance();
		System.out.println("===============Aurangabad Branch=====================");
		PuneBranch pb= new PuneBranch();
		System.out.println("===============pune Branch=====================");
		pb.backendsupport();
		pb.branchmanager();
		pb.cashier();
		pb.loadingstaff();
		pb.zonalmanager();
		System.out.println("===============pune Branch=====================");
       GeneralizationUse gu= new GeneralizationUse();
       gu.AurangabadParking();
    		   
	}
	public void AurangabadParking()
	{
		System.out.println(" this is my parking team is somnath,deepak,janardhan and altaf mistari");
	}

}
