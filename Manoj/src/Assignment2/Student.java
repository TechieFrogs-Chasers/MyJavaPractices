package Assignment2;

public class Student {
    int rollno;
    String name;
    public static void main(String...args){
        Student object=new Student(2,"john");

    }
   Student(int i,String n){
       rollno=i;
       name=n;
       System.out.println("name "+ name+" rollno "+rollno);

   }
    
}
