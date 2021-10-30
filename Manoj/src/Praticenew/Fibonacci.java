package Praticenew;

public class Fibonacci {
    public static void main(String[] args) {
        int n1=1,n2=2;
        int sum;

        for (int i=2;i<10;i++){
            sum=n1+n2;
            System.out.println(sum);
            n1=n2;
            n2=sum;
        }
    }
    
}
