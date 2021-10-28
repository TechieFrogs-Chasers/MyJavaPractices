package Arrays;

public class Assignment_6 {
    public static void main(String[] args) {
        int[] revNumbers={9,8,7,6,5,4,3,2,1};
        System.out.println("Print numbers");
        for(int i=0;i<revNumbers.length;i++){
            System.out.print(revNumbers[i]+" ");

        }
        System.out.println();
        System.out.println("Reverse order : ");
        for(int i=revNumbers.length-1;i>=0;i-- ){
            System.out.print(revNumbers[i]+" ");
        }
    }
}
