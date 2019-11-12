import java.util.Scanner;

 public class tipCalculator 
  {
	public static void main(String []args)
  	{
     	Scanner in = new Scanner(System.in);
   	 
     	System.out.println("This program calculates a waiters tip based on the");
     	System.out.println("total bill for the entire meal and the diners overall");
     	System.out.println("satisfaction rating.");
     	System.out.println(" ");
     	System.out.println("What was the total bill at the end of the meal?");
    	 
     	double totalAmount = in.nextDouble();
   	 
     	System.out.println("Enter in satisfaction rating assigned for the diner:");
     	System.out.println("Enter [1] if Totally satisfied. [2] if Satisfied. [3] if Dissatisfied.");  
     	System.out.println("Enter in [1]	[2]   or   [3]:");
    	 
     	int rating = in.nextInt();
   	 
     	if (rating == 1)
        	{
         	System.out.print("The tip for the waiter based on the customer being totally ");
         	System.out.printf("satisfied is $%.2f", (totalAmount * 0.20));
        	}    	 
     	else if(rating == 2)
        	{     	 
         	System.out.print("The tip for the waiter based on the customer being ");
         	System.out.printf("satisfied is $%.2f", (totalAmount * 0.15));
        	}
     	else if(rating == 3)
        	{
         	System.out.print("The tip for the waiter based on the customer being "); 
         	System.out.printf("dissatisfied is $%.2f ", (totalAmount * 0.10));
        	}
  	} 	 
  }
