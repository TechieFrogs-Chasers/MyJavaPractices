package Practices;//Package

public class InnerClass {//Diver class
    static String carBrands;
    private int numBrand;

    void carMethod() {//Carmethod-access all below class here
        System.out.println("Car method!");
        Cars.CarNames secondClassObj = new Cars.CarNames();//when ever we required ,we can create outerclass instance
        secondClassObj.carMethods(8, 10);
        Cars.CarsCost thirdClassObj = new Cars.CarsCost();
        thirdClassObj.carSpeed(120);
        Cars firstClassObj = new Cars();
        firstClassObj.CarShowrooms();
        new Cars();
        new InnerClass();
    }

    class Cars {//Cars class-First inner class

           /*public static void main(String[] args) {//second main method
             System.out.println("Enter number of car brands ");
             InnerClass outerObj = new InnerClass();
             outerObj.carMethod();
           }*/
        void CarShowrooms() {//method
            final class CarAvailble {//method local class--In method local class we can give only final and abstract
                static final int numAvaliable = 5;
                String nameOfShowroom;
                Integer price;//Wapper datatypes

                void carAvailbles(String nam, Integer prices) {//method
                    nameOfShowroom = nam;
                    price = prices;

                    System.out.println("Enter number of cars available: " + numAvaliable + "," + "Enter name of the showeroom: " + nameOfShowroom + "," + "Enter price: " + price);
                }

            }
            new CarAvailble().carAvailbles("Honda showroom", 78000);//instance
        }

        protected static class CarNames {//proctected Inner nested class-Second inner nested class--Cars$CarNames.class
            static String carBrandName;
            protected int number;

            void carMethods(int numBrand, int number) {
                System.out.println("Enter number of car brands " + numBrand + " " + "Enter car number " + number);
                 new InnerClass();//accessing InnerClass Constructor
            }
        }

        Cars() {//Constructor
            System.out.println("Constructor");
        }

        private static class CarsCost {//private inner nested class-Third Inner nested class
            int speed;

            void carSpeed(int Speed)
            {
                System.out.println("Speed " + 110);
            }
        }
    }

    InnerClass() {//Constructor
        System.out.println("Inner class Constructor!");
    }

    public static void main(String[] args) {//main
        InnerClass outerObj = new InnerClass();//Outer class instance
        //  Cars innerObj = outerObj.new Cars();//Inner class instance-To create inner class instance,we have to create outer class instance first and from that instance we create inner class.
        outerObj.carMethod();//Call carMethods method
         //AnonymousClass=An inner class without a name only a single object is created from one the object may have "extras"or "changes" for that no need to create a separate innerclass,when it only need it once.
        AnonymousClass anonymousObj = new AnonymousClass() {//all anonymous inner class must ended with ;. because, they are statements-Statements can override.
            public void systemCost() {//over riding
                System.out.println("Cost of the music system is not expensive! ");
            }
        };
        AnonymousClass anonymousObj2 = new AnonymousClass();//to access another anonymous class statement
        anonymousObj.systemCost();
        anonymousObj2.systemCost();
    }
}
