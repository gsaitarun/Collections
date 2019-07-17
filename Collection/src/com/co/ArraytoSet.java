package com.co;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ArraytoSet
{
	public void run()
	{
		
	
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
	   set.add("**********************************");
	   Iterator itr = set.iterator();
	   while(itr.hasNext())
	   {
		   System.out.println(itr.next());
	   }
	   
	
}
}