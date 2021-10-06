package BasicPractices;
import java.util.Scanner;

public class IosScanner {
     public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
       /* System.out.println("Enter Name:");
        String Firstname = myobj.nextLine();
       String Lastname = myobj.nextLine();
       System.out.println("FistName:" +Firstname);
        System.out.println("LastName:" +Lastname);
       System.out.println("Enter age:");
       int i = myobj.nextInt();
       System.out.println("Age:" +i);
       Double d = myobj.nextDouble();
       System.out.println("Income:" +d);*/
       myobj.useDelimiter("/");
       System.out.println("name:");
       String Name = myobj.next();
       System.out.println(Name);
       String ClgName = myobj.next();
       System.out.println("University:" + ClgName);
       myobj.close();
       
        
    } 
        
    
}
