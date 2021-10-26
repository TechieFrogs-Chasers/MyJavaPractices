package Arrays;

public class Assignment_15 {
    public static void main(String[] args) {
        int[] des={15,6,7,8,1,34,666,47,148,12,0,9};
        int temp=0;
        System.out.println("Before descending order :" );
        for (int i=0;i<des.length;i++){
            System.out.println(des[i]);
        }
        for(int j=0;j<des.length;j++){
            for (int k=j+1;k<des.length;k++){
                if(des[j]<des[k]){
                    temp =des[j];
                    des[j]=des[k];
                    des[k]=temp;
                }
            }
        }
        System.out.println("After descending order : ");
        for (int z=0;z<des.length;z++){
            System.out.println(des[z]);
        }
    }
}
