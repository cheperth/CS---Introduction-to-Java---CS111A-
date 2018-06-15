import java.util.Scanner; 

public class Main
{
  public static void main(String[]args)
  {
    Scanner input = new Scanner(System.in); 
    
    int total = 0, num = 1, current = 1 + (int)( 10*Math.random() );
    
    char goAgain = 'y',playAgain = 'y', playAgain2 = 'y'; //variables
    
    do
    /*while loop to repeat num == 1 && playAgain == 'y' && 
  playAgain != 'n' 
   && playAgain2 == 'y' Infinite loop*/ 
  {
   total = 0; //reset total 
   current = 1 + (int)( 10*Math.random() ); //card variable
   
   for(int i = 0; i < 1; i++)//for loop for outputting string "First cards:"
   {
     total = 0; //reset total
     System.out.println("First cards: "); //output
   }
   for(int i = 0; i < 1; i++) /*for loop for outputting first two cards,
   outputting total,keeping total */
   {
    System.out.print("Card: " + current +",");
    total+=current; /*appears throughout code to keep count of total 
    based on cards being outputted*/ 
    
    System.out.println(current); //output card 
    
    total+=current; //update total 
    
    System.out.println("Total: "+ total);  //output total 
   
   }
  
  while(total < 21 && goAgain == 'y')  /*keep prompting the user as 
  long as total < 21 and goAgain == 'y'*/ 
   {
     System.out.println("Do you want another card?(y/n):"); /*Prompt user to 
     go again.*/ 
     goAgain = input.next().charAt(0);//take in user input to go again or not 
      
    while(goAgain == 'n')/*resets the game while user "stays" and 
    outputs 2 brand new cards with new total and asks user if they 
    new card and allows them to replay game.*/ 
    {
      total = 0; //refesh total
      
      playAgain = 'y'; //make do loop at beginnig of program true

      playAgain2 = 'y'; //make do loop at beginning of program true

      System.out.println("First cards: ");//output first cards string 

      current = 1 + (int)( 10*Math.random() );//card variable uninitialized to random

      System.out.println("Card: " + current + ","); //output card 

      total+=current;//update total 

      System.out.println(current); //output card 

      total+=current;//update total 

      System.out.println("Total: "+ total ); //output total 

      System.out.println("Do you want another card?(y/n):"); /*ask user if 
      they want to go again.*/ 
      
      goAgain = input.next().charAt(0);//store user input for go again
    }
    current = 1 + (int)( 10*Math.random() );//card variable uninitialized to random 
    
    System.out.println("Card: " + current); //output card 
   
    total+=current; //update total 
    
    System.out.println("Total: " + total);//output total 
    
for(int x = 0; x < 1; x++)
{
     if(total == 21 && total > 20 && total < 22)
       { 
       /*if total is 21 prints out congratulations and asks 
       user to play again.*/ 
  
         System.out.println("congratulations!(y/n):"); //output congrats
      
         System.out.println("Do you want to play again?(y/n):"); /*Ask user
         to play again.*/ 
       
         playAgain2 = input.next().charAt(0); //stores user input for play again
       }
}

     for(int i = 0; i < 1; i++)
     {//if total is greater than 21 output Bust and ask user to play again.
      if(total > 21 && total == 22 || total == 23 || total == 24 
      || total == 25 || total == 26|| total == 27 || total == 28 
      || total == 29 || total == 30)
       {
         System.out.println("Bust."); //output bust 
        //ask user to play again
        
         System.out.println("Do you want to play again?(y/n):");   
         
        playAgain = input.next().charAt(0); //store user input for play again. 
       }
      }
     }
    //condition for do while loop at beginning to remain true.
   }while(num ==1 && playAgain == 'y' && playAgain != 'n' 
   && playAgain2 == 'y' );
}

}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    


 

 
 



 







