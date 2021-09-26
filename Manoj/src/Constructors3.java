public class Constructors3 {
    int i ;
    String name;
    
    public static void  main(String...args){
        Constructors3 obj=new Constructors3(5);
        Constructors3 object=new Constructors3(4, "manoj");
        System.out.println(object.i+" "+object.name);

    }
    Constructors3(int h){
        i=h;
        System.out.println(i);
    }
    
    Constructors3(int k ,String n){
    i=k;
    name=n;
    }
}
