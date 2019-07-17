package com.enums;

import java.util.*;
enum days
{
   SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY;	
}


public class Enumsection 
{
  public static void main(String[] args)
  {
	  Set<days> set1 = EnumSet.allOf(days.class);  
	  System.out.println(set1);
	  Set<days> set2 = EnumSet.noneOf(days.class);
	  System.out.println(set2);
  }

}

