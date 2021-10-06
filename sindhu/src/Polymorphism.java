package sindhu.src;

/*public class Polymorphism {

    static int add(int i , int j){
        return i+j;
    }

    static int add(int i, int j, int k){
        return i+j+k;
    }
    
}
class Poly{
    public static void main(String[] args) {
        Poly x = new Poly();
        System.out.println(Polymorphism.add(4, 5));
        System.out.println(Polymorphism.add(4, 5, 6));

    }
}*/

public class Polymorphism{
    void hi(int a, long b){
        System.out.println(a+b);
    }

    void hi(int a, long b , long c){
        System.out.println(a+b+c);
    }
public static void main(String[] args) {
    Polymorphism x = new Polymorphism();
   x.hi(2,3);
}
}