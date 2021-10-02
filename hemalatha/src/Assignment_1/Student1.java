package Assignment_1;

public class Student1 {
    int rollno;
    String name;
    void display()    //using method
    {
        System.out.println("rollno:"+rollno);
        System.out.println("name:"+name);
    }  

public static void main(String[] args) {
    Student1 obj = new Student1();
    obj.display();
}
} 
    

/*int rollno;                  //using this keyword
String name;
Student1(int rollno,String name)
{
     this.rollno=rollno;
    this.name=name;
}
public static void main(String[] args) {
    Student1 obj1= new Student1(12,"John");
    System.out.println(obj1.rollno);
    System.out.println(obj1.name);
    
}
} */

