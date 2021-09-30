package Practices;/*public class NewAr {
    public static void main(String[] args) {
        System.out.println("Day details!");
        String day[]={"Morning","Afernoon","Night"};//Array
        String Food[]={"Breakfast","Lunch","Dinner"};
        System.out.println(day[2]);
        int time[]={1,4,6,9,10,12};
        System.out.println(time[5]);
        String i="123";//Convert String to int
        int n= Integer.parseInt(i);
        System.out.println(Integer.parseInt(i)+4);


    }
}*/

import java.util.*;

class NewAr {
    public static void main(String[] args) {
        int[][] Lotterycard = {{22, 46, 80},
                {16, 44, 53},
                {10, 33, 55}};//2D Array
        int[][] Lotterycard1 = new int[3][3];
        Lotterycard1[0][0] = 22;//  row and  column
        Lotterycard1[0][1] = 46;
        Lotterycard1[0][2] = 80;
        Lotterycard1[1][0] = 16;
        Lotterycard1[1][1] = 44;
        Lotterycard1[1][2] = 53;
        Lotterycard1[2][0] = 10;
        Lotterycard1[2][1] = 33;
        Lotterycard1[2][2] = 55;

        System.out.println("--------------------");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(Lotterycard[i][j]);
            }
        }
        for (int k = 0; k < 3; k++) {
            System.out.println(Lotterycard[k]);
        }

    }
}