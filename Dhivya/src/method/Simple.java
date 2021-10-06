/*Created super and subclass, using getters and setters assigned value for 
superclass variable and subclass variable. using subclass object called both the methods from
the two classes.
*/
public class Simple {
    public static void main(String[] args) {
        Sub1 newobj = new Sub1();
        newobj.setI(10);
        newobj.setJ(20);
        newobj.PrintNum();   
    }
}
class Super{
    int i;
    public int getI() {
        return this.i;
    }
    public void setI(int i) {
        this.i = i;
    }
    void PrintNum(){
    System.out.println("The value of i is : "+ i);
    }
}
class Sub1 extends Super{
    int j;
    public int getJ() {
        return this.j;
    }
    public void setJ(int j) {
        this.j = j;
    }
    void PrintNum(){
        super.PrintNum();
        System.out.println("The value of j is : " + j);
    }    
}