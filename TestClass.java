 Author:  che perth

Date  : 08/24/17

Homework assignment : 1

Objective: This is a program using the box class that required us to compile the box class separatly 
and then write a separate program which creates, uses and tests the box class inside of the main 
method. I wasn't actually 100% sure as to what the teacher wanted us to do specifically but the 
feedback i got was satisfactory. I was able to compile the box class in a separte class file 
without any errors and use it in this program. 
*/ 
 
class Box
{
 private int width; 
 private int height; 
 private int depth; 
 
 Box( int w, int h, int d)
 {
  width = w; 
  height = h; 
  depth = d; 
 }
 
 public int volume() 
 {
  return(width * height * depth); 
 }
 
 public Box(int dim)
 {
  this(dim, dim, dim); 
 }
 
 public Box()
 {
  this(0);
 }
 
 public String toString() 
 {
  return("width =" + width + " height = " + height + "depth = " + depth); 
 } 
 
 public Box(Box k) 
 {
  width = k.width; 
  height = k.height; 
  depth = k.depth; 
 } 
 
 public boolean equals(Box b) 
 {
  return(width == b.width && height == b.height && depth == b.depth); 
 }
}
public class TestClass
{
  public static void main(String args[])
  {
   Box b = new Box(2,3,4); 
 
   Box b1 = new Box(1,5,6); 
 
   Box b2 = new Box(2); 
 
   Box b3 = new Box(b); 
 
   Box b4 = new Box(); 
 
   if (b.equals(b3))  
   System.out.println(" b & b3 are the same"); 
  }
 } 

   
 
