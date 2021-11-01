public class Division {

    public static void main(String[] args) {
        
        int[][] a = new int[][]{{1,2,3},{4,6,9},{8,6,8}};

        int[][] b = new int[][]{{9,8,9},{6,5,4},{3,2,1}};

        int[][] c= new int[3][3];

        for(int i=0; i<a.length; i++){
            

            // System.out.println(a[i][j]);
        
                for(int j=0; j<3; j++){

                 //System.out.println(b[i][j]);
            
                 c[i][j]=0; // new storage

                   for(int k=0; k<3; k++){   // k loop for traversing c

                    c[i][j] += a[i][k] % b[k][j];   // code for multiplication

                   }    //end of k loop

                   System.out.print(c[i][j]+" ");  // printing c elements
                }
                System.out.println();
            
        }
    }
    
}
