package OopsConcepts;

import java.util.Scanner;

// Note : we can call static methods into the non static methods
    //        we can not call non static methods into the static methods.
    //         can call only by creating an instance or in a static way(with the class name)
    

public class MethodPractice {
  float f;
  int k;
    
    public static void main(String[] args) {

        MethodPractice Mp =new MethodPractice();
        Mp.data(10);

        Scanner sc =new Scanner(System.in);
        int a = Mp.k;
        int b = sc.nextInt();

        Mp.big(40000000);  //accepts "long" value in place of "int" since it is big
        Mp.code();

        //can print method obj,scanner input and also static obj

        System.out.println(a+" "+b+" "+ Mp.f);
        sc.close();
    }
    
    //methods can have same name but with different parameters
   
    static void display(){
     //this.f= f; //can not use in a static context ( in a static method)
     MethodPractice obj = new MethodPractice();
     obj.data("uma", 10);
     
    }

    void display(int i){
       this.k=i;    // can use instance variables with "this."
       f= 12.2f;   //can use the instance variables 
    }

    void display(int i,String s){
    i=10;
    }


   // int display(int i)  // can not have same name  even if it is "int" type method ,throws error


    int data(int i){       //any data type methods must return the same data type
      System.out.println(i);
        return i;
      //  System.out.println(i);  //  unreachable after the return keyword
    }

    static int data(int i , int j){
        i=10;
        j=20;
        if(i>j)
        return i;
        else
        return j;  //when there is a condition  inside the method, "return" can be used more than once
    }

    String data(String name, int i){   // no matters what parameters you have return must be the  defined data type
     name="uma";
     return "uma";
     
    }


    // void int show(int i, int j, ){   //can not be void and int type because void cant return any value

     void show(int a,int b, String s){
        a=10;
        b=20;
        s="uma";
     }
   

    void show(int a,String s, int b){    // same method name ,same no of parameters,  but not same order

    }

     void show(float n,boolean b){
       n =0.0f;  // local float variable
       f=10.0f;   //instance float varible
       
     }

     // float ,long and double are bigger than integer ,so "int" parameter will accept bigger data type values


     void big(int i){

     }

      char code (){
        System.out.println(65);
        return 'A';      // char accepts return value in int value as it reads ASCII code of the char and prints corresponding character
     
     }
}