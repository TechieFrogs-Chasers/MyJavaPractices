package sindhu.src.OOPs;

//OOPS

/*public class PracticeObj {
    int i;
    String name;

   /* public static void main(String[] args) {   //we can have diff. main methods in diff. classes,
                                                    // it will ask which main method has to be executed.

        PracticeObj x = new PracticeObj();
        System.out.println(x.name);
        Student1 y = new Student1();
        System.out.println(y.g);
}
}


 class Student1{
    int j =10;
    float g = 2.33f;
    static int k =10;

    void display(){
        int q; //we cannot call variables in method outside this block. we can call only method )
        System.out.println("it is a method"); // just for practice we are writing methods
    }


    public static void main(String[] args) {
    

    PracticeObj x = new PracticeObj();
    System.out.println(x.name);
    Student1 y = new Student1();
    System.out.println(y.g);

    y.g = 3.44f;
    System.out.println(y.g);
    Student1 z = new Student1();
    System.out.println(z.g);  //object names are different , memory allocation is diff. for diff. object names
    //System.out.println(y.k); // static
    Student1.k =15; // static should be accessed using class name (correct way)
    //System.out.println(z.k); //object names are diff, memory allocation same in static
    //System.out.println(Student1.k);
    System.out.println(z.q);


    y.display();
    }
}*/


//CONSTRUCTORS

/*public class PracticeObj{
    int i;
    String name = "sindhu";

    public static void main(String[] args) {
        PracticeObj x = new PracticeObj();
        x.i=10;  //we can write like this also 
        System.out.println(x.i);
        
    }

    PracticeObj(){
        i=5;
        System.out.println("this is the constructor"); // first it will execute bcz in 62nd line 
                                                          //constructor called first
    }
}*/


//PARAMETERISED CONSTRUCTOR

public class PracticeObj{
    int i;
    int j;
    String k;
    float l;

    void display(){
        System.out.println("thankyou");
    }
  

    public static void main(String[] args) {
        PracticeObj x = new PracticeObj(10,20);
        x.display();
        
      

        PracticeObj y = new PracticeObj("sindhu");
       // System.out.println(y.k);
        //System.out.println(y.l);


        PracticeObj z = new PracticeObj();
        z.display();
       


}

    PracticeObj(int r , int s){
        this();
        i=r;
        j=s;
        System.out.println("first");

    }

    PracticeObj(){
        System.out.println("default constructor");
}

  PracticeObj(String m){
      this( 2.22f);
      k=m;
      System.out.println("second");

  }

  PracticeObj(float a){
      l=a;
      System.out.println("third");

  }

}

    


    



