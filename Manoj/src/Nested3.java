public class Nested3 {
   int m=45;
   int n=99;
     
     void outer(){
         for(int i=0; i<5;i++){ //inner class within a for loop
         class inner {       //method local inner class
             void inneri(){
                 System.out.println("manoj"+ "- "+m);
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
                System.out.println("manoj"+"- "+n);
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
