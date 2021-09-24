public class Enhancement {
    public static void main(String[] args) {
        int week = 4;
        String weekString = "";
        switch (week) {
            case 1:
                weekString = "1-monday";
                break;
            case 2:
                weekString = "2-tuesday";
                break;
            case 3:
                weekString = "3-wednesday";
                break;
            case 4:
                weekString = "4-thrusday";
                break;
            case 5:
                weekString = "5-friday";
                break;
            case 6:
                weekString = "6-saturday";
                break;
            case 7:
                weekString = "7-sunday";
                break;
            default:
                System.out.println("Please enter in between 1-7:");

        }
        System.out.println(weekString);

        int val = 7;
        switch (val) {
            case 3, 4, 5, 6 -> System.out.println("its in range");
            default -> System.out.println("Not in range");
        }

        char v = 'P';
        int k = switch (v) {
            case 'R':
                System.out.println("print value");
                yield 'k';

            case 'Y':
                System.out.println("its same value");
                yield 'n';

            default:
                yield 77;
        };
        System.out.println("value: " + k);

        int a = 10;
        switch (a) {
            case 1: {
                if (a > 1)
                    System.out.println("a is greater than 1");
                else
                    System.out.println("a is lesser than 1");
            }
                break;
            case 4: {
                if (a > 4)
                    System.out.println("a is greater than 4");
                System.out.println("a is lesser than 4");
            }
                break;
            case 10: {
                if (a >= 10)
                    System.out.println("a is greater than or equal to 10");
                else
                    System.out.println("a is lesser than 10");
            }
                break;
            default:
                System.out.println("invalid");
                break;
        }
        int l = 'd';
        switch (l) {
            case 'D' | 'd' | 'e' | 'r': {
                int f = 5;
                int d = 3;
                int sum = (f + d);
                System.out.println('d' + " " + sum);
            }
                break;

            default:
                System.out.println("invalid");
                break;
        }
    }
}