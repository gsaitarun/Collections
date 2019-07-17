package com.co;
import java.util.*;
public class Comparision  extends Thread 
{
  public void run()
  {
	  List<String> list = new LinkedList<String>();
	  list.add(0,"oneL");
	 // System.out.println("LLLL");
	  list.add(1,"twoL");
	 // System.out.println("LLLL");
	  list.add(2,"threeL");
	 // System.out.println("LLLL");
	  list.add(3,"fourL");
	 // System.out.println("LLLL");
	  list.add(4,"fiveL");
	 // System.out.println("LLLL");
	  list.add(5,"sixL");
	  //System.out.println("LLLL");
	  list.add(6,"sevenL");
	  //System.out.println("LLLL");
	  list.add(7,"eightl");
	  //System.out.println("LLLL");
	  list.add(8,"ninel");
	  //System.out.println("LLLL");
	  for(String s:list)
	  {
		  System.out.println(s);
	  }
	  
  }
}
