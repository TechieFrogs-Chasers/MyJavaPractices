package Practices;//Package

interface Interface {//Interface is a blue print of a class
    int num = 200;//public static final int num=200;

    void valuemethod();//public abstract void valuemethod();

}

interface Interface1 {//Interface1
    float i = (float) 1.3;

    float value(float value);
}

interface Interface2 {//Interface2
    int num2 = 66;//public static final int num=66;

    void value1(double value);//public abstract void value();
}


class InterfaceDemo implements Interface, Interface1, Interface2 {//InterfaceDemo implements interface

    @Override
    public void valuemethod() {
        System.out.println(num);
    }

    @Override
    public void value1(double v) {
        System.out.println(num2);
    }

    @Override
    public float value(float value) {
        return (float) 1.5;
    }

    public static void main(String[] args) {//main method
        //interface obj=new interface()--we can't create instance for interface
        System.out.println("Main Interface : " + num + " , " + num2 + " , " + i);
        InterfaceDemo obj1 = new InterfaceDemo();
        obj1.valuemethod();
        obj1.value(1.5F);
        obj1.value(num + 5);
        //obj1.method2();
        obj1.value1(1.3 + num);
    }

}
