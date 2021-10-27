package Arrays;

public class Duplicate {
    public static void main(String[] args) {
        int arr[]=new int[]{1,4,5,6,2,3,4,2};  //initialization
        System.out.println("duplicate elements in array");
        for(int i=0;i<arr.length;i++){  // search for elements
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j])
                {
                    System.out.println(arr[j]);
                }

            }
        }

    }
    
}
