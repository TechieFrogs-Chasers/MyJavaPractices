

public class StringPractice {

    
    public static void main(String[] args) {

        String s = "uma";   //   string literal
        String s1 = "uma";
        String s5 = "devi";

        String s2 = new String(); //creates two objects (one inthe heap, one inthe string pool)and 
        //                         a reference  variable that refers to the object in heap

        System.out.println(s+" "+s1+"  "+s2);

        String s3="ram kumar";
        String s4 = "UMA";
        System.out.println(s1.equals(s));  //identical reference variable objects( comparing objects)

          System.out.println( s3.equals(s2));  //compares the value of the string and case sensitive ,returns boolean value
         
          System.out.println(s4.equalsIgnoreCase(s)); //ignores case sensitivity

          System.out.println(s4.toLowerCase());  // brings all the characters to lower case

         System.out.println(s3.startsWith("ram")); // if s3 starts with prefix "ram", it returns true

         System.out.println(s.charAt(0));   // output is "u",displays u from "uma"

         System.out.println(s3.substring(3)); //  prints "kumar"  ...takes first 3 letters from s3(ram kumar)

         System.out.println(s3.length());  // op  is 9(3+1+5)...prints length of the string including space(ram kumar)

         System.out.println(s1.split("boo:and:mooo"));

        

          String k= "Ram";
          k.concat("kumar");
          System.out.println(k);  // prints "Ram"

          k= k.concat("kumar");
          System.out.println(k);  // prints "Ramkumar"
         
        String name = "uma devi";
        String name1 = "Ram kumar";
        String name2 =  "Sri varshitha lavu";
        String name3 = new String("Sri varshitha lavu"); // keyword "new" allocates another instance
        System.out.println(name2 ==name3);  //false ---- checks both value and reference  too
        System.out.println(name ==  name1);

        String str =s1+s5;
        System.out.println(str);
        String str1 = name;
        name=str;
        System.out.println(name+" "+str1);

        StringPractice obj = new StringPractice();
        StringPractice obj1 = obj;
        System.out.println(obj1==obj);

        StringPractice obj2= new StringPractice();
        System.out.println(obj2==obj);
        System.out.println(obj2==obj1);  // comparing references,returns boolean value
        
    }
    
}
