package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Assignment_2 {
    public static void main(String[] args) {
        int num;
        String name;
        byte num1;
        int sum;
        Scanner scannerObj=new Scanner(System.in);
        System.out.println("Enter two number to sum: ");
        num =scannerObj.nextInt();
        num1=scannerObj.nextByte();
        int arr[]={1,6,4,96};

        try {
            sum=num+num1;
            System.out.println("Sum of two numbers : "+ sum);
            System.out.println("Element in array at index 1 is: "+ arr[1]);
            System.out.println("Element in array at index 3 is: "+arr[3]);
            try {//nested try block
                System.out.println("Name of the string: ");
                name=null;
                System.out.println(name.length());

            }
            catch (StringIndexOutOfBoundsException se){
                System.out.println("StringIndexOutOfBoundsException"+se);
            }

        }catch (ArrayIndexOutOfBoundsException ae){
            System.out.println("ArrayIndexOutOfBoundsException"+ ae);
        }
        catch (InputMismatchException ie){
            System.out.println("InputMismatchException "+ie);
        }
        catch (NumberFormatException ne) {
            System.out.println("NumberFormatException " + ne);

        }catch (Exception e){
            System.out.println("Exception ");
        }
        finally {
            System.out.println("Final statement");
            scannerObj.close();
        }
    }
}
