package com.co;
import java.util.*;
public class Npa 
{
    public static void main(String[] args) 
    {
	 TreeSet ts = new TreeSet();
	 ts.add(44.2);
	 ts.add(99.2);
	 ts.add(78.2);
	 ts.add(54.2);
	 ts.add(68.2);
	 ts.add(80.2);
	 ts.add(94.2);
	 ts.add(74.2);
	 // to show the collection containing
	 Iterator itr = ts.iterator();
	 while(itr.hasNext())
	 {
		 System.out.println(itr.next());
	 }
	 //to remove 80.2
	 (ts.contains()(80.2)) 
         System.out.println("Data is removed from tree set"); 
     else
         System.out.println("Data doesn't exist!"); 

     System.out.print("Now the tree set contain: "); 
     itr = ts.iterator(); 

	 
    }
}
