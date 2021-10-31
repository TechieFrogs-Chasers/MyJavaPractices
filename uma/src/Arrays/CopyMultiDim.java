import java.util.Arrays;


public class CopyMultiDim {

    public static void main(String[] args) {
        

        int[][] a={{1,2},{2,3}};
        int[][] b={{9,8},{7,6}};
       
        
        for (int i=0; i<a.length; i++){
            for( int j=0; j<a[i].length; j++){
                System.out.print(a[i][j]+"  ");
            }
            System.out.println();
        }

        b=a;  //shallow copying in multi dimensional arrays
        //only references are copied, new obj is not created in the memory

        for (int i=0; i<b.length; i++){
            for( int j=0; j<b[i].length; j++){
                System.out.print(b[i][j]+"  ");
            }
            System.out.println();
        }

        System.out.println(b==a);   // true
        System.out.println(b.equals(a));   //true




        System.out.println(Arrays.copyOf(a, a.length));
    }
    
}
