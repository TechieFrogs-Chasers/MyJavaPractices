import java.util.Scanner;

public class SwitchEnhancements {

    public static void main(String[] args) {
    /*    int i = 33;
        String month = "  ";
        char ch = 'B';
        long j = 33;

        switch (i) {

            case 'B' -> {
                System.out.println(ch);
                break;
            }
            case 1 -> {
                if (j >= i)
                    System.out.println("Print j value" +" "+ j);
                else
                    System.out.println("Print j value" +" "+ i);
                break;
            }

            case 2 -> {
                System.out.println(66 + ch);
                break;
            }
            case 33->{//scope
                int num=20;
                System.out.println(num);
                break;
            }

            default->
                System.out.println(" default");
        }
    }
}*/
        System.out.println("Enter value: ");//Scanner
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        switch (k) {
            case 1, 2, 3, 4 -> System.out.println("Enter value between 1 to 4");
            // yield 3;
            case 5, 6, 7, 8 -> System.out.println("Enter value between 5 to 8");
            //yield 8;

            default -> System.out.println("invalid");
        }
    }
}