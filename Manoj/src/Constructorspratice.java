


public class Constructorspratice {
 int miliage ,i;
 String name ,k;
 float f;
    Constructorspratice(int n ,String a ){ // created a parameter constructor
        miliage=n;
        name=a;
        System.out.println("my constructor pratices "+n+" "+a );
    }
    Constructorspratice(float f){
        System.out.println();
    }


    void display(){
        System.out.println(miliage+" "+ name);
    }

    public static void main(String...args){
        Constructorspratice object=new Constructorspratice(20,"safari");
       Constructorspratice objt=new Constructorspratice( 25,"ciaz " );
       object.display(); //call the method to display the values of an object 
       objt.display();
      object.i=45;
      object.k="manoj ";
       System.out.println(object.i+" "+object.k);      
       
    }
}
