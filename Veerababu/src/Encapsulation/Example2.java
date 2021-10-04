package Encapsulation;

public class Example2 {
    private int x = 10;
    private int y =15;
    private String name = "Hello World";
    private char c = 'A';

    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
        System.out.println("After Set"+" "+ x);
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
        System.out.println("After Set"+" "+ y);
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
        System.out.println("After Set"+" "+ name);
    }
    public char getC() {
        return c;
    }
    public void setC(char c) {
        this.c = c;
        System.out.println("After Set"+" "+ c);
    }
    public static void main(String[] args) {
        Example2 example2 = new Example2();
        System.out.println("First Integer Value"+" "+example2.getX());
        example2.setX(18);
    }
       
}
