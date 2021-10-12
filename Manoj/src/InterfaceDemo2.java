public class InterfaceDemo2 implements InterfaceDemo{
      public  void display(){   //we need to provide public to the method 
          System.out.println("in display");
        }
      public void hello(){
          System.out.println("say hello "+i);
      }  
      int i=20;
     public static void main (String...args){
         int i=30;
        InterfaceDemo2 obj=new InterfaceDemo2();
        obj.display();
        obj.hello();
         System.out.println(InterfaceDemo.i);//we access static one by class name
         System.out.println(obj.i);//we acces the instance variable through object
         System.out.println(i);//we can access local variables directly
     }
}
