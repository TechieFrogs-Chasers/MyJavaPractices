package Assignment_1;

public class UpperHill {
    public static void main(String[] args) {
        int rows=7,k=0;
        for(int i=1;i<=rows;i++,k=0){ //for rows
            for(int j=1;j<=rows-i;j++){
                System.out.print(" "); //space
            }
                while(k!=2*i-1){
                System.out.print("*"); //star
                k++;
                } //for newline
                    System.out.println(" "); 
                
        }     
    }
    
}
