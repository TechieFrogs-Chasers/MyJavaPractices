public class Arrays {

  public static void main(String[] args) {
      
    int[] a = new int[5];
        a[0]= 10;
        a[1]=15;
        a[2]=20;
        System.out.println(a); //prints [I@4617c264 
       // System.out.println(a[5]);// throws exception "out of bound"
        System.out.println(a[4]); // value is not assigned, but prints 0,default value of an element in the array is 0
        System.out.println(a[3]); //prints 0
        System.out.println(a[2]); //prints 20
        System.out.println(a.length); //  prints 5 (number of elements in an array) 
       //System.out.println(a[1],a[2]);  //error "println is not applicable for arguments"
       //System.out.println(a[0,1,2]); //   ""          ""
       //System.out.println(a{1,2,});  // inavalid expression
       // System.out.println(int[]);

       // int[] arr = int[]{1,2,3}; // error
       //int[] ar = new[]{1,2,3}; //can not convert from byte[] to int[]

    int[] k = new int[]{1,2,3};
       System.out.println(k[2]);  //prints 3


    double[] doub ={12.3, 45, 6.8f};  //(double is 64bits and 8 bytes), why is it accepting float value ??

        //System.out.println(doub[]); // compile time error "can not be resolved to a type"
        System.out.println(doub); // prints [D@36baf30c
        System.out.println(doub[1]);  //prints 45.0
        System.out.println(doub[2]);   //prints  6.800000190734863  (even though the value assigned is float 6.8f)
        
    double[] d = new double[4];

       // d[0] = []; //Type mismatch: cannot convert from Class<byte[]> to double
       
        d[0] = 12.3;
        d[1] = 45;
        d[2] = 6.8f;
        d[3] =1000000000000000000l;   // long is 64bits and 8 bytes  (double[] accepting long value ????)--type promotion

        System.out.println(d[3]);   // prints 1.0E18

       
    // float[] fl = {34.3,1.2f} ;  // compilation error "type mismatch"  (float 32 bits and 4 bytes)

    //  int[] i = {21,2.0,2f} // compile error "type mismatch"    ( int 32 bits and 4 bytes)


      //byte[] by =  byte[2];
    byte[] b = new byte[2];
         System.out.println(b); //prints [B@5ca881b5

        // b[0]=189; //  error ,not more than 127
        b[1] =4;


    char[] ch = {'A', 68,'!','b',10000,9};

        System.out.println(ch[5]); // prints  ✐ ,ASCII value

    char[] c = new char[3];

       //  c[0]="uma"; error "double quotes for string only"
        c[0] = '9';  // single byte
       // c[1] = '45'; //error "invalid character constant", since it is char ,accepts only single byte

       c[2] = 65;  // ASCII code of  A is 65

       c[3] = 34; //there is no 3rd index in the array(if defined as 3 ,index starts from 0,1,2 only),did not throw compile error

        System.out.println(c[3]); // runtime error ( Index 3 out of bounds for length 3)



        boolean[] boo = new boolean[3];
       
       // boo[2]="true"; // error
       // boo[1]=17; //error
       boo[0] = true;
       boo[1] = false;
       boo[2]= true;


       //int[] inner = new int[]{1,[],2} //can not convert int[][] to int[]






  }
    
}
