package Arrays;

public class Assignment_14 {
    public static void main(String[] args) {
        int[] asc={5,8,1,6,7,9,11,3,88,4};
        int temp=0;
        System.out.println("Before ascending order: ");
        for(int i=0;i<asc.length;i++){
            System.out.println(asc[i]);
        }
        for(int j=0;j<asc.length;j++){
            for (int k=j+1;k<asc.length;k++){
                if(asc[j]>asc[k]){
                    temp=asc[j];
                    asc[j]=asc[k];
                    asc[k]=temp;
                }
            }
        }
        System.out.println("After ascending order :");
        for (int z=0;z<asc.length;z++) {
            System.out.println(asc[z] );
        }
    }
}
