package OopsConcepts;

   //main class

public class SubClass {
    int i;
    String s;
    static int si;


    void display(){   // one method
        System.out.println("subclass");
    }

    class Inside{    // creating a class inside the main class
    
        String name;
        int num;


        void subdisplay(){
            System.out.println("method in sub class");
        }

    }
        public static void main(String[] args) {  //main method

            SubClass subObj = new SubClass();
            subObj.display();


            Other Obj = new Other(1); //no error when creating object from a different class
            Obj.demo();

           // Inside inObj = new Inside(); 
        // "no enclosing instance is accessible" error when tried to create instance for the inner class
           // inObj.subdisplay();
        
        }
}

  //another class outside the main class

class Other{
    int num;
    float f;
    boolean b;
    String gender;
   

    void demo(){
        System.out.println("demo for class in class");
    }

    Other obj = new Other(1);

    Other(int i ){
        this(10, "g");
        num=i;
        System.out.println("one int parameter");
    }

    Other(int i ,String g){
        num=i;
        gender= g;
        System.out.println("one int and one string parameters");
    }
   

    




}