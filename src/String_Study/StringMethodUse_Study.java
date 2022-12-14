package String_Study;

public class StringMethodUse_Study 
{

	public static void main(String[] args) 
	{
	   // two way dispaly the string one is without using new key word and using new keyword
		String a="Aurangabad";
		String a1= new String("Aurangabad");
		System.out.println(" String a is "+a);
		System.out.println(" String a1 is "+a1);
		System.out.println("=========================================");
		// we can used in different different method used in string
		// 1  length() string method
		String b="Aurangabad";
		b.length();
		System.out.println(b.length());
		int outputoflength = b.length();
		System.out.println("string length is "+outputoflength);
		System.out.println("=========================================");
		//2 touppercase() string method
		String c="aurangabad";
		c.toUpperCase();
		System.out.println(c.toUpperCase());
		String outputofuppercase = c.toUpperCase();	
		System.out.println("string upper case is "+outputofuppercase);
		System.out.println("=========================================");
		//3  tolowercase() string method
		
		String d="AURANGABAD";
		d.toLowerCase();
		System.out.println(d.toLowerCase());
		String outputoflowercase = d.toLowerCase();
		System.out.println("string lower case is "+outputoflowercase);
		System.out.println("=========================================");
		// 4 equals() string method
		String e="Aurangabad";
		String e1="Aurangabad";
		String e2= new String("Aurangabad");
		String e3= new String("Aurangabad");
		e.equals(e);
		System.out.println(e.equals(e1));
		System.out.println(e1.equals(e));
		System.out.println(e2.equals(e3));
		System.out.println(e2.equals(e));
		System.out.println(e3.equals(e2));  // case sensitive
		System.out.println(e==e1);
		System.out.println(e==e3);
		System.out.println(e2==e3);
		System.out.println("=========================================");
		// 5 equalsIgnorecase() string method
		String f="Mumbai";
		String f1=" mumbai";
		
		System.out.println(e.equalsIgnoreCase(e1));
		System.out.println(e.equalsIgnoreCase(e3));
		System.out.println(f.equalsIgnoreCase(f1));
		System.out.println("=========================================");
		// 6 contains() string method
		String g="Undirwadi";
		System.out.println(g.contains("Und"));
		System.out.println(g.contains("Unir"));
		System.out.println(g.contains("wadi"));
		System.out.println(g.contains("didi"));
		System.out.println("=========================================");
		// 7 isEmpty() string method
		String h="Waluj";
		System.out.println(h.isEmpty());
		String i="              ";
		System.out.println(i.isEmpty());
		String j="";
		System.out.println(j.isEmpty());
		System.out.println("=========================================");
		// 8 isBlank() string method
		String w="Pune";
		System.out.println(w.isBlank());
		String w1="   ";
		System.out.println(w1.isBlank());
		String w2="";
		System.out.println(w2.isBlank());
		System.out.println("=========================================");
		// 9 charAt string method
		String t1="Waluj";
		System.out.println(t1.charAt(3));
		System.out.println(t1.charAt(0));
		//System.out.println(t1.charAt(88));
		
		String t2=null;
		//System.out.println(t2.length());
		//System.out.println(t2.length());
		System.out.println("=========================================");
		// 10 endsWith & startWith string method
		String t3="Aurangabad";
		System.out.println(t3.endsWith("bad"));
		System.out.println(t3.endsWith("aur"));
		System.out.println(t3.endsWith("Aurangabad"));
		System.out.println(t3.endsWith("bd"));
		System.out.println("=========================================");
		
		System.out.println(t3.startsWith("ran"));
		System.out.println(t3.startsWith("Aur"));
		System.out.println(t3.startsWith("ga", 5));
		System.out.println(t3.startsWith("ang", 3));
		System.out.println("=========================================");
		// 11 subString string method
		
		String y1="How Are You";
		System.out.println(y1.substring(4));
		System.out.println(y1.substring(4, 7));
		System.out.println(y1.subSequence(4, 7));
		System.out.println("=========================================");
		// 12 concat string method
		String n="Gopika";
		String n1=" Ganesh";
		n.concat(n1);
		n1.concat(n);
		System.out.println(n.concat(n1));
		System.out.println(n1.concat(n));
		System.out.println(n.concat(n1).concat(" Kadam"));
		System.out.println("=========================================");
		// 13 indexof string method
		String m="communication";
		System.out.println(m.indexOf("m"));
		System.out.println(m.indexOf("o"));
		System.out.println(m.indexOf("m", 3));
		System.out.println("=========================================");
		// 14 lastindexof string method
		String l="connectness";
		System.out.println(l.lastIndexOf("n"));
		System.out.println(l.lastIndexOf("n"));
		System.out.println(l.indexOf("n", 3));
		System.out.println("=========================================");
		// 14 replace string method
		
		String q="How many people are use telephone phone ";
		System.out.println(q.replace('o', 'x'));
		System.out.println(q.replace('o', 'z'));
		System.out.println(q.replace("le", ""));
		System.out.println(q.replace("phone", ""));
		System.out.println(q.replace("phone", "mobile"));
		System.out.println(q.replaceAll("are", "telephone"));
		System.out.println(q.replaceFirst("How many people are use", "what is your name only"));
		
		
		
		

		
		
		
		
		
		

		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		

		
		

	}

}
