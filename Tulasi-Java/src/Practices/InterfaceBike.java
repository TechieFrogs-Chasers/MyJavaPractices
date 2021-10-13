package Practices;

interface Bike {//Interface
    int bikes = 15;

    static void bike(int bikes) {
        System.out.println("Static for bike");
    }

    default int cost() {//default interface int
        int cost = 99;
        return cost();
    }
        class twoWheeler implements Bike{//nested class in Interface

            void twoTires() {//method in nested class
                System.out.println("No.of tires");
                interface CostOfTires {//Interface in nested class method----In interface there should not have local classes.And local members can't be static.

                    public static void main(String[] args) {//Main method in interface
                        twoWheeler objTwoWheeler = new twoWheeler();
                        objTwoWheeler.twoTires();
                        Bike.bike(15);

                    }
                }
            }
        }
    }


class Showroom implements Bike {
    @Override
    public int cost() {
        return Bike.super.cost();
    }
}

public class InterfaceBike {
    public static void main(String[] args) {//main method
        Showroom objShowroom = new Showroom();
        objShowroom.cost();
    }
}
