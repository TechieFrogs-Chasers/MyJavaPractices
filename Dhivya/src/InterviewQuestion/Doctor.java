package InterviewQuestion;

import java.util.Scanner;
public class Doctor {
    public static void main(String[] args) {
        long fees =0;
        int[] age = new int[7];
        System.out.println("Please enter the ages of the patient:");
        Scanner sc= new Scanner(System.in);
        for(int i=0;i<age.length;i++){
             age[i] = sc.nextInt();
             if(age[i]<=0 || age[i]>=120)
             System.out.println("Invalid input");
             else if (age[i]<17)
                fees = fees+200;
            else if(age[i]>=17&&age[i]<=40)
                fees = fees+400;
            else if(age[i]>40)
                fees = fees+300;
        }
        System.out.println("The Doctor's total fees from all patients:  " +fees);
        
    }
}
