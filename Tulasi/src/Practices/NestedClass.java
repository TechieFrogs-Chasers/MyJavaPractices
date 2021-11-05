package Practices;

public class NestedClass {
    int i;
    String house;

    private static class InnerClass {

        public static void main(String[] args) {
            NestedClass obj=new NestedClass();
            NestedClass.InnerClass objInnerClass = new InnerClass();

            objInnerClass.rooms();
            obj.House();
        }

        void rooms() {
            System.out.println("This is inner room");
        }
    }

    void House() {
        System.out.println("This is outer House");
    }

    public static void main(String[] args) {
        NestedClass objNestedClass = new NestedClass();
        NestedClass.InnerClass objInnerClass = new InnerClass();
        objNestedClass.House();
        objInnerClass.rooms();
    }

}

