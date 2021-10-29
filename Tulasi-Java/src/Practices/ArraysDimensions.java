package Practices;


public class ArraysDimensions {
    public static void main(String[] args) {

        int[][] arr = new int[][]{{5, 2, 5},
                                  {3, 3, 2},
                                  {1, 2,3}};
        int[][] arr1 = new int[][]{{6, 3, 3},
                                   {3, 3, 3},
                                   {2, 5, 3}};


        int[][] mul = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                mul[i][j] = 0;
                for (int k = 0; k < 3; k++) {
                    mul[i][j] += arr[i][k] / arr1[k][j];
                  // mul[i][j]+=arr[i][k]*arr1[k][j];
                }
                System.out.print(mul[i][j] + " ");
            }
            System.out.println();
        }

        int[][] jag = new int[3][];//replacing the dimensions with jagged array
        jag[0] = new int[]{3, 5, 6};
        jag[1] = new int[]{9, 6, 3, 56, 4};
        jag[2] = new int[]{9, 4, 3, 4, 6, 7, 4};
        for (int i = 0; i < jag.length; i++) {
            for (int j = 0; j < jag[i].length; j++) {
                System.out.print(jag[i][j] + " ");
            }
            System.out.println();
        }
        String[] str = new String[3];
        String[] str1 = new String[]{"C++", "is", "Hard", "language"};

        System.out.println(arr.getClass());
        System.out.println(str.getClass().getName());
        System.out.println(jag.clone().getClass());

        System.out.println(arr1.getClass().getName());//two dimension array will show with-[[-I means integer.
        //  System.arraycopy(arr,0,arr1,0,3);//we can't apply to multidimensional array


        System.arraycopy(str1, 0, str, 0, 3);
        for (String s : str1) {
            // str1[Integer.parseInt(s)]=str1[Integer.parseInt(s)].replace("C++","Java");
            System.out.print(s + " ");
        }


        int[] num = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};//coping
        int[] num1 = new int[num.length];//coping
        System.arraycopy(num, 1, num1, 1, 8);
        for (int i : num1) {
            System.out.println(i);

        }
        System.out.println();
        //cloning single dimensional array
        int[] arrOld = {5, 6, 7, 8};
        int[] arrNew = arrOld.clone();
        for (int arrs : arrNew) {//for int we can give for(int name),but remaining we must give [] beside datatype
            System.out.println(arrs);
        }
        System.out.println(arrOld == arrNew);

        System.out.println();
        //cloning double dimensional array

        double[][] arrdouble = {{1.3, 5.4, 6.4}, {5.6, 1.2, 1.3}, {6.4, 5.2, 7.2}};
        double[][] arrdo = arrdouble.clone();
        for (double i = 0; i < 3; i++) {
            for (double j = 0; j < 3; j++) {
                System.out.print(arrdo[(int) i][(int) j] + ", ");
            }
            System.out.println();
        }
        System.out.println(arrdouble == arrdo);
    }
}
