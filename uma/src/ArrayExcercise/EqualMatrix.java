public class EqualMatrix {

    public static void main(String[] args) {
        
        int[][] a = {{4,5,6},{1,2,3},{2,3,4}};
        //int[][] b = {{5,6,7},{6,7,8},{9,8,7}};
        int[][] b = {{4,5,6},{1,2,3},{2,3,4}};
       /* a=b;

        System.out.println(a.equals(b));
        System.out.println(a==b);*/

        for (int i=0; i<a.length; i++){

            for (int j=i+1;j<a.length; j++){
                if(a[i][j]==b[i][j])
                System.out.println("equal");
            }
           
        }
        System.out.println("not equal");    
    }
    
}
