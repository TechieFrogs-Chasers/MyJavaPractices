

public class Nested {
    public static void main(String[] args) {
        int a=15;
        int b=20;
        if(a<b){
            System.out.println("a is equal to b");
            if((a+b)<(a/b) | (a+b) < (a*b))
                System.out.println("a is greater than b");
            else if(a>=b)
                System.out.println("a is less thank or equal to b");
            else if(a==b)
                System.out.println("a is not equal to b");
            else
                System.out.println("Result");
        }

    }
}
