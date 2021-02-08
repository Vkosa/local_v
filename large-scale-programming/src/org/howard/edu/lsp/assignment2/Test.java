package org.howard.edu.lsp.assignment2;

/**
 * this is the driver class
 * @author Vivian.lisanza
 *
 */

public class Test {
/**
 * this class tests the combination class
 * @param args
 */
	public static void main(String[] args) {

	    int bucky[]= {1,2,3,4,5,6,7};
	    int sum = 6;

	    Combination numbers = new Combination(); 
	    String vivi = numbers.list(bucky, sum);
	    System.out.println(vivi);
	    
	    int bucky1[]= {1,2,3,4,5,6,7};
	    int sum1 = 5;

	    Combination numbers1 = new Combination(); 
	    String vivi1 = numbers1.list(bucky1, sum1);
	    System.out.println(vivi1);
	  }

}
