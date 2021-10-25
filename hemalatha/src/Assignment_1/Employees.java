package Assignment_1;
import java.util.Scanner;

public class Employees {
    int year;
    String name,address;
    Employees(String name, int year,String address)
    {
        this.name=name;
        this.year=year;
        this.address=address;
        //System.out.println(" Name      Year of joining    Address");

    }
    /*void company(Scanner sc)
    {
        System.out.println("enter the name of employee:");
        this.name = sc.next();
        System.out.println("enter the year of joining:");
        this.year = sc.nextInt();
        System.out.println("enter the address of employee:");
        this.address = sc.next();
    }*/
    void display()
    {
        System.out.println(name+"      "+year+"       "+address);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employees em1 = new Employees("Robert", 1994, "64C-WallStreat");
        //em1.company(sc);
        Employees em2 = new Employees("john", 1999, "26B-WallStreat");
        //em2.company(sc);
        Employees em3 = new Employees("sam", 2000, "64D-WallStreat");
        //em3.company(sc);
        System.out.println(" Name        Year        Address");
        em1.display();
        em2.display();
        em3.display();
        sc.close();
    }
}
    


