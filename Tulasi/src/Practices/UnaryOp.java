package Practices;

public class UnaryOp {
    public static void main(String[] args) {
        int x=234; int y= 20; int b=-245; boolean z=true; boolean a=false;
        int r=-68;
        int u=3;
        //System.out.println(x++);//unary-postfix
        System.out.println(x);
        System.out.println(x++ + ++y);
        //System.out.println(++x);//unary-prefix
        System.out.println(~x);//unary-oppsitie
        System.out.println(x);
        System.out.println(x--);//unary -postfix
        System.out.println(--x);//unary-prefix
        System.out.println(x++ + ++y);
        System.out.println(x-- + --y);
        System.out.println(~x);//unary-oppsitie
        System.out.println(~b);
        System.out.println(!z);//unary-boolean
        System.out.println(!a);
        System.out.println(x+y);//arithmetic
        System.out.println(x-y);//arithmetic
        System.out.println(x*y);//arithmetic
        System.out.println(x/y);//arithmetic
        System.out.println(x%y);//arithmetic
        System.out.println(r<<u);//r*2^u=r*2*2*2=60*2*2*2=480--shift operator-left
        System.out.println(r>>u);//r/2^u=r/2*2*2=60/8=7.5- int =7--shift operator-right
        System.out.println(r>>>u);
        System.out.println(x>y&&x<r);//Bitwise operator --logical &&--If first condition is true,than only it checks next condition.
        System.out.println(x>y&x<b);//Bitwise operator --Bitwise &--It always check both conditions, if first one is true or flase.
        System.out.println(x>y||x<b);//Bitwise operator --logical ||--If one is true ,then it satifies.
        System.out.println(x>y|x<b);//Bitwise operator --Bitwise |--If one is true,than only it checks next condition.
        int i = (++x + ++y);
        System.out.println((x++ + y++)-(i));
    }
}
