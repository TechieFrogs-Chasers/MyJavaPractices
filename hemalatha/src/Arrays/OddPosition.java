package Arrays;

public class OddPosition {
    public static void main(String[] args) {
        int a[]=new int[]{1,2,3,4,5,6,7};
        System.out.println("elements present in odd position");
        for(int i=0;i<a.length;i=i+2){
            System.out.println(a[i]+" ");
        }
        System.out.println(" ");
    }
    
}
