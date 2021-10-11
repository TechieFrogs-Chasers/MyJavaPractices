package TcsPaperPractices;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scObj = new Scanner(System.in);
        System.out.println("Enter Your Choice from main menu : ");
        System.out.println(" Coffee " + " Tea " + " Soups "+ " Bevareages " );
        char main = scObj.next().charAt(0);
      //  System.out.println(main);
      switch (main) {
          case 'C':
              System.out.println("Welcome to CCD");
              System.out.println("Enter the choice from the sub menu : ");
              System.out.println(" 1.ExpressCoffee " + " 2.CappuccinoCoffe "+ " 3.LatteCoffee");
              int sub1 = scObj.nextInt();
              switch(sub1){
                  case 1: System.out.println("Enjoy your ExpressCoffe ");
                  break;
                  case 2: System.out.println("Enjoy your CappuccinoCoffee ");
                  break;
                  case 3: System.out.println("Enjoy your LatteCoffee ");
                  break;
                  default: System.out.println("Invalid Input");
                  break;
                }
                default:System.out.println("Invalid Input");
                break;
          case 'T':
             System.out.println("Welcome to CCD");
             System.out.println("Enter the choice from the sub menu : ");
             System.out.println("1.PlainTea" + "2.AssamTea" + "3.GingerTea" + "4.cardomomTea" + "5.MasalaTea"+ "6.LemonTea" + "7.GreenTea" + "Organic Dargeeling Tea");
            int Sub2 = scObj.nextInt();
             switch(Sub2){
                 case 1: System.out.println("Enjoy your Plain Tea  ");
                 break;
                 case 2:  System.out.println("Enjoy your Assam Tea ");
                 break;
                 case 3: System.out.println("Enjoy your Ginger Tea ");
                 break;
                 case 4: System.out.println("Enjoy your Cardomom Tea");
                 break;
                 case 5: System.out.println("Enjoy your Masala Tea ");
                 break;
                 case 6: System.out.println("Enjoy your Lemon Tea");
                 break;
                 case 7: System.out.println("Enjoy your Green Tea");
                 break;
                 case 8: System.out.println("Enjoy your Organic Tea");
                 break;
                 default: System.out.println("Invalid Input");
                 break;
             }
             break;
         case 'S' :
             System.out.println("Welcome to CCD");
             System.out.println("Enter the choice from the sub menu : ");
             System.out.println("1.Hot and Sour Soup "+ "2.veg Corn Soup"+ "3.Tomato Soup"+ "4.Spicy Tomato Soup");
             int sub3 = scObj.nextInt();
             switch(sub3){
                 case 1:System.out.println("Enter your Hot and Sour Soup ");
                 break;
                 case 2: System.out.println("Enter your veg corn Soup ");
                 break;
                 case 3: System.out.println("Enter your Tomato Sopu ");
                 break;
                 case 4: System.out.println("Enter your Spicy Tomato Soup");
                 break;
                 default:System.out.println("Invalid Input ");
                 break;
             }
             break;
         case 'B':
             System.out.println("Welcome to CCD");
             System.out.println("Enter the choice from the sub menu : ");
             System.out.println("1.Hot Chocolate drink "+ "2.Badam drink" + "3.Badam -Pista Drink");
             int sub4 = scObj.nextInt();
             switch(sub4){
                 case 1:System.out.println("Enjoy your Hot Chocolate Drink");
                 break;
                 case 2:System.out.println("Enjoy your Badam Drink");
                 break;
                 case 3:System.out.println("Enjoy your Badam-Pista Drink");
                 break;
                 default : System.out.println("Invalid Input");
             }
        }
        scObj.close();
    }
}
