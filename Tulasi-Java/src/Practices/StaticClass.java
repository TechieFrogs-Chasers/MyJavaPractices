package Practices;

public class StaticClass {//Driver class
    static int number = 30;//static datatypes
    static String name;
    char letter = 'L';//In static class non static data types are not able to access.

    static {//Static variable
        name = "Lenovo";
    }

    void nonStaticMethod() {
        System.out.println("Enter char :" + letter);//we can access the non static data type
    }

    static class Innerclass {//Static inner class-first static class

        static void msg() {//static method
            StaticClass nonStaticMethodObj = new StaticClass();//Instance for non static method in static method
            System.out.println("The number of monitors : " + number + " Name :" + name + nonStaticMethodObj.letter);

        }

        public static void main(String[] args) {//Second main method
            StaticClass nonStaticMethodObj = new StaticClass();
            System.out.println(nonStaticMethodObj.letter);
            Details staticClassObj = new Details();
            staticClassObj.diplayDetails();
            Innerclass.Details obj = new Innerclass.Details();
            System.out.println(obj.num);
            Details.diplayDetails();
        }

        static class Details {//Static class-in a static class-Second static class
            int num;
            static String location;//static variable
             static {//static initialization block
                 location="Atlanta";
             }
            static void diplayDetails() {
                System.out.println("Location: " + location + "The number of monitors : " + number + " Name :" + name);

                class NumOfLocations {//-Inner or non-static or member class in side static class and in side a method(Its a local inner class,this we not able to access outside this method)-Third static class
                    int numOfLocations = 15;
                    static Byte branches ;//static variable & Wapper datatype
                    static  {//static initialization block
                       branches=5;
                        System.out.println("In static block");
                    }
                    NumOfLocations() {//Constructor
                        System.out.println("Name :" + name +" , "+ "Location :" + location +" , "+ "The number of monitors : " + number);

                    }
                }
                NumOfLocations noObj = new NumOfLocations();
                System.out.println(noObj.numOfLocations +NumOfLocations.branches);
            }
        }
    }

    public static void main(String args[]) {//main method
        Innerclass.msg();
        StaticClass.Innerclass.Details.diplayDetails();
        Innerclass nonStaticObj = new Innerclass();

    }
}
