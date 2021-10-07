package OopsConcepts;

public class Polymorphism {

    void overLoad(){
        System.out.println("empty method");
    }
    void overLoad(int i,String st,boolean b){
        System.out.println("3 parameters");

    }

    void overLoad(String st,int i, boolean b){
        System.out.println("different order");;
    }
    static void overLoad(double d, float f){
        System.out.println(" static over loading");
    }
    
    void  overLoad(byte by,short sh){

        System.out.println("private");
    }

    //return type may not be same in overloading,but must have different parameters

    int load(String st,int i, boolean b){
        
        System.out.println("same name  with int return type");
        return 100;
    }

    String load(String st,int i, boolean b ,float f){
    
        System.out.println("return type different but same name");
        return "uma";
    }

    void operator(String s, String s1){

        System.out.println(s+s1);
    }


    public static void main(String[] args) {
        Polymorphism objPolymorphism = new Polymorphism();

        System.out.println(objPolymorphism.load("ram", 20, true));
       // objPolymorphism.load("ram", 20, true);
        objPolymorphism.load("uma", 10, true, 10.0f);
       Polymorphism.overLoad(10.00, 10.09f);
       objPolymorphism.operator("uma", "  B");

       //objPolymorphism.overLoad(12, 300);
    }

}

class Poly extends Polymorphism{

    void overLoad(int i,String st,boolean b){
        System.out.println("3 parameters");

    }

    void overLoad(String st,int i, boolean b){
        System.out.println("different order");;
    }
    static void overLoad(double d, float f){
        System.out.println(" static over loading");
    }
    
    void  overLoad(byte by,short sh){

        System.out.println("private");
    }

    public static void main(String[] args) {
        
        Poly objPoly = new Poly();
        objPoly.overLoad("uma", 10, false);
        System.out.println(objPoly.load("uma", 10, false));
    }

}
