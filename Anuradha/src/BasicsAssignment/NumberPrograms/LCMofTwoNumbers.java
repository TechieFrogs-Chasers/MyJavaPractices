package NumberPrograms;

import java.util.Scanner;
class LCMofTwoNumbers {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Two Numbers to find LCM");
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
    int lcm ;
    lcm = (num1 > num2) ? num1 : num2;
    while(true){
    if((lcm % num1 == 0) && (lcm % num2 == 0))
    {
        System.out.println(lcm);
        break;
    } ++lcm;
}
sc.close();
}
}
