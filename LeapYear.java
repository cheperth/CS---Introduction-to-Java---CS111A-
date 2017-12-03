import java.util.Scanner;

 public class LeapYear.java 
  {
	public static void main(String []args)
  	{
     	Scanner in = new Scanner(System.in);
   	 
     	System.out.print("This program calculates leap years based");
     	System.out.println("on the year entered.");
     	System.out.println(" ");
     	System.out.println("Enter in a year:");
    	 
     	int yearInput = in.nextInt();
   	 
     	if (yearInput % 400 == 0)
        	{
         	System.out.println("The number entered is a leap year.");
        	}    	 
     	else if(yearInput % 100 == 0)
        	{     	 
         	System.out.println("The number entred is not a leap year.");
        	}
     	else if (yearInput % 4 == 0)
        	{
         	System.out.println("The number entred is a leap year.");
        	}
     	else if (yearInput / yearInput == 1)
        	{
         	System.out.println("The number entered is not a leap year.");
        	}
  	} 	 
  } 	
