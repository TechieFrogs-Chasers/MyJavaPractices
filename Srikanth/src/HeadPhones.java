public class HeadPhones {

    String color = "red/blue";
    String charge = "usb c";
    String[] controls = { "power", "vloume", "skip" };

    static boolean power = false;
    static int volume = 0;

    public static void poweron() {
        power = true;
    }

    public static void poweroff() {
        power = false;
        System.out.println();
    }

    public static class Constructor {
        Constructor() {
            System.out.println(" Its driver class.");
        }
    }

    public void charge() {
        System.out.println("Usb-c");
    }

    public void color() {
        System.out.println("red/blue");
    }

}

class information {

    void companyname() {
        System.out.println("Enter brand name: ");
    }

    void price() {
        System.out.println("Enter the value: ");
    }

    information() {
        System.out.println("This is a default constructor.");
    }

    public static void main(String[] args) {
        HeadPhones myObjHeadPhones = new HeadPhones();
        myObjHeadPhones.charge(); // non-static
        myObjHeadPhones.color(); // non-static
        Pen myObjectPen = new Pen();
        Pen.twist(); // this is a static variable
        System.out.println(Pen.twisted);
        myObjectPen.color(); // this is non-static variable
    }
}
