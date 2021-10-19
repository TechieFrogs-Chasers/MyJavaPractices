package TcsNqt;
import java.util.Scanner;

public class Trainee {
    public static void main(String...args){
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the 1st round oxygen level of 1 : ");
        int num1=Trainee.validate(obj);
        System.out.println("enter the 1st round oxygen level of 2 : ");
        int num2= Trainee.validate(obj);
        System.out.println("enter the 1st round  oxygen level of 3 : ");
        int num3=Trainee.validate(obj);
        System.out.println("enter the 2nd round oxygen value of 1: ");
        int num1r2=Trainee.validate(obj);
        System.out.println("enter the 2nd round  oxygen value of 2: ");
        int num2r2=Trainee.validate(obj);
        System.out.println("enter the 2nd round oxygen level of 3: ");
        int num3r2=Trainee.validate(obj);
        System.out.println("enter the 3rd round oxygen level of 1: ");
        int num1r3=Trainee.validate(obj);
        System.out.println("enter the 3rd round oxygen level of 2: ");
        int num2r3=Trainee.validate(obj);
        System.out.println("enter the 3rd round oxygen level of 3: ");
        int num3r3=Trainee.validate(obj);
        int Traine1=(num1+num1r2+num1r3)/3;
        int Traine2=(num2+num2r2+num2r3)/3;
        int Traine3=(num3+num3r2+num3r3)/3;
        
        if (Traine1>70){
            System.out.println("Trainee number : 1");
        }else{
            System.out.println("trainee 1 is unfit ");
        }
        if (Traine2>70){
            System.out.println("Trainee number : 2");
        }else{
            System.out.println("Trainee 2 is unfit ");
        }
        if (Traine3>70){
            System.out.println("Trainee number :  3");
        }else{
            System.out.println(" trainee 3 is unfit ");
        }
        if (Traine1>70 && Traine2>70&& Traine3>70){
            System.out.println("all trainers are fit ");
        }else {
            System.out.println("all trainers are unfit");
        }
        obj.close();
        
    }
    static int validate(Scanner obj){//method to validate 
        int num;
        do { // input validation check
            System.out.println("enter the values");
            while(!obj.hasNextInt()){
                System.out.println("this is not a valid one ,please enter a valid one");
                obj.next();
            }num=obj.nextInt();
        }while(num<=0);

        return num;//return type is closed 
    }
    
}
