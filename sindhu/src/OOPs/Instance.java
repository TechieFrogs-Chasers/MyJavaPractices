package OOPs;

import java.util.Scanner;

/*public class Object{
    int X = 5;
    public static void main(String[] args){
        Object myObj = new Object();
        System.out.println(myObj.X);
    }
}*/

/*public class Instance {
    int x = 5;
  
    public static void main(String[] args) {
      Instance myObj1 = new Instance();  // Object 1
      Instance myObj2 = new Instance();  // Object 2
      System.out.println(myObj1.x);
      System.out.println(myObj2.x);
    }
  }*/

 /* public class Instance {
    int x = 10;
  
    public static void main(String[] args) {
      Instance myObj = new Instance();
      myObj.x = 25; // x is now 25
      System.out.println(myObj.x);
    }
  }*/

 /* public class Instance {
    int x = 5;
    int y=6;
    //Instance myObj1 = new Instance(); 
    //System.out.println(myObj1.x);
  
    public static void main(String[] args) {
      Instance myObj1 = new Instance();  // Object 1
      Instance myObj2 = new Instance();
      Instance myObj3 = new Instance(); 
      myObj1.x=7; // Object 2
      myObj3.x = 25;
      System.out.println(myObj1.x);  // Outputs 5
      System.out.println(myObj2.x); 
      System.out.println(myObj3.x);  // Outputs 25
    }
  }*/

  /*public class Instance{

  String name = "Sindhu";
  float h = 2.33f;
  int age = 26;
  char rose = 't';
  int x=5;
  public static void main(String[] args) {
    
    Instance myObj = new Instance();
    Instance myObj1 = new Instance();

    System.out.println(myObj.x ); 

    System.out.println(myObj1.name + " "+ "is"+ " "+ myObj.age+ " "+ " years" + " old" );
    
    System.out.println(myObj.h);
    
    //System.out.println(myObj.age);
    
    System.out.println(myObj.rose);
  }
}*/

// by using static keyword
/*public class Instance{
  int age = 20;
  Instance myObj = new Instance();
  //System.out.println(myObj.age); 

  
  static String j = "100";
  //System.out.println(Instance.j);



  static void main() {
    System.out.println(Instance.j);
    Instance myObj = new Instance();
    System.out.println(myObj.age); 
    System.out.println(Instance.j);



  }
  public static void main(String[] args) {
    //String x ="sindhu";
    Instance myObj = new Instance();
    System.out.println(myObj.age);
    System.out.println(Instance.j);
  }
}*/

//Accessing object members
class Student{
  int age = 24;
  String name = "sindhu";

Student(int x,String y){
  x = age;
  y = name;
}

class Student1{
  public static void main(String[] args) {
    Student myObj = new Student();
    System.out.println(myObj.name);
  }
}




  
