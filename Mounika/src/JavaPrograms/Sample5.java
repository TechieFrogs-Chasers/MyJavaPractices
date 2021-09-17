package JavaPrograms;
public class Sample5 

{
int l = 95;
    final int a = 85; // value is a final value, final is a keyword
    final int abc;   //blank final value, not assigned any value
    static final int x;//For constant we use both static and final, 
    //because for static memory allocates only once, final not changle anywhere.
//  naming convention for final is caps letter

static final double PI = 3.14;//constants names shoul be caps
static
{

    x = 8966644;// static intialization blck
}
    {

       abc = 2548; /*static intialization block, where we can give valu for blank final variable
       if we remove this block, we will get error*/
    
    }

    public static void main(String[] args) 
    {
        //System.out.println(l);
        Sample5 Sample5Obj = new Sample5();
        //sample5Obj.a = 56; - not able to change the value "final" keyword int data type value
        System.out.println(Sample5Obj.a);
        //System.out.println(Sample5Obj.a+Sample5Obj.a);
       // System.out.println(Sample5Obj.a+" "+Sample5Obj.a);
       System.out.println(Sample5Obj.abc);
        System.out.println(Sample5Obj.x);
        System.out.println(Sample5Obj.PI);//best to access/call static variable is with class name
        System.out.println(Sample5.PI);
        System.out.println(PI);
    
    
    
    }




}
    
