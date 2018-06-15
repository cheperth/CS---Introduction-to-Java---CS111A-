/*
This is a Box class i did as part of another assignment. This class can be compiled but not run and can only be used 
in another program that has a public class and a main method. The purpose of this was assignment was to have us make 
a class file. This was used in a separate TestClass.java assignment. 
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


 
