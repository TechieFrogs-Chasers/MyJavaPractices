import java.util.Arrays;

public class Descending {

    public static void main(String[] args) {
        
        int[] a ={34,67,87,54,23};

        Arrays.sort(a);  //sorting the elements
        
        for (int s : a) {
          System.out.print(s+" "); //prints in ascending order  23 34 54 67 87 87
        }
       
        for(int i=a.length-1; i>=0; i--){  //after sorting reverse the order
            
        System.out.println(a[i]+" ");  //prints  87 67 54 34 23
        }
        
    }
    
}
