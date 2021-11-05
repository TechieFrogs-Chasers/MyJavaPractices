package Practices;

import java.util.Scanner;

class Details {
    int iD;
    String name;
    float salary;

    Details(int id, String name, float salary) {
        this.iD = id;
        this.name = name;
        this.salary = salary;
    }

    public Details(Scanner scannerObj) {
    }

    public String toString() {
        return iD + " , " + name + " , " + salary;

    }
}

public class demoToString {
    public static void main(String[] args) {
        Scanner scannerObj = new Scanner(System.in);
        Details obj = new Details(scannerObj.nextInt(),scannerObj.nextLine(), scannerObj.nextFloat());
        System.out.println(obj);
    }
}
