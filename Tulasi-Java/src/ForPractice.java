import java.util.*;

public class ForPractice {
    static final String name ="Lenovo";//final static
    static long investement=3456L;//static
    static byte locations;
    int employees;//instance

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);//Scanner
        System.out.println("Your Company name:" + " "+ name);
        System.out.println("Investment for the company:"+" " + investement);
        System.out.println("Enter number of Locations :" );
        String name=sc.next();//string next
        ForPractice obj=new ForPractice();//instance obj
        System.out.println("Enter number of employees working in the company: ");
        int emp=sc.nextInt();//
        obj.Partners(sc);//call method-Partners
        obj.EmployeeDetails(sc);
        sc.close();
    }
    void Partners(Scanner sc1){//method

        System.out.println("Enter number of partners :");
        int pat=sc1.nextInt();
        String Partners="Dell";
        System.out.println("number of Partners " + pat);

    }
    void EmployeeDetails(Scanner sc3){
        System.out.println("---------Enter your details -----------");
        System.out.println("Enter your name:" + " ");
        int name=sc3.nextInt();



    }
}