import java.util.Scanner;

public class HelloPersonal {
	
	private String personal;
	
	public String helloPersonal(String x)
	{
		return ("Hello " + x);
	}
	
	public String getPersonal()
	{
		return personal;
	}
	
	public void setPersonal(String y)
	{
		personal = y;
	}
	
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		String z = kb.nextLine();
		HelloPersonal hello = new HelloPersonal();
		hello.setPersonal(z);
		System.out.println(hello.helloPersonal(hello.getPersonal()));
	}

}
