package com.enums;

import java.util.*;

enum Days
{
  SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY;	
}
public class EnumSection2 
{
	public static void main(String[] args) 
	{
		
	
	 Map<Days,String>map = new EnumMap<Days,String>(Days.class);
	 map.put(Days.MONDAY,"2");
	 map.put(Days.WEDNESDAY,"4");
	 map.put(Days.THURSDAY,"5");
	 map.put(Days.SATURDAY,"6");
	 map.put(Days.FRIDAY,"6");
	 map.put(Days.TUESDAY,"3");
	 map.put(Days.SUNDAY,"1");
	 System.out.println(map);
	} 
}
