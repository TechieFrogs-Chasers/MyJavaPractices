public class Addarray {
    public static void main(String[] args) {
        int a[][]={{1,2},{3,4},{5,1}};
        int b[][]={{5,7},{8,9},{9,10}};
        int c[][]=new int [a.length][2];
        for (int i=0;i<a.length;i++){
            for(int j=0;j<2;j++){
              // c[i][j]=a[i][j]+b[i][j];
                c[i][j]=a[i][j]-b[i][j];
                System.out.print("  "+c[i][j]);
            }
           System.out.println();
        }
    }
    
}
