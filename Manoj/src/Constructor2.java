public class Constructor2 {
    int rollno ;//instance variable 
    String name;
    String branch;
    //for to access instant variable we have to create the object or we can have the constructor  
     public static void main(String...args){
       Constructor2 obj=new Constructor2();//object is created 
       Constructor2 obj2=new Constructor2(45,"manoj");// for every object creation it will execute
       Constructor2 obj3=new Constructor2(9,"manoj","mech");
      // obj.display(); 
     }   
      Constructor2(){
         rollno=20;
         name ="manoj";
         System.out.println(rollno+" "+ name);
     }
     Constructor2(int i,String n){
         rollno=i;
         name=n;
         System.out.println("2nd constructor");
         System.out.println(rollno+" "+name);
     }
     Constructor2(int i, String n,String b){
         this(100,"manoj"); //we are calling the 2nd constructor using this() keyword 
         rollno=i;
         name=n;
         branch=b;
         System.out.println("3rd constractor");
         System.out.println(rollno+" "+name+" "+branch);

     }
     /*void display(){ //we are created a method but it did't execute for that we have to call the method through the object 
         System.out.println(a+" " + name );
     }*/
     

}

