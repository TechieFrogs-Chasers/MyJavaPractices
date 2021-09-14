import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
       /* for(;;)
            System.out.println("Invalid" );*/
       /* int i=1;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any number : ");
        int num= sc.nextInt();
        label1:
        do{
            System.out.print(i+" ");
            if(i==6);
            //i++;
            continue;
        } while(i<=num);*/
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter Height :");
        int height = sc.nextInt();
        System.out.println("Enter width :");
        int width = sc.nextInt();
        label1:
        for (int i = 1; i <= height; i++) {
            label2:
            for (int j = 1; j <= width; j++)
                //break label1;
                //continue label1;
            System.out.print("#");
            System.out.println("");
            sc.close();
        }

    }
}
