package Strings_Step_2;
//2.WAP to swap strings using 3rd variable and without using 3rd variable?
public class SwapString_2 {
    public static void main(String[] args) {
    String a="Swap";
    String b="Strings";
        System.out.println("Before swapping-"+"a"+"="+a+" and "+"b"+"="+b);
    String temp=null;
    temp=a;
    a=b;
    b=temp;

        System.out.println("After swap a and b-"+temp);
    String a1="Strings";
    String b1="Swap";
    a1=a1+b1;
    b1=a1.substring(0,a1.length()-b1.length());
    a1=a1.substring(b1.length());
        System.out.println("String after swapping a1 ="+a1+","+"b1="+b1);

    }

}
