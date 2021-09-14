import java.util.Scanner;

public class ScannerValidation {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
       
        System.out.println("enter your name");
        String name=obj.next();

       System.out.println("your name is :   "+name);
       obj.nextLine();
        
       System.out.println("enter your gender ");
       String gender=obj.next();
        System.out.println(gender.charAt(0));
        System.out.println(gender.length());
     if(gender.charAt(0)=='m')
        System.out.println("welcome sir");
        else
        System.out.println("welcome lady !");
       // String gender=obj.next();
        //System.out.println();
        System.out.println("enter your marital status ");
        obj.next();
      int age;
      do{
          System.out.println("enter your age:");
         while(!obj.hasNextInt() ){
             String input=obj.next();
             System.out.println(input+"  is not a valid type");
           }
           age=obj.nextInt();
         } while(age<=0);
       // obj.useDelimiter("2");


        

        


























       obj.close();
    }
}
