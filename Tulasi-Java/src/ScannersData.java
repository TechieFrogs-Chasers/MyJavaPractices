import java.math.BigInteger;
import java.util.Scanner;

public class ScannersData {//class
    final static String company;//Static variable
    String address;//instance variable
    String State;
    byte Branches;
    short ParttimeEmployess;
    int FulltimeEmployees;
    BigInteger Turnover;
    float Percentage;
    double Value;

    static {//static initialisation block
        company = "Maxotech";
    }

    public static void main(String[] args) {//main
        ScannersData obj = new ScannersData();//scanners
        Scanner sc = new Scanner(System.in);
        sc.delimiter( );
        System.out.println("Company name: " + company);
        System.out.println("Comapny address: ");
        obj.address = sc.nextLine();
        obj.State= sc.nextLine();
        System.out.println("Number of branches : ");
        obj.Branches = sc.nextByte();
        byte Branches;
        do {
            System.out.println("Number of branches : ");
            while ((!sc.hasNextByte())) {
               byte input = sc.nextByte();
                System.out.println("Only Bytes allowed.Try again: ");
            }
            Branches = sc.nextByte();
        }while (Branches<=0);

        System.out.println("Number of Parttime Employees: ");
        obj.ParttimeEmployess = sc.nextShort();
        System.out.println("Number of Fulltime Employees: ");
        obj.FulltimeEmployees = sc.nextInt();
        System.out.println("Company turnover: ");
        obj.Turnover = sc.nextBigInteger();
        System.out.println("Shares percentage of the company: ");
        obj.Percentage = sc.nextFloat();
        System.out.println("Value of the company: ");
        obj.Value = sc.nextDouble();
        System.out.println("Output: " + sc.findInLine("Maxotech"));
        System.out.println(sc.delimiter());//to check which delimiter we used.If we use usedelimiter() means to change the default delimiter.
        obj.data();//call method
        sc.close();//close scanner
    }

    public void data()//method

    {
        System.out.println( );
        System.out.println("Company name: " + company );
        System.out.println("Company address: " + address );
        System.out.println(State);
        System.out.println("Number of branches : " + Branches);
        System.out.println("Number of Parttime Employees: " + ParttimeEmployess);
        System.out.println("Number of Fulltime Employees: " + FulltimeEmployees);
        System.out.println("Company turnover: " + Turnover);
        System.out.println("Shares percentage of the company: " + Percentage);
        System.out.println("Value of the company: " + Value);
        System.out.println("Logo char letter: " + company.charAt(0));

    }

}

