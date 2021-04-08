package org.howard.edu.lsp.assignment4;

import java.util.ArrayList;

import org.howard.edu.lsp.assignment4.Integerset.Listemptyexception;
/** contains implementation class
 * Each set can be found here as well
 */

public class Main {

	public static void main(String[] args) throws Listemptyexception {
		// TODO Auto-generated method stub
		  
		ArrayList<Integer> list1= new ArrayList<>();
  
		Integerset set1= new Integerset(list1);
		
		ArrayList<Integer> list2= new ArrayList<>();

		Integerset set2= new Integerset(list2);
		

		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		set1.add(5);
		set1.add(9);
		set1.add(6);
		
		
		set2.add(1);
		set2.add(40);
		set2.add(12);
		set2.add(33);
		set2.add(53);
		set2.add(66);
		
		  
		System.out.println("Set 1: " + set1.getlist());
		System.out.println("Set 2: " + set2.getlist());
		  
		System.out.println("Is equal: "+set1.equals(set2));
		  
		System.out.println("Largest element in set1: " + set1.largest());
		  
		System.out.println("Smallest element in set2: "+ set2.smallest());
		  
		Integerset newset= set1.union(set2);
		  
		System.out.println("Union: " + newset.getlist() );
		  
		Integerset setj= set1.intersect(set2);
		  
		System.out.println("intersection: " + setj.getlist() );
		  

		      
		   }


}
