import java.util.Scanner;

public class DoWhileloop {
    public static void main(String[] args) {
        int i=1;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any number : ");
        int num= sc.nextInt();
        do{
            System.out.print(i+" ");
            i++;
        } while(i<=num);
    }
}
