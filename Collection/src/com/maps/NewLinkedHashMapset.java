package com.maps;
//linked hash map is a class with insertion order and with no duplicate values but no duplicate keys 
//allows null only once .
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class NewLinkedHashMapset
{
  public static void main(String[] args)
  {
	  Map<Integer,String> map = new LinkedHashMap<Integer,String>();
	   map.put(1, "tarun");
	   map.put(104552, "hanamichi");
	   map.put(1054, "dhoni");
	   map.put(1545, "stephen");
	   map.put(178, "jordan");
	  map.put(null,null);
	  map.put(null, null);
	   for(Map.Entry m:map.entrySet())
	   {
		   System.out.println(m);
	   }
	   
  }
}
