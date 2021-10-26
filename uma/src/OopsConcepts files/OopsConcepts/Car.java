package OopsConcepts;

public interface Car {

    void drive();
    
}
class BMW1 implements Car{

    Car ref;
    public void drive(){

        System.out.println("BMW");
    }

    BMW1(Car ref){
        
        System.out.println("car ref in bmw construct");

    }
}
class AUDI1 implements Car{

    public void drive(){

    }
}
class HONDA implements Car{
    public void drive(){

    }
}
class Dealer{
    public static void main(String[] args) {
        
    }
}