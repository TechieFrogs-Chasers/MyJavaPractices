package sindhu.src.ArraysAssignment;

public class Fourth {
    public static void main(String[] args) {
        
        int arr[] = {1,2,5,5,6,6,7,2};
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1; j<arr.length;j++){

                if((arr[i] == arr[j]) && (i != j)){
                    System.out.println("duplicate element:" +arr[j]);
                }
            }
        }
    }
    
    
}
