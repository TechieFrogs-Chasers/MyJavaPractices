package Arrays;

public class Assignment_32 {
    public static void main(String[] args) {//adding two martrix with Jagged array
        int arr[][]=new int[3][];
        int arr2[][]=new int[3][];
        int sum[][]=new int[3][];

        // The java.lang.Math.random() is used to return a pseudorandom double type number greater than or equal to 0.0 and less than 1.0. The default random number always generated between 0 and 1.

        arr[0]=new int[]{(int)((Math.random() * 100) + 1), (int) ((Math.random() * 100) + 1),(int) ((Math.random() * 100) + 1)};
        arr[1]=new int[]{(int)((Math.random() * 100) + 1), (int) ((Math.random() * 100) + 1)};
        arr[2]=new int[]{(int)((Math.random() * 100) + 1), (int) ((Math.random() * 100) + 1)};

        arr2[0]=new int[]{(int)((Math.random() * 100) + 1), (int) ((Math.random() * 100) + 1),(int) ((Math.random() * 100) + 1),};
        arr2[1]=new int[]{(int)((Math.random() * 100) + 1), (int) ((Math.random() * 100) + 1)};
        arr2[2]=new int[]{(int)((Math.random() * 100) + 1), (int) ((Math.random() * 100) + 1)};

        sum[0]=new int[3];
        sum[1]=new int[2];
        sum[2]=new int[2];

        System.out.println("Matrix of arr: ");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println(" ");
        }
        System.out.println("Matrix of arr1: ");
        for(int i=0;i<arr2.length;i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print(arr2[i][j] + "  ");
            }
            System.out.println(" ");
        }
        System.out.println("Sum of two Jagged arrays: ");
        for(int i=0;i<sum.length;i++) {
            for (int j = 0; j < sum[i].length; j++) {
                sum[i][j] = arr[i][j] + arr2[i][j];
                System.out.print(sum[i][j] + "  ");
            }
            System.out.println(" ");
        }
    }
}
