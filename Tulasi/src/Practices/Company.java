package Practices;

public class Company {
    final static String COMPANY_NAME ;//static variable declarartion
    static final int companycode= 0001;//static variable declaration & initialization
    static
    {
        COMPANY_NAME = "Lenovo";//Static variable initialization using static block
    }
    int empid =111;//instance variable
    String empname = "Bin";//instance variable
    static int emid =113;//static variable
    static String emname = "Tim";//static variable
       public static void main(String[] args){
           int empid =110;//local variable
           String empname = "Leo";//local variable
           System.out.println("Company name"+"=" + Company.COMPANY_NAME);// static campany name print
           System.out.println("Company Code"+"=" + Company.companycode);// static company code print
           System.out.println(empid + "-" + empname); //local variable print
           Company obj=new Company();//insatnce object
           System.out.println(obj.empid +"-"+ obj.empname);//insatnce object print
           System.out.println(Company.emid +"-"+ Company.emname);//static variable print
            }
}


