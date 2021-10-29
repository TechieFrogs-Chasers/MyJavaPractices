public class Multiarray {
    public static void main(String...args){
        int  a[][]={{1,2,3},{3,4,5},{5,6,7}};
        int  b[][]={{1,2,3},{4,5,6},{7,8,9}};
        int c[][]=new int[a.length][b.length];    
         for (int i =0;i<a.length;i++){          //row travesing 
             for ( int j=0;j<b.length;j++){  //column travesing 
             c[i][j]=0;
             for(int k=0;k<3;k++){
                 c[i][j]=a[i][k]*b[i][k];  //matrix multiplication 
             }
             System.out.print(c[i][j]+" "); //printing matrix element 
             }
             System.out.println();//new line 
         }
}    
}
