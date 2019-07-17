package com.cos;

import java.util.Comparator;

public class SortbyId implements Comparator<Employee>
{

	
		public int compare(Employee e3, Employee e4) 
		{
			
			return e3.Access-e4.Access;

		}
}
class SortbySalary implements Comparator<Employee>
{


	public int compare(Employee e5, Employee e6) {
		
		return e5.salary-e6.salary;

	}
   	
}