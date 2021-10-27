package Arrays;

public class SumOfAllElements {
    public static void main(String[] args) {
        int a[] = new int[]{1,3,5,3,7,69};
         int sum=0;
         for(int i=0;i<a.length;i++){
             sum=sum+a[i];
         }
         System.out.println("sum of all the elements in array :"+sum);
    }
    
}
