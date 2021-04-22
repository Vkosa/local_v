package org.howard.edu.lsp.exam.question40;

public class Airplane implements Flying {
	public Airplane() {  

	   }

	   @Override

	   public void fly() {

	       System.out.println(getClass().getSimpleName() + " engines running.");

	   }
}
