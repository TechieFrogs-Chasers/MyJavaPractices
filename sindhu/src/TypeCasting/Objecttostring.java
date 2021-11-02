package TypeCasting;

/*public class Objecttostring {  

    public static void main(String[] args) {
        
        Objecttostring x = new Objecttostring();
        
        String s = x.toString();
        String s1 = String.valueOf(x);
        System.out.println(s);  //object to string reference id will print

        System.out.println(s1);
    }
    
}*/

//converting stringbuilder to string

public class Objecttostring {

    public static void main(String[] args) {
        
        String s = "sindhuram";

        StringBuilder s1 = new StringBuilder(s);
        s1.reverse();

        String y = s1.toString(); // we can use string.valueof(object)
        System.out.println(s);
        System.out.println("reverse string is" +y);


    }
}

/*public class Objecttostring{  
    public static void main(String args[]){  
    String s="hello";  
    StringBuilder sb=new StringBuilder(s);  
    sb.reverse();  
    String rev=sb.toString();//converting StringBuilder to String  
    System.out.println("String is: "+s);  
    System.out.println("Reverse String is: "+rev);  
    }}  */