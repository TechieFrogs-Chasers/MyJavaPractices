public class Constructor2 {
    int a ;//instance variable 
    String name;
    //for to access instant variable we have to create the object or we can have the constructor  
     public static void main(String...args){
       Constructor2 obj=new Constructor2();//object is created 
       Constructor2 obj2=new Constructor2();// for every object creation it will execute
       obj.display(); 
     }   
     Constructor2(){
         a=20;
         name ="manoj";
         System.out.println("manoj"+" "+a+" "+ name);
     }
     void display(){ //we are created a method but it did't execute for that we have to call the method through the object 
         System.out.println(a+" " + name );
     }

}

