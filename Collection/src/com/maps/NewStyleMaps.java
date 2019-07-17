package com.maps;
import java.util.*;
public class NewStyleMaps 
{
 public static void main(String[] args)
 {
   Map<Integer,String> map = new HashMap<Integer,String>();
   map.put(1, "tarun");
   map.put(101, "hanamichi");
   map.put(102, "dhoni");
   map.put(103, "stephen");
   map.put(151, "jordan");
   map.put(11, "michael");
   for(Map.Entry m:map.entrySet())
   {
	   System.out.println(m);
   }
   //hashmap is a class with  insertion order with no duplicate keys and with   duplicates values. 
 }
}
