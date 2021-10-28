package sindhu.src.ArraysAssignment;

public class Thirtytwo {

    public static void main(String[] args) {
        
        int x[][] = new int[3][2]; //3 rows 2 colums

        int y[][] = new int [3][2];

        int x1[][] = {{1,2},{2,5},{3,6}};

        int y1[][] = {{1,2},{2,5},{3,6}};

        int z1[][] = new int[3][2];

        for(int i=0; i<3;i++){

            for(int j=0; j<2;j++){

                z1[i][j] = x1[i][j] + y1[i][j];

                System.out.println(z1[i][j]);
            }

            System.out.println();
        }




    }
    
}
