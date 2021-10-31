public class CheckTheNumber {
    
    public static void main(String[] args) {
        int[] a={20,30,40};
        int j =40;

        for (int check : a) {
           if(check==j)
               System.out.println("given number is in the array");
                    
        }
        
        System.out.println("not in the array");
    }
}
