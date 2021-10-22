import java.util.Scanner;



// program to display count of +ve number in a given set

public class CodeGym {

    public static void main(String[] args) {
        

        Scanner objScanner = new Scanner(System.in);

        System.out.println("Enter a number");
        int a = objScanner.nextInt();
        System.out.println("Enter a number");
        int b = objScanner.nextInt();
        System.out.println("Enter a number");
        int c = objScanner.nextInt();
        int count=0;
        if (a>0){
            count++;
        }
         if (b>0){
            count++;
        }
        if(c>0){
            count++;
        }
        System.out.println(count);

        objScanner.close();
        
    }

}

// program to increase the count by 1 each time the method is called

class Cat{

    private static int count=0;

    static void addNewCat(){
        count++;
    }
    public static void main(String[] args) {
        //Cat objCat = new Cat();
       // objCat.addNewCat(); //static method should be called in a static way

       Cat.addNewCat();
       Cat.addNewCat();
       System.out.println(count); // output is 2
    }
}

class Again{


    public static void main(String[] args) {
        
    
    Scanner objScanner1 = new Scanner(System.in);

        System.out.println("Enter a number");
        int a = objScanner1.nextInt();
        System.out.println("Enter a number");
        int b = objScanner1.nextInt();
        System.out.println("Enter a number");
        int c = objScanner1.nextInt();
        int count=0;
        int neg=0;
        if (a>0){
            count++;
        }
         if (b>0){
            count++;
        }
        if(c>0){
            count++;
        }
        if(a<0){
            neg++;
        }
        if(b<0){
            neg++;
        }
        if(c<0){
            neg++;
        }
        System.out.println(count);

        System.out.println(neg);

        
        
        
        objScanner1.close();
    }
    

}

