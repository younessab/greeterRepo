package edu.esprit.greeter.test;
import org.junit.*;
import edu.esprit.greeter.Greeter;

public class TestGreeter {
	/*First fast, independent, repeatable,selfchecking, timely (rapide pour avoir resultat) */
	Greeter greeter;
	@Before
	public void setUp(){
		greeter = new Greeter();
	}
	@Test 
	public void itShouldSayHelloWorld(){	
		String result= greeter.sayHello("world");
		Assert.assertEquals("Hello world", result);
	}
	@Test(expected = IllegalArgumentException.class)
	public void itShouldRaiseException(){
		String param="MAN";
		greeter.sayHello(param);
	}

	@Test 
	public void itShouldSayHello(){	
		String result= greeter.sayHello("java");
		Assert.assertEquals("Hello javaa", result);
	}
	@Test(expected = IllegalArgumentException.class)
	public void itShouldRaiseException(){
		String param="MAN";
		greeter.sayHello(param);
	}
	@After
public void tearDown()
	{
	greeter=null;	
	}
}