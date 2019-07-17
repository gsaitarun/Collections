package com.cos;
import java.util.*;
public class ComparatorSorting implements Comparator
{
	
@Override
  public int compare(Object e1, Object e2)
  {
	Employee emp = (Employee)e1;
	Employee emp2 = (Employee)e2;
	// String str = String.valueOf(emp.salary);
	 //String str2 = String.valueOf(emp2.salary);
	return emp.name.compareTo(emp2.name);
  }


	
  public static void main(String[] args)
  {
	
	  List list=new ArrayList();  
	  list.add(new Employee(101,"Vijay",23000));  
	  list.add(new Employee(106,"Ajay",27000));  
	  list.add(new Employee(105,"Jai",21000));  
	    Collections.sort(list,new ComparatorSorting());
	    Iterator itr2=list.iterator(); 
	    System.out.println("sorting acording to the name ");
	    while(itr2.hasNext())
	    {  
	    	Employee st=(Employee)itr2.next();  
	    	
	    	System.out.println(st.Access+" "+st.name+" "+st.salary);
	  	    	//System.out.println(e.Access+" "+e.name+" "+e.salary);
	  	    }
	  	    System.out.println("******************************************");
	    Collections.sort(list,new SortbyId());
	    System.out.println("sorting acording to the Access ");
	    Iterator itr3=list.iterator();  
	    while(itr3.hasNext())
	    {  
	    	
	    	Employee st=(Employee)itr3.next();  
	    	System.out.println(st.Access+" "+st.name+" "+st.salary);
	  	    	//System.out.println(e.Access+" "+e.name+" "+e.salary);
	  	    }
	    System.out.println("*****************************************************");
             
  Collections.sort(list,new SortbySalary());
  System.out.println("sorting acording to the salary ");
  Iterator itr4=list.iterator();  
  while(itr4.hasNext())
  {  
	 
  	Employee st=(Employee)itr4.next();  
  	System.out.println(st.Access+" "+st.name+" "+st.salary);
	    	//System.out.println(e.Access+" "+e.name+" "+e.salary);
  } 

  }
  
}

	    
	    
  


