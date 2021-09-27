import java.util.Scanner;

public class One {
    int id;
    String name;
    int age;
public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("enter id value");
                int x = input.nextInt();
                input.nextLine();

                System.out.println("enter name");
                String y = input.nextLine();
                
                
                System.out.println("enter age");
                int z = input.nextInt();
                
     One s = new One();
     s.find(3,4,"sindhu");




            
        
    }
    One(){
        System.out.println("default constructor");
    }

    void find (int id , int age, String name){
        System.out.println(id);
        System.out.println(age);
        System.out.println(name);

    }

  
}