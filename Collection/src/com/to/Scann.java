package com.to;
import java.util.*;
public class Scann
{
	static int i=10;
void 	run()
	{
		if( i == 10)
		{
			System.out.println("saitarun");
		}
		else
		{
			System.out.println("invalid access");
		}
	}
 public static void main(String[] args)
  {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter you card");
	int s = sc.nextInt();
	Scann n = new Scann();
	n.run();
	
 }
}
