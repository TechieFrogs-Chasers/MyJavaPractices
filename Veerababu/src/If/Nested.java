package If;

public class Nested{
public static void main(String[] args) {
    int i=10;
    int j =15;
    if((i+j)==25){
        System.out.println("25");
        if((i+j)<(i*j)){
            System.out.println("10");
        }
        else if((i/j)==10){
            System.out.println("12");
        }
        else{
            System.out.println("5");
        }
    }
    else if((i*j)==20){
        System.out.println("2");
    }
    else{
        System.out.println("8");
    }
        
    }
}