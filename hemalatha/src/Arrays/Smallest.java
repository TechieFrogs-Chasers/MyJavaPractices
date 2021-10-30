package Arrays;

public class Smallest {
    public static void main(String[] args) {
        int a[] = new int[]{145,83,65,72,53,92};
        int min=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]<min)
            min=a[i];
        }
        System.out.println("largest element in array:" +min);
    }
    
}
    

