class Car{
    int size;
    String Brand;

    void Speed(){
        System.out.println("Economy Speed");
    }
    void Road(){
        System.out.println("National Highway");
    }
}



public class Constructors{
    int s;
    void display(){
        System.out.println("Do Practice");
    }
    public static void main(String[] args) {
        Constructors s = new Constructors();
        Constructors s1 = new Constructors();
        s.display();
        System.out.println(s.s);
       Car c = new Car();
       c.Road();
       c.Speed();
      System.out.println(c.size);

    }
}