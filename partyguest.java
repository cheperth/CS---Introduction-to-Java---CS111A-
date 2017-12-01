
import java.util.Scanner;
public class partyguest
{
 public static void main(String[]args)
 {
  int capacity, attendees;
  Scanner stdin = new Scanner(System.in);
  System.out.println("What is the max room capacity for the meeting?");
  capacity = stdin.nextInt();
  System.out.println();
  System.out.println("How many attendees will you be having?");
  attendees =  stdin.nextInt();
  System.out.println();
  stdin.close();
  if ( attendees > capacity )
  {
   System.out.println("The meeting will not be legal.");
   System.out.print("You have " + ( attendees - capacity));
   System.out.println(" attendees over the legal limit.\n");
  }
  else if ( attendees == capacity )
  {
   System.out.println("The meeting will be legal. ");
   System.out.println("However adding any more sdditional attendees ");
   System.out.println("will put  you over the legal limit and will ");
   System.out.println("put you in violation of existing fire laws.\n");
  }
  else if ( attendees < capacity )
  {
   System.out.print("The meeting will be legal. You may admit up to ");
   System.out.print((capacity - attendees) +"\nadditional attendees for ");
   System.out.println("the meeting and remain legal.\n");
  }
 }
}
