package com.cos;
import java.util.*;

public class MyComparator 
{
  public static void main(String[] args)
  {
	 ArrayList<Integer> list = new ArrayList<Integer>();
	 list.add(12345);
	 list.add(12354);
	 list.add(12364);
	 list.add(12356);
	 list.add(5451);
	 list.add(6552);
	 Comparator<Integer> c = new Comparator<Integer>()
	 {
		 public int compare(Integer i,Integer j)
		 {
			 if(i%2>j%2)
				 return 1;
			 else
				 return -1;
		 }
	 };
	 Collections.sort(list,c);
	 for(Integer s: list)
	 {
		 System.out.println(s);
	 }
  }
}
