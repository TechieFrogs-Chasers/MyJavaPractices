package InterviewQuestion;
import java.util.Scanner;
public class PrimeNo {
    public static void main(String[] args) {
        PrimeNo obj = new PrimeNo();
        //int count =0;
        //System.out.println("Enter the number: ");
        Scanner scan = new Scanner(System.in);
        int num;
            do{
            System.out.println("Enter the positive number");
             num = scan.nextInt();
            }while(num<=0);
            scan.close();
            obj.prime(num);      
        } 
    void prime(int number){
        int count =0;
        if((number==1)||(number==2)){
            System.out.println("It's a prime no");
        }
         else{
             for(int i=2;i<number;i++){
                 if(number%i==0){
                     count++;
                     break;
                 }
                } if(count==0){
                    System.out.println("It's a Prime: ");
                }else{
                    System.out.println("It's not a Prime no:");
                }

                }
            }
        }        
 
           
        


