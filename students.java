import java.util.*;
class Person{
  String name;
  String address;
  Person(String name,String address){
      this.name=name;
      this.address=address;
  }
  String getName(){
        return this.name;
  }
  String getAddress(){
        return this.address;
  }
}
class Student extends Person{
       Student(String name,String address){
          super(name,address);
       }
       HashMap<String,Integer>courses=new HashMap<>();
       void addcourse(String course,int grade)
       {
              courses.put(course,grade);
       }
       void print_course(){
           double avg=0;
           System.out.println("courses taken by: "+this.name+" are");
             for(String i:courses.keySet()){
                   System.out.println(i);
                   avg+=(double)courses.get(i);
             }
             System.out.println("average grade is: "+(double)(avg/courses.size()));
       }
}
class Teacher extends Person{
      Teacher(String name,String address){
           super(name,address);
      }
      ArrayList<String>courses=new ArrayList<>();
      boolean addcourse(String course){
            if(!(courses.contains(course))){
                 courses.add(course);
                 return true;
            }
            else{
                 return false;
            }
      }
      boolean removecourse(String course){
            if(courses.contains(course)){
                 courses.remove(course);
                 return true;
            }
            else{
                   return false;
            }
      }
}      
public class students{
    public static void main(String[] args){
          Student s1=new Student("hamsika","pegadapally");
          s1.addcourse("oops",4);
          s1.addcourse("os",3);
          s1.print_course();
          Student s2=new Student("hasini","pegadapally");
          s2.addcourse("BEE",6);
          s2.addcourse("lm",8);
          s2.print_course();
          Teacher t1=new Teacher("surrender","basar");
          boolean a=t1.addcourse("oops");
          t1.addcourse("DBMS");
              
    }
}        
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       

  
