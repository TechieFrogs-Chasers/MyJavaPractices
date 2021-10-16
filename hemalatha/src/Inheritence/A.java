package Inheritence;

public class A {
    int i,j;
    A(int i,int j){
        this.i=i;
        this.j=j;
    }
    void show()
    {
        System.out.println("the value of i:" +i);
        System.out.println("the value of j:" +j);
    }
    class B extends A{
        int k;
        B(int k){
            super(2,3);
        }
        void show()
        {
            System.out.println("the value of k:" +k);
        }
    }

    public static void main(String[] args) {
        A a = new A(4,5);
        B b = a.new B(4);
        b.show(); 
        a.show();  

    }
    
}
