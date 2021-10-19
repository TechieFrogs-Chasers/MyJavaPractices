package Practices;//Package

public class Strings {//Driver class

    public static void main(String[] args) {//main method

        String na = "COMPANYS";
        String name = "Companys";//String literals-memory alocated in heap and string constant pool-String is a class-Java.lang.package-all supportable classes,this package is import internally.
        String names = "Company";//String literals
        String nam = new String("company");//String obj-one in the heap and String constant pool and the obj created that obj awlays points to Heap area.
        String nam1 = new String();//String literals
        String n = new String("Company");
        String n1 = na.concat(n);

        if ((n == names) | (na == nam)) {
            System.out.println("String values are same");
        }
        else {
            System.out.println("String values are not same");
        }

        names.concat("names ");
        System.out.println(names.concat(" names "));//new string will created,but reference of name is not changed.(new will created but I it not pointed to new obj)-Concat() method takes only one argument of string and concat it with other string.
        names = names.concat(" name ");//Here new string is pointed to names(newly created string,point to that parituclar obj).
        System.out.println(names + nam);//+ operator can take any number of arguments and concatenates all the strings
        System.out.println(name.equals(names));//different literals-compare only value
        System.out.println(nam.equals(names));//case sensitivity
        System.out.println(n.equals(names));//equals() methods
        System.out.println(names.equalsIgnoreCase(nam));//equalIgnoreCase() methods
        System.out.println(na == name);//same literals
        System.out.println(n == names);//compare value and reference(literals and new obj)
        System.out.println(nam1.compareTo(n));//line-8
        System.out.println(nam1);//line-11
        System.out.println(nam);//line-9
        System.out.println(name);
        System.out.println(n1);//na+n
        System.out.println(na.toLowerCase());//Convert uppercase to lowercase-lowercase() and uppercase() methods
        System.out.println(nam.toUpperCase());//Convert lowercase to uppercase
        System.out.println(n.startsWith("C"));//starting letter in string-startswith() & endswith() methods
        System.out.println(n.endsWith("S"));//ending letter in string
        System.out.println(nam.length());//length of the string-length() method
        System.out.println(na.charAt(2));//charAt() returns a character at specified index-charAt() method
        System.out.println(n);
        System.out.println(names);
        System.out.println(n.compareTo(names));
    }

}
