package org.howard.edu.lsp.exam.question40;

public class Goose extends Animal implements Flying {
	public Goose() {

	   }

	   public void speak() {
	       System.out.println("This Goose speaks");

	   }  

	   public void move() {
	       System.out.println("This Goose moves forward");

	   }  

	   @Override

	   public void fly() {

	       System.out.println(getClass().getSimpleName() + " is flying");  

	   }
}
