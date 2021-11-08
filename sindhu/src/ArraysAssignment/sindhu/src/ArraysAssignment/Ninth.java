package sindhu.src.ArraysAssignment;

public class Ninth {
    public static void main(String[] args) {
        
        int x[] = {25,11,17,68,668,93,100,245};

       // x = new int[]{25,11,17,68,668,93,100,245};
        int max = x[0];
        for(int i=0;i<x.length;i++){

            if(x[i]>max)
            max = x[i];
        }

        System.out.println("largest element present in the given array" +max);
    }
    
}
