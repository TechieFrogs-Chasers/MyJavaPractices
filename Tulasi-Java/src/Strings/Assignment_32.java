package Strings;//Package

public class Assignment_32 {//Driver class

    public static void main(String[] args) {//main method
        String character = new String("Assignment-32 is about specific character by using replace() method!");
        char ch = '-';
        character = character.replace(' ', ch);//used replace() method
        System.out.println("After using specific character : " + character);
    }
}
