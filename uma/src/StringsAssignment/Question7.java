public class Question7 {

    public static void main(String[] args) {
        String s1 =new String("Hi");
        String s2 = new String("  Hi");
        String s3= new String("hi");
        String s4= new String("Hi");

      
        System.out.println(s1==s2);  //false
        System.out.println(s1==s3);  //false
        System.out.println(s2==s3);  //false
        System.out.println(s4==s1);  // false --exactly same but different objects

        s1=s4;
        s2=s3;
        System.out.println(s1==s4); //true
        System.out.println(s2==s3); //true
        
    }
    
}
