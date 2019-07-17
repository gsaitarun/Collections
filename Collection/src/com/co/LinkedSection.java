package com.co;
import java.util.*;
public class LinkedSection
{
  public static void main(String[] args) 
  {
	PriorityQueue<String> pq = new PriorityQueue<String>();
	pq.add("tarun");
	pq.add("kRUN");
	pq.add("CHrM");
	pq.add("AAASIN");
	pq.add("TAMANAH");
	pq.add("HEGDE");
	pq.add("LONDAY");
	System.out.println(pq.peek()+pq.element());
	pq.remove();
	pq.poll();
	System.out.println(pq);
  }
}
