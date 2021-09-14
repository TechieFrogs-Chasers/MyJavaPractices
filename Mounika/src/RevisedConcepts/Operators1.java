public class Operators1 {
static int i = 10;
short j= 2;
final byte k= 5;
final static long l= 20;
public static void main(String[] args) {

    Operators1 operators1Obj = new Operators1();
//operators1Obj.j -> not accepts because we need to pass some values like 10th line
    operators1Obj.j=12;// reference of instance variable j
    //operators1Obj.k=5; // getting error because k is final we can't change
   System.out.println(operators1Obj.j>i&&operators1Obj.k<l);
   /*logic && doesn't check 2nd cond if 1st is F. 
   here j value changed in line 10 so 1st cond T 
   o/p is T*/


   int a = 6;
   int b = 10;
   short k= 20;
   System.out.println(a>b&b<k); //bitwise & checks bot cond if 1st is T or F
   System.out.println(a>k||b>a);//logical or dosen't check 2nd cond if 1st is true
   int p= (a<k||b>a)? a:b;// Ternary operator
   System.out.println(p);
    System.out.println(k<operators1Obj.j|a>b); 
    //bitwise or logical operator only for boolean

    //Shift operators

    System.out.println(20<<2);
    // o/p - 80; 20*2^2= 20*4
    System.out.println(10>>3);
    // o/p -1 10/2^3= 10/8 prints Quotient
    System.out.println(10>>3 | 5<<2); // o/p is 21 why// 
    //10100 binary for 1
    //00001 binary for 20 or operation happen b/w 1 binary value and 20 binary value
    //10101 working on bitwise so the value is 21
    //System.out.println(10>>3 || 5<<2);  not accepts because it check for true or false conditions




    
}
}