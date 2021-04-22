package org.howard.edu.lsp.exam.question41;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.howard.edu.lsp.exam.question41.ArrayList1;


import org.junit.jupiter.api.Test;

/**
 * class tests for adding numbers and removing zero
 * @author esther.lisanza
 *
 */
class ArrayListTest {
/**
 * method adds integers to list and removes zero
 */
	@Test
	@DisplayName ("Tests")
	public void test() {
	ArrayList1 obj1 = new ArrayList1();	
	obj1.add(1);
	obj1.add(2);
	obj1.add(3);
	obj1.add(0);
	obj1.removeZero();
	
	assertEquals (obj1.toString(),"1 2 3 "); 
	
	
	obj1.add(2);
	obj1.add(4);
	obj1.add(6);
	obj1.add(0);
	obj1.add(1);
	obj1.add(2);
	obj1.add(3);
	obj1.removeZero();
	
	assertEquals (obj1.toString(),"1 2 3 2 4 6 1 2 3 ");
	
	obj1.add(0);
	obj1.add(7);
	obj1.add(2);
	obj1.add(0);
	obj1.add(4);
	obj1.add(2);
	obj1.add(3);
	obj1.removeZero();
	
	assertEquals (obj1.toString(),"1 2 3 2 4 6 1 2 3 7 2 4 2 3 ");


	
	
		
	}
	

}
