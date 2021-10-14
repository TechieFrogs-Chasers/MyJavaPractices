import java.util.Scanner;

public class TCSNQTProgram2 {
    public static void main(String[] args) {
        int[][] trainee = new int[3][3];
        int[] avgOxygenLevel = new int[3];
        int maxOxyLevel = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 9  Oxygen level values  for 3  trainee for 3 rounds :");
       
        for(int i= 0; i< 3;i++){
            System.out.println("Round "+(i+1));
            for(int j = 0; j<3;j++){
                trainee[i][j] = sc.nextInt();
                if(trainee[i][j] < 0 || trainee[i][j] > 100){  //to check oxygn level between 1 - 100
                    System.out.println("INVALID INPUT");
                }
        }
    }
         sc.close();
    for(int i= 0; i< 3;i++){
        for(int j = 0; j<3;j++){
            avgOxygenLevel[i] += trainee[i][j];
        }
        avgOxygenLevel[i] /= 3;   //avg oxy level of trainee from  all 3  levels
    }

    for(int i= 0; i< 3;i++){
            if(avgOxygenLevel[i] > maxOxyLevel)
               maxOxyLevel = avgOxygenLevel[i];   //max oxy level among the trainees
    }

    for(int i = 0; i< 3;i++){
        if(avgOxygenLevel[i] == maxOxyLevel)
            System.out.println("Trainee Number :"+(i+1));

        if(avgOxygenLevel[i] < 70)
           System.out.println("Trainee Number "+(i+1)+ "unfit");
    }

    }
}
