
import java.util.Scanner; //importing scanner class 
 
public class searchingArrays 
{ 
 /************************userPrompt()*****************
 //commented out user prompt method:
 public static void userPrompt()
 {
  System.out.print("Enter in an integer: "); 
 }*/


/*****************************ifFound()*****************
Method to find out if your input is in the unsorted array*/ 
public static void ifFound(int guess,int[]unsortedList)
{
    int counter = 0;   
    for (int i = 0; i < unsortedList.length; i++)
    {
        if (guess == unsortedList[i])
        {
         counter++;
        }
    }
    if(counter>1) 
    System.out.println("Your Integer is in the unsortedList ");    
 }

/************************Occurances()**************************
Method to find the number of times the user input occures in 
the array.*/    
   public static void Occurances(int guess,int[]unsortedList) 
   {
    int counter2 = 0; 
     
    for (int i = 0; i < unsortedList.length; i++)
    { 
     if (guess == unsortedList[i])
     { 
      counter2++;   
     }
    }  System.out.println("Your Integer occured " + counter2 +" times in the unsortedList. ");
   }


/*********************getArrayIndex()*************************
Method to get the position of user input in unsortedList array
*/ 
   public static void getArrayIndex(int guess,int[]unsortedList) 
   {
    for(int i=0;i<unsortedList.length;i++)
    if(guess==unsortedList[i]) 
    System.out.println("The position of the Integer in the array: "+i); 
   }

/*********************************main()*******************************
Main method***********************************************************/
 
 public static void main( String...args ) 
 { //scanner class object
  Scanner keyboard = new Scanner(System.in); 
  
  //unsorted list array 
  int [] unsortedList ={8,120,5,71,29,38,120,40,93,12,74,10,9,8,120,97,49,8,37,4}; 
  
  //user prompt 
  System.out.println("Enter an integer: "); 
  
  //variable to store in user input
  int guess = keyboard.nextInt();  
  
  /*commented out userPrompt()Method
  userPrompt(); */ 
 
  /*calling methods for determining if user input is present in array 
    finding the number of occurances of user input in the array 
    finding the position locations of the array*/ 
  ifFound(guess,unsortedList); 
  Occurances(guess,unsortedList); 
  getArrayIndex(guess,unsortedList); 
  }
 }
//Interesting to note that the first position in an array is 0 and not 1. 


























  
