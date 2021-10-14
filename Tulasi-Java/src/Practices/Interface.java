package Practices;//Package

interface InterfaceTest {//Interface is a blue print of a class
    int num = 200;//public static final int num=200;


    void valuemethod();//public abstract void valuemethod();//functional interface
     int privateMethod();//object class method

    private String data() {
        return null;
    }

    boolean equals();//functional interface method

    public static void main(String[] args) {

    }
    default void defaultMethod() {//default method uses from Java 8
        System.out.println("Interface Default Method");
    }

    static void staticMethod() {//static method uses from Java 8
        System.out.println("Interface Static Method");
    }

    static void sameName() {
        System.out.println("Static method");
    }

    class OverrideMethod implements InterfaceTest,Interface1{//Overriding the default method ,when we extending other interfacen in own interface.
        @Override
        public void valuemethod() {

        }

        @Override
      public int privateMethod() {
            return 0;
        }

        @Override
        public boolean equals() {
            return false;
        }

        @Override
        public void defaultMethod() {
            InterfaceTest.super.defaultMethod();
        }
    }
}

interface Interface1 {//Interface1
    float i = (float) 1.3;

    static float value(float value) {
        return 0;
    }

    default void sameName() {
        System.out.println("Default method");
    }
   /* static void sameName(){
        System.out.println("Static method");
    }*/
}

interface Interface2 {//Interface2
    int num2 = 66;//public static final int num=66;

    void value1(double value);//public abstract void value();

    public static void main(String[] args) {//main method in interface2
        System.out.println(Interface2.num2);
        System.out.println(Interface1.i);
        System.out.println(InterfaceTest.num);

    }
}

class InterfaceDemo implements InterfaceTest, Interface1, Interface2 {//InterfaceDemo implements interface,Interface1,Interface2

    @Override
    public void valuemethod() {
        System.out.println(num);
    }

    @Override
    public int privateMethod() {
        return 0;
    }

    @Override
    public boolean equals() {
        return false;
    }

    @Override
    public void value1(double v) {
        System.out.println(num2);
    }


    public float value(float value) {
        return (float) 1.5;
    }

    public void defaultMethod() {//Override default Method- If we get error about in reduce visibility,means its a overridition method.On both inheritance and interface we can over ride the methods.
        System.out.println("Override default Method in Interface");//Overrider method will executed,first it will check in its class,then it will check interface.we need to override default method in child class ,its manidatory.

    }

    interface innerInterface {//nested interface

        class nestedClasss {//nested inner class in interface

            void nestedMethod() {//nested method
                class methodInnerClass {//method innerclass

                    void methodInnerclass() {//method in- method innerclass

                    }
                }

            }
        }
    }

    static class Inner implements innerInterface {
        void innerImplementationMethod() {
            System.out.println("InnerImplementationMethod!");

        }
    }

    public static void main(String[] args) {//main method
        //interface obj=new interface()--we can't create instance for interface
        System.out.println("Main Interface : " + num + " , " + num2 + " , " + i);
        InterfaceDemo obj1 = new InterfaceDemo();
        innerInterface.nestedClasss obj4 = new innerInterface.nestedClasss();
        //innerInterface.nestedClasss.methodInnerClass objInnerclass=new  innerInterface.nestedClasss.methodInnerClass();
        obj1.valuemethod();
        System.out.println(InterfaceTest.num);
        System.out.println(Interface1.i);
        System.out.println(Interface2.num2);
        obj4.nestedMethod();
        obj1.defaultMethod();
        obj1.sameName();//call sameName default method
        //obj4.innerImplementationMethod();

    }

}
