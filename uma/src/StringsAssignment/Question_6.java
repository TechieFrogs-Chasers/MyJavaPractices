public class Question_6 {
    public static void main(String[] args) {
        
        String str1 = "Hello";
        String str2 = "Java";
        String str3 = "hello";

        System.out.println(str1== str2);   ///   op--false... 
        System.out.println(str1.equals(str2));  //   op--false
        System.out.println(str1.equals(str3)); // op ---false

        String s =new String("Hi");
        String s1 = new String("Hi");
        String s3= new String("hi");
        System.out.println(s);
        System.out.println(s1);
        System.out.println(s.equals(s1));  // op -- true
        System.out.println(s.equals(s3));  // op ---false

    }
    
}
