import java.util.Scanner;
public class Assign2 { 
    public static void main(String[] args) {
        Stud obj = new Stud("Sam");
        Stud ob2 = new Stud("John");
    }
}
class Stud{
    Stud(String a){
       int rollno;
       Long phno;
       String address;
    System.out.println(" Enter the roll no, phno, and address for " + a + ": ");
    Scanner getData = new Scanner(System.in);
    rollno = getData.nextInt();
    phno = getData.nextLong();
    address = getData.nextLine();
    System.out.println("The student name and details:" + a +" & ROLLNO: " +rollno +" & CONTACT NO: "+ phno +" & ADDRESS: "+
    address);
    getData.close();
    }
}