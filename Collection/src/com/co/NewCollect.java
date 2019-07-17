package com.co;
import java.util.*;
public class NewCollect
{
  public static void main(String[] args)

  {
	ArrayList<Integer> al=new ArrayList<Integer>(); 
	al.add(554);
	al.add(545);
	al.add(55);
	al.add(45);
	al.add(645654);
	al.add(3535);
	al.add(321);
	al.ensureCapacity(1000);
	ListIterator<Integer> itr2 =al.listIterator(); 
	while(itr2.hasNext() )
	{
		//System.out.println(itr2.previous());
	    Integer in=itr2.next();  
        System.out.println(in);  
	}
  }
}
