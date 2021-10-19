public class StringDemo1 {
    public static void main(String...args){
     String s1=new String("manoj bellapukonda "); //1st  way of calling a string by creating an object.
     String s2="Manoj bellapukonda ";     //2nd way of calling a string with literal way
     System.out.println(s1);
     System.out.println(s2);

     System.out.println(s1.length());//we using the length method to find the length of the string
     System.out.println(s2.length());

     System.out.println(s1.charAt(16));//we using the charmethod to display the particular char in string by  indexing
     System.out.println(s2.charAt(2));

     System.out.println(s1.concat(s2));//here we are adding two strings by concatination 
     System.out.println(s2.concat(s1));

     System.out.println(s1.equals(s2));//here we using equals method to see the given strings are equall are not
     System.out.println(s1.equalsIgnoreCase(s2));

     System.out.println(s1==s2);//here it checks the values and with references of storage locations

    }
    
}
