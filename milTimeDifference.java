import java.util.Scanner;

public class millTimeDifference 
{
 public static void main(String[] args)
 {
  Scanner in = new Scanner(System.in);
  
  System.out.println("Please enter the first time: ");
  int topTime = in.nextInt();

  System.out.println("Please enter the second time: ");
  int bottomTime = in.nextInt();

  int topTimeMod = topTime / 100; 
   
  int bottomTimeMod = bottomTime / 100; 
   
  int bothTimeMod = topTimeMod - bottomTimeMod; 
   
  int topTimeModd = topTime % 100; 
   
  int bottomTimeModd = bottomTime % 100;
   
  int bothTimeModd = topTimeModd - bottomTimeModd;
   
  System.out.print(bothTimeMod + " " + "hours" + " " + "and" + " ");
  System.out.println(bothTimeModd + " " + "minutes.");     
  }
}
