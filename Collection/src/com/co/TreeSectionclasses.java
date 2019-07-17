package com.co;
import java.util.*;
public class TreeSectionclasses 
{
   public static void main(String[] args) throws Exception
   {
	TreeSet<String> ts = new TreeSet<String>();
	//ts.add("hello");
	ts.add("water");
	ts.add(null);
	//ts.add("carter");
	//ts.add("mater");
	//ts.add("seater");
	//ts.add("hello");
	//ts.add(null);
	Iterator<String> itr = ts.iterator();
	while(itr.hasNext())
	{
	System.out.println(itr.next());
	}
   }
}
