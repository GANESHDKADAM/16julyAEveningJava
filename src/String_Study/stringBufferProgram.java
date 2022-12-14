package String_Study;

public class stringBufferProgram 
{

	public static void main(String[] args) 
	{
		StringBuffer sb= new StringBuffer("Ganesh");
		
		System.out.println(sb.append(1));
		System.out.println(sb.append(0));
		System.out.println(sb.append("kadam"));
		System.out.println(sb.append("ra"));
		System.out.println(sb.append(0));
		System.out.println(sb.capacity());
		System.out.println(sb.charAt(5));
		System.out.println(sb.codePointAt(0));
		System.out.println(sb.compareTo(sb));
		System.out.println(sb.insert(0, true));
		//System.out.println(sb.reverse());
		System.out.println(sb.equals("kadam"));
		System.out.println(sb.lastIndexOf("h"));
		System.out.println(sb.replace(0, 4, "aarav"));
		System.out.println(sb.replace(0, 2, "gopika"));
		System.out.println(sb.insert(3, "f"));
		System.out.println(sb.insert(3, "ga"));
		System.out.println(sb.insert(2, 5));
		System.out.println(sb.indexOf("ravi", 2));
		System.out.println(sb.replace(2, 4, "raj"));
		System.out.println(sb.delete(2, 5));
		//System.out.println(sb.reverse());
		System.out.println(sb.capacity());
		sb.capacity();	
		sb.ensureCapacity(0);
		System.out.println(sb);
		
		}

}
