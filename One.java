import java.util.Scanner;

/*public class One {
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

  
}*/

/*public class PracticePrg
{  
    public static void main(String[] args) 
    {
        PracticePrg x = new PracticePrg("sindhu");
    
        x.evenOrOdd(5);

    }

    PracticePrg(String name)
    {      //printing two constructors at a time by using this keyword
        this(4);
        System.out.println("default constructor");
    }

    PracticePrg(int y)
    {
        System.out.println("first constructor");

    }

     void evenOrOdd(int x)
     {
        if(x%2==0)
        {
            System.out.println("even number");
        }
        else 
        {
            System.out.println("odd number");
        }

    }
}*/


public class One{
public static void main(String[] args) 
{
        One x = new One("sindhu");
    
       System.out.println(x.evenOrOdd(5));

}

    One(String name)
    {      //printing two constructors at a time by using this keyword
        this(4);
        System.out.println("default constructor");
    }

    One(int y)
    {
        System.out.println("first constructor");

    }

     String evenOrOdd(int x)
     {
        if(x%2==0)
        {
            return "even number";
        }
        else 
        {
             return "odd number";
        }
     }

}
