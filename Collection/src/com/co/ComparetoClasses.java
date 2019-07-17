package com.co;
import java.util.*;
public class ComparetoClasses
{
    
	public static void main(String[] args)
	{
	 TreeSet<String> set = new TreeSet<String>();
	 set.add("varun");
	 set.add("arun");
	 set.add("ravi");
	 set.add("karun");
	 set.add("tarun");
	 set.add("charan");
	 System.out.println("before removing ravi "+set);
	 //specifically remove the  
	 set.remove("ravi");
	 System.out.println(set);
	 System.out.println("Reverse Set: "+set.descendingSet());
	 System.out.println("Head Set: "+set.headSet("tarun", true));  
     

       
     System.out.println("TailSet: "+set.tailSet("tarun", false));  
	}
}
