package Practices;

public class StaticClass {//Driver class
    //variables
    static String name;//static variable
    private static int number;//static variable
    private static byte value;
    char letter = 'L';//In static class non static data types are not able to access.
    private short num;

    static {//Static initializaton block
        name = "Lenovo";
    }

    private class Encapsulation {

        public static int getNumber() {//Encapulation Getter-Accessor-Give read-only access
            return number;
        }

        public static void setNumber(int number) {//Encapulation Setter-Modifier or Mutator -Give to modify value access
            StaticClass.number = number;//if we use static insetter ,we have to use driver class
        }

        public byte getValue() {//Encapulation Getter-Accessor-Give read-only access
            return value;
        }

        public void setValue(byte value) {//Encapulation Setter-Modifier or Mutator -Give to modify value access
            StaticClass.value = value;
        }

    }

    public static void main(String args[]) {//main method
        Innerclass.msg();
        StaticClass.Innerclass.Details.diplayDetails();
        Innerclass nonStaticObj = new Innerclass();
        StaticClass setterObj = new StaticClass();//Instance for setter
        StaticClass.Encapsulation obj = setterObj.new Encapsulation();//instance for inner class (encapsulation)
        obj.getValue();//access getter value
        obj.setValue((byte) 55);//access setter value
        System.out.println("The number: " + 55 + " ," + "The byte value: " + 12);
        System.out.println(obj.getValue());
    }

    void nonStaticMethod() {//Non static method
        System.out.println("Enter char :" + letter);//we can access the non static data type
    }

    static class Innerclass {//static inner class---first static class

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
            static String location;//static variable

            static {//static initialization block
                location = "Atlanta";
            }

            int num;

            static void diplayDetails() {//static method
                System.out.println("Location: " + location + "The number of monitors : " + number + " Name :" + name);

                class NumOfLocations {//-Inner or non-static or member class inside static class and inside a method(Its a local inner class,this we not able to access outside this method)-Third static class
                    static Byte branches;//static variable & Wapper datatype

                    static {//static initialization block
                        branches = 5;
                        System.out.println("In static block");
                    }

                    int numOfLocations = 15;

                    NumOfLocations() {//Constructor
                        System.out.println("Name :" + name + " , " + "Location :" + location + " , " + "The number of monitors : " + number);

                    }
                }
                NumOfLocations noObj = new NumOfLocations();//Instance must create in end of the method inner class only.
                System.out.println(noObj.numOfLocations + NumOfLocations.branches);
            }
        }
    }
}
