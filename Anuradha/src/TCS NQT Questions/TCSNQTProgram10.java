import java.util.Scanner;

public class TCSNQTProgram10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of patients:");
        int no_of_patients = sc.nextInt();
        int ages[] = new int[no_of_patients];
        System.out.println("Enter ages for  patients :");
        for(int i = 0;i < no_of_patients;i++){
            ages[i] = sc.nextInt();
        }
        sc.close();
        int fees = 0;// intilizing the fees to 0
        for (int i = 0; i < ages.length; i++) {
            if (ages[i] <= 17) {//  age is less than 17 
                fees += 200;
            } else if (ages[i] > 17 && ages[i] < 40) { //age between 17 and 40                                                                      
                fees += 400;
            } else {     //age above 40
                fees += 300;
            }

        }
        System.out.println("Total Income " + fees + " INR");
    }
}
