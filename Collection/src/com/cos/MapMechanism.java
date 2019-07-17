package com.cos;
import java.util.*;
import java.lang.*;
public class MapMechanism 

{
	static String name = null;
  public static void main(String[] args) 
  {
	  Scanner input = new Scanner(System.in);
	  //String name; 
	  String a = null,b;
	  Map<String,String>map = new TreeMap<>();
	for(int i =0;i<5;i++)
	{
		 if(i==0)
		  {
	         	a = "sai tarun" ;	  
		  }
		 if(i==1)
		  {
	         	a = "sai teja" ;	  
		  }
		 if(i==2)
		  {
	         	a = "swathi" ;	  
		  }
		 if(i==3)
		  {
	         	a = "anuhya" ;	  
		  }
		 if(i==4)
		  {
	         	a = "sasank" ;	  
		  }
		 System.out.println(a +":"+"enter value of this key");
		 b = input.nextLine();
		 map.put(a,b);
		
		 System.out.println(map);
		 
	}
  }
}
