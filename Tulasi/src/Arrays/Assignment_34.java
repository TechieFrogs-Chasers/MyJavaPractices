package Arrays;

public class Assignment_34 {
    public static void main(String[] args) {
        int[] arr=new int[]{13,72,93,44,55,62,71,28,99};
        int sum =0;
        for(int i=0; i<arr.length; i++){
            sum = sum + arr[i];
        }
        int average=sum/arr.length;
        System.out.println("The average is : "+ average);
    }
}
