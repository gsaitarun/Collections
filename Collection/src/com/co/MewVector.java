package com.co;
import java.util.*;
public class MewVector
{
   public static void main(String[] args)
   {
	 Vector <Integer>list1 = new Vector<Integer>();
	 Vector <Integer>list2 = new Vector<Integer>();
	 System.out.println (list1.add(21312));
	 System.out.println (list1.add(121));
	 System.out.println (list1.add(12310));
	 System.out.println (list1.add(213231));
	 System.out.println (list1.add(13123));
	 System.out.println (list1.size());
	 System.out.println (list1.elementAt(3));
	 System.out.println(list2.addAll(list1));
	 System.out.println (list1.clone());
	// System.out.println (list2.addElement(22));
	 System.out.println (list1.firstElement());
	 System.out.println (list1.elementAt(4));
	 System.out.println (list1.capacity());
	// list1.clear();
	 System.out.println(list1);
	 
   }
}
