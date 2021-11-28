package TypeCasting;

public class narrowingtypecasting {

    public static void main(String[] args) {
        
        double x = 98.2;
        int y = (int) x;
        System.out.println(y);

        float a = (float) x;
        System.out.println(a);


        long b = (long) x;

        System.out.println(b);


        short c = (short) x;

        System.out.println(c);

        byte d = (byte) x;

        System.out.println(d);


        int e = 98;
        char ch = (char) e;
        System.out.println(ch); //converting integer to character

    }
    
}
