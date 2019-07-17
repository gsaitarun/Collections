package com.co;

import java.util.ArrayList;
import java.util.ListIterator;

public class StringCollect 
{
   public static void main(String[] args) 
   { 
	   ArrayList<String> al=new ArrayList<String>(); 
		al.add("hi");
		al.add("sad");
		al.add("saddsa");
		al.add("crnewr");
		al.add("hello");
		al.add("hello");
		al.add("sas");
		ListIterator<String> itr2 =al.listIterator(al.size()); 
		while(itr2.hasPrevious() )
		{
			//System.out.println(itr2.previous());
		    String in=itr2.previous();  
	        System.out.println(in);  
		}
   }
}
