package Arrays;

public class Largest {
    public static void main(String[] args) {
        int a[] = new int[]{145,83,65,72,53,92};
        int max=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]>max)
            max=a[i];
        }
        System.out.println("largest element in array:" +max);
    }
    
}
