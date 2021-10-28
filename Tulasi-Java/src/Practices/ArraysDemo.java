package Practices;

public class ArraysDemo {
    public static void main(String[] args) {
        int i;
        //int b[] = new int[3];
        int a[] = {55, 66, 11, 22, 33};
        int b[] = {45, 664, 54655, 44};
        boolean[] n = new boolean[1];
        float[] arr1 = new float[1];
        byte[] arry3 = new byte[1];
        double[] arr2 = new double[1];
        
        for (i = 0; i < a.length; i++) {
            System.out.println(a[i]);

        }
        System.out.println();
        
        for (int j : b) {//for-each- int variablename: array name
            System.out.println(j);
        }
        arrMethod(a);//call method
        arrBoolean(n);
        arrdata(arr1,arry3,arr2);
    }
    //methods
    private static void arrMethod(int[] a) {
        for (int l : a) {
            System.out.println("Method: " + l);
        }
    }
   public static void arrBoolean(boolean[] z){
       boolean[] n = new boolean[1];
       for (boolean c: n ){
            System.out.println("Boolean :" + c);

        }
   }

   public static void arrdata( float[] j,byte [] f,double[] d){

       float[] arr1 = {1.5F,6.5F};
       for (float k:arr1){
            System.out.println("Float " +k);
        }
       byte[] arry3={8};
       for (byte s:arry3){
           System.out.println("Byte "+ s);
       }
       double[] arr2= {9.9,25.1};
       for (double m: arr2){
           System.out.println("double "+m);
       }
   }
}