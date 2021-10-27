package Practices;

public class LoopDemos {
    /* public static void main(String[] args) {
         int table=12,count=1,total;
         for(count=1;count<=12;count++){
            total= table*count;
             System.out.println(table+" * "+ count+"="+total);
         }
     }*/
    public static void main(String[] args) {
        /*int num = 1, sum = 0, totalNum = 50;
        for (num = 1; num <= totalNum; num = num + 2) {
            System.out.println(num);
            if ((num % 2) == 1) {
                sum = sum + num;
            }
        }
        System.out.println(sum);*/

        int i, j, k;
        int num = 5;
        for (i = 1; i <= num; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
