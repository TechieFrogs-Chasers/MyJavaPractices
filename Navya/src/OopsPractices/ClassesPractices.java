package OopsPractices;
class OuterClass{
    static int m;
     /*void display() {
       OuterClass obj=new OuterClass();
       obj.m= 56;
       System.out.println("Display m value "+m);
     }*/
      OuterClass(){
          m = 87;
          System.out.println(" prints valu m "+m);
      }
}
     class InnerClass{
         String name = "navya";
         int age = 20;
         void javaPracties(){
             System.out.println(" prints the values");
         }
         InnerClass(){
             System.out.println(name+" "+ age);
         }
}

public class ClassesPractices {
int i,j ;
   static int num = 34;
   public static void main(String...args){     // created the main method inside the  class
       ClassesPractices object=new ClassesPractices(); //creatd an object here
       int d=20; 
        OuterClass myObj2  = new OuterClass();
       // myObj2.display();
       //new is the keyword is used to create the object 
       object.i=35;        //here i is a staic one and the object is reading it 
       object.j=50;
       object.num = 54;
       System.out.println(object.i + " " + object.j+ "  " +d +" "+object.num);
       InnerClass myObj3=new InnerClass();
       myObj3.javaPracties();
     System.out.println(myObj3.name + " "+myObj3.age);

   }

}