package Arrays;

import java.util.Scanner;

public class ArrayCreation {
    public static void main(String[] args) {

    float floatArr[] = {10.0f,20.0f,30.0f};
    System.out.println(floatArr);
    System.out.println(floatArr[0]);
    System.out.println(floatArr[2]);


    int[] intArr = new int[5];
    Scanner sc = new Scanner(System.in);

    for(int i = 0;i< intArr.length;i++){
        intArr[i]=sc.nextInt();
    }
    for(int n:intArr){
        System.out.print(n+" ");
    }


String[] str = {"abc","bcd","xyz"};
System.out.println(str.length);
    }
}
