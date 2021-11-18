package sindhu.src.ArraysAssignment;



public class Eighteenth {
  
        
        public static void main(String[] args) {
        int temp;
            int b[] = new int[]{12,23,34,45,56,67,78,89,90};
            for(int i=0; i<b.length; i++){
                for(int j=i+1; j<b.length; j++){
                    if (b[i] >b[j]){
                        temp = b[i];
                        b[i] = b[j];
                        b[j] = temp;
                    }
                }
                System.out.println("second smallest element" +b[2]);
            }
        }
    }
            
        
    
    

