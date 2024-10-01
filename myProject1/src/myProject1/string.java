package myProject1;

public class string {

	public static void main(String[] args) 
	{
 //String s="Palvai Thrinadh Selenium ";
 //String s1="Palvai Thrinadh Selenium ";
 //String s5=" hello";
 //System.out.println("--> "+s +s1 +s5);
 String s2= new String("Welcome ");
 String s3= new String(" Welcome");
 System.out.println("--> "+s2 + s3);
 String s="Palvai Thrinadh Selenium ";
 String[] splittedString= s.split(" ");
		 System.out.println(splittedString[0]);
		 System.out.println(splittedString[1]);
		 System.out.println(splittedString[2]);
		 System.out.println(splittedString[2].trim( ));
		 for(int i=0;i<s.length();i++)
		 {
			 System.out.println(s.charAt(i));
		 }
		 for(int i=s.length()-1;i>=0;i--)
		 {
			 System.out.println(s.charAt(i));
		 }
	}

}
