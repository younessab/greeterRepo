package edu.esprit.greeter;

public class Greeter {
	
	
	/**
	 * 
	 * sayHello method
	 * @param name
	 * @return "Hello " + name
	 */
	
	public String sayHello(String name) {
			if(name.equals("MAN"))
				throw new IllegalArgumentException();
		
		int x;		
		return "Hello "+ name;

	}

}
