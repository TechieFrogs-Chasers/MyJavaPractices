package sindhu.src.TCS;

import java.util.Scanner;

public class Ninth {
    

    public static void main(String[] args) {
    
    char soups  = 's';
    char tea = 't';
    char coffee = 'c';
    char beverages = 'b';
    int y;
        
        Scanner input = new Scanner(System.in);
        System.out.println("enter first letter to select main menu");
        char x = input.next().charAt(0);
        if ( (x == 'c')|| (x=='t')|| (x=='s')||(x=='b')){

        System.out.println("which option do you want in " + x );
         
        }
        else{
            System.out.println("please enter valid character");
        }
        y = input.nextInt();
        System.out.println("wlcome to CCD");

       

        

        
       

    
    if(x=='c'){
    switch ( y){
        case 1: 
        System.out.println("enjoy your espresso coffee");
        break;
        case 2:
        System.out.println("enjoy your capuccino coffee");
        break;
        case 3:
        System.out.println("enjoy your latte coffee");
        break;
        default:
        System.out.println("please enter correct input");
    }
}

    else if(x=='t'){

        
    switch(y){
        case 1:
        System.out.println("enjoy your plain tea");
        break;
        case 2:
        System.out.println("enjoy your assam tea");
        break;
        case 3:
        System.out.println("enjoy your ginger tea");
        break;
        case 4:
        System.out.println("enjoy your cardamom tea");
        break;
        case 5:
        System.out.println("enjoy your masala tea");
        break;
        case 6:
        System.out.println("enjoy your lemon tea");
        break;
        case 7:
        System.out.println("enjoy your green tea");
        break;
        case 8:
        System.out.println("enjoy your organic darjeeling tea");
        break;
        default:
        System.out.println("please enter correct input");
    }
}

    
else if ( x == 's'){
    
    switch(y){
        case 1:
        System.out.println("enjoy your hot and sour soup");
        break;
        case 2:
        System.out.println("enjoy your veg corn soup");
        break;
        case 3:
        System.out.println("enjoy your tomato soup");
        break;
        case 4:
        System.out.println("enjoy your spicy tomato soup");
        break;
        default:
        System.out.println("please enter correct input");
    }
}
else{
    

    
    switch (y){
        case 1:
        System.out.println("enjoy your hot chocolate drink");
        break;
        case 2:
        System.out.println("enjoy your badam drink");
        break;
        case 3:
        System.out.println("enjoy your badam-pista drink");
        break;
        default:
        System.out.println("please enter correct input");
    }

    
}




    


       


    
    input.close();
}

  
}

    

    



   









   





        
