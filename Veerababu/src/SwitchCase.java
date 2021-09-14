public class SwitchCase {
    public static void main(String[] args) {
        int i =10;

        int k= switch(i) {
            case 10:
                System.out.println("Print I value");
                yield 105;
            case 50:
                System.out.println("print if i is correct");
                yield 25;
            case 100:
                System.out.println(i);
                yield 30;
            default:
                System.out.println("Hi");
                yield 15;
        };
        System.out.println(k);
    }
}
