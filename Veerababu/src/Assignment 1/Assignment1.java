import java.util.Scanner;
public class Assignment1 {
    public static void main(String[] args) {
        int i;
        int j;
        i=15;
        j=25;
        System.out.println("Add two integer values" +" "+ (i+j));
   

        Scanner add = new Scanner(System.in);
    System.out.println("Given First Value");
    int l = add.nextInt();
    System.out.println("Givre Second Value");
    int m=add.nextInt();
    add.close();
    
    int k;
    k=l+m;
    System.out.println("Adding of Two Integers is"+" "+k);
        
    }
   
}

