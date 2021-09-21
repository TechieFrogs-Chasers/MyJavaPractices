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
    }

}
