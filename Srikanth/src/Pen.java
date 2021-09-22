public class Pen {

    String type = "gel";
    String color = "blue";
    int point = 10;
    // An object has attributes.

    static boolean twisted = false;
    boolean clicked = false;
    // by creating a static variable we can call it by class name,
    // instead of initializing.

    // for non static variable we need to create object to call the variables.
    String colored = "";

    void click() {
        clicked = true;
    }
    // Object has actions.

    void unclick() {
        clicked = false;
    }
    // Object has actions.

    static void twist() {
        twisted = true;
    }

    static void untwist() {
        twisted = false;
    }

    void close() {
    }

    public void color() {
        System.out.println("blue.");
    }

}
