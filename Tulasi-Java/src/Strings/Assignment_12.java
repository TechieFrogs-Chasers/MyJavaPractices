package Strings;//Package

public class Assignment_12 {//Driver class

    public static void main(String[] args) {//main method
        StringBuffer dataToClear=new StringBuffer("Data to clear using delete() method from stringbuffer in java");//StringBuffer(String Str) constructor
        System.out.println("Length of String = " + dataToClear.length());//length() method
        dataToClear.delete(0,61);//used delete() method
        System.out.println("String length after delete() method = " +dataToClear.length());//After using delete() method

    }
}
