package Assignment1;

import java.util.Scanner;

/*public class HalfPyramidusingStar {
    public static void main(String[] args) {
        /*int rows = 5;

        for (int i = 1; i <= rows; ++i) {
          for (int j = 1; j <= i; ++j) {
            System.out.print("* ");
          }
          System.out.println();
        }

        // using scanner method
        Scanner input = new Scanner(System.in);
        
        System.out.println("enter how many rows");
        
        int s = input.nextInt();
        for (int i = 1; i <= s; ++i) {
          for (int j = 1; j <= i; ++j) {
            System.out.print("* ");
          }
          System.out.println();
        }
        input.close();


    }
    
}*/

public class HalfPyramidusingStar {
  public static void main(String[] args) {
    Scanner  input = new Scanner(System.in);
    int x;
    do{
      System.out.println("enter how many rows");
      while(!input.hasNextInt()){
        String s = input.next();
        System.out.println(s+"is not a valid one");
      }
       x = input.nextInt();
    }while(x<=0);

    for (int i = 1; i <= x; ++i) {
      for (int j = 1; j <= i; ++j) {
        System.out.print(" * ");
      }
      System.out.println();
    }
    input.close();
  }
}



