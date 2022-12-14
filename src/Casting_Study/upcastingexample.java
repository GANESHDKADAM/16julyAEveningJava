package Casting_Study;

public class upcastingexample 
{

	public static void main(String[] args) 
	{
		fatherupcastexample fu= new fatherupcastexample();
		fu.demo();
		fu.demo2();
		sonupcastexample su= new sonupcastexample();
		su.demo();
		su.demo2();
		su.demo3();
		su.demo4();
		fatherupcastexample fs= new sonupcastexample();
		fs.demo();
		fs.demo2();

	}

}
