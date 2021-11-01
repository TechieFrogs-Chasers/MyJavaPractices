public class SecondLargest {

    public static void main(String[] args) {
        

        int[] num = {10,20,30,40,50};

        int min=num[0];
        for(int i=0; i<num.length; i++){
           if(num[i]<min)
           min=num[i];
        System.out.println(num[i]+" ");
        }
        
        System.out.println("minimum number is  "+min);
        
    }
    
}
