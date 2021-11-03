package Practices;

public class IfElseCondition {
    public static void main(String[] args) {
        int num = 35;
        int num2 = 55;
        if ((num > 40) && (num == 35) || (num2 < num)) {
            System.out.println("number is positive");
        } else if (num == num2) {
            System.out.println("number is negative");
        } else {
            System.out.println("Invalid");
        }
    }
}
