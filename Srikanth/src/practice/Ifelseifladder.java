package practice;

public class Ifelseifladder {
    public static void main(String[] args) {
        int number = 75;
        if (number <= 15) {
            System.out.println("Fail");
        } else if (number <= 40) {
            System.out.println("Close to pass marks, but failed");
        } else if (number <= 50) {
            System.out.println("you have passed the exam");
        } else if (number <= 60) {
            System.out.println("you have acheived C grade");
        } else {
            System.out.println("Didn't take the test.");
        }
    }
}
