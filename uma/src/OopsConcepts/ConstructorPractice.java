package OopsConcepts;

public class ConstructorPractice {
    
int a;
int b;
static int total;
static String name;

static void student(){
total=75;
name="uma";
System.out.println(name+"'s  marks are:  "+total);
}

void math(){
     int marks=75;
     System.out.println("marks in math are"+marks);
}

void science(){

 int sc=60;
 System.out.println("marks in science are  "+sc);

}


ConstructorPractice(){
    a=50;
    b=75;
    total=100;
        System.out.println("constructor demo");
    }
    
public static void main(String[] args) {

    ConstructorPractice myObj =new ConstructorPractice();  //constructor

    student();   //static method, no need to use object

    System.out.println(name);  //"name" is a static variable, can access anywhere in the class

    myObj.math();  // calling methods
    myObj.science(); //methods that are called in the main method are only printed out

    System.out.println(myObj.a +" "+ myObj.b +" "+total );//output is 50 ,75,75 
                    //even when i changed total to 100 in the constructor 

ConstructorPractice myObj1 =new ConstructorPractice();  //constructor

System.out.println((myObj1.a +" "+ myObj1.b +" "+total )); // out put is now 50,75,100
          //because i created new instance for my constructor and called again
}

void physics(){

    ConstructorPractice myObj =new ConstructorPractice();  //constructor
    myObj.math();
    
}
}
 class Demo{

int c;
int d;


void describe(){
    System.out.println("describe");
}

void display(){
    System.out.println("display");
}

public static void main(String[] args) {
    

Demo Obj = new Demo(); 

System.out.println(Obj.c);
Obj.describe();

ConstructorPractice conObj= new ConstructorPractice(); //accessing other class
conObj.science();

Library lobj = new Library();
lobj.display(); //we can not call the variables from other file,can call only methods
}

Demo(){  //constructor

    c=100;
    d=200;
    System.out.println("in demo");
}

}