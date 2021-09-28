package Practices;//Package

public class InnerClass {//Diver class
    static String carBrands;
   private int numBrands;

    void carMethod() {//Car method
        System.out.println("Car method!");
        Cars.CarNames secondClassObj = new Cars.CarNames();//when ever we required ,we can create outerclass instance
        secondClassObj.carMethods(8, 10);//
        Cars.CarsCost thirdClassObj = new Cars.CarsCost();
        thirdClassObj.carSpeed(120);
        new Cars();
        new InnerClass();
       // InnerClass outerObj = new InnerClass();

    }

    class Cars {//Cars class-First inner class


        protected static class CarNames {//proctected Inner nested class-Second inner nested class
            String carBrandName;
           protected int number;

            void carMethods(int numBrand, int number) {
                System.out.println("Enter number of car brands " + numBrand +" "+ "Enter car number " + number);
               // new InnerClass();//accessing InnerClass Constructor
                CarsCost thirdClassObj1 = new CarsCost();

            }
        }

        Cars() {//Constructor
            System.out.println("Constructor");

        }

        private static class CarsCost {//private inner nested class-Third Inner nested class
            int speed;

            void carSpeed(int Speed) {
                System.out.println("Speed " + 110);

            }

        }

    }

    InnerClass() {//Constructor
        System.out.println("Inner class Constructor!");
    }

    public static void main(String[] args) {//main
        InnerClass outerObj = new InnerClass();//Outer class instance
        // Cars innerObj = outerObj.new Cars();//inner class instance-To create inner class instance,we have to create outer class instance first and from that instance we create inner class.
        outerObj.carMethod();//Call carMethods method
        //   InnerClass.Cars.CarNames obj = innerObj.new CarNames();
        //   obj.carMethods(5, 1589);
        //   InnerClass.Cars.CarsCost obj2 = innerObj.new CarsCost();
        //   obj2.carSpeed(120);
    }
}