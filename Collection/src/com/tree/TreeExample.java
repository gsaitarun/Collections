package com.tree;
import java.util.*;

public class TreeExample 
{
    public static void main(String[] args)
    {
	 Set<Object> t = new TreeSet<Object>();
	 t.add(1);
	 t.add(8);
	 t.add(3345);
	 t.add(54);
	 t.add(345);
	 t.add(45);
	 t.add(53);
	 t.add(15);
	 for(Object i :t)
	 {
		 System.out.println(i);
	 }
	 TreeSet<Object> reverse = (TreeSet<Object>)t.descendingSet();
	 System.out.println("Without descendingSet(): " + t); 
     System.out.println("With descendingSet(): " + reverse); 
	 
	}
}
