package OopsConcepts;

public class ConstructorOverload {
    int number;
    String subjects;
   boolean b;

    ConstructorOverload(){    
        number=100;   // when parameters are not given variables must be assigned value
        subjects="math";
        System.out.println("no parameters");
    }


    ConstructorOverload(int n){
        number=n;
        System.out.println("one parameter");
    }

 
    ConstructorOverload(int n , String s){
        number=200;
        s="uma";
        System.out.println("int and string");
    }

    ConstructorOverload(int i,int n){

        System.out.println("int and int");
    }

    ConstructorOverload(String s,String t){

        System.out.println("string and string");
    }

    ConstructorOverload(String s,int n){

        System.out.println("string and int");
    }


    ConstructorOverload(String s,int n,boolean b){
       b=true;
        System.out.println("string,int and boolean");
    }

    public static void main(String[] args) {
      
        
       // constructor with no parameters
       ConstructorOverload Obj = new  ConstructorOverload();
       Obj.display();

       ConstructorOverload Obj1 = new  ConstructorOverload(2);
       Obj1.display();

       ConstructorOverload Obj2= new  ConstructorOverload(3 ,"uma");
       Obj2.display();

       ConstructorOverload Obj3= new  ConstructorOverload("uma",4);
       Obj3.display();

       ConstructorOverload Obj4 = new  ConstructorOverload("uma","ram");
       Obj4.display();

       ConstructorOverload Obj5 = new  ConstructorOverload(5,1);
       Obj5.display();


       ConstructorOverload Obj6 = new  ConstructorOverload("varsha",1,true);
       Obj6.display();

    }
       
    void display(){
        System.out.println("over loading");
    }
}
