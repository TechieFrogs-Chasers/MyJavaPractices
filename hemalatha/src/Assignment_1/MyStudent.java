package Assignment_1;
import java.util.Scanner;

public class MyStudent { //driver class
    int rollno=12;
    String name="A";
    String subject="maths";
    MyStudent() // constructor
    {
        System.out.println("My Constructor practice");
    }
    void test() //method
    {
        System.out.println(" Marks ");
    }

}

    class Flowers
    {
        int count=2;
        static String name ="Rose";
        String colour = "White";
        Flowers() //construtor
        {
            System.out.println("Rose flower");
        }
        void cost()
        {
            System.out.println("Garden");
        }
    }
    
    
        class Animals
        {
            int count;
            String name ;
            String type ;
            Animals() //constructor
            {
                count=3;
                
                 System.out.println("White tiger");
            }
            void wild()
            {
                System.out.println("Forest");
            }
        
        
        public static void main(String[] args) {
            MyStudent s1 = new MyStudent();                     /*whenever the instance of the class is created then */
            Scanner sc= new Scanner(System.in);                        /* my constructor will called*/
            System.out.println(s1.name+" "+s1.rollno+" "+s1.subject);
            s1.test();
            Flowers f1 = new Flowers();
            System.out.println(f1.count+" "+f1.name+" "+f1.colour);
            f1.cost();
            Animals a1 = new Animals();
            a1.count=3;
            a1.type="bengal";
            a1.name="tiger";
            System.out.println(a1.count+" "+a1.type+a1.name);
            a1.wild();
            sc.close();


        }

    }




    
    


    

    

