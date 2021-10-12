package TCS_NQT;

import java.util.Scanner;

public class Automatic_Vending_Machine_9 {
    public static void main(String[] args) {
        Scanner myScannerObj = new Scanner(System.in);

        System.out.println("Enter your choice in menu:");
        System.out.println("C-Coffee");
        System.out.println("T-Tea");
        System.out.println("S-Soup");
        System.out.println("B-Beverages");
        System.out.println();
        System.out.println("Choice of menu :");
        char menu = myScannerObj.next().charAt(0);

        switch (menu) {
            case 'C':
                System.out.println("Welcome to CCD!");
                System.out.println("Enter your choice from sub-menu:");
                System.out.println("1.Espresso Coffee");
                System.out.println("2.Cappuccino Coffee");
                System.out.println("3.Latte Coffee");
                System.out.println();
                System.out.println("Choice of sub-menu :");

                byte subMenu1 = myScannerObj.nextByte();

                switch (subMenu1) {
                    case 1:
                        System.out.println("Enjoy your Espresso Coffee.");
                        break;
                    case 2:
                        System.out.println("Enjoy your Cappuccino Coffee.");
                        break;
                    case 3:
                        System.out.println("Enjoy your Latte Coffee.");
                        break;
                    default:
                        System.out.println("INVALID OUTPUT!");
                        break;

                }
                break;
            case 'T':
                System.out.println("Welcome to CCD!");
                System.out.println("Enter your choice from sub-menu:");
                System.out.println("1.Plain Tea");
                System.out.println("2.Assam Tea");
                System.out.println("3.Ginger Tea");
                System.out.println("4.Cardamom Tea");
                System.out.println("5.Masala Tea");
                System.out.println("6.Lemon Tea");
                System.out.println("7.Green Tea");
                System.out.println("8.Organic Darjeerling Tea");
                System.out.println();
                System.out.println("Choice of sub-menu :");

                int subMenu2 = myScannerObj.nextInt();

                switch (subMenu2) {
                    case 1:
                        System.out.println("Enjoy your Plain Tea");
                        break;
                    case 2:
                        System.out.println("Enjoy your Assam Tea.");
                        break;
                    case 3:
                        System.out.println("Enjoy your Ginger Tea.");
                        break;
                    case 4:
                        System.out.println("Enjoy your Cardamom Tea.");
                        break;
                    case 5:
                        System.out.println("Enjoy your Masala Tea.");
                        break;
                    case 6:
                        System.out.println("Enjoy your Lemon Tea.");
                        break;
                    case 7:
                        System.out.println("Enjoy your Green Tea.");
                        break;
                    case 8:
                        System.out.println("Enjoy your Organic Darjeerling Tea");
                        break;
                    default:
                        System.out.println("INVALID OUTPUT!");
                        break;

                }
                break;
            case 'S':
                System.out.println("Welcome to CCD!");
                System.out.println("Enter your choice from sub-menu:");
                System.out.println("1.Hot and Sour Soup");
                System.out.println("2.Veg Corn Soup");
                System.out.println("3.Tomato Soup");
                System.out.println();
                System.out.println("Choice of sub-menu :");

                byte subMenu3 = myScannerObj.nextByte();

                switch (subMenu3) {
                    case 1:
                        System.out.println("Enjoy your Hot and Sour Soup.");
                        break;
                    case 2:
                        System.out.println("Enjoy your Veg Corn Soup.");
                        break;
                    case 3:
                        System.out.println("Enjoy your Tomato Soup.");
                        break;
                    case '4':
                        System.out.println("Enjoy your Spicy Tomato Soup.");
                        break;
                    default:
                        System.out.println("INVALID OUTPUT!");
                        break;

                }
                break;
            case 'B':
                System.out.println("Welcome to CCD!");
                System.out.println("Enter your choice from sub-menu:");
                System.out.println("1.Hot Chocolate Drink");
                System.out.println("2.Badam Drink");
                System.out.println("3.Badam-Pista Drink");
                System.out.println();
                System.out.println("Choice of sub-menu :");

                byte subMenu4 = myScannerObj.nextByte();

                switch (subMenu4) {
                    case 1:
                        System.out.println("Enjoy your Hot Chocolate Drink.");
                        break;
                    case 2:
                        System.out.println("Enjoy your Badam Drink.");
                        break;
                    case 3:
                        System.out.println("Enjoy your Badam-Pista Drink.");
                        break;
                    default:
                        System.out.println("INVALID OUTPUT!");
                        break;

                }
        default:
            System.out.println("INVALID OUTPUT!");
        }
        myScannerObj.close();
    }
}
