import java.util.Scanner;

public class changeConverter
{
  public static void main(String[] args)
  {
   Scanner in = new Scanner(System.in);
  
   System.out.println("Please enter the amount due:");
   int amountDue = in.nextInt();

   System.out.println("Please enter the amount given:");
   int amountRec = in.nextInt();

   int total = amountRec - amountDue; 

   int Var1 = total / 100; //print for dollar bills
  
   int Var2 = total % 100; 
  
   int Var3 = Var2 / 25; //print for quaters
  
   int Var4 = Var2 % 25; 
 
   int Var5 = Var4 / 10; //print for dimes 
  
   int Var6 = Var4 % 10; 
  
   int Var7 = Var6 / 5; //Print for nickles
  
   int Var8 = Var6 % 5; 
  
   int Var9 = Var8 / 1; //Print for pennies 
  
   System.out.println("Give the customer back" + " " + Var1 + " " + "dollar bills");
   
   System.out.print(" " + Var3 + " " + "Quarters" + " " + Var5 + " " + "dimes");
  
   System.out.println(" " + Var7 + " " + "nickles" + " " + Var9 + " " + "cents.");     
  }
}
