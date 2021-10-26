public class ArrayPractice{

    public static void main(String[] args) {
        
        //int[] a; // declaration of an array

       // int[] a = new int[]{1,2}; //once declared only ,can not assign values or instantiate
      

       // int b[]; // another way of declaring

       // b = new int[5]; //instantiation
         // b={1,2,3,4,5};  //error

        
        
        int c[] = new int[]{1,2,3,4,5};   //declare,instantitate and assign values

        // c={1,2,3,4,5}; error
        System.out.println(c);
        System.out.println(c[3]);

        int d[] = {10,20,30,40,50};

       
        System.out.println(d[3]);  //prints 40

        for(int i =0; i<d.length; i++){
            System.out.println(d[i]);  //prints all the elements in the array
        }

        int total = 0;
        for(int i =0; i<d.length; i++){
            total +=d[i];
        }
        System.out.println(total);   //prints total of elements in array


        String[] showroom = {"BMW","AUDI","HONDA"};
        System.out.println(showroom[2]);

        showroom[2]= "TESLA";  // replace an element, prints  TESLA instead of HONDA
        System.out.println(showroom[2]);

        showroom[1] = "   ";  // delete/clear an element ,prints empty space
        System.out.println(showroom[1]);


        int[] x = new int[(byte) 10];
        double[] dou = new double[(float) 2.4f]






    }


}