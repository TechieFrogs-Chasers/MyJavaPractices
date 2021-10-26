package Practices;//package


import java.util.Scanner;//import scanner

interface States {//interface

    default void defaultstatesInterface()//interface default method
    {
        System.out.println("Default method");
    }

     void noOfStates(int i);//abstract method in interface with int parameter



    class Innerclass {//innerclass in interface

        void Innermethod() {//method in innerclass interface
            System.out.println("InnerMethod");
        }
    }

    public static void main(String[] args) {
        Scanner sc2=new Scanner(System.in);
       // i.sc2.nextInt();
    }
}

interface countys {
    default void defaultStateMethod() {//default method in interface
        System.out.println("defaultStateMethod");

    }

    static void staticStateMethod() {//static method in interface
        System.out.println("staticStateMethod");
    }

}

class differentStates implements States, countys {//implement interface States & countys in class

    static void staticStateMethod() {//static method in interface
        System.out.println("staticStateMethod");
    }

    @Override
    public void defaultstatesInterface() {
        States.super.defaultstatesInterface();
    }//Override of default interface method from states interface

    @Override//
    public void defaultStateMethod() {
        countys.super.defaultStateMethod();
    }//Override of default interface method from countys interface

    @Override
    public void noOfStates(int i) {//Override of method with int parameter in interface from states interface
        //System.out.println(i=50);
       // noOfStates(sco.nextInt());//sco.nextInt();
    }


    abstract class onStates {

        public static void main(String[] args) {

        }
        private int noOfStates;
        String names;


        public int getNoOfStates() {
            return noOfStates;
        }

        public void setNoOfStates(int noOfStates) {
            this.noOfStates = noOfStates;
        }

        public String getNames() {
            return names;
        }

        public void setNames(String names) {
            this.names = names;
        }
    }
}

    public class VarToInterfaces {//Driver class
        String stateNames;

        public static void main(String[] args) {//main method
            Scanner scannerObj = new Scanner(System.in);//Scanner
            differentStates classObj = new differentStates();//static class instance
            classObj.defaultStateMethod();
            classObj.staticStateMethod();
            classObj.defaultstatesInterface();

            scannerObj.close();

        }
    }
