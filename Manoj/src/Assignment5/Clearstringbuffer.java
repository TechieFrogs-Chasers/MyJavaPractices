package Assignment5;
public class Clearstringbuffer {
    public static void main (String...args){
        StringBuffer str=new StringBuffer("maonj"); //created a string buffer 
        StringBuffer str2=new StringBuffer();//another string buffer 
        str2.append("java operates"); //added the strings to the string buffer
        str2.append("and executes");
        str2.append("program");
        System.out.println("stringbuffer: "+str2);
        System.out.println("stringbuffer after :" +str2.delete(0, str2.length()));
        System.out.println(str.delete(1,3));
    }
    
}
