package Arrays;

public class Copy {
    public static void main(String[] args) {
        int arr1[]=new int[]{1,2,3,4,5}; //initialization
        int arr2[]=new int[arr1.length]; //create another array with size of arr1
        for(int i=0;i<arr1.length;i++){
            arr2[i]=arr1[i];  //copying values

        }
        System.out.println("first array elements");  //display first values
        for(int i=0;i<arr1.length;i++){
            System.out.println(arr1[i]+" ");
        }
        System.out.println(" ");
    
        System.out.println("second array elements");  //display second values
        for(int i=0;i<arr2.length;i++){
            System.out.println(arr2[i]+" ");
        }
    }
    
    
}
