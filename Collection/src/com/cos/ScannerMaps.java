package com.cos;
import java.util.*;
public class ScannerMaps 
 {
 public static void main(String[] args)
 {
   Map<String,String> map = new HashMap<>();
   Scanner in = new Scanner(System.in);

   for(int i=0;i<3;i++)
   {
System.out.println("enter a  ");
     String a=in.nextLine();
     System.out.println("enter b  ");
    String b=in.nextLine();
    map.put(a, b);
    System.out.println(a+" : "+map.put(a,b));

   }

    
	

 
 }
}
