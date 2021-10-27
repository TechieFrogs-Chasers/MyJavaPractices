package Assignment6;

public class Oddorevenarray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8};
        for (int i=0;i<arr.length;i++){
            if (arr[i]%2==0){
                System.out.println("even values are : "+arr[i]);
            }
            if (arr[i]%2!=0){
                System.out.println("odd values are:"+arr[i]);
            }
        }
    }
    
}
