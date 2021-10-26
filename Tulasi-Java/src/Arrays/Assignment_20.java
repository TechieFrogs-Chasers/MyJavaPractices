package Arrays;

public class Assignment_20 {
    public static void main(String[] args) {
        int i;
        int[] odd_Even = {1, 6, 5, 8, 3, 4, 9, 7, 12, 11, 35, 48, 49, 10, 88, 44, 55, 22, 66, 33, 77};
        System.out.println("Print even numbers : ");
        for (i = 0; i < odd_Even.length; i++) {
            if (odd_Even[i] % 2 == 0) {
                System.out.print(odd_Even[i] + " ");
            }
        }
        System.out.println();
        System.out.println("Print odd numbers : ");
        for (i=0;i<odd_Even.length;i++){
            if(odd_Even[i]%2!=0){
                System.out.print(odd_Even[i]+ " ");
            }
        }
    }
}
