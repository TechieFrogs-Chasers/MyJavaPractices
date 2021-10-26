import java.time.LocalDate;
import java.time.LocalTime;

public class StringDemo1 {
    public static void main(String...args){
     String s1=new String("manoj bellapukonda "); //1st  way of calling a string by creating an object.
     //String s1="manoj bellapukonda";
     String s2=" Manoj bellapukonda";     //2nd way of calling a string with literal way
     System.out.println(s1);
     System.out.println(s2);

     System.out.println(s1.length());//we using the length method to find the length of the string
     System.out.println(s2.length());

     System.out.println(s1.charAt(16));//we using the charmethod to display the particular char in string by  indexing
     System.out.println(s2.charAt(2));

     System.out.println(s1.concat(s2));//here we are adding two strings by concatination 
     System.out.println(s2.concat(s1));

     s1= s1.concat("java");
     System.out.println(s1);

     System.out.println(s1.equals(s2));//here we using equals method to see the given strings are equall are not
     System.out.println(s1.equalsIgnoreCase(s2));

     System.out.println(s1==s2);//here it checks the values and with references of storage locations

     System.out.println(s1.endsWith(" "));// here endswith checks the given string is particular letter 
     
     
     String str1=String.format("%d",99); //integer 
     String str2=String.format("%30s","manoj"); //string
     String str3=String.format("%.3f", 450.95); //float 
     String str4=String.format("%c",'M'); //char value
     //String str5=String.format("%tc",new Date());
      
      //string.formatted() method 
     //this method is introduced in java 15 for foramtting an instance of the formating string class with supplied arguments
     String str="Date is %tD and time is %tT";
     String formatted=str.formatted(LocalDate.now(),LocalTime.now()); //formatted is introduced in java15 for 
    

     System.out.println(str1);
     System.out.println(str2);
     System.out.println(str3);
     System.out.println(str4);
     System.out.println(String.format("%s",s1)); 
     System.out.println(formatted);

     //java is using the printf() method . this method prints the contents on the standard output stream and does't return anything.

     System.out.printf("Today date is %tD%n",LocalDate.now());

     //System.out.println(s1.reverse()); //this method is not defined for string 



     /*String s3="459";
     int i =Integer.parseInt(s3);
     System.out.println(i);*/
    
     


    }
    
}
