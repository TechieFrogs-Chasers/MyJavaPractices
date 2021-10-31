public class Average{

    public static void main(String[] args) {
        
        int[] a = {20,30,50,50,60};
        int size=a.length;
        int total=0;
        int average =0;
        for (int sum : a) {
            total+=sum;
            
        }
        System.out.println("total is  "+total);
        
        average=total/size;
        System.out.println("average of the elements in the array is  "+average);
        
    }
}