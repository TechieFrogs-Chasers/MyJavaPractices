package sindhu.src.ArraysAssignment;

public class Seventh {
    public static void main(String[] args) {
        
        int[] x = {1,3,5,7,9,2,4,5,6};
        System.out.println("elements of array present in even position");
        for(int i=1; i<x.length; i=i+2){
            System.out.println(x[i]);
        }
    }
    
}
