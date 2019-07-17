package com.co;
import java.util.*;
public class LinkedSetclasses
{
  public static void main(String[] args)
  {
	 LinkedHashSet<String> set = new LinkedHashSet<String>();
	 set.add("michael");
	 set.add("yuvi");
	 set.add("sachin");
	 set.add("hanamichi");
	 set.add("jordan");
	 set.add("stephen");
	 set.add("michael");
	 set.add(null);
	 Iterator itr = set.iterator();
	 while(itr.hasNext())
	 {
		 System.out.println(itr.next());
	 }
  }
}
