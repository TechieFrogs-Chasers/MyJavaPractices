package practice;

public class codegympractice {
    static int a, b;

    public static void main(String[] args) {
        a = 5;
        b = 7;
        int sum = a + b;
        int product = a * b;
        System.out.println(sum);
        System.out.println(product);

        codegympractice kitty = new codegympractice();
        codegympractice pinky = new codegympractice();
        kitty.cat();
        pinky.cat();
        kitty = pinky;

        print4("I like to move it,we like to move it move it.");

    }

    public static void print4(String s) {
        System.out.println(s);
    }

    void cat() {
        System.out.println("this is a construtor");
    }

    class student4 {
        String name;
        int age;

        {
            student4 jen = new student4();
            jen.name = "jen";
            jen.age = 30;
            System.out.println("age is: " + age + "Name is: " + name);

        }
    }

}
