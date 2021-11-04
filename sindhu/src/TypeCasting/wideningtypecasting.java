package TypeCasting;

public class wideningtypecasting {

    public static void main(String[] args) {
        
        int num =10;
        System.out.println("the integer value" +num);

        byte s = 20;

        short x1 = s;
        int x2 = s;
        double x3 = s;

        System.out.println(x1);
        System.out.println(x2);
        System.out.println(x3);

        char ch = 'f';
        int a = ch;
        System.out.println(a); //converting character to integer

       
    

    double x = num; //int to double
    long y = num;
    float z = num;
    System.out.println("double value" +x);
    System.out.println("convert to long" +y);
    System.out.println("convert to float" +z);

    
}
}
