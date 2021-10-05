package BasicPractices;
public class Gcd {
    public static void main(String[] args) {
        int n1=12, n2=8 ; 
        for(int i = 1; i <= n1 && i <= n2; i++)  
        while(n1!=n2) {
            if(n1 > n2)  
n1=n1-n2;  
else  
n2=n2-n1;  
        }  
        System.out.printf("GCD two numbr is: " +n2); 
    }
    
}
