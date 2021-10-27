package Strings;//Package

public class Assignment_13 {//Driver class

    public static void main(String[] args) {//main method
        StringBuffer data=new StringBuffer("This is a setlength method in string buffer ");//StringBuffer(String Str) constructor
        System.out.println("Length of String = " + data.length());//used Length() method
        data.setLength(0);//Used setLength() method-It will delete all strings,which number we mention in setLength().
        System.out.println("String length after setLength() method = " + data.length());

    }
}
