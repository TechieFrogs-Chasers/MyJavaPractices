package ExceptionHandling;

public class Assignment_16 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Assignment_4 obj=new Assignment_4(6,8);
        System.out.println("Assignment obj before clone :");
        System.out.println(obj);
        try {
            System.out.println("Assignment obj After clone :");
            Assignment_4 assignmentCopy=(Assignment_4) obj.clone();
            System.out.println(assignmentCopy);
        }catch (CloneNotSupportedException ce){
            ce.printStackTrace();
        }catch (Exception e){
            e.getMessage();
        }finally {
            System.out.println("Final statement!");
        }
    }
}
