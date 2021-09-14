import java.util.Scanner;

public class YieldSwitch {
    public static void main(String[] args) {
        System.out.println("Enter the month number: ");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        String month="oct";
        i = switch (month) {
            case "1":
                System.out.println("Jan");
                yield 1;

            case "2":
                System.out.println("Feb");
                yield 2;

            case "3":
                System.out.println("Mar");
                yield 3;

            case "4":
                System.out.println("Apr");
                yield 4;

            case "5":
                System.out.println("May");
                yield 5;

            case "6":
                System.out.println("JUN");
                yield 6;

            case "7":
                System.out.println("Jul");
                yield 7;

            case "8":
                System.out.println("Aug");
                yield 8;

            case "9":
                System.out.println("Sep");
                yield 9;

            case "10":
                System.out.println("Oct");
                yield 10;

            case "11":
                System.out.println("Nov");
                yield 11;

            case "12":
                System.out.println("Dec");
                yield 12;

            default :
                System.out.println("Not a valid entry");
                yield 0;

        };
    }
}

