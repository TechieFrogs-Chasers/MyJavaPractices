/*public interface InterfaceDemo3{
    void print();    
}
 interface Showable{
    void show(String s);//method with a parameter

 interface InnerInter{    //Inner interface 
      void InnerMeth();
      
 }   

}

class Bike implements InterfaceDemo3,Showable{
  public void print(){
      System.out.println("in interface");
  }   
       public void show(String s){
           System.out.println("In car "+s);
       }
              public void InnerMeth(){
                 System.out.println("inner interface");
              }
  public static void main(String...args){
      Bike obj=new Bike();
      obj.show("toyata");
      obj.print();
      obj.InnerMeth();
  }

}*/

//----------one interface can be extends another----------- //


interface A {
    void meth1();
    void meth2(); //created methods 
    default void meth4(){
        System.out.println("interface A meth4()");
    }
}
//B now includes meth1 ,meth2 ().....it adds meth3

interface B extends A{  //here we  use extends keyword
    void meth3();

    default void meth4(){ //while having a default method we can directly call this method through obj 
        System.out.println("implements meth4()");
        

      /* interface C{  
           void meth5();
        }
        C obj2=new C();
        obj2.meth5();*/
    }

}

class Myclass implements B{
    public void meth1(){
        System.out.println("implements meth1()");
    }
    public void meth2(){
        System.out.println("Implements meth2() ");
    }
    public void meth3(){
        System.out.println("Implements meth3()");
    }

   /* public void meth5(){
        System.out.println("Implements meth5()");
    }*/

}
class ExtendsInter{
    public static void main(String...args){
        Myclass obj=new Myclass();
        obj.meth1();
        obj.meth2();
        obj.meth3();
        obj.meth4();
        
    }
}
