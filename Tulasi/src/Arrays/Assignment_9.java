package Arrays;

public class Assignment_9 {
    public static void main(String[] args) {
        int [] greater={5,9,77,66,88,99,105,456,5412};
        int max=greater[0];
        for(int i=0;i<greater.length;i++){
            if(greater[i]>max)
                max=greater[i];
        }
        System.out.println("Largest element in given array: " + max);
    }
}
