package sindhu.src.ArraysAssignment;

public class Twentytwo {

    public static void main(String[] args) {

        int i, j;
        int a[] [] = new int [][]{ {4,5,3}, {8,4,3}, {1,4,3}};

        int b[][]= new int [] [] { {2,2,6}, {1,3,4}, {1,5,1}};

        int c[][] = new int[3] [3];

        for( i=0; i<3; i++){
            for( j=0; j<3; j++){

                c[i][j] = a[i][j] - b[i][j];
                
            }
            
        }

        System.out.println("new matrix is:");
        for( i=0;i<3;i++){

            for( j=0; j<3; j++){
                System.out.println(c[i][j]+ " ");
            }

            System.out.println();

        }
        
    
    }
    
}
