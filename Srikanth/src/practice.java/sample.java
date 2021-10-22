//package practice;

public class sample {
    public static void main(String[] args) {
        String behaviour = "good person";
        String gender = "He is";
        String age = " 28";
        int i = 25;
        int mat = 19;
        String status = "single";
        System.out.println(gender + " " + behaviour + "," + "he is still" + age + "waiting to get married,but still "
                + status + ".");
        System.out.println(gender + " to young, when, " + gender + " " + i);

        if (mat <= 18) {
            System.out.println("this is printing");
        } else
            mat++;
        {
            System.out.println("this is not printing");
        }
        {
            System.out.println(" this is also printing");
        }

    }
}