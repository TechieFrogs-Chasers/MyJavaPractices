package TCS;
import java.util.Scanner;

public class Menu9{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your choice in main menu");
        System.out.println("C.Coffee"+ " " +"T.Tea"+ " "+"S.Soup"+ " "+"B.Beverages");
        char ch = sc.next().charAt(0);
        switch(ch){
            case 'C':
            System.out.println("welcome to CCD:");
            System.out.println("Select your choice from sub menu:");
            System.out.println("1.Espresso Coffee"+" "+"2.Cappucino Coffee"+" "+"3.Latee Coffee");
            int sub=sc.nextInt();
            switch(sub){
                case 1 : System.out.println("enjoy your Espresso Coffee");
                break;
                case 2: System.out.println("enjoy your Cappucino Coffee");
                break;
                case 3: System.out.println("enjoy your Latte Coffee");
                break;
                default: System.out.println("INVALID OUTPUT");
                break;
            }
            break;
        }
            switch(ch){
                case 'T':
                System.out.println("welcome to CCD");
                System.out.println("select your choice from sub menu:");
                System.out.println("1.Plain Tea"+" "+"2.Assam Tea"+" "+"3.Ginger Tea"+" "+"4.Caradamom Tea"+" "+"5.Masala Tea"+" "+"6.Lemon Tea");
                int sub1=sc.nextInt();
                switch(sub1){
                    case 1:System.out.println("enjoy your Plain Tea");
                    break;
                    case 2:System.out.println("enjoy your Assam Tea");
                    break;
                    case 3:System.out.println("enjoy your Ginger Tea");
                    break;
                    case 4:System.out.println("enjoy your Caradamom Tea");
                    break;
                    case 5:System.out.println("enjoy your Masala Tea");
                    break;
                    case 6:System.out.println("enjoy your Lemon Tea");
                    break;
                }
                break;
            }
                switch(ch){
                    case 'S':
                    System.out.println("welcome to CCD:");
                    System.out.println("select your choice from submenu");
                    System.out.println("1.Hot and Sour Soup"+" "+"2.Veg Corn Soup"+" "+"3.Tomato Soup"+" "+"4.Spicy Tomato Soup");
                    int sub2 = sc.nextInt();
                    switch(sub2){
                        case 1:System.out.println("enjoy your Hot and Sour soup");
                        break;
                        case 2:System.out.println("enjoy your Veg Corn Soup");
                        break;
                        case 3:System.out.println("enjoy your Tomato Soup");
                        break;
                        case 4:
                        System.out.println("enjoy your Spicy Tomato Soup");
                        break;
                    }
                    break;
                }
                    switch(ch){
                        case 'B':
                        System.out.println("welcome to CCD:");
                        System.out.println("select your choice from submenu:");
                        System.out.println("1.Hot Choclate Drink"+" "+"2.Badam Drink"+" "+"3.Badam-Pista Drink");
                        int sub3 = sc.nextInt();
                        switch(sub3){
                            case 1:System.out.println("enjoy your Hot Badam Drink");
                            break;
                            case 2:System.out.println("enjoy your Badam Drink");
                            break;
                            case 3:System.out.println("enjoy your Badam-Pista Drink");
                            break;
                        }
                        break;
                    }
                    sc.close();
                            
                
                        
                    
                }
            }
                
        

                


        
            

        
    
    
    