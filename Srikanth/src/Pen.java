public class Pen {

    String type = "gel";
    String color = "blue";
    int point = 10;
    // An object has attributes.

    static boolean clicked, twisted = false; // by creating a static variable we can call it by class name,
    // instead of initializing.
    static String colored = "";

    public static void click() {
        clicked = true;
    }
    // Object has actions.

    public static void unclick() {
        clicked = false;
    }
    // Object has actions.

    static void twist() {
        twisted = true;
    }

    static void untwist() {
        twisted = false;
    }

    public void close() {
    }

    public void color() {
    }

}
