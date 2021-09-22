package OOPs;

public class Constructors{
    int age;
    String name;
    int id; 
    String place;

    Constructors(){
        System.out.println("default constructor");

    }


    Constructors(int s,String t){
        age =s;
        name = t;
        System.out.println(" first parameterized");
    }

    Constructors(int r,String q, String h,int g){
        age=r;
        name =q;
        place = h;
        id =g;
        System.out.println("2nd parameterized");
    }

    Constructors(int z, int j, String p){
        age=z;
        id =j;
        name =p;
        System.out.println("3rd parameterized");
    }
 

    

    void display(){
       // System.out.println(age+" "+name+" "+place+" "+id);
    }

    public static void main(String[] args) {
        Constructors x = new Constructors(23,"sindhu");
        //System.out.println(x.age);
        //System.out.println(x.name);
        x.display();
      

    }

   

}