import java.util.Scanner;

public class Scheme {
    

    public static void main(String[] args) {
         
        Scanner obj = new Scanner(System.in);
        System.out.println("enter the parent name");
        String name= obj.next();

        System.out.println("scheme amount");
       int amount= obj.nextInt();

        System.out.println("number children?");
        int count= obj.nextInt();


             if(count==2){
       System.out.println("two child members");
        
       System.out.println("enter names of child members");
       System.out.println("1st name");
      String childName1= obj.next();
       System.out.println("2nd name");
       String childName2= obj.next();


       int comm= amount* 20/100;
       int comm1=amount*5/100;
       int comm2=amount*5/100;

      
       System.out.println("COMMISSION DETAILS");
       System.out.println("Total number of members is 3");
       System.out.println(name+"  got commission of RS  "+comm);
       System.out.println(childName1+"  got commission of RS  "+comm1);
       System.out.println(childName2+"  got commission of RS  "+comm2);}

           if(count==1){
          System.out.println("one child member");
          System.out.println("enter name of the child member");
          String childName3=obj.next();

          int comm4= amount* 10/100;
          int comm3=amount*5/100;
          System.out.println("COMMISSION DETAILS");
          System.out.println("Total number of members  is 2");
          System.out.println(name+"  got commission of RS  "+comm4);
          System.out.println(childName3+"  got commission of RS  "+comm3);}
         
        

     else if(count==0){
        System.out.println("COMMISSION DETAILS");

     System.out.println("No child members");

      int comm5=amount*5/100;
      System.out.println("commission  is Rs  "+comm5);}

      else if (count>2){
      System.out.println("invalid");}

      
        
        obj.close(); 
          
         
         
    }

       







    
}
