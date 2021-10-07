//package MethodAssignment;

public class IntChar {
    public void display(int i, char c) {
        System.out.println("Int i:" + i + "Char c:" + c);
    }

    public void display(char c, int i) {
        System.out.println("char c:" + c + "Int i:" + i);
    }

    public static void main(String[] args) {
        IntChar objChar = new IntChar();
        objChar.display(9, 'i');
        objChar.display('c', 0);

    }
}
