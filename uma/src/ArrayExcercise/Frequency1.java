public class Frequency1 {


    public static void main(String[] args) {
        
        int[] a ={1,2,3,4,3,2,4,5,4};
        findfreq(a);
    }

   static void findfreq(int[] a){
        int[] s= new int [a.length];
        for (int n : a) {
            s[n]++;
         }
        for(int i=0; i<a.length; i++){
            if(s[i] > 0)
            System.out.println("frequency of  element  "+i+ "  is :"+s[i]);
        }


    }
    
}
