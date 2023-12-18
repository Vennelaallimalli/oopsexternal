 import java.util.*;
class Shapes{
   void getarea(int side){
      System.out.println("Area of a square is: "+side*side); //method overloading  
   }
   void getperimeter(int side){
        System.out.println("perimeter of a square is: "+4*side);
   }
   void getarea(double radius){
         System.out.println("Area of a circle is: "+Math.PI*radius*radius);
   }
   void getperimeter(double radius){
        System.out.println("perimeter of a circle is: "+(2*Math.PI*radius));
   }
   void getarea(int length,int width){
             System.out.println("Area of a rectangle is: "+(length*width));
   }
   void getperimeter(int length,int width){
       System.out.println("perimeter of a rectangle is: "+(2*(length+width)));
   }
public static void main(String[] args){
       Shapes circle=new Shapes();
       circle.getarea(2.0);    
       circle.getperimeter(2.0);
       Shapes square=new Shapes();
       square.getarea(2);
       
       
       
       
       
       
       
       
       
       
       
       
      }
}      
  
