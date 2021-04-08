package org.howard.edu.lsp.assignment6.integerset;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Collections;

import org.howard.edu.lsp.assignment4.Integerset.Listemptyexception;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class IntegerSetTest {

	@Test
	@DisplayName ("Test cases for equals")
	public void testEquals() {
		
		//ArrayList<Integer> list2=b.set;
		IntegerSet set1 = new IntegerSet();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		IntegerSet set2 = new IntegerSet();
		set2.add(1);
		set2.add(2);
		set2.add(3);
		assertEquals(set1.equals(set2),true);
	      
	       
		
	}
	
	@SuppressWarnings("null")
	@Test
	@DisplayName ("Test cases for clear ")
	public void testClear() {
	       //ArrayList<Integer> set = null;
		IntegerSet newset = new IntegerSet();
		newset.clear();
		
		newset.clear();
		assertEquals (newset.size(),0);}
	
	@Test
	@DisplayName ("Test cases for length")
	public void testLength () {
		IntegerSet set = new IntegerSet();
		assertEquals(0,set.length());
		
		   
	}
	/**
	 * tests for the smallest value in the list
	 */
	@Test
	@DisplayName ("Test cases for smallest")
	public void testSmallest () {
		IntegerSet set1 = new IntegerSet();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		int expectedValue = 1;
		
		assertEquals(set1.length(), expectedValue);
		
		set1.add(2);
		set1.add(4);
		set1.add(6);
		int expectedValue1 = 2;
			
		assertEquals(set1.length(), expectedValue1);
		}

	
	
	/**
	 * test removes positive value
	 */
	@Test
	@DisplayName ("Test cases for remove")
	public void testRemoves () {
		IntegerSet Set1 = new IntegerSet();
		Set1.add(1);
		Set1.add(2);
		Set1.add(3);
		Set1.remove(2);
		String expectedValue = "1 and 3";
		assertEquals(expectedValue, Set1.toString());
		
		Set1.add(11);
		Set1.add(2);
		Set1.add(3);
		Set1.remove(3);
		String expectedValue1 = "11 and 2";
		assertEquals(expectedValue1, Set1.toString());
		
		Set1.clear();
		Set1.add(2);
		Set1.remove((15));
		assertEquals (1,Set1.length());
	
		

	}
	
	
	@Test
	@DisplayName ("Test cases for add")
	public void testAdd() {
		IntegerSet Set1 = new IntegerSet();
		Set1.add(1);
		Set1.add(2);;
		Set1.add(3);
		String expectedValue = "1,2 and 3";
	    assertEquals(expectedValue, Set1.toString());
	    
	    Set1.add(2);
		Set1.add(4);;
		Set1.add(6);
		String expectedValue1 = "2,4 and 6";
	    assertEquals(expectedValue1, Set1.toString());
		
	}
	
	@Test
	@DisplayName ("Test cases for union")
	public void testUnion() {

		IntegerSet set1 = new IntegerSet();
		IntegerSet set2 = new IntegerSet();
		

		
		set1.add(1);
		set1.add(2);
		set1.add(3);

		set2.add(1);
		set2.add(5);
		set2.add(6);
		
		assertEquals (false, set1.equals(set2));
		set1.clear();
		set2.clear();
		
		set1.add(2);
		set1.add(3);
	

		set2.add(2);
		set2.add(3);
	
		assertEquals (false, set1.equals(set2));
		set1.clear();
		set2.clear();
		
		
	}
	
	@Test
	@DisplayName ("Test cases for intersect")
	public void testIntersect() {
		IntegerSet set1 = new IntegerSet();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		IntegerSet set2 = new IntegerSet();
		set2.add(7);
		set2.add(2);
		set2.add(4);
		assertEquals(set1.equals(set2), false);
			IntegerSet set11 = new IntegerSet ();
			IntegerSet set12 = new IntegerSet ();

		
	}
	
	@Test
	@DisplayName ("Test cases for difference")
	public void testDifference() {
		IntegerSet set1 = new IntegerSet();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		IntegerSet set2 = new IntegerSet();
		set2.add(4);
		set2.add(5);
		set2.add(6);
		assertEquals(set1.equals(set2), false);	
		
		IntegerSet set3 = new IntegerSet();
		set3.add(1);
		set3.add(2);
		set3.add(3);
		IntegerSet set4 = new IntegerSet();
		set4.add(2);
		set4.add(4);
		set4.add(6);
		assertEquals(set3.equals(set4), false);	

		
	
	}
	
	@Test
	@DisplayName ("Test cases for toString")
	public void testTostring () {
	IntegerSet set1 = new IntegerSet();
	set1.add(1);
	set1.add(2);
	set1.add(3);
	String expectedValue = "1 2 3";
	
	assertEquals(expectedValue,set1.toString());
	}

	
	@Test
	@DisplayName ("Test cases for largest")
	public void testLargest () {
	IntegerSet set1 = new IntegerSet();
	set1.add(1);
	set1.add(2);
	set1.add(3);
	int expectedValue = 3;
	
		assertEquals(set1.length(), expectedValue);
		
	set1.add(2);
	set1.add(4);
	set1.add(6);
	int expectedValue1 = 6;
		
	assertEquals(set1.length(), expectedValue1);
	}

		
}
