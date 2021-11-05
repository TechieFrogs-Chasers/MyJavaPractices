import java.util.Scanner;

public class TypeCasting {

    public static void main(String[] args) {
        byte b = 12;
        int i = 10;
        char ch = 'A';
        char c = '9';
        int j = 'H';
        long l;
        float f;
        double d = 1222.52;

        

        l = j;// Widening or implicity type converstion happen by compliler
        f = l;

        //byte -> short-> char -> int -> long -> float -> double
        // from lower to upper data types the complier will take care the type casting internally i.e is widening
            System.out.println("Widening :" + f );

            //double -> flaot -> long -> int -> char ->short - >byte
            l = (long)d;
                System.out.println("Narrowing"+l);
                b = (byte)f;
                    System.out.println("Narrowing"+b);
                    // there will be a data loss in this also
                    i = 266;
                    b = (byte)i;
                        System.out.println("Value of b : "+b);
                        Scanner scObj = new Scanner(System.in);
                            System.out.println("Enter any value");
                            i = scObj.nextInt();
                            ch = (char)i;

                                System.out.println("Entered Values - ASCII values is :"+ch);

                                // Type promotion in expression
                                double result = (f*b) + (b/l) - (i*b);

                                    System.out.println("Result : "+ result);

                                    long value = (i+j) * (b*i);

                                        System.out.println("Value : " + value);


                                    // Explict type casting in expression
                                        System.out.println(b);

                                        b = 70;
                                        System.out.println(b);
                                        i = (b * 2); 
                                        // by default an expresion type is integer so here we are do narrowing or explict type casting in expression
                                            System.out.println("Value of b is : " + i);

                                            b = (byte)(b*2);
                                            System.out.println("Value of b is : " + b);
                                            // the value is out is range

                                        
                                        





            
            


    }
    
    
}
