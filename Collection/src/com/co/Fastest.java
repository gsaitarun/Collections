package com.co;
import java.util.*;

public class Fastest extends Thread
{
  public static void main(String[] args)
  {
    
    ComparetoArray ca = new ComparetoArray();
    Comparision c = new Comparision();
    Thread t1 = new Thread(ca);
    Thread t2 = new Thread(c);
    t2.start();
    t1.start();
  }
}
