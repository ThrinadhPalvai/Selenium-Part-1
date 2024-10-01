package myProject1;

public class methods
{
	public static void main(String[] args) 
	{
		methods d= new methods();
	String name =d.getData();
	System.out.println(name);
	getData2();
}
public String getData()
{
System.out.println("Hello World");
return "Palvai Thrinadh";
}
public static String getData2()
{
	System.out.println("Hello World2");
	return "Thrinadh Palvai";
}
}