package practice;

public class NestedClass {
    int i;
    String house;

    private static class InnerClass {

        public static void main(String[] args) {
            NestedClass.InnerClass objInnerClass = new InnerClass();
            objInnerClass.rooms();
            // objInnerClass.House();
        }

        void rooms() {
            System.out.println("This is inner room");
        }
    }

    void House() {
        System.out.println("THis is outer House");
    }

    public static void main(String[] args) {
        NestedClass objNestedClass = new NestedClass();
        objNestedClass.House();
        // objNestedClass.rooms();
    }

}
