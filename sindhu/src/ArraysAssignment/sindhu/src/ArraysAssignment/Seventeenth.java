package sindhu.src.ArraysAssignment;

import java.util.Arrays;

public class Seventeenth {
    public static void main(String[] args) {
        
        int b[] = new int[]{12,23,34,45,56,67,78,89,90};
        int size = b.length;
        Arrays.sort(b);
        int max = b[size-2];
        System.out.println("second largest" +max );
    }
    
    
}
