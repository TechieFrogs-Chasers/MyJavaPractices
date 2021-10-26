public interface Question6 extends one,two,three {

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
   
    int a=150;

}

class Question1  extends Question2 implements Question6{

    public void one_method1() {
           
    }
    public void one_method2(){ 
        
    }
    public void method() {
       
    }
	@Override
	public void two_method1() {
		
		
	}
	@Override
	public void two_method2() {
	
		
	}
	@Override
	public void three_method1() {
		
		
	}
	@Override
	public void three_method2() {
		
		
	}

    void method1(one o){
        System.out.println("method1");

    }


   /* //Question1(Question6 i){   //constructor with interfcae as datatype (instead of int i --interface i)

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
       
        
    } */ 
    public static void main(String[] args) {

        Question1 objQuestion1 = new Question1();
        objQuestion1.method1(objQuestion1);
        
    }   

} 
class concrete extends Question1{

    public static void main(String[] args) {
        
        concrete objConcrete = new concrete();
        objConcrete.method1(objConcrete);

        Question1 objQuestion1 = new Question1();
        objQuestion1.method1(objQuestion1);
    }
}   
