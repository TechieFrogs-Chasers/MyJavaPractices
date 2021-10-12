package Practices;

public class Interface_marketing implements Interface {
    public static final float value = (float) 5.3;

    public void valuemethod() {
        System.out.println("ValueMethod");
    }
    void method2() {
        System.out.println("method2");
    }

    public  class Interface_sales extends Interface_marketing {
        void method() {
            System.out.println("method");
        }

    }

    public static void main(String[] args) {//main method
        Interface obj = new Interface() {//Instance for interface -anonymous way
            @Override
            public void valuemethod() {
                System.out.println("Method Implementation ");
            }
        };
        int marketing = 99;
        Interface_marketing obj2=new Interface_marketing() ;
        obj.valuemethod();
        obj2.valuemethod();
        obj2.method2();
        System.out.println("Market value : " + (marketing + (float) 5.3));
    }
}
