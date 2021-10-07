//package MethodAssignment;

public class PrintNumber {

    void printn(float l) {
        System.out.println("Float value: " + l);
    }

    void printn(int i) {
        System.out.println("Int value: " + i);
    }

    void printn(String s) {
        System.out.println("String value:" + s);
    }

    void printn(int i, String h) {
        System.out.println("Int and String values: " + i + " " + h);
    }

    public static void main(String[] args) {
        PrintNumber Obj = new PrintNumber();
        Obj.printn("Srikanth");
        Obj.printn(4);
        Obj.printn(3);
    }
}
