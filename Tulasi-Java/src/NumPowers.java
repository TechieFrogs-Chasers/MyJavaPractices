import java.util.Scanner;

//public class Samples {
//
//        public static void main(String[] args) {
//            Scanner sc = new Scanner(System.in);
//            System.out.println("How many lines you want :");
//            int table = sc.nextInt();
//            int count = 1;
//            int total = 1;
//            for (count = 1; count <= 10; count++) {
//                total = table * count;
//                System.out.print(count + " * " + table + " = " + total);
//                total = (table + 1) * count;
//                System.out.println ("      " + count + " * " + (table + 1) + " = " + total);
//            }
//        }
//
//    }

public class NumPowers
{
    public static void main(String[] args)
    {
        int numPowersOf2; //How many powers of 2 to compute
        int nextPowerOf2 = 1; //Current power of 2
        int exponent; //Exponent for current power of 2 -- this
        //also serves as a counter for the loop
        Scanner scan = new Scanner(System.in);
        System.out.println("How many powers of 2 would you like printed?");
        numPowersOf2 = scan.nextInt();
        int i = 0;
        int powerof2 = 1;
        //print a message saying how many powers of 2 will be printed
        //initialize exponent -- the first thing printed is 2 to the what?
        while (i<numPowersOf2 )
        {
//testing
            //System.out.println(powerof2);;//print out current power of 2
            System.out.println("2^" + i + "=" + powerof2);;//print out current power of 2
            powerof2 = powerof2 * 2;//find next power of 2 -- how do you get this from the last one?
            i++;//increment exponent

        }
    }
}


