package edu.handong.csee.java.inheritance;

public class Dog extends Animal{
	public static void testClassMethod() {
	        System.out.println("The static method in Dog");
	    }
		@Override
	    public void testInstanceMethod() {
	        System.out.println("The instance method in Dog");
	    }

}
