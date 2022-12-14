package methodUse;

public class assigment2 {

	public static void main(String[] args) {
		System.out.println("this is main class");
		System.out.println("this is non static method with parameter example");
		assigment2 ag= new assigment2();
		ag.gropinfo("Ganesh", 'M', 24, "ganeshkadam2593@gmail.com", "MSC computer", 55.56f);
		ag.gropinfo("Ashok", 'M', 29, "ashokyadav2593@gmail.com", "Mechanical", 57.55f);
		ag.gropinfo("Sarika", 'F', 30, "sarikakhaladkar2593@gmail.com", "computer", 89.56f);
		ag.gropinfo("Priyaka", 'F', 59, "priyankamore2593@gmail.com", "Mechanical", 89.56f);
		ag.gropinfo("Depali", 'F', 29, "depalithorkar2593@gmail.com", "Chemical", 58.56f);
		System.out.println("                                                            ");
		System.out.println("this is static method with parameter example");
		gropinfo1("Ganesh", 'M', 24, "ganeshkadam2593@gmail.com", "MSC computer", 55.56f);
		gropinfo1("Ashok", 'M', 29, "ashokyadav2593@gmail.com", "Mechanical", 57.55f);
		gropinfo1("Sarika", 'F', 30, "sarikakhaladkar2593@gmail.com", "computer", 89.56f);
		gropinfo1("Priyaka", 'F', 59, "priyankamore2593@gmail.com", "Mechanical", 89.56f);
		gropinfo1("Depali", 'F', 29, "depalithorkar2593@gmail.com", "Chemical", 58.56f);
	}

	public void gropinfo(String name,char gender, int age,String email, String branch,float height)
	{
		System.out.println("                                                                      ");
		System.out.println("name "+name);
		System.out.println("gender "+gender);
		System.out.println("age "+age);
		System.out.println("email "+email);
		System.out.println("branch "+branch);
		System.out.println("height "+height);
		
	}
	
	public static void gropinfo1(String name,char gender, int age,String email, String branch,float height)
	{
		System.out.println("                                                                             ");
		System.out.println("name "+name);
		System.out.println("gender "+gender);
		System.out.println("age "+age);
		System.out.println("email "+email);
		System.out.println("branch "+branch);
		System.out.println("height "+height);
		
	}
}
