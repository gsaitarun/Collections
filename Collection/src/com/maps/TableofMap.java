
package com.maps;
import java.util.*;
public class TableofMap
{
	
	 public static void main(String args[]){  
	  Hashtable<Integer,String> hm=new Hashtable<Integer,String>();  
	  
	  hm.put(100,"Amit");  
	  hm.put(125,"Ravi");  
	  hm.put(101,"Vijay");  
	  hm.put(12132,"Rahul");  
	  
	  for(Map.Entry m:hm.entrySet()){  
	   System.out.println(m);  
	  }  
	 }  
}
