package Arrays;

public class Assignment_13 {
    public static void main(String[] args) {
        int[] number={1,2,3,4,5,6,7,8,9};
        int rightRotate=5;
        System.out.println("Numbers before rotation: ");
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i]+" ");
        }
        for (int j=0;j<rightRotate;j++){
            int k,num_last = 0;
            num_last=number[number.length-1];
            for (k = number.length - 1;k>0; k--) {
                number[k] = number[k - 1];
            }
            number[0] = num_last;
        }
        System.out.println();
        System.out.println("Numbers after rotation: ");
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i]+ " ");
        }
    }
}
