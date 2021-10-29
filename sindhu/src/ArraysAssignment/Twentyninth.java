package sindhu.src.ArraysAssignment;

public class Twentyninth {

    public static void main(String[] args) {
        
        int x[][] = new int[3][3];

        int y[][] = new int[3][3];

        int x1[][] = {{1,2,3},{3,4,5},{4,5,6}};

        int y1[][] = {{2,3,4},{4,5,6},{6,7,8}};

        int z1[][] = new int[3][3];

        for(int i=0; i<3;i++){

            for(int j=0;j<3;j++){

                z1[i][j]=0;

                for(int k=0; k<2;k++)
                {
                    z1[i][j] += x1[i][k]* y1[k][j];

                }

               
            }

           
        }

        System.out.println("multiplication of two matrices");
        for(int[] row : z1) {
            for (int column : row) {
                System.out.print(column + "    ");
            }
            System.out.println();


    }


    
}


            }
        
    
