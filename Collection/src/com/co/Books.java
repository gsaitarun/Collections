package com.co;
import java.util.*;
public class Books implements Comparable<Books>
{
  int id;
  String name,author;
  public  Books(int id,String name,String author)
  {
	  this.id = id;
	  this.name = name;
	  this.author = author;
  }
  public  int CompateTo(Books b)
  {
	  if(id>b.id)
	          {
		       return 1;
	          }
	  else if(id<b.id)
	  		  {
		       return -1;
	          }
	  else
	          {
		       return 0; 
	          }
	  
  }
  public static void main(String[] args)
  {
	 Set<Books> set = new TreeSet<Books>();
	 Books b1 = new Books( 101, "tarun", "karan");
	 Books b2 = new Books( 102, "charan", "druve");
	 Books b3 = new Books( 103, "varun", "arun");
	 set.add(b1);
	 set.add(b2);
	 set.add(b3);
	 for(Books b :set){
	 System.out.println(b3.id+" "+b3.name+" "+b3.author);
	 }
  }
@Override
public int compareTo(Books o) {
	// TODO Auto-generated method stub
	return 0;
}
}
