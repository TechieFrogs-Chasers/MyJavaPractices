public class StringMethods {

    static String name = "lavu";

    public static void main(String[] args) {

    String firstName = "varsha";
    String lastName = "  Lavu";
    String name1= new String();
    String name2 = new String("boppana");
    name1="sri";
   //static String name = "lavu";
  // String s = lastname + name; // can not add one static and one non static
  String s = firstName + lastName;

  String str = "    uma devi";
  String str1= "lavu ramkumar";

 //System.out.println(str.charAt(1));
 System.out.println(str1.codePointAt(1));
 //System.out.println(name1.codePointAt(3));
 System.out.println(s);
 //System.out.println(str.substring(4, 9));
 System.out.println(name1.contains(str));
 System.out.println(str.endsWith("i"));
 System.out.println(str.startsWith("um"));
 System.out.println(str1.indent(0));  //leaves number of spaces  before the "str1" that is specified in the arg
 // and also gap of one line in the terminal
 System.out.println(str);
 System.out.println(name2.intern());
 System.out.println(str.toLowerCase());
 System.out.println(str.substring(3));
 System.out.println(str.length());
 System.out.println(s.compareTo(str));
 System.out.println(s.equalsIgnoreCase(str1));
 System.out.println(s.indexOf('v', 3));
 System.out.println(s.isBlank());
 System.out.println(s.lastIndexOf(str));
 System.out.println(str.replace("uma", "ram"));
 System.out.println(str.strip()); //removes before and after spaces
 System.out.println(s.repeat(2)); //repeats the string value 2 times
 System.out.println(s.matches(str));




    }
}
