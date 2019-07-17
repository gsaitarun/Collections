package com.cos;
import java.util.*;
public class Student implements Comparable<Student>
{
  int id;
  String name;
  int rollno,age;
  Student(int id,String name,int rollno,int age)
  {
	  this.id = id;
	  this.name= name;
	  this.rollno= rollno;
	  this.age = age;
	  
  }
	@Override
	public int compareTo(Student s)
	{
	  if(age >s.age)
	  {
		  return 1;
	  }
	  else if(age<s.age)
	  {
		  return -1;
	  }
	  else
	  {
		  return 0;
	  }
	  
	}

}
