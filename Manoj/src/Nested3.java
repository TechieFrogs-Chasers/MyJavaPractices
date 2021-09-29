public class Nested3 {
   int m=5;
   int n=99;
   static int f=5;
   private String name="java";
     
     void outer(){
         for(int i=0; i<5;i++){ //inner class within a for loop
         class inner {       //method local inner class
            int h=6;
            int d=30;
             void inneri(){
                 System.out.println("manoj"+ "- "+m+"*"+h+"="+d);
             }
         }
         inner innerobj=new inner();//for loocal inner class we able to call that class in method block
         innerobj.inneri();
     }
    }
    void outer2(){
        if (m<n){    // inner class with if condition 
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
    }
    
}
