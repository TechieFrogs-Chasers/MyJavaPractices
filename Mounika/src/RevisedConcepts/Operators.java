public class Operators {
    public static void main(String[] args) {
        int a = 10;
        byte b = 20;
        short c = 30;
        //unary operator - only single operand
        System.out.println(a++);//a=a+1
        //post increment o/p 10, ist value printed then incremented
        System.out.println(a);//o/p 11 after incremented the value is 11
        System.out.println(a--);//post decrement//11
        System.out.println(a);//10
        System.out.println(++b);//pre incre
        System.out.println(b);
        System.out.println(--b);//pre decre
        System.out.println(b);
        System.out.println(a+++" "+--c);
        //+ is used as a concatenating not participation in operation
        System.out.println(~a);
//-12 Bitwise compliment, binary of 12, reverse all bits means all 1 to 0's, 0's to 1's and prints the o/p
        
        System.out.println(++a+" "+a--);
        System.out.println(a++ + --c);//39 
        boolean B= false;
        System.out.println(!B);//negation o/p is true
        System.out.println(a);//12
        System.out.println(b);//20
        System.out.println(c);//28

        //Arthematic operators
        System.out.println(a+b+c); 
        // as we are not assigning the values(line 25,26,27) to variables, here values are starting values
        System.out.println(a+b-c);
        System.out.println((a+b)*c);
        System.out.println((a/b)-c);// Quotient
        System.out.println(a%b); //reminder

        //Assignment
             a+=c;
             short d = 15;
             b-=d;
            System.out.println(a);
            System.out.println(b);
           // c= a+b; complie error a is in b is byte
          // c= c+d; both are short but internally 30+15 = 45, int type in this case
          c=(short)(c+d);
          System.out.println(c);

// Comparision
//returns only boolean values
        byte l = 10;
        short p = 5;
        int o = 6;
        System.out.println(l==o);
        System.out.println(l!=o);
        System.out.println(l>o);
        System.out.println(l<p);
        System.out.println(o<=l);
        System.out.println(p>=l);
    }
}
