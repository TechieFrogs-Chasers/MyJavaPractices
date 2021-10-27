package Strings;//Package

public class Assignment_43 {//Driver class

    public static void main(String[] args) {//main method
        String name = " Assignment ";
        System.out.println("Length of the string:" +name.length());
        System.out.println("Before separation of the individual character from a string :" +name);
        for (int i = 0; i < name.length(); i++) {
            System.out.print(name.charAt(i)+ " ");
        }
    }
}
