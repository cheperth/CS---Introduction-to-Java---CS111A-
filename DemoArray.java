/*

Author:  che perth

Date  : 09/24/17

Homework assignment : 2

Objective: DemoArray class: Functions:  fill(),avearage(),largest(),smallest(),

printArray(),main() to test all methods. 

*/

public class DemoArray

{

    public static int num[]= new int[100]; //Create an array holding 100 elements 

//*********************************rand()*********************************

    private static int rand(int a, int b)  //Random number generator method from class repository 

    {

        return((int)((b-a+1)*Math.random() + a));

    }

//*******************************println()********************************

    public static void println(Object ... o)  //Println method from class repository 

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

//********************************fillup()********************************

    public static void fillup(int a[]) //Method to fill up array with random numbers. 

    {

        for (int i = 0; i < a.length; i++)//fill

        a[i] = rand(1,500);

    }

//*******************************average()********************************

    public static double average(int a[])//Method to find the average of elements in array. 

    {

        double result = 0;

        for (int i = 0; i < a.length; i++)//average

        result = result + a[i];

        return result / a.length;

    }

//*******************************largest()********************************

    public static int largest(int a[])//Method to print largest number in array 

    {

        int temp = 0;

        for ( int i = 0; i < a.length; i++)

        if(temp < a[i])

        temp = a[i];

        return temp;

    }

//*******************************smallest()*******************************

    public static int smallest(int a[]) //Method to print smallest number in array 

    {

        int min = a[0];

        for ( int i = 1; i < a.length; i++)

        if(a[i]< min)

        min = a[i];

        return min;

    }

//******************************printArray()******************************

    public static void printArray(int a[]) //Method to print all elements in array. 

    {

        for (int i = 0; i < a.length; i++)

        {

            println(a[i]);

        }

    }

//*********************************main()*********************************

    public static void main(String...args)

    {
        
        fillup(num);  

        println("The average of the elements in num [] array is: " + average(num));

        println("The largest element in the num[] array is: " + largest(num));

        println("The smallest element in the num[] array is: " + smallest(num));

        println("The elements within the num[] array are: ");

        printArray(num);

    }

}

