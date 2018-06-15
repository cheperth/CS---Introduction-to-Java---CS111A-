/*
Author:  che perth

Date  : 09/24/17

Homework assignment : 3

Objective: Palindrom program returns true or false if palindrome. 
Ignores all symbols,whitepace,case, punctuation, digits. 
Prompts user for sentinel value to terminate program. 
*/ 

import java.util.Scanner;

public class palindrome
{
 public static String filter(String str)// method completely filters the string of all whitespace,symbols,punctuation,digits,special characters
 {                                     
  String out = str.replaceAll("[\\d+(?:.,\\d+)*\\s*<>]", "");   
  return out; 
 } 
public static String reverse(String s) 
{
 String reversedString = "";
 for(int i=s.length(); i>0; i--) 
 {
  reversedString += s.charAt(i-1);
 }   
return reversedString;
}
 public static void println(Object ... o)//println method 
 {
  if(o.length == 0)
  {
   System.out.print("");
  }
  else if(o.length == 1)
  {
   System.out.print("" + o[0]);
  }
  else for(Object obj : o)
  {
  System.out.print("" + obj + "\t");
  }
  System.out.println("");
 }
  public static void print(Object ... o)//print method 
  {
   if(o.length == 0)
      {
          System.out.print("");
      }
      else if(o.length == 1)
      {
          System.out.print("" + o[0]);
      }
      else for(Object obj : o)
      {
          System.out.print("" + obj + "\t");
      }
      System.out.print("");
   }
public static void main(String...args)
{
 Scanner stdin = new Scanner(System.in);
 
 for (int i = 1; i >= 1; i++) //infinite loop to prompt user until user terminates program with sentinel value 
 {
  print("Enter stop, end, exit or cancel to terminate the program: \n\nEnter in a string of characters:"); 
  String input = stdin.nextLine();
  
  if(input.equals("stop"))break; 
  else if(input.equals("cancel"))break; 
  else if(input.equals("end"))break; 
  else if(input.equals("exit"))break;
  
  if(filter(input).equalsIgnoreCase(reverse(filter(input))))//if user input filtered equals user input filtered and reversed return true else if return false
  println("Input is a Palindrome.");
  else println("\nInput is not a palindrome."); 
  
 }
 
 }
}





