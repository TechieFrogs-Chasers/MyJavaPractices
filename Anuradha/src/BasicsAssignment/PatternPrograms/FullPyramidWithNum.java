package BasicsAssignment.PatternPrograms;
import java.util.*;
class FullPyramidWithNum{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter number of lines you want");
        int n;
        do {
            System.out.println("enter  number of rows : ");
            while (!obj.hasNextInt()) {
                System.out.println("This is not a number.Please Enter Positive Number: ");
                obj.next();
            }
            n = obj.nextInt();
        } while (n <= 0);

        for(int i = 1 ; i <= n ;i++)
        {
            for (int j = i; j<=n; j++){

                System.out.print("  ");
            }
            for (int j = 1; j<=(2*i)-1; j++){

                System.out.print(i+j+" ");
            }
            System.out.println("");
        }
        obj.close();
    }
}