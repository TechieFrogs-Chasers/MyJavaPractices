package sindhu.src.ArraysAssignment;

public class Thirtynine {
    public static void main(String[] args) {
        
    

    

        int row=2, column=3;
        
        int[][] x = {{1,2,3}, {7,8,9}};

        display(x);

        int[][] transpose = new int[column][row];
        for(int i=0; i<row;i++){

            for(int j=0;j<column;j++){

                transpose[j][i] = x[i][j];


            }
        }

        display(transpose);

       }

       public static void display(int[][] x) {
        System.out.println("The matrix is: ");
        for(int[] row : x) {
            for (int column : row) {
                System.out.print(column + "    ");
            }
            System.out.println();
           

       }

        


    }

    
    
    
}

