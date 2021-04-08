package org.howard.edu.lsp.assignment4;

import java.util.*;

/** this contains the Integerset class 
 * the class throws the Integerset and extends the exception class
 */
public class Integerset {
	private ArrayList<Integer> set= new ArrayList<>();
	  
	   public Integerset(ArrayList<Integer> list) {
	       this.set=list;
	   }
	  
	  
	  
	/**
	 * clears the all representation of class
	 */
	   public void clear() {
	       set.clear();
	   }
	  
	/**
	 * returns the length of set
	 * @return
	 */
	  
	   public int length() {
	       return set.size();
	   }
	  
	/**
	 * return true if the 2 sets  are equal. false otherwise
	 * @param b
	 * @return
	 */
	   public boolean equals(Integerset b) {
	      
	       ArrayList<Integer> list2=b.set;
	         
	       if(set.size()!=list2.size()) {
	           return false;
	       }
	         
	       ArrayList<Integer> temp1=set;
	         
	       ArrayList<Integer> temp2=list2;
	         
	       Collections.sort(temp1);
	       Collections.sort(temp2);
	         
	       for(int i=0;i<temp1.size();i++) {
	           if(temp1.get(i)!=temp2.get(i)) {
	               return false;
	           }
	       }
	         
	       return true;
	      
	   }
	   
	   public class Listemptyexception extends Exception {

	   }
	  
	/**
	 * returns the largest number in the list and throws exception if the list is empty
	 * @return
	 * @throws Listemptyexception
	 */
	  
	   public int largest() throws Listemptyexception {
	      
	       if(set.size()==0) {
	           Listemptyexception e= new Listemptyexception();
	           throw e;
	       }
	      
	       int max=0;
	      
	       for(int i=0;i<set.size();i++) {
	           if(set.get(i)>max) {
	               max=set.get(i);
	           }
	       }
	      
	       return max;
	      
	   }
	  
	  /**
	   * finds minimum value
	   * @return
	   * @throws Listemptyexception
	   */
	   public int smallest() throws Listemptyexception {
	      
	       if(set.size()==0) {
	           Listemptyexception e= new Listemptyexception();
	           throw e;
	       }
	      
	       int min=Integer.MAX_VALUE;
	      
	       for(int i=0;i<set.size();i++) {
	           if(set.get(i)<min) {
	               min=set.get(i);
	           }
	       }
	      
	       return min;
	      
	   }
	  

	  /**
	   * adds item to list
	   * @param item
	   */
	  
	   public void add(int item ) {
	      
	       boolean exist=false;
	      
	       for(int i=0;i<set.size();i++) {
	          
	           if(set.get(i)==item) {
	               exist=true;
	           }
	       }
	      
	       if(exist==false) {
	           set.add(item);
	       }
	      
	   }
	  
	/**
	 * removes item if it already exists in the list
	 * @param item
	 */
	  
	   public void remove(int item ) {
	      
	      
	      
	       for(int i=0;i<set.size();i++) {
	          
	           if(set.get(i)==item) {
	               set.remove(i);
	           }
	       }
	      
	   }
	  
	   public Integerset union(Integerset list2) {
	      
	       ArrayList<Integer> temp=list2.getlist();
	      
	       Set<Integer> set = new HashSet<>();
	       set.addAll(set);
	       set.addAll(temp);
	      
	       ArrayList<Integer> list3= new ArrayList<>(set);
	      
	       Integerset list4= new Integerset(list3);
	      
	       return list4;
	      
	   }
	  /**
	   * finds item in both lists that equal each other
	   * @param list2
	   * @return
	   */
	   public Integerset intersect(Integerset list2) {
	      
	       ArrayList<Integer> temp=list2.getlist();
	      
	       set.retainAll(temp);
	      
	       Integerset list4= new Integerset(set);
	      
	       return list4;
	   }
	  
	   public Integerset difference (Integerset list2) {
	      
	       ArrayList<Integer> temp=list2.getlist();
	      
	       set.removeAll(temp);
	      
	       Integerset list4= new Integerset(set);
	      
	       return list4;
	      
	   }
	  
	   public ArrayList<Integer> getlist(){
	       return set;
	   }


}
