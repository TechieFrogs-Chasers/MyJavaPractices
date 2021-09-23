import java.util.Scanner;

public class sandglass {

    public static void main(String args[]) {
        // taking variable for loop iteration and row .
        int row, r, c;
        // creating object
        Scanner s = new Scanner(System.in);
        // entering the number of row
        System.out.print("Enter rows : ");
        row = s.nextInt();
        // first outer for loop for printing upper side
        for (r = 0; r <= row - 1; r++) {
            // printing spaces
            for (c = 0; c < r; c++)
                System.out.print(" ");
            // printing stars
            for (c = r; c <= row - 1; c++)
                System.out.print("* ");
            // taking to the new line
            System.out.println();
            s.close();
        }

        // second for loop for printing lowerside
        for (r = row - 1; r >= 0; r--) {
            // printing spaces
            for (c = 0; c < r; c++)
                System.out.print(" ");
            // printing stars
            for (c = r; c <= row - 1; c++)
                System.out.print("* ");
            // taking to the new line
            System.out.println();
        }
    }
}
