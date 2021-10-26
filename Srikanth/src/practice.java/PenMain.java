package practice;

public class PenMain {
    public static void main(String[] args) {
        Pen p = new Pen();
        System.out.println(p.color);
        System.out.println(p.point);
        System.out.println(p.type);

        p.click();
        System.out.println(p.clicked);

        p.unclick();
        System.out.println(p.clicked);

        Pen.twist();
        System.out.println(Pen.twisted);

        HeadPhones.poweron();
        System.out.println(HeadPhones.power);

        p.color();
        System.out.println(p.color);

    }

}
