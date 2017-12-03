
import java.util.*; 

public class salesmen
{
 public static int b; 
 /********************************largest()********************************
Largest number method gets the largest number(element) in the array. 
*/  public static int largest(int a[])
    {   
        int temp = 0;
        for ( int i = 0; i < a.length; i++)
        if(temp < a[i])
        temp = a[i];
        return temp;
    }

    public static void main(String[] args) 
    {
        Scanner stdin = new Scanner(System.in);

        int temp = 0;
        
        System.out.println("Enter in the number of salesmen.");
        int salesmen = stdin.nextInt();
       
        int[] sales = new int[salesmen+1];
       
        for (int b = 1; b < salesmen+1; b++) 
        {
            System.out.print("Enter the sales for salesmen # " + (b) + ":");
            sales[b] = stdin.nextInt();
            counter++; 
        }

        for (int b = 1; b < salesmen+1; b++) 
        {
            System.out.println(("Salesmen # " + b ) + "  sales = " + sales[b] + " ");
        }

        System.out.println(" ");
        System.out.println("The largest sales value entered was: "+(largest(sales))); 
     }
}
