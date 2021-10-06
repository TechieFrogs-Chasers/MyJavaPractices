package assignment3;

public class Eight {
    public static void main(String[] args) {
        B obj = new B(9);
        obj.i=12;
        obj.j=4;
        obj.show();
        
    }  
}
class A{
    int i;
    int j;
    A(){
        System.out.println(" Empty Constructor of parent class:");
    }
    A(int i, int j){
        this.i = i;
        this.j=j;

    }
void show(){
    System.out.println(" The value of I and J are: "+ i +" & "+ j) ;
}
}
class B extends A{
    int k;
    B(int k){
        this.k=k;
    }
    void show(){
        //super.show();
        System.out.println(" The value of K is : "+ k);
    }
}
