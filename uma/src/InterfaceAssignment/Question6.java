public interface Question6 extends one {

    void method();
    
}

interface one {
    void one_method1();
    void one_method2();

}
interface two{

    void two_method1();
    void two_method2();

}
interface three{

    void three_method1();
    void three_method2();

}

class Question2{
    

}

class Question1  extends Question2 implements Question6{

    public void one_method1() {
           
    }
    public void one_method2(){ 
        
    }
    public void method() {
       
    }


    //Question1(Question6 i){   //constructor with interfcae as datatype (instead of int i --interface i)

    //}

    public static void accept(one obj){

       obj.one_method1();
    }

     public static void main(String[] args) {

        Question1 objQuestion1 = new Question1();
        
        objQuestion1.one_method2();




        Question1.accept(new one(){   //interface acts as anonymous inner class

            public void one_method1() {
        
            }
            public void one_method2() {
   
            }
            
        });
       
        
    }  
       
    


    
    
}    
