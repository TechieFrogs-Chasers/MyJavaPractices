public class Number {
    int i=20;
    int j=30;
    float k=40;
    static int z=100;
    boolean b;
    char a;
    {
        a=11;
    }
    public static void main(String[] args) {
        int i=10;
        System.out.println("hello");
        Number Numberobj=new Number();
        System.out.println(Numberobj.a+"  "+Numberobj.k);
        Number Numberobj1 = new Number();
        System.out.println(Numberobj.b);
        System.out.println(i);
        
        System.out.println(Numberobj.k+"  "+Numberobj.j+" "+i);
        System.out.println(z+"  "+Numberobj.j+"  "+i);
        
        Numberobj1.k=500;
        System.out.println(z+"  "+Numberobj.k+"  "+Numberobj1.k);
    
    }

    
}
    

        
        
        
        
    

    
