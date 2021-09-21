package Practices;

public class OperatorsDemo {
    public static void main(String[] args) {
        int a=30;// Binary of 30=11110
        int b=20;// Binary of 20=10100
        System.out.println(a+b);//Arithmetic
        System.out.println(a-b);//Arithmetic
        System.out.println(a*b);//Arithmetic
        System.out.println(b/a);//Arithmetic
        System.out.println(a%b);//Arithmetic
        System.out.println(a!=b);//Relational
        System.out.println(a++ + --b);//30+19=49
        System.out.println(a & b);//a=31 -11111,b=19 -10011-->11111
                                                           // 10011
                                                          //---------
                                                         //   10011 =19

        System.out.println(a | b);// a=31 -11111,b=19 -10011-->11111
                                                            // 10011
                                                            //--------
                                                            // 11111 =31

        System.out.println(~a);//a=31 --11111----100000=-32
        System.out.println(a^b);//a=31 -11111,b=19 -10011-->11111
                                                         // 10011
                                                        //--------
                                                       //   01100 =12
        int c=5,d=4;
        System.out.println(c<<d);//c=5,d=4--> 5*2^4=5*2*2*2*2=80
        System.out.println(c>>d);//c=5,d=4--> 5/2^4=5/2*2*2*2=0
        System.out.println(c==a);//Relational

    }
}
