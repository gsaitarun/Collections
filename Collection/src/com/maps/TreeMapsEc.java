package com.maps;

import java.util.*;
public class TreeMapsEc 
{
  public static void main(String[] args)
  {
	Map<Integer,String> map = new TreeMap<Integer,String>();
	map.put(1131, "arun prakash");
	map.put(13654, "rahul");
	map.put(1354, "ramakrishna");
	map.put(1553, "charan");
	map.put(551, "santosh");
	map.put(1553, "arjun");
	map.put(15, "laahari");
	map.put(32131, null);
	map.put(155345, null);
	for(Map.Entry m:map.entrySet())
	{
		System.out.println(m);
	}
	
// treemap is class with ascending order sorting with no duplicates keys but allows duplicate values.
  //allows null n number of times
  }
}
