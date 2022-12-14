package String_Study;

public class SplitMethodUSe 
{

	public static void main(String[] args) 
	{
		String a="my name is lakhan";
		       String[] mysplit = a.split("");		
		       
		       for(int i=0; i<=mysplit.length-1;i++)
		       {
		    	   System.out.println(mysplit[i]);
		       }
		       System.out.println("==========================");
		       
		       String b="Ganesh_Ashok_Sarika_Deepali_Priya";
		                String[] mystring = b.split("_");
		                
		                for(int j=0; j<=mystring.length-1;j++)
		                {
		                	System.out.println(mystring[j]);
		                }
		                System.out.println("==========================");
		                
		                
		                String c= "rajesh_ravi_rajyog_rahul_raghvir";
		                           String[] myresult = c.split("_");
		                           for(int i=0; i<=myresult.length-1;i++)
		                           {
		                        	   System.out.println(myresult[i]);
		                           }
		                           System.out.println("==========================");
		                
		                // String in Reverse order
		                  String p="dad";
		                  String p1="";
		                  for(int i=p.length()-1;i>=0;i--)
		                  {
		                	 // System.out.println(p.charAt(i));
		                	  
		                	  
		                	  p1=p1+p.charAt(i);
		                  }
		                  System.out.println(p1);
		                  if(p1.equals(p))
		                  {
		                	  System.out.println("string is plindrome");
		                  }
		                  else
		                  {
		                	  System.out.println("string is not plindrome");
		                  }
		                  System.out.println("==========================");     
		                String g="mom";
		                String g1="";
		                
		                for(int i=g.length()-1;i>=0;i--)
		                {
		                	//System.out.println(name.charAt(i));
		                	
		                	g1=g1+g.charAt(i);
		                	
		                	
		                }
		                System.out.println(g1);
		                if (g1.equals(g))
		                {
		                	System.out.println("string is plindrome");
		                }
		                else
		                {
		                	System.out.println("string is not plindrome");
		            
		                }
		                System.out.println("==========================");
		                String s= "rajesh";
		                String temp="";
		                for(int i=s.length()-1;i>=0;i--)//7,6,5---,0
		                {
		                temp=temp+s.charAt(i);
		                //temp=""+y-->y
		                //yt=y+t
		                //yti=yt+i
		                }
		                System.out.println(temp);
		                if(temp.equals(s))
		                {
		                System.out.println("String is palindrome");
		                }
		                else
		                {
		                System.out.println("String is not palindrome");
		                }
		                
		                
		                
		                

	}

}
