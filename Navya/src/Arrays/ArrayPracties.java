package Arrays;

//import java.util.Scanner;

public class ArrayPracties {
    public static void main(String[] args) {
    int [] a = {4,7,8,6,2};
    sum(a);
     int j[] = new int[5];
     j[0] = 3;
     j[1] = 4;
     j[2] = 5;
     j[3] = 6;
     j[4] = 5;
     //j = {7,8,9,6,9};
        /* for(int i = 0 ; i < j.length ;i++){
           System.out.print(" " +j[i] );
           
        }
        for (int i = 0 ; i < a.length;i++){
            System.out.print(" "+a[i]);
        } 
        System.out.println();
        for (int i : a) {
            System.out.println(i);
        }
        for (int i  : j) {
        System.out.println(i);
        }
        System.out.println("converting char to integer");
        int n[] = {'A' , 'B', 'F'};
        //System.out.println(n);
        for (int n1 : n) {
            System.out.println(n1);
        }
        System.out.println("converting integer to char");
        char ch[] = {87 , 34, 45};
        for (char ch1  : ch) {
            System.out.println(ch1);
        }
        String name[] = new String[2];
        name[0] = "navya";
        name[1] = "Chowdary";
       // name[2] = "pasumarthi";
        for (String names : name) {
            System.out.println(names);   
        }
        char name1[] = {'a', 'b' ,'c'};
        System.out.println(name1);
        for (char names1 : name1) {
            System.out.print(names1);
        }*/
    }
    static int sum(int arr[]){
        int sum = 0;
        for(int i=1;i<arr.length;i++) 
        sum += arr [i];
         System.out.println(sum);
        return sum;  
    }  
}
