package org.howard.edu.lsp.assignment2;
/**
 * This is the combination class that is considered the implementation code
 * @author Vivian.lisanza
 *
 */
public class Combination {
/**
 * this class prints out the indexes that equal the target sum
 * @param bucky
 * @param sum
 * @return this class returns a string of arrays
 */
	public  String list (int [] bucky,int sum) {
	    String scale= "";
	    for (int i = 0; i<bucky.length; i++) {
	       if (bucky[i]== sum) 
	       {scale+="["+ i+"]";}
	    
	      for (int j = i+1; j<bucky.length; j++) {
	          if (bucky[i] + bucky[j] == sum)
	            
	          {scale+="["+i+","+ j+"]";}
	      
	        for (int k = j+1; k<bucky.length; k++) {
	          if (bucky[i] + bucky[j] + bucky[k] == sum)

	          {scale+="["+i+","+ j+","+ k+"]";}}
	      }
	    }
	      return scale;
	  }

}
