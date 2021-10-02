public class Nested3 {
   int m=5;
   int n=99;
   static int f=5;
   private String name="java";

     static class Staticclass{
          int a=10;
          static int b=20;
          void StaticMethod(){
              Nested3 outerobj=new Nested3();
              System.out.println("number"+ " " + a +f+" "+outerobj.name); //here we only call static ones from the outer class
              //if we need to access the outer instance variables create the object with outer class 
          }

      }
     
     void outer(){
        for(int i=0; i<5;i++){ //inner class within a for loop
         class inner {       //method local inner class
            int h=6;
            int d=30;
             void inneri(){
                 System.out.println("manoj"+ "- "+m+"*"+h+"="+d);
             }
         }
         inner innerobj=new inner();//for local inner class we able to call that class in method block
         innerobj.inneri();
     }
    }
    void outer2(){
        if (m<n){    // inner class with if condition 
     //for this class we couldnt able to give access modifiers except keywords abstract and final
         class inner2{      //method local inner class 
            void innerj(){
             System.out.println("manoj"+"- "+n+" "+f+" "+name);
            }
        }
        inner2 inner2obj=new inner2(); //here we call the local inner class 
        inner2obj.innerj();
    }
}
    public static void main (String...args){
        Nested3 obj=new Nested3();
          obj.outer();
          obj.outer2(); 
        Staticclass Staticobj=new Staticclass(); //we can directly access the static class without the use of outer class
        Staticobj.StaticMethod();
    }
    
}
