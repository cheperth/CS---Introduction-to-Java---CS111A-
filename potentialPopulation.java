
import java.text.DecimalFormat;
import java.util.Scanner;

public class HomeWork4A //class
 {
  /* public static double pow(int base, double power)//Math pow method, had issues with Math.pow
  {
   if(power == 0) return 1;
   return base * pow(base, --power);
  }
  */ 
 public static void main (String[] args) //main method 
  { //variable declarations 
    int males, females, totalButterflies;
    int ratioVariance, sexRatio; 
    double genderDifference, matingPairs; 
    double  potentialPopulation; 
    double growthFactor,ratioFactor;  
    
    Scanner stdin = new Scanner(System.in);
    //prompting user and taking in input 
    System.out.println("\nButterfly Estimator\n");
    System.out.print("Enter the estimated males population: ");
    males = stdin.nextInt();
    System.out.print("Enter the estimated females population: ");
    females = stdin.nextInt();
    
    
    
    //decimal format 
    DecimalFormat noDigit = new DecimalFormat("#0"); 
    DecimalFormat oneDigit = new DecimalFormat("#0.0"); 
    DecimalFormat threeDigits = new DecimalFormat("#0.000");   
       
    //variable initializations 
    totalButterflies = males + females; 
    sexRatio         = males / females;
    ratioVariance    = males % females;
    genderDifference = males - females; 
    matingPairs      = males * females; 
    growthFactor     = Math.sqrt(matingPairs); 
    ratioFactor     = growthFactor / sexRatio;  
    potentialPopulation = Math.pow(2,(int)ratioFactor);
     
 
     
    //program output
    System.out.println("\nTotal Butterflies: " + totalButterflies );
    System.out.println("Sex Ratio        : " + sexRatio );
    System.out.println("Variance         : " + ratioVariance );
    System.out.println("genderDifference : " + genderDifference ); 
    System.out.println("matingPairs      : " + matingPairs ); 
    System.out.println("growthFactor     : " + threeDigits.format(growthFactor)); 
    System.out.println("ratioFactor      : " + oneDigit.format(ratioFactor)); 
    System.out.println("potentialPopulation:" + noDigit.format(potentialPopulation)); 
  }
}



    






