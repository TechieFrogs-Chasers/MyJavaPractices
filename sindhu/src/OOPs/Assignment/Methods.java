package sindhu.src.OOPs.Assignment;

//import java.util.Scanner;

/*public class Methods {    //validation method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter  number1");
        int x = Methods.find(input);
        System.out.println("enter  number2");
        int y = Methods.find(input);
        System.out.println("enter  number3");
        int z = Methods.find(input);
       int avg = ((x+y+z)/3);
        System.out.println("average of three numbers" + avg);
        input.close();
    }
    
    static int find(Scanner input)
    {
        int num;
        do
        {
            //System.out.println("enter a number");
            while(!input.hasNextInt())
            {
                input.next();
                System.out.println("please enter a valid number");
            }
            num = input.nextInt();
        }while(num<=0);
        return num;


    }
}*/


//passing parameters
/*public class Methods{
    public static void main(String[] args) {
        Methods input = new Methods();
        input.display(5, 6, "sindhu");

    }

    void display(int x , int y , String name){
        System.out.println(y);

    }
}*/

//method overloading using static
/*public class Methods
{
  static void multiply(int a, int b)
  {
    System.out.println("Result is"+ " " +  (a*b)) ;
  }
  static void multiply(int a, int b,int c)
  {
    System.out.println("Result is"+ " " + (a*b*c));
  }
  public static void main(String[] args)
  {
    Methods.multiply(8,5);   
    Methods.multiply(4,6,2);   
  }
}*/

// method overloading using objects
/*class Method
{
  void multiply(int a, int b)
  {
    System.out.println("Result is"+(a*b)) ;
  }
  void multiply(int a, int b,int c)
  {
    System.out.println("Result is"+(a*b*c));
  }
  public static void main(String[] args)
  {
    Method obj = new Method();
    obj.multiply(8,5);   
    obj.multiply(4,6,2);   
  }
}*/

//overloading using datatypes
/*class Method2
{  
 int add(int a, int b)        //same method name used twice ( for int and double)
   {
      return a+b;
   }  
 double add(double a, double b)  //two methods can have different parameters
   {
     return a+b;
   }  


 
public static void main(String[] args)
{  
    Method2 x = new Method2();

   System.out.println(x.add(7,3));  
   System.out.println(x.add(10.4,10.6));  
}
}*/

//method overriding

class college {
    public void move() {
     System.out.println("College is open");
    }
   }
   class univ extends college {                   //defining the same method as parent class
    public void move() {
     System.out.println("University is open too");
    }
   }
   public class Methods {
    public static void main(String args[]) {
     college a = new college();
     univ b = new univ();
     a.move();
     b.move();
    }
}
//method overriding by using super keyword

class Animal {
    public void displayInfo() {
       
       System.out.println("I am an animal.");
    }
 }
 
 class Dog extends Animal {
    public void displayInfo() {
       super.displayInfo();
       System.out.println("I am a dog.");
    }
 }
 
 class Main {
    public static void main(String[] args) {
       Dog d1 = new Dog();
       //Animal d1 = new Animal();
       d1.displayInfo();
    }
 }


