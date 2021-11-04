package Practices;


// this is the class defination
// public is - keyword
// class is a keyword
// Humanbeing is a class name
// { this is known as curly brackets - it used to open the class or block of code

public class Humanbeing {

    // variables ---- are nothing but to store the data to use in our application.
    // static is another keyword ---- Tulasi created static variables called nature, behavior, gender
    // id - its non-static variable
    // ; -- semicolon ---- This meaning is end of the line in Java ..
    // String is a data type --- data type to store our data

        static String nature,behaviour,gender ;
         static int id=10;

        // she created static block of code
        static {
            // assigned the values to the variables
            // assigned using = operator ....
            nature ="Helpful";
            behaviour="good";
        }

        // this is a main method in Java which is must to run our simple programs....
    // this never change.
    // public status void main( parenthesis )
    public static void main(String[] args) {
        // classname obj = new Classname();
        Humanbeing human = new Humanbeing();
        human.descriptionPerson();
    }
    // method in the class
    // method always follows camel case naming convention --- helloIndia, greatJob, myNameisVJ.
    public void descriptionPerson(){
        System.out.println("He is" + " "+ behaviour+" " + "and "+ nature + " " + "person!" + " and his Id no:" + id);

    }


}
