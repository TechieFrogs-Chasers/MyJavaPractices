package Practices;

final class Instancevar {
    //instance variable
    int engmarks ;
    int mathmarks ;
    int technologymarks ;
    final static int total = 300;
    public static void main(String... args) {
        Instancevar obj1 = new Instancevar();
        obj1.engmarks = 88;
        obj1.mathmarks = 90;
        obj1.technologymarks = 81;
        Instancevar obj2 = new Instancevar();
        obj2.engmarks = 90;
        obj2.mathmarks = 77;
        obj2.technologymarks = 88;
        int sum1 = obj1.engmarks + obj1.mathmarks + obj1.technologymarks;
        int sum2 = obj2.engmarks + obj2.mathmarks + obj2.technologymarks;
        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(total - sum1);
        System.out.println(total - sum2);

    }
}
