package Array;

import java.util.Scanner;

public class ArrayExample {
    // array is a collection on similar data types in homoginious way
    // in aaray we need to give the size, we cant pass the values dynamically after the size,
        public static void main(String[] args) {

        int a[];// declare a varialbe array
        //a = {1,2,3} // this way is not supportted

        a = new int[10];// intializing, define
        byte b[] = new byte[5];
        //we can only give the constant and integer, it accpts the single values in ' ', but not the mutiple, because char is 1 byte 
        // can't give the size in negative complie time it accepts, run its shows exception negative array size 

        int c[] = {1,2,3}; // declare, intantiate, intialize
        int k[] = {1,'a',3};// it accepts the char too 
        int l[] = {1,'2',3};// it accepts the value in '' like char 
        //only for char and int have this relation

        b[0] = 5;
        b[1] = 10;
        b[2] = 15;

        for(int i = 0; i<c.length; i++){ // traverse of array using for loop
            System.out.println(c[i]);// one way to get the values

        }
        System.out.println(c[0]+" "+c[2]);// anothe way to get the values

        Scanner scObj = new Scanner(System.in);
        System.out.println("Enter values ");

        for(int i = 0; i< c.length; i++){// every thing as a index in for here i acts as index
        // int arrays length acts as an attribute
        // in string length() is acts as a method
            c[i] = scObj.nextInt();
        }
            System.out.println("Print Values : ");
            for(int i = 0; i< c.length; i++){
                System.out.println(c[i]);

            }
        
        
        System.err.println(" Printing values for each");
        for(int i : c){
            System.out.println(i); // here i acts for each element 
        }


        // to priint the reverse array 
        System.out.println("Enter values ");

        for(int i = 0; i< c.length; i++){
            
            c[i] = scObj.nextInt();
        }
        System.out.println("Print Values : ");
        for(int i= c.length- 1; i >=0; i--){// prints the given input in reverse, not possible with for each
            System.out.println(c[i]);


        }
        System.out.println("For char");
        char ch[] = {8,9}; // char falls under integral dat types so int accepts integer values 
        int d[];
        d = new int [8];
        for(int z : ch){
            System.out.println("Values : "+ z);
        }
        char cha[] = {65,66,67};
        for(int z : cha){
            System.out.println("Values : "+ z);
            System.out.println("Prints the values in cha : "+cha);
        }
        for(char z : cha){
            System.out.println("Values : "+ cha);
            System.out.println("It Prints the characters :"+z);
        }
        display(c); //passing c array int as parmeter, c is a actual parameter

        myDisplay(l, ch);
        //myDisplay(l, new char[]{1,2,3}); 
        // we can also write like this is anonymous way

        char p[] = myDisplayReturn(new int[]{1,2,3});   // anonymous
        /*we need to catch the return values in char p because the method return 
        type is char, we are passing value and calling, not printing, so we need to assign them to some value*/
        }



        int x[] = new int[4]; 

        static void display(int a[]){//taking int array a as formal paramenter
            for(int k : a){
                System.out.println("In display method : "+ k);

            }
        }
        //static int b[] ={1,2};
        //char ch[] = {'5','6'};
            static void myDisplay( int a[], char ch[]){
                for(int i = 0; i<a.length;i++){
                //for(int j =0;j<ch.length;j++){
                    System.out.println("In myDisplay :"+ " "+a[i]);
                }
            }
            static char[] myDisplayReturn(int a[]){
                int c[] = new int[2];
                c[0] = 4;
                char cha[] = new char[3];
                cha[0] = 'M';
                    System.out.println(cha);
                    System.out.println(c);
                    //return cha;
                     return new char[]{'A','B','C'};// anonymous
            }
        

    
}
