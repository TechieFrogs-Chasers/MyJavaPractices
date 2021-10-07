package assignment3;

import java.util.Scanner;

public class Five {
    public static void main(String[] args) {
        int[] array = new int[10];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<array.length;i++){
            int k =i+1;
            System.out.println("Enter the side value for square: "+k );
            //Scanner sc = new Scanner(System.in); the scanner must be declared outside the for loop 
            //or else we wont be able to close the sc.close(); outside forloop.
            //hence declare scanner before the loopstarts and scannerclose outside the for loop.
            array[i]= sc.nextInt();
            int j= array[i];
            Squares obj = new Squares(j);
            System.out.println("Area of the square "+ k+ " is: " + obj.areaSquare());
        }
        sc.close();
    }
}
class Squares extends Rectangle{
    int side;
    Squares(int j){
        super(3,5);
        this.side = j;
    }
    int areaSquare(){
        int area= side*side;
        return area;
    }
    int periSquare(){
        int peri = 4*side;
        return peri;
    }
}