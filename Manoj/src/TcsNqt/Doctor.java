package TcsNqt;
import java.util.Scanner;

public class Doctor {
    public static void main (String...args){
        int num;
        int fee=0;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the no of patients: ");
        num=obj.nextInt();

        int arr[]=new int[num];//given array with arr variable name
        System.out.println("enter the patients age: ");
        for (int i=0;i<num;i++){
            arr[i]=obj.nextInt();
        }   

        for (int x:arr){ //here  i use for each looop to store the values in x variable
         
        if (x<17 && x>0){
            fee+=200;    
        }else if (x >17 && x<40){
            fee+=400;
        }else if (x >40){
            fee+=300;
        }else if(x<0 && x>120){
            System.out.println("INVALID");
        }
        }
        System.out.println("total income : " + (fee) +" INR");

        obj.close(); 
}
}


