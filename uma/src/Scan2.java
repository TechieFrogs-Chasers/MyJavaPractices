import java.util.Scanner;

public class Scan2 {
    static String per,temp,contract,type;
    static{
        
        per="permanent";
        temp="temporary";
        contract="contractors";
        type= "per";
        
    }
    
    public static void main(String[] args) {
        int employees=0;
        String name="uma";
        Scanner scan2obj =new Scanner(System.in);
        System.out.println("enter no of employees"+employees);
        employees= scan2obj.nextInt();
        System.out.println("enter the name");
        name=scan2obj.next();
        
        System.out.println("name is :"+name);
        scan2obj.nextLine();

        //name=scan2obj.nextLine();
        System.out.println("enter the type of employee");
        per=scan2obj.nextLine();
        boolean b=scan2obj.nextBoolean();
        if(b==true)
        System.out.println(b+"give access");
     else
     System.out.println(b+" no access");
        //if(type==per){
        //    System.out.println("give access ");
       // }
       // else
        
       // System.out.println("do not give access");
        
        scan2obj.close();

    }
}
