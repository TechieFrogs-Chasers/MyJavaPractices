package Constructs;

public class DefaultParameter {
    String name;
    char Character;
    int a;
    int b;

    
        public static void main(String[] args)
        {
        DefaultParameter defaultParameter = new DefaultParameter();
            System.out.println("1. In Default Constructor"+" "+defaultParameter.a+" "+defaultParameter.b);

        DefaultParameter defaultParameter1 = new DefaultParameter(10,10);
        System.out.println("2. In Default Constructor"+" "+defaultParameter1.a+" "+defaultParameter1.b);

        DefaultParameter defaultParameter2 = new DefaultParameter(15,25,'A');
        System.out.println("3. In Default Constructor"+" "+defaultParameter2.a+" "+defaultParameter2.b+" "+defaultParameter2.Character);
        
        DefaultParameter defaultParameter3 = new DefaultParameter(20,20,'B');
        System.out.println("4. In Default Constructor"+" "+defaultParameter3.a+" "+defaultParameter3.b+" "+defaultParameter3.Character);
        }
        DefaultParameter()
        {
            a=5;
            b=6;
            System.out.println("Default Parameter");
        }
    
        DefaultParameter(int x, int y)
        {
            a=x;
            b=y;
        }

        DefaultParameter(int i, int j, char c)
        {
            a=i;
            b=j;
            Character=c;
            System.out.println("Integers and Characters in Constructor");
        }
        
}
