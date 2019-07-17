package com.co;
import java.util.*;
public class IntegerHash
{
  public static void main(String[] args)
  {
	  LinkedHashSet<Integer> set1 = new LinkedHashSet<Integer>();
		 set1.add(1);
		 set1.add(2);
		 set1.add(null);
		 set1.add(3);
		 set1.add(4);
		 set1.add(5);
		 set1.add(6);
		 set1.add(2);
		 set1.add(null);
		 Iterator itr = set1.iterator();
		 while(itr.hasNext())
		 {
			 System.out.println(itr.next());
			
		 }
		 
		 System.out.println("*********************************************");
		 HashSet<Integer> set2 = new HashSet<Integer>();
		 set2.add(1);
		 set2.add(2);
		 set2.add(null);
		 set2.add(3);
		 set2.add(4);
		 set2.add(5);
		 set2.add(6);
		 set2.add(2);
		 set2.add(null);
		 Iterator itr2 = set2.iterator();
		 while(itr2.hasNext())
		 {
			 System.out.println(itr2.next());
		 }
  }
}
