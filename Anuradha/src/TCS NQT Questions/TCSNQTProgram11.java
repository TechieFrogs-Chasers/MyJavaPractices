import java.util.Scanner;

public class TCSNQTProgram11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year to check whether leap year or not");
        int year = sc.nextInt();
        sc.close();

        boolean leapyear = false;
        if (year % 4 == 0)// If it is not divisible by 4 then it is not a leap year.
        {
            if (year % 100 == 0)// If it is not divisible by 100 then it is a leap year.
            {
                if (year % 400 == 0)// If it is  divisible by 400 then it is a leap year.
                {
                    leapyear = true;
                } else {
                    leapyear = false;
                }
            } else {
                leapyear = true;
            }
        } else {
            leapyear = false;
        }
        if (leapyear) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is a not a leap year");
        }
    }
}