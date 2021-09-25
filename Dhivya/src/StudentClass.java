
import java.util.Scanner;
public class StudentClass {
    public static void main(String[] args) {//MAIN CLASS
        
        StudentS obj = new StudentS("john",2);//creating object for the class named StudentS
    }
}
class StudentS{//CLASS
    //String name;
    //int rollno;
   
    StudentS(String name, int rollno)//CONSTRUCTOR
    {
        //name=n;
        //rollno =r;
        System.out.println( "The Student name:" + name + " & rollno :" + rollno);
    } 
}

