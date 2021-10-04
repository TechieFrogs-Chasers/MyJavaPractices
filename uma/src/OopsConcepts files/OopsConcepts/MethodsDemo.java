package OopsConcepts;


/*the defining syntax for any method is ----it starts with method header (signature) and method body

      (accessmodifier)    ( void  /  return type )    (method name)   (int i,string s)     {method body}
      public          no return  primitive data types                     formal      
      private                    like int,string                           parameters                 
      protected                                                                             
      default                                                                                     */

public class MethodsDemo {
     int i;
     String name;
     float f;
     static int s;

    private void demo_now(){
     
        System.out.println("In Demo now");
    }

    public  int demoNow(int i, String s){
       int a=10;
       int b =20;
       int sum =(a+b);

       System.out.println(sum);
        return sum;
    }
     public int demoNow(String s,int i){

        return 10;
    }

    protected float demo(float f){

        return 10.9f;
     //System.out.println("Float demo");
        
    }

     String demo(String name,short s,boolean b){   //default

        return name;
    }

    

     static int data(int i , int j){
       
        i=10;
        j=20;
        if(i>j){
            System.out.println(i);
        return i;}
        else
        System.out.println(j);
        return j;  //when there is a condition  inside the method, "return" can be used more than once
    }
    static int demo(){

        s=200;
      // name= "uma"; //can not make static ref
        return 10;
    }

    void big(int i){

    }
 
      // float ,long and double are bigger than integer ,so "int" parameter will accept bigger data type values
    

    public static void main(String[] args) {

    MethodsDemo objDemo = new MethodsDemo();
       objDemo.demo_now(); 

       objDemo.demoNow(10, "uma");

       objDemo.big(2000000000);

      //objDemo.data(10, 20);  //error

       MethodsDemo.data(10, 20);
      

       objDemo.sub();
       
    }

    void main(){
        System.out.println("hello");
    }
    
    void sub(){

      this.main();
      this.main_sub();

      System.out.println("Hi");
    }
    
    void main_sub(){

        this.add();   

        System.out.println("method chaining");
    }
    final int add(){
        s=200; 
        System.out.println("add method");
        return 10;
   }

    


   
}
