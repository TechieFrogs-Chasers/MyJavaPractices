public class EvenAndOdd {
    public static void main(String[] args) {
        int[] a = {12,13,14,15,17,19,34};
        for(int i=0; i<a.length; i++){
            if(a[i]%2==0)
            System.out.println(a[i]+"   is even");
            else
            System.out.println(a[i]+"  is odd");
        }
        
    }
}
