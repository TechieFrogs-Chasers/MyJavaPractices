
import java.util.Scanner;
public class ConstructorSample {
    //String name;
    //int age;
    public static void main(String[] args) {// main class
       System.out.println("Enter the name and age:");
       Scanner sc = new Scanner(System.in);// allocating space for getting inputs from the user.
        String name = sc.next();
        int age = sc.nextInt();
        ConstructorSample obj1 = new ConstructorSample(name,age); // creating for the class and passing the scanned inputs

    }
 ConstructorSample(String name,int age)//constructor
    {
        //String n1 = n;
        //int ag = a;
        System.out.println(" The entered name and age is : "+ name+" & " + age);
    }
}
