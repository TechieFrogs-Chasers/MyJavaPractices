package OopsConcepts;

import java.util.Scanner;

public class AddDistance {
    

public static void main(String[] args) {
    
   //program without validation
   /* Scanner sc = new Scanner(System.in);
   System.out.println("enter the distance in inches");
    int  i=sc.nextInt();
    System.out.println("enter the distance in feet");
    double f=sc.nextInt();
    AddDistance obj = new AddDistance();
    obj.add(i, f);
  sc.close();*/

   // program with number validation

   Scanner scannerObj=new Scanner(System.in);

   System.out.println("Enter the distance for inches");
    int i= AddDistance.validate(scannerObj);   //can have class name while calling method

    System.out.println("Enter the distance for feet");
    double f= validate(scannerObj);    //may not have class name

    AddDistance obj = new AddDistance();  // instance to call the method "add"
    obj.add(i, f);

    scannerObj.close();

}

   double add(int i,double f){

    double f3=i%12;
     double f1=i/12;
    double sum =f+f1;
    
    if (i>=12 && f1==0)
    
    System.out.println("Total distance is   "+sum+"   ft");
    else
    System.out.println("Total distance is  "+sum+ "ft and "+f3 +" inches");
    
    return sum;
  }

    static int validate(Scanner scannerObj){
      int input;
      do{
        System.out.println("Enter the valid number");
        while(!scannerObj.hasNextInt()){
          scannerObj.next();
          System.out.println("Please enter a valid number");
        }
        input=scannerObj.nextInt();
      }while(input<=0);
      return input;
    }


}
