

public class CopyIn2D {

    public static void main(String[] args) {
        

        int[][] a={{1,2},{2,3},{4,3}};
        int[][] b={{9,8},{7,6}};
        int[][] c= new int[2][2];
       
        
        for (int i=0; i<a.length; i++){
            for( int j=0; j<a[i].length; j++){
                System.out.print(a[i][j]+"  ");
            }
            System.out.println();
        }

        b=a; //copy to the b array which already has elements

        for (int i=0; i<b.length; i++){
            for( int j=0; j<b[i].length; j++){
                System.out.print(b[i][j]+"  ");
            }
            System.out.println();
        }

        c=a;  //copy into an empty array
        //even if c array is declared with only 2*2 matrix,while copying it added one more row

        for (int i=0; i<c.length; i++){
            for( int j=0; j<c[i].length; j++){
                System.out.print(c[i][j]+"  ");
            }
            System.out.println();
        }



        char[] copyFrom = { 'd', 'e', 'c', 'a', 'f', 'f', 'e', 'i', 'n', 'a', 't', 'e', 'd' };  //source array
          
        char[] copyTo = new char[7];  //declaring a destination array

          
        System.arraycopy(copyFrom, 2, copyTo, 0, 7); //copying array using System.arraycopy() method 
        
        System.out.println(String.valueOf(copyTo));  //printing the destination array 
         
        
    
    }
    
}
