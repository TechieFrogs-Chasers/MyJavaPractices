package Arrays;

public class MatrixMultiplication {
    public static void main(String[] args) {
        int a[][]={{1,4,3},{2,6,8},{8,3,9}};   //first matrix with 3 columns and 3 rows 
        int b[][]={{2,5,1},{2,6,9},{1,9,5}};   // second matrix with 3 columns and 3 rows
        int c[][]=new int[3][3];  // to store the result     
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                c[i][j]=0;
            for(int k=0;k<3;k++){
                c[i][j]+=a[i][k]*b[k][j];
            }
            System.out.print(c[i][j]+ " ");   //print the Result in c 
        }
        System.out.println(" ");
    }
    
}
}
