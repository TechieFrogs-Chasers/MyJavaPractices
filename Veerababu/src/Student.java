import java.util.Scanner;
public class Student {
  public static void main(String[] args) {
      Scanner student = new Scanner(System.in);
      System.out.println("Roll NUmber");
      int n = student.nextInt();
      System.out.println("Student Name");
      String s= student.next();
      System.out.println("Phone Number");
      long p = student.nextLong();
      student.close();

        System.out.println("Roll Number"+ n);
        System.out.println("Student Name"+ s);
        System.out.println("Phone Number"+ p);
  }  
}
