package Arrays;

public class Assignment_1 {
    public static void main(String[] args) {
        int[] ele1={66,55,44,33,22,11};
        int ele2[]=new int[ele1.length];
        for(int i=0;i<ele1.length;i++){
            ele2[i]=ele1[i];
        }
        System.out.println("Elements of ele1 array : ");
        for (int i=0;i<ele1.length;i++){
            System.out.println(ele1[i]);
        }
        System.out.println();

        System.out.println("Elements of ele2 array: ");
        for(int i=0;i< ele2.length;i++){
            System.out.println(ele2[i]);
        }
    }
}
