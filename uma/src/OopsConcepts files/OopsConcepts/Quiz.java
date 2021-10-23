package OopsConcepts;

public class Quiz{
    public static void msg(){
        System.out.println("hello");
    }
}
class  One extends Quiz{
    public static void msg(){
        System.out.println("hi");
    }
}
class Test {
    public static void main(String[] args) {
       // Quiz obj = new One();
       // obj.msg();
    }
}