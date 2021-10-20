package practice;

import practice.NestedClass.InnerClass.SubInnerClass;

public class NestedClass {
    int i;
    String house;

    class InnerClass {

        static class Inner {

        }

        class SubInnerClass {

            static int j;

            void kitchen() {
                System.out.println("This is kitchen" + j);
            }

        }

        { // intialization block
          // NestedClass.InnerClass objInnerClass = new InnerClass();
          // objInnerClass.rooms();
          // objInnerClass.masterBedRoom();

            // NestedClass objClass= new NestedClass();
            House();
            rooms();
            masterBedRoom();
            // NestedClass.InnerClass.SubInnerClass object1 = new NestedClass().new
            // InnerClass().new SubInnerClass();
            // object1.kitchen();

            System.out.println("THis is inner main method");
        }

        void masterBedRoom() {
            System.out.println("This is inner masterbed room:");
        }

        void rooms() {
            System.out.println("This is inner room");
        }
    }

    void House() {
        System.out.println("THis is outer House");
    }

    NestedClass() {
        System.out.println("This is a constructor");
    }

    static void house() {
        System.out.println("this is house");
    }

    public static void main(String[] args) {
        NestedClass objNestedClass = new NestedClass();
        objNestedClass.House();
        InnerClass objClass = objNestedClass.new InnerClass();
        objClass.rooms();
        objClass.masterBedRoom();
        SubInnerClass object1 = objClass.new SubInnerClass();
        object1.kitchen();
        System.out.println("hi");

    }

}
