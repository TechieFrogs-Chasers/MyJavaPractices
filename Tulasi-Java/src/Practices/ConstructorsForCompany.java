package Practices;

import java.util.Scanner;

public class ConstructorsForCompany {//Driver class

    static class company {//Class
    String company;
        company(String org ) {//Default Constructor
            company=org;
            System.out.println("Company Name:" + company);
        }

        void companyId() {//Method
            System.out.println("Enter your company id number:");
        }
    }

    public static void main(String[] args) {//main method

        company myCompanyObj = new company("Lenovo");//obj for company Parameterized Constructor
        details branch=new details("Lenovo-Atlanta");//create obj for class details of String Parameterized Constructor
        branch.dispalyParameter();//call method that used for Parameterized Constructor-String
        details logoobj=new details((char) 76);//create obj for class details of char Parameterized Constructor
        logoobj.dispalyParameter();//call method that used for Parameterized Constructor-char
        details countAndCentersobj=new details(5555, (byte) 99);//create obj for class details of int,byte Parameterized Constructor
        countAndCentersobj.dispalyParameter();//call method that used for Parameterized Constructor-String,byte
        details companyAndIncomeobj=new details("Lenovo", (float) 7.12);//create obj for class details of String,float Parameterized Constructor
        companyAndIncomeobj.dispalyParameter();//call method that used for Parameterized Constructor -String,float
        details companyFullDetailsObj=new details("Lenovo",(char)76,(float)7.12);//create obj for class details of String,char,float Parameterized Constructor
        companyFullDetailsObj.dispalyParameter();//call method that used for Parameterized Constructor -String,char,float
        Scanner myScannerObj = new Scanner(System.in);//Scanner
        myCompanyObj.companyId();//call for companyId method
        int companyId = myScannerObj.nextInt();//input scanner for companyId
        details myDetailObj = new details();//obj for default details constructor
        myDetailObj.employeeDetails();//obj for emplyoeeDetails method
        int employeeDetails = myScannerObj.nextInt();//Input Scanner for employeeDetails
        myScannerObj.close();//Scanner closed
    }

}
