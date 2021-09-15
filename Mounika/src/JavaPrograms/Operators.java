package JavaPrograms;

public class Operators {
    public static void main(String[] args) {

        int i = 50;
        int j =200;
       
        System.out.println(i++);// output is 50 only- 1st print the value then incrent
        System.out.println(++j);// output is 201 incremente and executed the command/ statement j =j+1
        System.out.println(j);
        System.out.println(i--);// output is 51 because in abvoe statement i value increment, that valu printed
        System.out.println(--j);//200 as j is 201, so 201 - 1
        System.out.println(j);
        System.out.println(i++ + ++i);//102
       // System.out.println(j-- - --j);//output is 2, is j=201, 201 - 199
        System.out.println(j);//outpu is 198
int k = 65;
System.out.println(~k);//~ = negotation
/*output is -66, because 65 conveterd to 2's compliment 0001 ~65 is 1110,
 in byte code 1 menas flase so -, 110 value is 66*/
 System.out.println(!true);//! = not
 boolean a = false;
 System.out.println(!a);
    
 //Bitwise operators
 //Logical &&, Bitwise &

 int f = 5;
 int p = 1;
 int n = 3;
 int d = 2;
System.out.println(d<p && f>p); //Logical if 1st condition flase does'nt check the second
System.out.println(f<p & f>p); // Bitwise if 1st condition flase checks second one
System.out.println(f>d && p>d);
System.out.println(p++<d++ & ++d>n);

// Logical || Bitwise |
System.out.println(d<p || f>p);
//logical or - The 1st condition should always true, y because if the 1st condition is false it doesnot second
System.out.println(n>f | f<p);
System.out.println(f>d | p>d);
System.out.println(p++<d++ || ++d>n);//logical and









    }   

}
