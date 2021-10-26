import java.util.Scanner;

//import java.io.CharArrayReader;

public class ArraysScanner {


    public static void main(String[] args) {
        
        String[] cars = new String[]{"BMW","AUDI"};
        System.out.println(cars[1]);

       // String[] pets = new String[2]{"dogs","123"}; // can not declare dimension when it is alredy initialized

       String[] pets = new String[] {"dogs","123","cats"};

       System.out.println(pets[1]);

       for(int i=0; i<pets.length; i++){
           System.out.println(pets[i]);
       }

       char[] ch = new char[] {'A','B','C',68};
       System.out.println(ch[2]+" "+ch[3]);  // prints C & D (ASCII code of C is 68)

       for(char c=0; c<ch.length; c++){
        System.out.println(ch[c]);  
       }
       

       int[] l = new int[]{12,1000,123456789};

       float[] f = new float[]{12.3f,23.5f,2.3f};

       System.out.println(l[1]+f[1]); // can add two different data types 

       byte[] b = new byte[]{12,13,67,126}; // can not give values morethan 127

       short[] s = new short[] { 9,8,5,10000};
       System.out.println(b[3]+"  "+s[2]);


       // for loop------------------


       int[] age = new int[]{17,21,65,45,32};

       for(int j= age.length-1; j>=0; j--){
           System.out.println(age[j]);  // prints 32,45,65,21,17
       }


        //for each loop ----------------------

        int[] money = new int[]{90,150,500,700};

        int total=0;
        for (int k : money) {
            System.out.println(k);  // prints 90,150,500,700
           total += k;
           System.out.println(total);
            
        }


       // scanner with arrays----------------------------------

        int[] scan = new int[5];

        Scanner sc = new Scanner(System.in);

        

        
        System.out.println("Enter the values");

        for(int i=0; i<scan.length; i++){
            scan[i] = sc.nextInt();

        }
        System.out.println("print the values");

        for(int i=0; i<scan.length; i++){
            
            System.out.println(scan[i]);

            sc.close();

        }
       
    }
    
}
