/*
Jonathan Lee
Math Professor Dean Perkins
CSCI Professor Gita Faroughi
Math 12
Date 5/12/22
*/

import java.util.*;
import java.math.*;
public class binomial
{
   public static void main (String args[])
   {
      int a = 4700; // enter as (n/j) n here
      int b = 2500; // j here
      System.out.println(BinomialTheorem(a, b));
   }

   public static BigInteger BinomialTheorem(int n, int j) 
   {
      BigInteger result = BigInteger.ONE;
      for (int i = 2; i <= n; i++)
      {
         result = result.multiply(BigInteger.valueOf(i));
      }
      //System.out.println(result); //helper line
      BigInteger q = BinomialTheorem(j);
      //System.out.println(q); //helper line
      BigInteger sub = BinomialTheorem(n-j);
      //System.out.println(sub); // helper line
      BigInteger mult = q.multiply(sub);
      //System.out.println(mult); //helper line
      result = result.divide(mult);
      return result;
   } //this method was adapted for your convenience and requirements to solve
   
   
   public static BigInteger BinomialTheorem(int n) 
   {
      BigInteger result = BigInteger.ONE;
      for (int i = 2; i <= n; i++)
      {
         result = result.multiply(BigInteger.valueOf(i));
      }         
      return result;
   }//This method is cited below
}

/*
Works Cited:
Baeldung. (2022, January 19). Calculate factorial in Java. Baeldung. 
Retrieved May 12, 2022, from https://www.baeldung.com/java-calculate-factorial
*/
