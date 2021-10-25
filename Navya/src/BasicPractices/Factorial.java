package BasicPractices;
public class Factorial {
    public static void main(String[] args) {
        int number = 15;
        long fact = 1;
        int i = 1;
        for(i = 1; i <= number ; i++)
        while(i<=number)
        {
            fact = fact * i;
            i++;
        }
        System.out.println("Factorial of "+number+" is: "+fact);
    }
}
