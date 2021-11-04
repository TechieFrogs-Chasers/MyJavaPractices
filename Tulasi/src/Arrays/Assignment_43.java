package Arrays;

public class Assignment_43 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        int check=6;
        boolean result=false;
        for(int num:arr){
            if(num==check){
                result=true;
                break;
            }
        }
        System.out.println(result);
    }
}
