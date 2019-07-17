package com.co;
import java.util.*;
public class vectorSection 
{
  public static void main(String[] args) 
  {
	Vector<String>list = new Vector<String>();
	list.add("hi hello how are you");
	list.add("crazywsfs");
	list.add("crazy luckyy");
	list.add("crazy shakk");
	list.add("clam down");
	list.add("keep calm");
	list.add("be ");
	Enumeration em = list.elements();
	while(em.hasMoreElements())
	{
		System.out.println(em.nextElement());
	}
  }
}
