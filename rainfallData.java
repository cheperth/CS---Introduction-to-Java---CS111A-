

import java.util.*; 

public class rainfallData
{   
  int rainFall[]= new int[52];
/*********************************rand()*********************************
Math.Random method, makes it easier to use random numbers by calling the method
rand(int,int) rand(double,double)etc.
*/  private static int rand(int a, int b)
    {
        return((int)((b-a+1)*Math.random() + a));
    }
/********************************println()********************************
System.out.println method makes it easier and faster to include print statements 
by calling the print method. println("String");*/ 
    public static void println(Object ... o)
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
/*********************************fillup()********************************
Fillup method fills the rainFall array with random numbers using the rand method. 
*/
    public static void fillup(int a[])
    {   int rainFall[]= new int[52];
        for (int i = 0; i < a.length; i++)//fill
        a[i] = rand(1,500);
    }
/********************************average()********************************
gets the average of all of the numbers in the array by adding them all together 
and dividing by the number of numbers(elements)that are in the array.
*/ 
    public static double average(int a[])
    {   int rainFall[]= new int[52];
        double result = 0;
        for (int i = 0; i < a.length; i++)//average
        result = result + a[i];
        return result / a.length;
    }

/********************************largest()********************************
Largest number method gets the largest number(element) in the array. 
*/  public static int largest(int a[])
    {   int rainFall[]= new int[52];
        int temp = 0;
        for ( int i = 0; i < a.length; i++)
        if(temp < a[i])
        temp = a[i];
        return temp;
    }
/********************************smallest()*******************************
Smallest method gets the smallest number in the array. 
*/ 
    public static int smallest(int a[])
    {
        int rainFall[]= new int[52];
        int min = a[0];
        for ( int i = 1; i < a.length; i++)
        if(a[i]< min)
        min = a[i];
        return min;
    }
/*******************************printArray()******************************
PrintArray prints out all of the numbers(elements)in the array
*/ 
    public static void printArray(int a[])
    {   int rainFall[]= new int[52];
        for (int i = 0; i < a.length; i++)
        {
            println(a[i]);
        }
    }
//*********************************main()*********************************

    public static void main(String...args)
    {
      int rainFall[]= new int[52];

     //call the fillup() method in order to fill the array with random numbers. 
        fillup(rainFall);
     //call the average() method to show the average of all of the elements in the array. 
        println("The average of the elements in rainFall [] array is: " + average(rainFall));
    //call the largest() method to show the largest number in the array. 
        println("The largest element in the rainFall[] array is: " + largest(rainFall));
    //call the smallest() method to show the smallest number in the array. 
        println("The smallest element in the rainFall[] array is: " + smallest(rainFall));
   
        println("The elements within the rainFall[] array are: ");
    //call the printArray() method to print out all of the numbers(elements) in the array
        printArray(rainFall);
    }
}
