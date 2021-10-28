import java.util.Scanner;



public class Pascal {
    public static void main(String[] args) {
        Scanner scObj = new Scanner(System.in);
        int num;
        do{
            System.out.println("Enter Value for num");
            while(!scObj.hasNextInt()){
                String input = scObj.next();
                System.out.println("Enter value for num");
            }
            num = scObj.nextInt();
                for(int i = 1; i<=num;i++){
                    for(int j = 0; j<=(num-i); j++){
                        System.out.print(" ");// for left side spcing
                    }
                    int c =1;
                    for(int k=1;k<=i;k++){
                        System.out.print(c+" ");// the first valuse in a line is always 1
                        c= c*(i-k)/k;
                    }
                    System.out.println();
                }

        }while(num<=0);
}

}
    

