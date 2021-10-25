import java.util.Scanner;



public class HalfPyramidAlpha {
    
    public static void main(String[] args) {
        Scanner scObj = new Scanner(System.in);
        int ch;
        char st;
        do{
            System.out.println("Enter a Character");
            while(scObj.hasNextInt()){
                String input =scObj.nextLine();
                System.out.println("Enter a Character");
            }
            ch = scObj.next().charAt(0);
        }while(ch<65);
        do{
            System.out.println("Enter a Character upto which charcter we need to print");
            while(scObj.hasNextInt()){
                String input =scObj.nextLine();
                System.out.println("Enter a Character");
            }
            st = scObj.next().charAt(0);
        }while(ch<65);
            
            for (int i = ch; i <= st; i++) {
               for (int j = 1; j <= i; j++) {
                    System.out.print((char)(64+i) + " ");
                }
                ch++;
                System.out.println();
           // }
          /*  for (int i = 1; i <= (ch - 'A' + 1); ++i) {
                for (int j = 1; j <= i; ++j) {
                    System.out.print(st + " ");
                }
                ++st;
                System.out.println();
            }*/
        
    
}    

}
}