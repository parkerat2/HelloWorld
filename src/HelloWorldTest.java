import static org.junit.Assert.*;

import org.junit.Test;

public class HelloWorldTest
{
	@Test
	public void testMain()
	{
		String value = HelloWorld.main(null);
		String expected = "Hello World";
		assertEquals("message", expected, value);
	}
}
