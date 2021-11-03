package ExceptionHandling;

import Inheritance.A;

import java.util.Scanner;

public class Assignment_8 {

    public static void main(String[] args)  {
        Scanner scannerObj = new Scanner(System.in);
        System.out.println("Enter the age:");
        int age = scannerObj.nextInt();
        String name=scannerObj.next();
        String address=scannerObj.next();
        method(age);
        stringmethod(name,address);
        try {
            StringIndexOutOfBoundsException sObj=new StringIndexOutOfBoundsException("Exception");
            sObj.initCause(new IllegalArgumentException("This is actual cause of teh exception."));
            throw sObj;
        }catch (StringIndexOutOfBoundsException sObj){
            System.out.println(sObj);
            System.out.println(sObj.getCause());
        }
    }

    public static void method(int age) throws IllegalArgumentException {
        try (Scanner scannerObj = new Scanner(System.in)) {
            if (age < 0) {
                throw new IllegalArgumentException("Age cant be less than 0");
            } else {
                System.out.println("Age is correct");
                scannerObj.close();
            }
        } catch (IllegalArgumentException ie) {
            System.out.println(ie);
        } finally {
            System.out.println("Final statement!");

        }
    }

    public static void stringmethod(String name,String address) throws StringIndexOutOfBoundsException{
        try(Scanner scannerObj=new Scanner(System.in)) {
            method(scannerObj.nextInt());
            System.out.println("Name and adress:" + name+", "+ address);

        }catch (StringIndexOutOfBoundsException se){
            System.out.println(se.getMessage());
        }finally {
            System.out.println("Final Statement!");
        }

    }

}
