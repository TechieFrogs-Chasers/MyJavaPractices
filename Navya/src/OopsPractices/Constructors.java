package OopsPractices;
public class Constructors{
    int s;
    int age;
    String name;
    int id; 
    String place;
    float g;

    Constructors(){
        System.out.println("default constructor");

    }


    Constructors(int s,String t,float u){
        this(324, "fggg", "dgrt",456);
        age =s;
        name = t;
        g =u;
        System.out.println(" first parameterized  " + s+" "+t+" "+u);
    }

    Constructors(int r,String q, String h,int g){
        this();
        age=r;
        name =q;
        place = h;
        id =g;
        System.out.println("2nd parameterized  " +r+" "+q+" "+h+" "+g);
    }

    Constructors(int z, int j, String p){
        this(123,"navya", 5654f);
        age=z;
        id =j;
        name =p;
        System.out.println("3rd parameterized " + z+ " "+ j +" "+p );
    }
 

    

    void display(){
       // System.out.println(age+" "+name+" "+place+" "+id);
       System.out.println("Default dispaly");
    }
    public static void main(String[] args) {
        Constructors x = new Constructors(123,"navya", 5654f);
        Constructors x1 = new Constructors( 324, "fggg", "dgrt",456);
        Constructors x2 = new Constructors( 324, 456 ,"sgg");

        //System.out.println(x.age);
        //System.out.println(x.name);
        x.display();
    }
}
