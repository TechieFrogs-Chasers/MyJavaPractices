//import java.util.Arrays;

public class ConcatArrays {

    public static void main(String[] args) {
        int[] a = {1,2,3};
        int[] b= {4,5,6};

       // int [] add = (int[] a + int[] b);// error

       int a1 =a.length;
       int b1 = b.length;

       int length =  a1+b1;

       System.out.println(length); // only adds lengths,does not add arrays

      /* int[] add1 = new int[length];
       int count=0;

       for (int i  : a){
           i=add1[i];
           count++; 
       } 
           
       for (int j : b) {
       
           j=add1[j];
           count++;  
       }
       System.out.println(Arrays.toString(add1));*/
       


       
    }
    
}
