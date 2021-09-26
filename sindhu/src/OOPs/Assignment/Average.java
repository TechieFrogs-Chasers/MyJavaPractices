package sindhu.src.OOPs.Assignment;

//import java.util.Scanner;

/*public class Average {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter  number1");
        int x = input.nextInt();
        System.out.println("enter  number2");
        int y = input.nextInt();
        System.out.println("enter  number3");
        int z = input.nextInt();

        int avg = (x+y+z)/3;
        System.out.println("average of three numbers" + avg);
        input.close();

    }*/

    /*public class Average{
        static int myMethod(int x, int y, int z) {
            return (x + y + z)/3;
          }
          public static void main(String[] args) {
            int z = myMethod(5, 3 , 4);
            System.out.println(z);
          }
        
    }*/


    import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter  number1");
        int x = Average.find(input);
        System.out.println("enter  number2");
        int y = Average.find(input);
        System.out.println("enter  number3");
        int z = Average.find(input);
       int avg = ((x+y+z)/3);
        System.out.println("average of three numbers" + avg);
        input.close();
    }
    /*static int find(int x, int y, int z) {
        return (x + y + z)/3;
      }*/
    static int find(Scanner input)
    {
        int num;
        do
        {
            System.out.println("enter a number");
            while(!input.hasNextInt())
            {
                input.next();
                System.out.println("please enter a valid number");
            }
            num = input.nextInt();
        }while(num<=0);
        return num;


    }
    

        

        

      
        

        
    }

    
   
}






    

