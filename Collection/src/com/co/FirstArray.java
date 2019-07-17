package com.co;
import java.util.*;
public class FirstArray 
{
   public static void main(String[] args) 
   {
	List <Integer>list1 = new ArrayList<Integer>();
	list1.add(1);
	list1.add(2);
	list1.add(3);
	list1.add(4);
	list1.add(5);
	list1.add(6);
	list1.add(7);
	list1.add(4,5465464);

	list1.add(9);
	System.out.println(list1);
	Iterator itr =list1.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	System.out.println("*********************************************");
	
	List <Integer>list2 = new LinkedList<Integer>();
	list2.add(1);
	list2.add(2);
	list2.add(3);
	list2.add(4);
	list2.add(5);
	list2.add(6);
	list2.add(7);
	list2.add(9);
	list2.add(43,2);

	System.out.println(list2);
	Iterator itr2 =list2.iterator();
	while(itr2.hasNext())
	{
		System.out.println(itr2.next());
	}
	
   }
}
