package Practices;//Package

public class Interface_marketing implements InterfaceTest {

    public static final float value = (float) 5.3;

    public void valuemethod() {
        System.out.println("ValueMethod");
    }

    @Override
    public int privateMethod() {
        return 10;
    }

    @Override
    public boolean equals() {
        return false;
    }

    void method2() {
        System.out.println("Method2");
    }

    interface forMethod {
        private void forMethod() {
            System.out.println("Private formethod");
        }

    }

    public static class Interface_sales extends Interface_marketing implements forMethod {
        void method() {
            System.out.println("Method");
        }

        @Override
        public void valuemethod() {//methods to Implement
            super.valuemethod();
        }

        @Override
        void method2() {
            super.method2();
        }

        @Override
        public void defaultMethod() {
            super.defaultMethod();
        }

        public void forMethod() {
            System.out.println("ForMethod");
        }
    }

    public void defaultMethod() {//Override default Method- If we get error about in reduce visibility,means its a overridition method.On both inheritance and interface we can over ride the methods.
        System.out.println("Override default Method");//Overrider method will executed,first it will check in its class,then it will check interface
        InterfaceTest.super.defaultMethod();//to call method if more methods with same name.
        //InterfaceDemo.super.defaultMethod();//InterfaceDemo is a class, so we cant access as interface
    }

    static void staticMethod() {
        System.out.println("Hiding Interface static method");
    }

    static void sameName() {
        System.out.println("Hiding sameName Static method");
    }
   /* public void sameName(){
        System.out.println("Override sameName Default method");
    }*/

    public static void main(String[] args) {//main method
        InterfaceTest obj = new InterfaceTest() {//Instance for interface -anonymous way
            @Override
            public void valuemethod() {
                System.out.println("Method Implementation!");
            }

            @Override
            public int privateMethod() {
                return 0;
            }

            @Override
            public boolean equals() {
                return false;
            }
        };

        int marketing = 99;
        Interface_marketing obj2 = new Interface_marketing();
        Interface_sales obj5 = new Interface_sales();
        obj.defaultMethod();
        obj5.forMethod();
        obj5.defaultMethod();
        obj5.method();
        obj5.staticMethod();
        obj.valuemethod();
        obj2.valuemethod();
        obj2.method2();

        System.out.println("Market value :" + (marketing + (float) 5.3));

    }
}
