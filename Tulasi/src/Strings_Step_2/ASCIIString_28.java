package Strings_Step_2;

//To print respective ASCII values of given string?
public class ASCIIString_28 {
    public static void main(String[] args) {
        String value="JAVA";
        int sum=0;
        for (int i=0;i<value.length();i++){
            int asciiValue=value.charAt(i);
            sum=sum+asciiValue;
            System.out.println("ASCII  value="+sum);
        }
    }
}
