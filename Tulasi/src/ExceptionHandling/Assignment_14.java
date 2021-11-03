package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Assignment_14 {
    public static void main(String[] args) {
        Scanner scannerObj=new Scanner(System.in);
        System.out.println("Enter a array: ");
        int num=scannerObj.nextInt();
        int[] arr= new int[num];
        try {
            System.out.println(arr[10]);
        }
        catch (ArrayIndexOutOfBoundsException ae){
            System.out.println(ae.getMessage());
        }
        catch (InputMismatchException ie){
            System.out.println(ie.getMessage());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Final statement!");
        }
    }
}
