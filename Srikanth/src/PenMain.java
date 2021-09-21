public class PenMain {
    public static void main(String[] args) {
        Pen p = new Pen();
        System.out.println(p.color);
        System.out.println(p.point);
        System.out.println(p.type);

        Pen.click();
        System.out.println(Pen.clicked);

        Pen.unclick();
        System.out.println(Pen.clicked);

        Pen.twist();
        System.out.println(Pen.twisted);
        p.close();

        HeadPhones.poweron();
        System.out.println(HeadPhones.power);

        p.color();
        System.out.println(p.color);

    }

}
