package sindhu.src;
class grandInheritance{
    
    int k=30;
    static class staticInh{
        int g=6;
        static void hi(){
            System.out.println("method");

        }
    }
}

public class Inheritance extends grandInheritance {

    int i=10;
    String name1 ="sindhu";
    int age;
    
}

class subInheritance extends Inheritance{
    int j = 15;
    int id = 242;
    String name= "haya";


public static void main(String[] args) {
    subInheritance x = new subInheritance();
    System.out.println(x.i);
    System.out.println(x.name1);
    System.out.println(x.k);
    System.out.println(grandInheritance.g);
    
}
}
