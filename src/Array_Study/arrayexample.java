package Array_Study;

public class arrayexample 
{

	public static void main(String[] args) 
	{
		// we can create mock gorup studend name
		// declaration of array
		String mname[]= new String[5];
		// intialization of array
		mname[0]="Ganesh";
		mname[1]="Ashok";
		mname[2]="Priya";
		mname[3]="Sarika";
		mname[4]="Deepali";
		// usage of array
		System.out.println(mname[0]);
		System.out.println(mname[1]);
		System.out.println(mname[2]);
		System.out.println(mname[3]);
		System.out.println(mname[4]);
		System.out.println("================================");
		// declaration of array
		int mage[]= new int[5];
		// intialization of array
		mage[0]=29;
		mage[1]=30;
		mage[2]=32;
		mage[3]=35;
		// usage of array
       System.out.println(mage[0]);
       System.out.println(mage[1]);
       System.out.println(mage[2]);
       System.out.println(mage[3]);
       System.out.println(mage[4]);
	   System.out.println("================================");
       float memberweight[]=new float[5];
       memberweight[0]=70.55f;
       memberweight[1]=55.50f;
       memberweight[2]=88.50f;
       memberweight[3]=62.50f;
       memberweight[4]=77.50f;
      // memberweight[5]=78.50f;// array index out of boundry index exception
       System.out.println(memberweight[0]);
       System.out.println(memberweight[1]);
       System.out.println(memberweight[2]);
       System.out.println(memberweight[3]);
       System.out.println(memberweight[4]);
      // System.out.println(memberweight[5]);  // Array index out put of boundry index exception
	   System.out.println("================================");
       double memberheight[]= new double[5];
       memberheight[0]=45.545d;
       memberheight[1]=58.5865d;
       memberheight[2]=44.87d;
       memberheight[3]=58.5875d;
       memberheight[4]=58.5896d;
       System.out.println(memberheight[0]);
       System.out.println(memberheight[1]);
       System.out.println(memberheight[2]);
       System.out.println(memberheight[3]);
       System.out.println(memberheight[4]);
	   System.out.println("================================");
        char mgender[]= new char[5];
        mgender[0]='M';
        mgender[1]='M';
        mgender[2]='F';
        mgender[3]='F';
        mgender[4]='F';
        System.out.println(mgender[0]);
        System.out.println(mgender[1]);
        System.out.println(mgender[2]);
        System.out.println(mgender[3]);
        System.out.println(mgender[4]);
        //System.out.println(mgender[8]);// array index out of bounds exception
        //System.out.println(mgender[-1]);// array index out of bounds exception
        System.out.println("========================");
        System.out.println("Array travesing using static for loop");
        //use of for loop for array traversing
        for(int i=0; i<=4; i++)
        {
        	System.out.println(memberheight[i]);
        }
        System.out.println("========================");
        System.out.println("Array travesing using dynamic for loop");
        //use of for loop for array traversin
        for(int i=0; i<=memberheight.length-1;i++)
        {
        	System.out.println(i);
        }

        

        


       
       
	   
       
       
		
		

		
		
		

	}

}
