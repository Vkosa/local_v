package org.howard.edu.lsp.assignment6.integerset;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertThrows;
 
import java.util.ArrayList;

import org.howard.edu.lsp.assignment4.Integerset;
import org.junit.jupiter.api.DisplayName;
 
public class IntegerSetTest  {
@Test
@DisplayName("Test cases for clear")
public void testClear() {
  ArrayList<Integer> list= new ArrayList<>();
	  Integerset set1= new Integerset(list);
 
  set1.add(1);
  set1.clear();
  assertEquals(set1.length(),0);
 
  set1.clear();
  assertEquals(set1.length(),0);
}
 
@Test
@DisplayName("Test cases for length")
public void testLength() {
  ArrayList<Integer> list= new ArrayList<>();
	  Integerset set1= new Integerset(list);
  
  set1.clear();
  assertEquals(0,set1.length()); 
  
 
  set1.add (1); 
  set1.add (2);
  assertEquals(2,set1.length());
}
 
@Test
@DisplayName("Test cases for equals")
public void testEquals() {
  ArrayList<Integer> list1= new ArrayList<>();
		ArrayList<Integer> list2= new ArrayList<>();
		
	  Integerset SetA= new Integerset(list1);
	  Integerset SetB= new Integerset(list2);
 
  SetA.add(1);
  SetA.add (2);
 
  SetB.add (1);
  SetB.add (2);
  assertEquals(true,SetA.equals(SetB));
 
  SetA.clear();
  assertFalse(SetA.equals(SetB));
 
  SetB.clear();
  assertFalse(SetA.equals(SetB));
 
  SetA.add (1);
  SetA.add (2);
  SetA.add (3);
 
  SetB.add (1);
  SetB.add (2);
  assertFalse(SetA.equals(SetB));
 
}
 
@Test
@DisplayName("Test cases for contains")
public void testContains() {
  ArrayList<Integer> list= new ArrayList<>();
	  Integerset set1= new Integerset(list);
 
  set1.add (2);
  assertTrue(set1.contains(2));
 
  set1.clear();
  assertFalse(set1.contains(2));
 
  set1.add (2);
  assertFalse(set1.contains(4));
 
}
 
@Test
@DisplayName("Integerset.largest throw exception")
public void testLargestException() {
	ArrayList<Integer> list= new ArrayList<>();
	  Integerset set1= new Integerset(list);
 
	  
	  Exception exception = assertThrows(IntegerSetException.class, ()->{set1.largest();});
	
	String expectedMessage= "Empty set in largest";
	String actualMessage =exception.getMessage();
	
	assertTrue(actualMessage.contains(expectedMessage));
}
 
 
@Test
@DisplayName("Integerset.smallest throw exception")
public void testSmallestException() {
	ArrayList<Integer> list= new ArrayList<>();
	  Integerset set1= new Integerset(list);
 
	  
	  Exception exception = assertThrows(IntegerSetException.class, ()->{set1.smallest();});
	
	String expectedMessage= "Empty set in smallest";
	String actualMessage =exception.getMessage();
	
	assertTrue(actualMessage.contains(expectedMessage));
}
 
 

 
 
 
@Test
@DisplayName("Test cases for add")
public void testAdd() {
  ArrayList<Integer> list= new ArrayList<>();
	  Integerset set1= new Integerset(list);
  
  set1.add (2);
  assertTrue(set1.contains(2));
 
 
  set1.clear();
  set1.add (-1);
  set1.add(0);
  set1.add (1);
  assertEquals(3,set1.length());
 
 
  set1.clear();
  set1.add(2);
  set1.add(2);
  assertEquals(1,set1.length());
}
 
@Test
@DisplayName("Test cases for remove")
public void testRemove() {
  ArrayList<Integer> list= new ArrayList<>();
	  Integerset set1= new Integerset(list);
 
  set1.add (2);
  set1.remove(0);
  assertEquals(0,set1.length());
 

 
  set1.clear();
  set1.add (1);
  set1.add (2);
  set1.add (3);
  set1.remove(2);
  assertEquals(2,set1.length());
 
 
  set1.clear();
  set1.add (1);
  set1.add (3);
  set1.add (2);
  set1.remove(2);
  assertEquals(2,set1.length());
 

}
 
@Test
@DisplayName("Test cases for union")
public void testUnion() {
  ArrayList<Integer> list= new ArrayList<>();
	  Integerset Expected= new Integerset(list);
	  
	  ArrayList<Integer> list1= new ArrayList<>();
	  ArrayList<Integer> list2= new ArrayList<>();
		
	  Integerset SetA= new Integerset(list1);
	  Integerset SetB= new Integerset(list2);
 
 
	  SetA.add (1);
	  SetA.add (2);
 
	  SetB.add (1);
	  SetB.add (2);
	  
	  Expected.add (1);
	  Expected.add (2);
	  
	  SetA.union(SetB);
	  assertEquals(true,SetA.equals(Expected));
	  
	//test if the arrays have overlapping values 
	  SetA.clear();
	  SetB.clear();
	  Expected.clear();
	  
	  SetA.add (1);
	  SetA.add (2);
 
	  SetB.add (3);
	  SetB.add (4);
	  
	  Expected.add (1);
	  Expected.add (2);
	  Expected.add (3);
	  Expected.add (4);
	 
	  SetA.union(SetB);
	  assertTrue(SetA.equals(Expected));
	  
	  SetA.clear();
	  SetB.clear();
	  Expected.clear();
	  
	  SetA.add (1);
	  SetA.add (2);
	  SetA.add (3);
 
	  SetB.add (4);
	  
	  
	  Expected.add (1);
	  Expected.add (2);
	  Expected.add (3);
	  Expected.add (4);
	 
	  
	  SetA.union(SetB);
	  assertTrue(SetA.equals(Expected));
	  
	  SetA.clear();
	  SetB.clear();
	  Expected.clear();
	  
	  SetA.add (1);
	  SetA.add (2);
	  
	  Expected.add (1);
	  Expected.add (2);
	  
	  SetA.union(SetB);
	  assertTrue(SetA.equals(Expected));
	  
	  SetA.clear();
	  SetB.clear();
	  
	  SetA.union(SetB);
	  assertEquals(0,SetA.length());
	  
}
 
@Test
@DisplayName("Test cases for intersect")
public void testIntersect() {
	ArrayList<Integer> list= new ArrayList<>();
	  Integerset Expected= new Integerset(list);
	  
	  ArrayList<Integer> list1= new ArrayList<>();
	  ArrayList<Integer> list2= new ArrayList<>();
		
	  Integerset SetA= new Integerset(list1);
	  Integerset SetB= new Integerset(list2);
 
 
	  SetA.add (1);
	  SetA.add (2);
	  SetA.add (3);
 
	  SetB.add (1);
	  SetB.add (2);
	  SetB.add (3);
	  
	  Expected.add (1);
	  Expected.add (2);
	  Expected.add (3);
	  
	  SetA.intersect(SetB);
	  assertTrue(SetA.equals(Expected));
	  
	  
	  
	 
	  SetA.clear();
	  SetB.clear();
	  Expected.clear();
	  
	  SetA.add (1);
	  SetA.add(2);
	 
 
	  SetB.add (4);
	  SetB.add (5);
	 
	  
	  SetA.intersect(SetB);
	  assertEquals(0,SetA.length());
	  
	
	  SetA.clear();
	  SetB.clear();
	  Expected.clear();
	  
	  SetA.add (1);
	  SetA.add (2);
	  SetA.add (3);
	  
	  SetA.intersect(SetB);
	  assertEquals(0,SetA.length());
	  
	
	  SetA.clear();
	  SetB.clear();
	  
	  SetA.intersect(SetB);
	  assertEquals(0,SetA.length());
}
 
@Test
@DisplayName("Test cases for diff")
public void testDiff() {
	ArrayList<Integer> list= new ArrayList<>();
	  Integerset Expected= new Integerset(list);
	  
	  ArrayList<Integer> list1= new ArrayList<>();
	  ArrayList<Integer> list2= new ArrayList<>();
		
	  Integerset SetA= new Integerset(list1);
	  Integerset SetB= new Integerset(list2);
 
 

	  SetA.add (1);
	  SetA.add (2);
 
	  SetB.add (1);
	  SetB.add (2);
 
	  
	  SetA.diff(SetB);
	  assertEquals(0,SetA.length());
	  
	  SetA.clear();
	  SetB.clear();
	  Expected.clear();
	  
	  SetA.add (1);
	  SetA.add (2);
	  SetA.add (3);
 
	  SetB.add (3);
	  SetB.add (4);
	  SetB.add (5);
	  
	  Expected.add (1);
	  Expected.add (2);
	  
	  SetA.diff(SetB);
	  assertTrue(SetA.equals(Expected));
	  
	
 
	  
	 
	  
	  SetA.clear();
	  SetB.clear();
	  Expected.clear();
	  
	  SetA.add (1);
	  SetA.add (2);
	  
	  Expected.add (1);
	  Expected.add (2);
	  
	  SetA.diff(SetB);
	  assertEquals(true,SetA.equals(Expected));
	  
	  SetA.clear();
	  SetB.clear();
	  
	  SetA.diff(SetB);
	  assertEquals(0,SetA.length());
}
 
@Test
@DisplayName("Test cases for toString")
public void testToString() {
	ArrayList<Integer> list= new ArrayList<>();
	  Integerset set1= new Integerset(list);
	  
	  
	  set1.add (1);
	  set1.add (2);
	  set1.add (3);
	  
	  
	  assertEquals("1 2 3 ",set1.toString());
	  
	  
	  set1.clear();
	  
	  assertEquals("",set1.toString());
 
}
 
 
@Test
@DisplayName("Test cases for GetFromPosition")
public void testGetFromPosition() {
	ArrayList<Integer> list= new ArrayList<>();
	  Integerset set1= new Integerset(list);
	  
	  
	  
	  set1.add (4);
	  set1.add (8);
	  
	  
	  assertEquals(4,set1.GetFromPosition(0));
	  assertEquals(8,set1.GetFromPosition(1));
 
	  
}
 
@Test
@DisplayName("Test cases for getSet")
public void testGetSet() {
	ArrayList<Integer> list= new ArrayList<>();
	  Integerset set1= new Integerset(list);
	  
	  set1.add (5);
	  assertTrue(set1.getSet().contains(5));
	  
	  set1.clear();
	  assertEquals(0,set1.getSet().size());
	  
}
 
}
