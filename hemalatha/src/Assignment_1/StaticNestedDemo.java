package Assignment_1;

class OuterClass{    //outer class
    static int age=22;  //static member
    int salary=28000;   //non-static member or instance member
    private static String name = "hema";   //private member
        void check()
        {
            System.out.println("enter salary:"+salary);
        }
static class Nested{        //static nested class
        int count;
        static String address = "india";   //static member
        void display(){     //method
            System.out.println("employee details:");
            System.out.println("employee age :"+age);   //calling static member
            System.out.println("employee name:"+name);   //calling private member
            System.out.println("employee address:"+address); //calling nested class static member
            //System.out.println("enter colour"+colour); 
        
            
            /* static  nested class does not have access to instance variables and methods of the outer class*/
            /* non-static members can not access the static field */
        }
    
static class DemoSubClass{   //another static nested class
        int count=12;
        String location="usa";
      static  String colour="red";
           private void product(){
               for(int i=0;i<=4;i++){
            System.out.println("enter product details:");
            System.out.println("enter no.of products:"+count);
            System.out.println("enter colour of the product:"+colour);
            System.out.println("enter address:"+address);  //calling outer static neste class
            System.out.println("print value of :"+i);
        }
    }
}
    
    public class StaticNestedDemo{ //driver class
        public static void main(String[] args) {     //main method
            OuterClass.Nested object = new OuterClass.Nested();
            object.display();
            OuterClass obj = new OuterClass();
            obj.check();
            OuterClass.Nested.DemoSubClass object2 = new OuterClass.Nested.DemoSubClass();
            object2.product();
        }
    }
}
}
        
    


    

