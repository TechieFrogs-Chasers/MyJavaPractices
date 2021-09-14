import java.util.Scanner;

public class ControlStatements {
    public static void main(String[] args) {
        Scanner scannerObj = new Scanner(System.in);
        System.out.println("Enter Age");
        short age = scannerObj.nextShort();
        System.out.println("Enter Weight"); 
        short weight = scannerObj.nextShort();
        System.out.println("Enter Height");
        float height = scannerObj.nextFloat();
        //Nested if
       /* if(age>18){
                if(weight>40){
                    if(height>5.5){
                        System.out.println("Eligible for Sports");
                    }
                }

        else{
                System.out.println("Not Eligible for Sports");
            }*/

    //if else
    if(age>20){
   // System.out.println("Age:"+age);// if we have muliple statement need to give in blck
    System.out.println("According to age eligible for Sports");
    }
    else{
        System.out.println("According to age Not eligible for Sports");
        }
        //if else if
        if(weight>40){
               // System.out.println("Weight: "+weight);
                System.out.println("According to weight  eligible for Sports");
        }
            else if (weight<40){
                System.out.println("Under weight, Not Eligible");
            }
                
            if(height>5.5)
            System.out.println("According to Height eligible for Sports");
            //System.out.println("Height:"+height);
            else if(height<5.5){
                System.out.println("According to Height eligible for Sports");
            }
            scannerObj.close();
    }   
}

