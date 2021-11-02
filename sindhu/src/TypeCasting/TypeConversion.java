package TypeCasting;

public class TypeConversion {

    public static void main(String[] args) {
        
        String s = "200";
        String q = "sindhu";
        int i = Integer.parseInt(s); //string to int

        int i1 = Integer.valueOf(s); //string to int


        System.out.println(i);

        System.out.println(i1+100);

        int a = 10;

        String b = String.valueOf(a); //int to string

        System.out.println(b+20);

        long c = Long.parseLong(s); //string to long
        System.out.println(c);

        long p = 987564l;
        String h = String.valueOf(p); //long to string
        System.out.println(p);

        Double d = Double.parseDouble(s); //string to double
        System.out.println(d);

        char e = s.charAt(1) ; //at one's place
        System.out.println(e);

        char r = q.charAt(3);    //string to char
        System.out.println(r);

        char ch = 's';
        String j = String.valueOf(ch); //character to string
        System.out.println(j);

        String j1 = Character.toString(ch);
        System.out.println(j1);

        String r1 = "sindhuram";
        Object obj = r1;
        System.out.println(obj); //string to object

        



        
    }
    
}
