package sindhu.src.Interfaces;

public interface Inter {
    int i=10; // internally every variable we defined as static final i.e; constant
  void display();

  int j =20;

} //by default it will considered as abstract

class face implements First.Fourth{

   void display(){
        System.out.println("should implement abstract method");
    }

    int j=30;
    public char[] l;
    void hello(){
        System.out.println("sindhu");
    }


}

interface Inter1{
    int l=55;
}

class face1 implements Inter,Inter1{
    int j= 40;

  public void  display(){

    }

public static void main(String[] args) {
        System.out.println("interface");
        System.out.println(Inter.i);

        face1 x = new face1();
        System.out.println(Inter.j);
        System.out.println(x.j);
        System.out.println(x.l);


        
}


}

/*interface Printable{  
    void print();  
    

    int i=9;

}

    interface Showable{  
    void show();  

    int i=10;
    }
    
    class A7 implements Printable,Showable{  
        int i=6;
    public void print(){System.out.println("Hello");}  
    public void show(){System.out.println("Welcome");}  
      
    public static void main(String args[]){  
    A7 obj = new A7();  
    obj.print();  
    obj.show();  
    System.out.println(Showable.i);

     }  
    }  */




    

