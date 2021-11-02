package TypeCasting;

public class Animal {

    void m1(){
        System.out.println("method1");
    }
}

class dog extends Animal{

    void hi(){
        System.out.println("method hi");
    }

    void m1(){
        System.out.println( "dog eat");
    }
}

    class cat extends Animal{

        void m2(){
            System.out.println("method2");
        }

        void m1(){

            System.out.println("overriding method1");
        }

        public static void main(String[] args) {
            
            cat x = new cat();
            x.m2();
            x.m1();

            dog z = new dog();
            z.hi();

            Animal y = x;
            y.m1();

            Animal y1 = new dog();
            y1.m1();

            Animal y2 = z;
            y2.m1();

           if(y1 instanceof cat) //to stop printing class cast exception
            ((cat)(y1)).m2(); //class cast exception

           

           

             //downcasting animal obj is converted into cat type

            //we cannot do with dog bcz no relation between dog and cat
            
        }
    
    
}
