import java.util.Scanner;

public class TCSNQTProgram9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice for Main menu  :");
        System.out.println("C --> Coffee" + "\n" + "T--->Tea" + "\n" + "S-->Soups" + "\n" + "B-->Beaverages");
        char main = sc.next().charAt(0);
        switch (main) {

            case 'C':
                System.out.println("Welcome to CCD ");
                System.out.println("Enter your choice from Sub Menu:");
                System.out.println("1.Espresso Coffee" + "\n" + "2.Cappiccino Coffee" + "\n" + "3.Latte");
                int sub = sc.nextInt();
                switch (sub) {
                    case 1:
                        System.out.println("Enjoy your Espresso Coffee");
                        break;
                    case 2:
                        System.out.println("Enjoy your Cappiccino Coffee");
                        break;
                    case 3:
                        System.out.println("Enjoy your Latte");
                        break;
                    default:
                        System.out.println("INVALID OUTPUT");
                        break;
                }
                break;
            case 'T':
                System.out.println("Welcome to CCD ");
                System.out.println("Enter your choice from Sub Menu:");
                System.out.println("1.Plain Tea " + "\n" + "2.Assam Tea" + "\n" + "3.Ginger Tea" + "\n"
                        + "4.Cardamom Tea" + "\n" + "5.Masala Tea " + "\n" + "6.Lemon Tea " + "\n"
                        + "7.Green Tea " + "\n" + " 8.Organic Darjeeling Tea");
                int sub1 = sc.nextInt();
                switch (sub1) {
                    case 1:
                        System.out.println("Enjoy your Plain Tea");
                        break;
                    case 2:
                        System.out.println("Enjoy your Assam Tea");
                        break;
                    case 3:
                        System.out.println("Enjoy your Ginger Tea");
                        break;
                    case 4:
                        System.out.println("Enjoy your Cardamom tea");
                        break;
                    case 5:
                        System.out.println("Enjoy your Masala Tea");
                        break;
                    case 6:
                        System.out.println("Enjoy your Lemon Tea");
                        break;
                    case 7:
                        System.out.println("Enjoy your Green Tea");
                        break;
                    case 8:
                        System.out.println("Enjoy your Organic Darjeeling Tea");
                        break;
                    default:
                        System.out.println("INVALID OUTPUT");
                        break;
                }
                break;
            case 'S':
                System.out.println("Welcome to CCD ");
                System.out.println("Enter your choice from Sub Menu:");
                System.out.println("1.Hot and Sour Soup"+"\n"+"2.Veg Corn Soup"+"\n"+"3.Tomato Soup"+"\n"+"4.Spicy Tomato Soup");
                int sub2 = sc.nextInt();
                switch (sub2) {
                    case 1:
                        System.out.println("Enjoy your Hot and Sour Soup");
                        break;
                    case 2:
                        System.out.println("Enjoy your Veg Corn Soup");
                        break;
                    case 3:
                        System.out.println("Enjoy your Tomato Soup");
                        break;
                    case 4:
                        System.out.println("Enjoy your Spicy Tomato Soup");
                        break;
                    default:
                        System.out.println("INVALID OUTPUT");
                        break;

                }
                break;
            case 'B':
                System.out.println("Welcome to CCD ");
                System.out.println("Enter your choice from Sub Menu:");
                System.out.println("1.Hot CHocolate Drink " + "\n" + " 2.Badam Drink " + "\n" + "  3.Badam-Pista Drink");
                int sub3 = sc.nextInt();
                switch (sub3) {
                    case 1:
                        System.out.println("Enjoy your Hot Chocolate Drink");
                        break;
                    case 2:
                        System.out.println("Enjoy your Badam Drink");
                        break;
                    case 3:
                        System.out.println("Enjoy your Badam-Pista Drink");
                        break;
                    default:
                        System.out.println("INVALID OUTPUT");
                        break;
                }
            default:
                System.out.println("INVALID OUTPUT");
        }
        sc.close();
    }
}
