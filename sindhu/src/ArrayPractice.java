package sindhu.src;

public class ArrayPractice {
    public static void main(String[] args) {

        int[] x ; //declare an array

        x = new int[10]; //allocate memory

        int[] z = new int[10]; //declare and allocate the memory
        
    

    //int x =10; // normal way

    int[] x1 = {10,20,30,40};  //declare and initialize an array

   /* for(int i=0; i<x.length; i++){           //for loop
        System.out.println(x[i]);
    }*/

    for(int i : x){                          //for each loop
        System.out.println(i);
    }

    char[] y ={'a','b',10,'c'};






    /*System.out.println(x[2]);

    x[2] = 100;

    System.out.println(x[2]);

    System.out.println(x.length);*/

    
}
}
