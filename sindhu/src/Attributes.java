package sindhu.src;

import java.util.Scanner;

public class Attributes{
    

    

    


    public static void main(String[] args)  {
        //BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        //int N = Integer.parseInt(bufferedReader.readLine().trim());
        Scanner input = new Scanner(System.in);
        System.out.println("enter your number");
        int N = input.nextInt();
        
        for(int i=1;i<=N;i++){
            System.out.printf(N*i);
            
        }
        System.out.println();
        input.close();
    }
}
    