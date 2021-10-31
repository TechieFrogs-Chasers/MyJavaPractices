//import java.util.Arrays;

public class RemoveDuplicate {

    public static void main(String[] args) {
        
        int[] a = {10,20,50,30,40,10,30,20};
        
        System.out.println("original elements are:");
        for (int original : a) {
            System.out.println(original+" ");
        }

        System.out.println("the duplicate elements are :");
        //int remove=0;
          for (int i=0; i<a.length; i++){
  
              for (int j=i+1;j<a.length; j++){
             if(a[i]==a[j])    
             
              System.out.println(a[i]); //prints duplicate numbers

              
              }

             
              
          }
          
       
          
    }
    
}
