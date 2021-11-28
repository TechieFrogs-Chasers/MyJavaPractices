package Practices;

import java.util.*;

public class AllCoreJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String note = "Hello customer , Please give your details.Your account number ends with 55.";
        Scanner obj1 = new Scanner(note);
        // char obj2= sc.next().charAt(0) ;
        String entrynote = obj1.findInLine("Hello customer");
        String detailsrequest = obj1.findInLine(" your details");
        int accnum1 = Integer.parseInt("55");
        System.out.println(entrynote + " " + detailsrequest + " " + accnum1);
        System.out.println("Enter your Bank name: ");
        String chase = sc.next();
        System.out.println("Enter your account number :");
        long accnum = sc.nextLong();
        System.out.println("Enter your first name: ");
        String firstname = sc.next();
        System.out.println("Enter your last name: ");
        String lastname = sc.next();
        System.out.println("Enter your phone number :");
        long phonenum = sc.nextLong();
        System.out.println("Enter your mail : ");
        String mail = sc.next();
        String address;
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter your address :");
        address = sc1.nextLine();
        StringTokenizer st = new StringTokenizer(address, " ");

        while (st.hasMoreTokens()) {

            System.out.println(st.nextToken());
            sc.close();
          // sc.pin();
        }
       /* public static void main(String[] args) {
        {
            int pinnum = sc.nextInt();
            int attempttimes = 4;
            System.out.println("Enter your pin number: ");
            if (attempttimes == 2) {
                System.out.println("Remained that you have two attempts only ");
            } else if (attempttimes == 3) {
                System.out.println("Warning massage");
            } else System.out.println("Block the account");
        } sc.close();*/
    } }


