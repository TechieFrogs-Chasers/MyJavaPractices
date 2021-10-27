package Praticenew;
public class prime2{
    public static void main (String...args){
        int num=10;
        int count =0;
        if (num>1){
            for (int i=1; i<=num;i++){ //here it checks the factors of the number 
             if(num%i==0){
                 count++;
             }
            }
        
            if (count==2){
                System.out.println("its a prime number");
            }
            else{
                System.out.println("its not a prime number ");
            }
        }

    }
}