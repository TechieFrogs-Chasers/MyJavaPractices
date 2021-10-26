package Strings;//Package

public class Assignment_34 {//Driver class

    public static void main(String[] args) {//main method
        String s1 = "RACECAR";
        String s2 = "ACERACR";
        //  if (s1.length()!=s2.length()){
        //    System.out.println("s2 is not rotating of s1.");
        //   }
        //   else {
        s1 = s1.concat(s1);//+ concat is used with string it act as a concatenation operator
        if (s1.indexOf(s2) != 1) {//-1
            System.out.println("s2 is rotating of s1.");
        } else {
            System.out.println("s2 is not rotating of s1.");
        }
    }
}

