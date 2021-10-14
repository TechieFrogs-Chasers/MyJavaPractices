//package MethodAssignment.java;
class I {
    int i;

    public void printNum() {
        System.out.println("The value of I:" + i);
    }
}

class j extends I {
    int j;

    public void printNum() {
        System.out.println("The value of J:" + j);
    }
}

public class A {
    public static void main(String[] args) {
        j obj = new j();
        obj.i = 10;
        obj.j = 30;
        obj.printNum();
    }
}
