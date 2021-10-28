package BasicsAssignment.NumberPrograms;
import java.util.Scanner;
public class LargestOfThreeNumbers {
    public static void main(String[] args) {
        System.out.println("Enter Three Numbers to find Largest among them");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j = sc.nextInt();
        int k = sc.nextInt();
        //Using if else Ladder
        if((i > j) && (i > k)){
            System.out.println( i + "is the largest Number");

        }
        else if( j > k)
        {
            System.out.println( j + "is the largest Number");
        }
        else{
            System.out.println( k + "is the largest Number");
        }
        //using nested IF Else
        if(i > j)
        {
            if (i > k)
            System.out.println( i + "is the largest Number");
           else 
            System.out.println( k + "is the largest Number");
        }
        else{
            if(j > k)
            System.out.println( j + "is the largest Number" );
            else
            System.out.println( k + "is the largest Number");
        }

        //USing Ternary Operator
       int  result = ((i > j)
                      ? (i > k)
                            ? i
                            : k
                      : (j > k)
                            ? j
                            : k);
        System.out.println("Max of three numbers = "
                           + result);
        sc.close();
    }
    }

