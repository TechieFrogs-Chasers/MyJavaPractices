package JavaPrograms;
import java.util.Scanner;
public class ScannerExam {

    public static void main(String[] args) {
        Scanner inObj = new Scanner (System.in);
        System.out.println("Enter First Name");
        String name = inObj.next();
        System.out.println("Enter Last Name");
        String lastName = inObj.next();//only in single token print
        System.out.println("Enter Address");
        inObj.nextLine();
        String address = inObj.nextLine();//prints entire line
        System.out.println("Mobile Num");
        Long mobile = inObj.nextLong();
        System.out.println("Enter Marks");
        float marks = inObj.nextFloat();
       //System.out.println("Enter Grade");
        String grade = inObj.next();
        inObj.close();
            if(marks>=400){
            switch(grade){
            case "900":
            System.out.println("Grade:"+'A');
            case "750":
            System.out.println("Grade:"+'B');
            break;
            default:System.out.println("Grade:"+'C');
           }
                System.out.println("Fail");
            
        }
        System.out.println("Name :"+name);
        System.out.println("Last Name :"+lastName);
        System.out.println("Address: "+address);
        System.out.println("Mobile "+mobile);
        System.out.println("Marks: "+marks);
        System.out.println("Grade :"+grade);
    
    

    }

}
