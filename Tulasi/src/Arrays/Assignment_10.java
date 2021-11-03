package Arrays;

public class Assignment_10 {
    public static void main(String[] args) {
        int[] less={564,94,133,44,6565,11,26,17,10};
        int min=less[0];
        for(int i=0;i<less.length;i++){
            if(less[i]<min)
                min=less[i];
        }
        System.out.println("smallest number in the given array : "+ min);
    }
}
