package com.cos;

import java.util.*;

public class Reversecollect 
{
  public static void main(String[] args)
  {
	  System.out.println("ASCENDING ORDER ACORDING TO AGE");
	List<Student> al = new ArrayList<Student>();
	
	al.add( new Student(1,"tarun ",1541,22));
	al.add( new Student(2,"karan ",1551,20));
	al.add( new Student(3,"sai   ",1542,21));
	al.add( new Student(4,"charan",1511,26));
	Collections.sort(al);
	for(Student s:al)
	{
		System.out.println(s.id+" "+s.name+" "+s.rollno+" "+s.age);
	}
	System.out.println("******************************************************");
	System.out.println("DESCENDING ORDER");
	Collections.sort(al,Collections.reverseOrder());
	for(Student s:al)
	{
		System.out.println(s.id+" "+s.name+" "+s.rollno+" "+s.age);
	}
  }
}
