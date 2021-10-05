package OopsPractices;
class overridding {
    void add(int a,int b, long c){
        System.out.println(a+b+c);
        
    }
    void run(){
        System.out.println("vehicle is running");
    }
}
public class Polymorphisam extends overridding{
     void add(int a, int b,long c ){
         long sum = a+b+c;
        System.out.println( "sum is :"+ sum);
    }
    static int sum(int i, int j ,int k){
        return i+j+k;
    }
    void run(){
        System.out.println("bike is running");
    }
    public static void main(String[] args) {
        Polymorphisam obj = new Polymorphisam();
       Polymorphisam.sum(5,6,9);
        //System.out.println(Polymorphisam.add(4,6,9));
        obj.add(6,8,5);
        obj.run();
    }
}
