package Arrays;

public class Assignment_3 {
    public static void main(String[] args) {
        int[] number = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int leftRotate = 5;
        System.out.println("Numbers before rotation: ");
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i]+" ");
        }
        for (int j = 0; j < leftRotate; j++) {
            int k, num_first;
            num_first = number[0];
            for (k = 0; k < number.length - 1; k++) {
                number[k] = number[k + 1];
            }
            number[k] = num_first;
        }
        System.out.println();
        System.out.println("Numbers after rotation: ");
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i]+ " ");
        }
    }
}

