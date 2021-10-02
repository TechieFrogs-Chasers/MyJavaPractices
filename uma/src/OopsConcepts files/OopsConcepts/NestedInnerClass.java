package OopsConcepts;

import OopsConcepts.NestedInnerClass.One.Two;
import OopsConcepts.NestedInnerClass.One.Two.Three;


public class NestedInnerClass {  //non static 
    static int a;
    String name;
    private float f;


    static{
        a=100;
        System.out.println("static block  SIB");
        {
            a=200;
            System.out.println("IB inside SIB");
        }
    }

    
    {
        a=150;
        System.out.println("in IB");
       // static{
       //we can give IB inside SIB  --- but can not give SIB inside IB
        //}
    }


    static void method1(){
     System.out.println("method 1 ");

     // static class MethodClass{  //can not define static,private ,protected class in a static method
     //}
     One oobj = new One();
     //oobj.method2();  //static method  can not be called with object
     One.method2();    //output is "method 2"

     Two obj = oobj.new  Two();   //non static class
     obj.MethodInTwo();    //output is "method in class two"

     Three threeobj = new Three();    //static class
     threeobj.methodInThree(10, "uma");  // private method  //prints name and sum



    class MethodLocalClass{     // can define a non static class inside the static method(method local)

        static int e;
        int t=75;

        void local(){
            System.out.println("local");   //output "local"
        }
       
        static void method(){   // can define a static method in side the non static class of static method

            String methodlocal="inside local method class";
            
            System.out.println("method local"+a+" "+e+" "+ methodlocal);
        }
    
     
    } 

         MethodLocalClass mlc = new MethodLocalClass();
         mlc.local();
         System.out.println(mlc.t);
        MethodLocalClass.method();
        
    }


    public static void main(String[] args) {
    
     method1();

     NestedInnerClass obj=new NestedInnerClass();
     System.out.println(obj.f);

     //One.method2();

    //method();
    
    }

    static public class One{

        static int b;
        int c;


        static void method2(){
            a=10;
            b=15;
            System.out.println("method 2");
        }
          
        class Two{

            int inte;
           
          void MethodInTwo(){
                System.out.println("method in class two");
            }


            static class Three{
                private String str;
                static final double  PI =3.14;


            private int methodInThree(int i,String s){
       
                str="uma";
                i=10;
                int j=20;
                int sum =(i+j);
                System.out.println(str +sum);
                return sum;   
            }
            
            }

        }


    }

}
