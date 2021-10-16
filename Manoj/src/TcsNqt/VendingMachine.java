package TcsNqt;
import java.util.Scanner;

public class VendingMachine {
    public static void main(String...args){
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the main menu :");
        char ch=obj.next().charAt(0);
        switch(ch){
            case 'C':
            System.out.println("welcome to CCD");
            System.out.println("choose the menu ");
            System.out.println("1.expresso coffee  2.cappuccino coffee  3.latte coffee");
            int num=obj.nextInt();
            switch(num){
                case 1:
                System.out.println("enjoy your expresso coffee");
                break;
                case 2:
                System.out.println("enjoy your cappuccino coffee");
                break;
                case 3:
                System.out.println("enjoy your latte coffee");
                break;
                default:
                System.out.println("INVALID INPUT");
            }
            break;
            case 'T':
            System.out.println("welcome to CCD");
            System.out.println("choose the menu ");
            System.out.println("1.plain tea  2.assam tea   3.ginger tea  4.cardamoom tea  5.masala tea  6.lemon tea  7.green tea  8.organic tea");
            int num2=obj.nextInt();
             switch(num2){
                 case 1:
                 System.out.println("enjoy the plain tea ");
                 break;
                 case 2:
                 System.out.println("enjoy the assam tea ");
                 break;
                 case 3:
                 System.out.println("enjoy the ginger tea ");
                 break;
                 case 4:
                 System.out.println("enjoy the cardamom tea ");
                 break;
                 case 5:
                 System.out.println("enjoy the masala tea ");
                 break;
                 case 6:
                 System.out.println("enjoy the lemon tea ");
                 break;
                 case 7:
                 System.out.println("enjoy the grean tea ");
                 break ;
                 case 8:
                 System.out.println("enjoy the organic Darjeeking tea ");
                 break;  
                 default:
                 System.out.println("INVALID INPUT");
             }
             break;
             case 'S':
             System.out.println("welcome to the CCD");
             System.out.println("choose the money ");
             System.out.println("1. hot and sour soup    2.veg corn soup  3.tomato soup   4.spicy tomato soup ");
             int num3=obj.nextInt();
             switch(num3){
                 case 1:
                 System.out.println("enjoy the hot and sour soup ");
                 break;
                 case 2:
                 System.out.println("enjoy the veg corn soup");
                 break ;
                 case 3:
                 System.out.println("enjoy the tomato soup ");
                 break ;
                 case 4:
                 System.out.println("enjoy the spicy tomato soup ");
                 break ;
                 default:
                 System.out.println("INVALID INPUT ");
             }
             break;
             case 'B':
                System.out.println("welcome to CCD");
                System.out.println("choose the menu");
                System.out.println("1.hot chocolate Drink  2.badam drink  3.Badam-pista drink");
                int num4=obj.nextInt();
                switch(num4){
                    case 1:
                    System.out.println("enjoy the hot chocoalte drink");
                    break;
                    case 2:
                    System.out.println("enter the badam drink");
                    break;
                    case 3:
                    System.out.println("enter the badam -pista -drink");
                    break;
                    default:
                    System.out.println("INVALID INPUT ");
                }
                break;


        

        }
        obj.close();

    }

    
}
