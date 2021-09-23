package Assignment2;

public class Student {  //class name as student
    int rollno;
    String name;
    public static void main(String...args){
        Student object=new Student(2,"john");//we created a object 

    }
   Student(int i,String n){ //constructor with parameters
       rollno=i;
       name=n;
       System.out.println("name "+ name+" rollno "+rollno);

   }
    
}
