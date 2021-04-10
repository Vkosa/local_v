

 package org.howard.edu.lsp.assignment4;
 import java.util.List;
 import java.util.ArrayList;
 import java.util.*;
  
 public class Integerset  {
   // Hint: probably best to use an array list.  You will need to do a little research
   private List<Integer> set = new ArrayList<Integer>();
  
  public Integerset(ArrayList list)
  {
    set=list;
  }
  
   // Clears the internal representation of the set
  public void clear()
  {
  for (int x=0; x<set.size(); x++)
    {
      set.clear();
    }
  }
  
  // Returns the length of the set
  public int length() {
     return set.size();
  } // returns the length
  
  /*
  * Returns true if the 2 sets are equal, false otherwise;
  * Two sets are equal if they contain all of the same values in ANY order.
  */
  public boolean equals(Integerset b) {
    int counter=0;
    int z=b.length();
    int Bigest;
  
    if(set.isEmpty() || b.isEmpty()||(set.size() != z))
    {return false;}
    else
    {
      Bigest= z;
    }
  
     for (int y=0; y< Bigest; y++)
    {
     for (int x=0; x< Bigest; x++)
     {
       if (set.get(y)==b.GetFromPosition(x))
       {
     	counter++;
       }
      
     }
    }
     return (Bigest==counter);
   }
  
  // Returns true if the set contains the value, otherwise false
  public boolean contains(int value) {
  boolean test=false;
  //for (int x: set)
  for(int x=0; x< set.size(); x++)
  {
    if (value==set.get(x))
    {test=true;}
  }
  return test;
  }  
  
  public int GetFromPosition(int n)
  {
    return set.get(n);
  }
  
  // Returns the largest item in the set; Throws a IntegersetException if the set is empty
  public int largest() throws IntegersetException
  {
    if(set.isEmpty())
    {
      IntegersetException e= new IntegersetException("Empty set in largest");
      throw e;
    }
     
    int x=Integer.MIN_VALUE;
   
    for(int i=0; i< set.size(); i++)
    {
      if(set.get(i)>x)
      {
        x=set.get(i);
      }
    }
     
    return x;
  }
  
  // Returns the smallest item in the set; Throws a IntegersetException if the set is empty
  public int smallest() throws IntegersetException
  {
    if(set.isEmpty())
    {
      IntegersetException e= new IntegersetException("Empty set in smallest");
      throw e;
    }
     
    int x=Integer.MAX_VALUE;
     
    for(int i=0; i< set.size(); i++)
    {
      if(set.get(i)<x)
      {
        x=set.get(i);
      }
    }
     
    return x;
  } // Adds an item to the set or does nothing it already there
  
  public void add(int item) {
    if (!set.contains(item))
    {set.add(item);}
  }// adds item to s or does nothing if it is in set
  
  // Removes an item from the set or does nothing if not there
  public void remove(int item) {
    set.remove(item);
  }
  
  public ArrayList<Integer> getSet()
  {
    return (ArrayList<Integer>) set;
  }
  
  // Set union
  public void union(Integerset intSetb) {
    ArrayList<Integer> ListB=intSetb.getSet();
     
    Set<Integer> unifier = new HashSet<>();
    unifier.addAll(set);
    unifier.addAll(ListB);
   
    set= new ArrayList<>(unifier);
  
  }
  
  // Set intersection
  public void intersect(Integerset intSetb)
  {
    ArrayList<Integer> ListB=intSetb.getSet();
     
    set.retainAll(ListB);
   
  }
  
  // Set difference, i.e., s1 –s2
  public void diff(Integerset intSetb)
  {
    ArrayList<Integer> ListB=intSetb.getSet();
     
  
    set.removeAll(ListB);
  
  }
  
  // Returns true if the set is empty, false otherwise
  boolean isEmpty()
  {
     if(( set.size())==0)
     {
  	 return true;
     }
     else
     { return false;}
  }
  
  // Return String representation of your set
  public String toString()
  {
    String output="";
    for (int x=0; x< set.size(); x++)
    {
      output+=Integer.toString(set.get(x))+" ";
    }
   
    return output;
  } // return String representation of your set
  
 }



