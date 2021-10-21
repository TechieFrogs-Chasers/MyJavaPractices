package StaticAndInstance;

public class SecondTry {
    public static void main(String[] args) {
        Bird b1 = new Bird("Parrot");
        Bird b2 = new Bird("Sparrow");
        Bird b3 = new Bird("Pigeon");
        b1.fly();
        b1.fly();
        b1.fly();
        System.out.println(b1.getNumber());
    

    }
}
class Bird{
    private String name;
    private   int number = 0;
    Bird(String name)
    {
        this.name = name;
        //number++;
    }
  
    public void fly()
    {
        number++;
        System.out.println("This bird flies " + number);
    }
  
    public int getNumber()
    {
        return number;
    }   

}

