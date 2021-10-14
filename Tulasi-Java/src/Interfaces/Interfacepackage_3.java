package Interfaces;

interface Interfacepackage_3 {
    void method1();


    void method2();


    void method3();

}

class Interfacepackage implements Interface1.Interfacepackage_3 {//Assignment -6

    public void method1() {
        System.out.println("Method-1");
    }


    public void method2() {
        System.out.println("Method-2");
    }


    public void method3() {
        System.out.println("Method-3");
    }

    public static void main(String[] args) {
        Interfacepackage obj = new Interfacepackage();
        obj.method1();
        obj.method2();
        obj.method3();
    }
}
