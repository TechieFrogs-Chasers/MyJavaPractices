//package NestedClass-folder;

public class Bank {   //superclass

   static String bankname = "Statebank";

   static class Branch{   //static nested class
       int totalno = 40;
       static int custtotal = 4000;
       void customerDetails(){   //static class method
        //static int r=7;/
        //local variables canot be static. it will cause errors. static can happen only in class level
           System.out.println("There are " + custtotal + " cutomers in the this branch");
       }
       public static void main(String[] args) { //main method inside Static nested class
           System.out.println(" Inside the static nested class: "+ custtotal);
       }

   }
   static float bankMethod(int a, int b){  // outer class method
       Float interestrate = 7.8f;
       int amount = a;
       int years = b;
        float maturity = amount*years*interestrate;
       return maturity;
   }

   public static void main(String[] args) { // main method
    System.out.println(" The bank name : "+ bankname);

    System.out.println(" The maturity amount is : " + bankMethod(10000,3)  +" rs");   
    Branch obj = new Branch(); //creating obj for static nested class without creating instance for outerclass
    obj.customerDetails();     
   }
}
