package Arrays;

public class EvenPosition {
    public static void main(String[] args) {
        int a[]=new int[]{1,2,3,4,5,6};
        System.out.println("array elements in even position");
        for(int i=1;i<a.length;i=i+2){
            System.out.print(a[i]+" ");
        }
        System.out.println(" ");
    }
    
}
