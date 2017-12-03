
import java.util.Scanner; 

public class countOccurances
{//method for number of occurances
 public static void countOccurrences(String s, char c)
 {
    int counter = 0;
    for (int i=0; i < s.length(); i++)
    {
        if (s.charAt(i) == c)
        {
             counter++;
        }
    }
 System.out.println("The occurance of the char1 in string1 is: "+counter); 
 }
 //method show character position 
 public static void showChar(String s, int p)
 {
  char result;
  result = s.charAt(p -1);   
  System.out.print("The char at the location of the int that is typed "); 
  System.out.println("in string1 is: " + result); 
 }
 public static void showChar2(String s, int p)
 {
  char result;
  result = s.charAt(p -1);   
  System.out.print("The first in string2 is: "); 
  System.out.println(result); 
 }

 //main method 
 public static void main(String...args)
 { 
  Scanner stdin = new Scanner(System.in);
  //user prompt string1

  System.out.print("Enter in String1: "); 
  String string1 = stdin.nextLine(); 

  //user prompt string2
  System.out.print("Enter in String2: "); 
  String string2 = stdin.nextLine(); 

  //user print char1 
  System.out.print("Enter in a Char1: "); 
  char char1 = stdin.next().charAt(0);
  
  //user prompt position 
  System.out.print("Enter in a Integer: "); 
  int position = stdin.nextInt(); 
 

  //boolean if string1 == or > or < than string2 print result 
  int compare = string1.compareTo(string2);  
  if (compare < 0) 
  {  
   System.out.println("String1 is less than string2.");     //a is smaller
  }
  else if (compare > 0) {
  System.out.println("String2 is greater than String1");  //a is larger 
  }
  else {  
  System.out.println("String1 is equal to String2");    //a is equal to b
  }
  /* 
  if(string1.equals(string2))
  System.out.println("String1 is equal to String2"); 
  else if (!string1.equals(string2))
  System.out.println("String1 is not equal to String2"); 
  */

  //boolean if string1 is upper case print result 
  if(string1==string1.toUpperCase())
  System.out.println("String1 is upper case."); 
  else if (!(string1==string1.toUpperCase()))
  System.out.println("String1 is not upper case."); 

  //boolean if string2 is lower case print result 
  if(string2==string2.toLowerCase())
  System.out.println("String2 is lower case."); 
  else if(!(string2==string2.toLowerCase()))
  System.out.println("String2 is not lower case."); 
  
  
  double str1Length = string1.length();
  System.out.println("The number of characters in string1 is: " + (int)str1Length); 
  
  
  //call  methods 
  countOccurrences(string1,char1);
  showChar(string1,position); 
  showChar2(string2,1); 
 
 }
}
