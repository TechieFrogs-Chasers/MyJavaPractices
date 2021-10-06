package sindhu.src.InheritanceAssignment;

public class A {
    int i;
    int j;

    void show(){
        System.out.println(" The value of I and J are: "+ i +" & "+ j) ;
    }
    A(){
        System.out.println("constructor");
    }
}

class B extends A{
    int k;
    B(int k){
        this.k =k;
        System.out.println("constructor");
    }

    void show(){
        System.out.println(" The value of K is : "+ k);

    }
    

public static void main(String[] args) {
    
     B  x = new B(5);

        x.show();
       

    }

}

    

