package Interfaces;

interface StaticAndFinal {
    public static final int num = 555;//interface will allow only public,static ,final
    static float num2 = (float) 1.1;
    final char charletter = 'K';
    byte num3 = 5;
}
class Implicitly implements StaticAndFinal{
    private int value=88;
    protected byte value1=4;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public byte getValue1() {
        return value1;
    }

    public void setValue1(byte vlaue1) {
        this.value1 = vlaue1;
    }
}
public class ImplicitlyStaticAndFinal_4{
    public static void main(String[] args) {
        Implicitly obj=new Implicitly();
        System.out.println(obj.num+","+obj.num2+","+obj.charletter+ " ,"+obj.num3);
        System.out.println(obj.getValue()+ " ,"+ obj.getValue1());

    }
}
