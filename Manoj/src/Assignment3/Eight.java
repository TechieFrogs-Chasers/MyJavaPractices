package Assignment3;

public class Eight {
    public static void main (String...args){
        B obj=new B(5);
         obj.i=10;
         obj.j=20;
        obj.show();

    }
}
class A{
     int i,j;
     A(){

     }
    A(int i ,int j ){
        this.i=i;
        this.j=j;
    }
     void show(){
         System.out.println("display the values of i&j: "+i+" "+j);

    }
}
class B extends A{
    int k;
    B(int k){
        super(5,5);
        this.k=k;

    }

    void show(){
        System.out.println("displaying the value of k: "+k);

    }

}