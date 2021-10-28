package Assignment6;

public class Positionsarray {
    public static void main(String[] args) {
        int arr[]={10,20,50,60,90,88};
        //for pritning even position values are
         for (int i=0;i<arr.length;i=i+2){
             System.out.println("even position values are :"+arr[i]);
         }
         //for printing odd position values are 
         for (int i=1;i<arr.length;i=i+2){
             System.out.println("odd position values are: "+arr[i]);
         }
    }
    
}
