public class TypeCasting {

    public static void main(String[] args) {
        byte b = 12;
        int i = 10;
        char ch = 'A';
        char c = '9';
        int j = 'H';
        long l;
        float f;
        double d = 1222.52;

        l = j;// Widening or implicity type converstion happen by compliler
        f = l;

        //byte -> short-> char -> int -> long -> float -> double
        // from lower to upper data types the complier will take care the type casting internally i.e is widening
            System.out.println("Widening :" + f );

        //double -> flaot -> long -> int -> char ->short - >byte
            l = (long)d;
            System.out.println("Narrowing"+l);
            


    }
    
    
}
