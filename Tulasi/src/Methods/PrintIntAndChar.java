package Methods;//Package

public class PrintIntAndChar {//Driver class
    void printIntAndChar(int num, char n) {//first method with two parameters
        System.out.println("Enter the value- " + num + "," + "Enter the char- " + n + ".");
    }

    void printIntAndChar(char n, int num) {//second method with two parameters
        System.out.println("Enter the char- " + n + "," + "Enter the value- " + num + ".");
    }

    public static void main(String[] args) {//main method
        PrintIntAndChar myMethodObj = new PrintIntAndChar();//Instance for driver class
        myMethodObj.printIntAndChar(55, 'P');//call first method
        myMethodObj.printIntAndChar('K', 66);//call second method

    }
}
