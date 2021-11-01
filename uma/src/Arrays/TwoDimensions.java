public class TwoDimensions {

    public static void main(String[] args) {
        

        int[][] a ={{1,2,3},{2,3,4},{1,2,3}};

    //printing elements with for loop    

        for (int i=0; i<a.length; i++){
            for( int j=0; j<a[i].length; j++){
                System.out.print(a[i][j]+"  ");
            }
            System.out.println();
        }

    }
    
}
