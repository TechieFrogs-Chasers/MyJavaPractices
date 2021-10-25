public class ConcatArrays {

    public static void main(String[] args) {
        int[] a = {1,2,3};
        int[] b= {4,5,6};

       // int [] add = (int[] a + int[] b);// error

       int a1 =a.length;
       int b1 = b.length;

       int add =  a1+b1;

       System.out.println(add); // only adds lengths,does not add arrays

       int[] add1 = new int[add];
       System.out.println(add1);

       
    }
    
}
