public class MultiDimensional {
    
    public static void main(String[] args) {
        //int arr[] [];
       int  arr[][] = new int [2] [2]; // 2 rows 2 columns 1st dimension always rows
        
       arr [0] [0] = 1;
       arr [1] [0] = 2;
       arr [1] [0] = 3;
       arr [1] [1] = 4;

      // arr[2] [1] = 5;
       // not gives compile gives run time error as out of bound, given array size is 2 2 array 

        System.out.println(arr[1][1]);

        int arr1[][] = {{1,1,1},{2,2,2},{3,3,3}};// {1,1} means 1st row value is 1 second row 1st value is 1
            System.out.println(arr1[2][1]);
            System.out.println(arr1.length);// arr1.legth return the number of rows

        //traverse to each and evry element
        for(int i = 0;i<arr1.length;i++){// for row travensing
            for(int j = 0; j<3; j++){// for colomn traversing
                System.out.print(" "+arr1[i][j]);

            }
            System.out.println();
        }
        //int [][][] arr2 = new int[][][]{{1,2,3},{4,5,4},{5,6,4}}// not accepts
        int [][][] arr2 = new int [4][][];// for 3 dimensional we need to specify the size in 1st dime i. e rows

    }

}
