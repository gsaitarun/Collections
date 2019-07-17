package com.co;

import java.util.ArrayList;
import java.util.Iterator;

public class ArraytoSet2 
{
 public void run()
  {
	   ArrayList<String> list = new ArrayList<String>();
	   list.add("hi");
	   list.add("hello");
	   list.add("sai Teja");
	   list.add("hanamichi");
	   list.add(null);
	   list.add(null);
	   list.add("michael");
	   list.add("jordan");
	   list.add("dhoni");
	   Iterator itr = list.iterator();
	   while(itr.hasNext())
	   {
		   System.out.println(itr.next());
	   }
	   
  }
  public static void main(String[] args)
  {
	  ArraytoSet as = new ArraytoSet();
	  ArraytoSet2 as2 = new ArraytoSet2();
	  as.run();
	  as2.run();
  }
}
