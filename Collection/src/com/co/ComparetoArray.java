package com.co;
import java.util.*;
public class ComparetoArray extends Thread
{
	public void run()
	  {
		  List<Integer> list = new ArrayList<Integer>();
		  list.add(0,1);
		 // System.out.println("aaa");
		  list.add(1,2);
		  //System.out.println("aaa");
		  list.add(2,3);
		  //System.out.println("aaa");
		  list.add(3,4);
		  //System.out.println("aaa");
		  list.add(5);
		  //System.out.println("aaa");
		  list.add(5,6);
		  //System.out.println("aaa");
		  list.add(6,7);
		  //System.out.println("aaa");
		  list.add(7,8);
		  //System.out.println("aaa");
		  list.add(4,9);
		  //System.out.println("aaa");
		  //System.out.println("Arraylist");
		  for(Integer i :list)
		  {
			  System.out.println(i);
		  }
		 
	  }
}