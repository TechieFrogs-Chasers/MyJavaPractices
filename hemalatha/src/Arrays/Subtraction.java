package Arrays;

public class Subtraction {
    public static void main(String[] args) {
        //int a[][]={{1,1,3},{2,3,4},{2,5,3}};
        //int b[][]={{2,4,5},{5,6,2},{2,4,1}};
        int a[][]={{1,4},{3,6}};
        int b[][]={{3,2},{6,2}};
        int c[][]=new int[2][2];  //create new array for subtraction 2 rows 2 columns
        //int c[][]=new int[3][3]; 
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
            c[i][j]=a[i][j]-b[i][j];  //subtracting two arrays and assaining to c
            System.out.print(c[i][j]+ " "); //display the subtraction

        }
        System.out.println(" ");
    }
    
}
    
}
