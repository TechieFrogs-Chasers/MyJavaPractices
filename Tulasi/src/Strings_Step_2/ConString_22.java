package Strings_Step_2;
//22.WAP to convert string to Integer & Integer to string?
public class ConString_22 {
    public static void main(String[] args) {
        String stringName="100";
       // int result=Integer.valueOf(stringName);
        int result=Integer.parseInt(stringName);
        System.out.println(result);

        int stringName1=55;
      //  String result1=String.valueOf(stringName1);
        String result1=Integer.toString(stringName1);
        System.out.println(result1);
    }
}
