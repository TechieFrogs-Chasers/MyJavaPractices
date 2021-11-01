public class SubtractMatrices {
    
    public static void main(String[] args) {
        

        int a[][]={{1,3,4},{3,4,5}};  
        int b[][]={{1,3,4},{3,4,5}};  
        
        int[][] c=new int[2][4];  //create new matrix for storing the subtracted matrices

        for (int i=0; i<a.length; i++){
            for( int j=0; j<a[i].length; j++){

              c[i][j] = (a[i][j] -  b[i][j]);  //subtracting the two matrices and storing in c array

                System.out.print(c[i][j]+"  ");
            }
            System.out.println();
        }    
    }
}
