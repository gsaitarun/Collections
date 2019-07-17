package com.co;
import java.util.*;
public class Setclasses
{
   public static void main(String[] args)
   {
	 // the major difference between hashset and array list or list classes is duplicates are not allowed in hash set.
	  Set<String> set = new HashSet<String>();
	   set.add("hi");
	   set.add("hello");
	   set.add("sai Teja");
	   set.add("hanamichi");
	   set.add(null);
	   set.add(null);
	   set.add("michael");
	   set.add("jordan");
	   set.add("dhoni");
	   Iterator itr = set.iterator();
	   while(itr.hasNext())
	   {
		   System.out.println(itr.next());
	   }
	   System.out.println("****************************");
	  Set<String> set2 = new LinkedHashSet<String>();
	   set2.add("hi");
	   set2.add("hello");
	   set2.add("sai Teja");
	   set2.add("hanamichi");
	   set2.add(null);
	   set2.add(null);
	   set2.add("michael");
	   set2.add("jordan");
	   set2.add("dhoni");
	   Iterator itr2 = set2.iterator();
	   while(itr2.hasNext())
	   {
		   System.out.println(itr2.next());
	   }
   }
}
