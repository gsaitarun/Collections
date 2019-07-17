package com.co;
import java.util.*;
public class StackMatter
{
  public static void main(String[] args)
  {
	Stack<String> list = new Stack<String>();
	list.push("hello ");
	list.push("everyone ");
	list.push("its ");
	list.push("Stack");
	list.push("things");
	list.add("asdasd");
	list.pop();
	System.out.println(list.isEmpty());
	System.out.println(list.peek());
	System.out.println(list.get(1));
	list.ensureCapacity(100434666);
	System.out.println(list.capacity());
	System.out.println(list);
	Iterator itr = list.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	
  }
}
