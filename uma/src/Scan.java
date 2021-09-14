import java.util.Scanner;

public class Scan {
    public static void main(String[] args) {
        int income,expenditure,ent,savings;
        Scanner input=new Scanner(System.in);
        //input.useDelimiter("/");
        System.out.print("enter our income $ ");
        income=input.nextInt();
        System.out.print("enter entertainment amt $ ");
        ent=input.nextInt();
        System.out.print("enter expenditure amt $  ");
        expenditure=input.nextInt();
        savings=income-(expenditure+ent);
        System.out.println("total savings of this month is: $ " +savings);
        input.close();
        
    }
    
}
