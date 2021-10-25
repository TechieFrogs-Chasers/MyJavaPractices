package InterviewQuestion;
import java.util.Scanner;
public class Trainee {
    public static void main(String[] args) {
        int[] array1 = new int[3];
        int[] array2 = new int[3];
        int[] array3 = new int[3];
        int[] avg = new int[3];
        Scanner sc = new Scanner(System.in);
        int j =0;
        int i =0;
        int k = 0;
        int max = 0;
        System.out.println("Round 1:");
        while(i<array1.length){
            System.out.println("Oxygen value of trainee:" + (i+1));
            array1[i] = sc.nextInt();
            if(array1[i]<1 || array1[i]>101){
                System.out.println("Invalid Input");   
            }
            else   
             i++; 
        }
        System.out.println("Round 2:");
        while(j<array2.length){
            System.out.println("Oxygen value of trainee:" + (j+1));
            array2[j] = sc.nextInt();
            if(array2[j]<1 || array2[j]>101){
                System.out.println("Invalid Input");   
            }
            else   
            j++;
        }
        System.out.println("Round 3:");
        while(k<array3.length){
            System.out.println("Oxygen value of trainee:" + (k+1));
            array3[k] = sc.nextInt();
            if(array3[k]<1 || array3[k]>101){
                System.out.println("Invalid Input");   
            }
            else 
            k++;
        } sc.close();
        for(int a=0;a<3;a++){
             avg[a] = (array1[a]+array2[a]+array3[a])/3;
        }
        for(int b = 0;b<3;b++)
        {
            if(avg[b]>max)
            {
                max= avg[b];
            }     
        }
        for(int x =0;x<3;x++)
        {
            if(avg[x]== max)
            {
                System.out.println("Trainee Number: " +  (x+1) + " is the most fittest one.");
            }
            else if(avg[x]<70)
            System.out.println("Trainee" +(x+1) + " is unfit. "); 
        }                         
    }   
}
