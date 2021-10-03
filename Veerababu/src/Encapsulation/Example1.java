package Encapsulation;

import java.util.Scanner;

public class Example1 {
 String name;

 public String getName()
 {
     
     return name;
 }
public static void main(String[] args) 
    {
        Example1 example1 = new Example1();
        Scanner scanner = new Scanner(System.in);
        example1.name = scanner.next();
        scanner.close();
        //example1.getName("Sample");
        System.out.println("Get Output"+" "+example1.getName());

    }
}

class Encapsulation{
    public static void main(String[] args) {
        
   // Encapsulation encapsulation =new Encapsulation();
    
    Example1 example2 = new Example1();
    example2.name = "Encaps";
    System.out.println(example2.name);
    
    }
}
