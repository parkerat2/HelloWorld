import static org.junit.Assert.*;

import org.junit.Test;

public class HelloAaronTest {

	@Test
	public void testHelloAaron()
	{
		HelloAaron hello = new HelloAaron();
		String value = hello.helloAaron();
		String expected = "Hello Aaron";
		assertEquals("message", expected, value);
	}

}
