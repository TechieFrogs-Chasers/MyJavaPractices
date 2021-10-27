package Assignment6;

public class Largestarray {
    public static void main(String[] args) {
        int arr[]={1,4,8,9,7,1,20,50};
        int max=arr[0];
        for (int i=1;i<arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("maximun element is:" + max);
    }
    
}
