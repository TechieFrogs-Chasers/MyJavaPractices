package TypeCasting;

public class Practice {

    void m1(){

        System.out.println("method");
    }
    
    
}

class dog extends Practice{

    void bark(){

        System.out.println("dog bark");
    }

    void m1(){
        System.out.println("method overriding");
    }
}



class hello extends Practice{

    void m2(){

        System.out.println("method2");
    }

    void m1(){

        System.out.println("method overriding");
    }

    public static void main(String[] args) {
        
        hello x = new hello();

        x.m1();
        x.m2();

        Practice y = x;
        y.m1();

        dog k = new dog();



        Practice z = new dog();
        z.m1();
        




        
    }
}