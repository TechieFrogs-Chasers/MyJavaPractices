package sindhu.src.OOPs.Assignment;

import java.util.Scanner;

/*public class Methods1 {
    //static int a;
    //int b;

  public static void main(String[] args) {
        Methods1 input = new Methods1();
        
        input.addingIntegers(4,5);
}

     void addingIntegers(int a , int b){
        System.out.println(a+b);
        
}
Methods1(){
    System.out.println("default constructor");
}

}*/

/*int addingIntegers(int a , int b){
    return a+b;
    public static void main(String[] args) {  //when we dont use void
        Methods1 input = new Methods1();
        System.out.println(input.addingIntegers(4,5));
}*/


//Area of Rectangle

public class Methods1{
    int l;
    int b;
    int Area;
    public  static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        System.out.println("enter length value");
        int x = input1.nextInt();
        System.out.println("enter breadth value");
        int y = input1.nextInt();

        
        Methods1 input = new Methods1();
        input.Area(4,5);

        
    }

Methods1(){
            System.out.println("constructor");
        
        
    }

    void Area(int l , int b){
        Area = l*b;
        System.out.println("area of rectangle" + Area);


    }

}
   
