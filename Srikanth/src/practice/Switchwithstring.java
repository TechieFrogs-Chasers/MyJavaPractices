package practice;

public class Switchwithstring {
    public static void main(String[] args) {
        String LevelOfJavaString = " ";
        int level = 0;
        switch (LevelOfJavaString) {
            case "beginner":
                level = 1;
                break;
            case "intermediate":
                level = 2;
                break;
            case "Expert":
                level = 3;
                break;
            default:
                level = 0;
                break;
        }
        System.out.println("your level is:" + level);
    }
}
