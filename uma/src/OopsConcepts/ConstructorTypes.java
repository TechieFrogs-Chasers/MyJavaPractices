package OopsConcepts;

class DefaultCon{

//creating a default constructor

    String name;
    int id;
    char ch;
    boolean b;

    void display(){

        System.out.println(id+"  "+" "+ch+"  "+b);
           //default constructor prints only the default values
    }  
}

public class ConstructorTypes{

    String name="uma";
    int rollno= 100;

    public static void main(String[] args) {
        
    ConstructorTypes stuObj = new ConstructorTypes();   //constructor with no args

     System.out.println(stuObj.name+"  "+stuObj.rollno); //accessing own class variables

     DefaultCon defObj =new  DefaultCon(); //accessing DefaultCon class

       defObj.display();   //calling DefaultCon class methods
        
    }
}

class Parameters{

       int code;
     String name;

     //creating parameterized constructor with one arg

     Parameters(int c){
       System.out.println("code is"+c);
     }

      //creating parameterized constructor with two args

        Parameters(int c ,String n){
       name=n;
       code=c;
           System.out.println("name is  "+name+"  "+"code is  "+code);
    }
        Parameters( String n,int c){
          System.out.println("string and int");
        }

    void show(){
       System.out.println(code+ "  "+ name);
    }

     public static void main(String[] args) {

       //creating objects and passing values
       Parameters paraObj = new Parameters(100);
       Parameters paraObj1 = new Parameters(10, "Uma");
       Parameters paraObj2 = new Parameters("Ram",20);

       // calling  own methods
       paraObj.show();
       paraObj1.show();
       paraObj2.show();
      // calling other class methods

      // PracticeCon obj=new PracticeCon("english");
      // obj.select();

    }
    
}

class PracticeCon{
      
    String languages;

    PracticeCon(String languages){
        languages="lang";
        System.out.println("languages are  "+languages);
    }

    PracticeCon Obj1 = new PracticeCon("english");
    PracticeCon obj2=new PracticeCon("telugu");

    void select(){
        System.out.println("select the language");
    }
    

}