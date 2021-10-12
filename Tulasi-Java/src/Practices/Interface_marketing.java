package Practices;

public class Interface_marketing implements Interface {
    public static final float value = (float) 5.3;

    public void valuemethod() {
        System.out.println("ValueMethod");
    }

    void method2() {
        System.out.println("method2");
    }

    interface forMethod {
        void forMethod();


    }

    public static class Interface_sales extends Interface_marketing implements forMethod {
        void method() {
            System.out.println("method");
        }


        @Override
        public void forMethod() {
            System.out.println("forMethod");
        }
    }

    public void defaultMethod() {//Override default Method- If we get error about in reduce visibility,means its a overridition method.On both inheritance and interface we can over ride the methods.
        System.out.println("Override default Method ");//Overrider method will executed,first it will check in its class,then it will check interface
        Interface.super.defaultMethod();//to call method if more methods with same name.
        //InterfaceDemo.super.defaultMethod();//this is a class so we cant access in interface
    }

    public static void main(String[] args) {//main method
        Interface obj = new Interface() {//Instance for interface -anonymous way
            @Override
            public void valuemethod() {
                System.out.println("Method Implementation ");
            }
        };
        int marketing = 99;
        Interface_marketing obj2 = new Interface_marketing();
        Interface_sales obj5 = new Interface_sales();
        obj5.forMethod();
        obj5.defaultMethod();
        obj5.method();
        obj.valuemethod();
        obj2.valuemethod();
        obj2.method2();

        System.out.println("Market value : " + (marketing + (float) 5.3));
        // obj.super.defaultMethod();


    }
}
