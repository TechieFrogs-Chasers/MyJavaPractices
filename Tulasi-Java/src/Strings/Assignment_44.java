package Strings;//Package

public class Assignment_44 {//Driver class

    public static void main(String[] args) {//main method
        String name = "Java ";
        String swap = "Developers";
        name = name + swap;
        System.out.println("Before swapping : " + name );
        swap = name.substring(0, (name.length() - swap.length()));
        name = name.substring(swap.length());
        System.out.println("After swapping : " + name + " " + swap);
    }
}
