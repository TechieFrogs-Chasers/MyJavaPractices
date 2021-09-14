package JavaPrograms;
import java.util.Scanner;
public class ControlSwitchEnchExam {
    

public static void main(String[] args) 
{
    Scanner controlSwitch = new Scanner(System.in);
    System.out.println("Enter value for i");
     int i = controlSwitch.nextInt();
     System.out.println("enter valu for j");
     int j = controlSwitch.nextInt();
     controlSwitch.close();
     switch(1){
         case 1, 2, 3 ->System.out.println("Sum "+(i+j));
        default -> System.out.println("Sub "+(i-j));
        }
}
}


