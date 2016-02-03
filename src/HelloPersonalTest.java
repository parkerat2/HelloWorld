import static org.junit.Assert.*;

import org.junit.Test;
import java.util.Scanner;

public class HelloPersonalTest
{
	Scanner kb = new Scanner(System.in);
	@Test
	public void testHelloPersonal()
	{
		String x = "fred";
		HelloPersonal hello = new HelloPersonal();		
		String value = hello.helloPersonal(x);
		String expected = "Hello " + x;
		assertEquals("message", expected, value);
	}
}