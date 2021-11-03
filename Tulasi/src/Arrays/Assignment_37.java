package Arrays;

public class Assignment_37 {
    public static void main(String[] args) {
        int[][] multiply1=new int[][]{{3,3,3},{2,2,2},{6,6,6}};
        int[][] multiply2=new int[][]{{2,2,2},{3,3,3},{4,4,4}};
        int[][] multiplication=new int[3][3];

        for(int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                multiplication[i][j]=0;
                for(int k=0;k<3;k++){
                    multiplication[i][j]=multiplication[i][j]+(multiply1[i][k]*multiply2[j][k]);//c[i][j]=c[i][j]+(a[i][k]*b[j][k])
                }
                System.out.print(multiplication[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
