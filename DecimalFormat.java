
import java.util.Scanner; 
import java.text.DecimalFormat;

public class DecimalFormat //decimal format 
{

 public static void roundToInteger(double a) //method to display user input as integer 
 {
  System.out.println(((int)(a)));
 }
 
 public static void roundToTenths(double a) //method to display user input rounded to tenths
 {                                            
  DecimalFormat f = new DecimalFormat("##.0");
  System.out.println(f.format(a)); 
 }
 public static void roundToHundredths(double a) //method to display user input rounded to hundredths
 { 
  DecimalFormat f = new DecimalFormat("##.00"); 
  System.out.println(f.format(a)); 
 } 
 public static void roundToThousandths(double a)//method to display user input rounded to Thousandths
 {
  DecimalFormat f = new DecimalFormat("##.000"); 
  System.out.println(f.format(a)); 
 } 
 
 
 public static void main(String...args)//main method 
 {
  Scanner stdin = new Scanner(System.in); //scanner class object for user input 
  
  System.out.println("Enter in a double: "); //prompt user for double 
  double input = stdin.nextDouble(); //store user input as double
  System.out.println("Original input: " + input); //print out original user input 
  System.out.print("Integer: "); //print statement 
  roundToInteger(input); //calling method to round user input to integer 
  System.out.print("Tenths: "); //print statement 
  roundToTenths(input); //calling method to round user input to tenths 
  System.out.print("Hundredths: "); // print statement 
  roundToHundredths(input); // call method to round user input to hundredths  
  System.out.print("Thousandths: "); //print statement 
  roundToThousandths(input); //call method to round user input to thousandths 
  }
 }   
  
 
    
    
    
 
    
    
    
    
    
    
    
    
