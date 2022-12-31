package com.automation;

interface ab{
	public void a();
}

interface xy{
	public void b(int x);
}

public class myLambda {

	// implement an interface using a lambda expression
	// only one method is allowed for each interface 
	
	
	public static void main(String[] args) {
		
		ab obj = () -> {
			System.out.println("My - string");
		};

		xy obj2 = (int x) -> {
			System.out.println("My - number");
		};

		obj.a();
		obj2.b(1);

	}

}
