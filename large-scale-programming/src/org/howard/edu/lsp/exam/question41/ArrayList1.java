package org.howard.edu.lsp.exam.question41;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * public class contains removeZero method to remove zeroes in the array lit along with methods to add values to the array list and converts it to a string
 * @author esther.lisanza
 *
 */


public class ArrayList1 {
	
	ArrayList<Integer> arraylist = new ArrayList<>(10);

/**
 * main method
 */
	public static void main(String[] args) {

				
	}
	
	/**
	 * method removes zeroes from the array list	
	 */
		public void removeZero()
		{
			for (int x=0; x<arraylist.size(); x++) 
			{
				if(arraylist.get(x)==0) 
				{
					arraylist.remove(x);
			}
		}
		
		
	}
	/**
	 * method adds values to the array list
	 * @param i
	 */
		public void add(int i) {
			arraylist.add(i);
			
		}
		
	/**
	 * method converts the array list into a string
	 */
		 public String toString()
		  {
		    String output="";
		    for (int x=0; x< arraylist.size(); x++)
		    {
		      output+=Integer.toString(arraylist.get(x))+" ";
		    }
		   
		    return output;
		  } 
}
	


			    
			   
	


