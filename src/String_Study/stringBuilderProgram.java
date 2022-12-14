package String_Study;

public class stringBuilderProgram 
{

	public static void main(String[] args) 
	{
		StringBuilder sb= new StringBuilder("Ganesh");
		
		System.out.println(sb);
		sb.append(" kadam");
		System.out.println(sb);
		sb.insert(0, "aarav ");
		System.out.println(sb);
		sb.replace(6, 12, "Gopika");
		System.out.println(sb);
		sb.delete(0, 1);
		System.out.println(sb);
		System.out.println(sb.reverse());
		sb.capacity();
		System.out.println(sb.capacity());
		sb.ensureCapacity(0);
		System.out.println();
	}

}
