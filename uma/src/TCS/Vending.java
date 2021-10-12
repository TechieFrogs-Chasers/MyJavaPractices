import java.util.Scanner;

public class Vending {
    
    public static void main(String[] args) {
        
       Scanner obj =new Scanner(System.in);

        System.out.println("Enter your order please");
        System.out.println("coffee / tea / soups / beverages");
        String order=obj.next();
        System.out.println(order.charAt(0));

        if(order.charAt(0)== 'c'){
            System.out.println("Enter 1 for Espresso 2.Cappuccino 3.Latte");
            int num=obj.nextInt();
            System.out.println("welcome to CCD");
            switch(num){
            case 1:
            System.out.println("Enjoy your Espresso coffee");
            break;
            case 2:
            System.out.println("Enjoy your Cappuccino coffee");
            break;
            case 3:
            System.out.println("Enjoy your Latte ");}}

         else if (order.charAt(0)== 't'){
            System.out.println("Enter 1 for plain 2. Assam 3.Ginzer 4.Cardamom 5.Masala 6.Lemon 7.Green 8.Org.Darjeeling tea");
            int num1=obj.nextInt();
            System.out.println("welcome to CCD");
              
            switch (num1) {
            case 1:
            System.out.println("Enjoy your Plain Tea ");         
            break;
            case 2:
            System.out.println("Enjoy your Assam Tea");
            break;
            case 3:
            System.out.println("Enjoy your Ginzer Tea");
            break;
            case 4:
            System.out.println("Enjoy your Cardamom Tea");
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
            System.out.println("Enjoy your Organic Darjeeling  Tea");}}
             
         else if (order.charAt(0)== 's'){
             System.out.println("Enter 1. Hot and Sour 2. Veg corn 3.Tomato 4.Spicy Tomato soup");
            int num2=obj.nextInt();
            System.out.println("welcome to CCD");
                      
            switch (num2) {
            case 1:
            System.out.println("Enjoy your Hot and Sour Soup  ");         
            break;
            case 2:
            System.out.println("Enjoy your Veg Corn Soup");
            break;
            case 3:
            System.out.println("Enjoy your Tomato Soup");
            break;
            case 4:
            System.out.println("Enjoy your Spicy Tomato Soup");}}
                    
         else if (order.charAt(0)== 'b'){
            System.out.println("Enter 1.Hot Chocolate 2.Badam Milk 3.Badam Pista Milk");
            int num3=obj.nextInt();
            System.out.println("welcome to CCD");
            if(num3>3)
            System.out.println("invalid");
                          
            switch (num3) {
            case 1:
            System.out.println("Enjoy your Hot Chocolate ");         
            break;
            case 2:
            System.out.println("Enjoy your Badam Milk");
            break;
            case 3:
            System.out.println("Enjoy your Badam Pista Milk");}}
              
            
         
     obj.close();
        

    }
}
