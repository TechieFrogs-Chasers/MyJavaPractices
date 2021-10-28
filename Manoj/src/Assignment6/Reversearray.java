package Assignment6;

public class Reversearray {
    public static void main(String[] args) {
        
    int arr[]={1,2,3,5,8,9};
    for(int i=0;i<arr.length;i++){
        System.out.println("values of an array are: "+ arr[i]);
    }

    for(int i=arr.length-1;i>=0;i--){
        System.out.println("reverse values of array are: "+arr[i]);
    }
    
}
}
