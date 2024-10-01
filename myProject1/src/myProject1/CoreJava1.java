package myProject1;

import java.util.ArrayList;

public class CoreJava1 {

	public static void main(String[] args) {
		
//	int myNum = 5;
//  String website = "GREAT INFO TELUGU";
//	char letter = 'G';
//	double dec = 5.99;
//	boolean mycard = true;
//	System.out.println("The value stored in the myNum variable " +myNum);
//  System.out.println("The name of the website is:- "+ website);
//	System.out.println("The value of letter is:- "+letter);
//	System.out.println("The value if decimal is:- "+dec);
//	System.out.println("The value of mycard is:- "+mycard);
	// The 1 st way of defining an Array
	int[] arr = new int[6];
	arr[0] = 1;
	arr[1] = 2;
	arr[2] = 3;
	arr[3] = 4;
	arr[4] = 5;
	//System.out.println(arr[0]);
	// The 2nd way of defining an Array
	//int[] arr2 = {1,2,3,4,5,6,7,8,9,10,122};
//	System.out.println(arr2[0]);
	String[] name= {"Palvai","Thrinadh","Selenium"};
//	System.out.println("The value of name is:-" +name[0] +name[1] +name[2]);
	//for(int i=0;i<arr.length;i++)
	//{
		//System.out.println(arr[i]);
		//}
	//for(int i=0;i<arr2.length;i++)
	//{
	//	System.out.println(arr2[i]);
	//}
	//for(int i=0;i<name.length;i++)
	//{
		//System.out.println(name[i]);
	//}
 for(String s:name)
 {
	 System.out.println(s);
 }
 int[] arr2 = {1,2,3,4,5,6,7,8,9,10,122};
 for (int i=0;i<arr2.length;i++)
 {
 if (arr2[i]%2==0)
 {
	 System.out.println(arr2[i]);
 }
 else
 {
	 System.out.println(arr2[i]+ "is not multiple of 2");
	 }
	}
 ArrayList<String> a=new ArrayList <String>();
 a.add("Palvai");
 a.add("Thrinadh");
 a.add("Slenium");
 a.add("Course");
 for(int i=0;i<a.size();i++)
	 {
	 System.out.println(a.get(i));
	 }
 
	}
}
