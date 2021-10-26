package Strings;

public class Practice {
    public static void main(String[] args) {
        String s = "java";
        String s1 = new String("Student");
        s1=s1.concat("world");
        //s.concat("program");
        s=s1.concat("program");
        System.out.println(s);
        //System.out.println(s1);
        String s2 = "Student";
        String s3 = "Student";
        String s4 = "Marks";
        String s5 = "Teacher";
        String s6 = "50" + " 60 ";
        String name = "happy birthday to you";
        char ch = name.charAt(4); //chatAt() 
        System.out.println(s1.equals(s2)); //false
        System.out.println(s1.equals(s)); //false
        System.out.println(s1.equals(s2)); //false
        System.out.println(s2.equals(s3)); //true
        System.out.println(s3.equals(s2)); //true
        System.out.println(s4.equals(s3)); //false
        System.out.println(s4.equals(s5)); //false
        System.out.println(s2.equals(s3));   // true (equals() method)
        System.out.println(s2.equalsIgnoreCase(s3));  // true (equalsIgnoreCase() method)
        System.out.println(s2==s3); //true because both refer to same instance (using == operator) 
        System.out.println(s2==s1); //false beacuse s1 refer to other instance created in String constant pool
        System.out.println(s2.compareTo(s3)); //0 because s2==s3 (using compareTo())
        System.out.println(s1.compareTo(s2)); // 5 because s1>s2 (using compareTo())
        System.out.println(s3.compareTo(s1)); //-5 because s3<s1 (using compareTo())
        System.out.println(s6);  //using string concatenation (+)operator
        System.out.println(ch);
        System.out.println(name.contains("happy"));// true [using contains() method]
        System.out.println(name.contains("birthday")); // true [using contains() method]
        System.out.println(name.contains("java"));  // false [using contains() method]
        System.out.println(name.endsWith("you")); // true [using endswith()]
        System.out.println(s1.endsWith("d")); // true [using endswith()]
        String sf1 = String.format("name is %s ",name);
        System.out.println(sf1); // {using format method}
        String str1 = String.format("|%10d|",101);  // Specifying length of integer  
        String str2 = String.format("%d",101);
        String str3 = String.format("| %d|",101);   
        String str4 = String.format("|%010d|",101); // Filling with zeroes 
        String str5 = String.format("|%-10d|",101); // Left-justifying within the specified width
        System.out.println(str1); 
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        System.out.println(str5);
        

    }
    
}
