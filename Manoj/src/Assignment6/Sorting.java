package Assignment6;

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int arr[]={5,10,2,8,9};
        System.out.println("before sorting of elements:"+Arrays.toString(arr));
        int n=arr.length;
        for (int i =0; i<n-1;i++){ //no of passes n-1
            for (int j=0;j<n-1;j++){ //iterations passing throw it 
                if (arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }

            }
        }
        System.out.println("after sorting the elements : "+Arrays.toString(arr));
        
        for (int i=0;i<n-1;i++){
            for (int j=0;j<n-1;j++){
                if(arr[j]<arr[j+1]){
                    int temp2=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp2;

                }
            }
        }
        System.out.println("descending order of the elements : "+Arrays.toString(arr));
    }
    
}
