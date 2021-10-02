package OopsPractices;

public class MethodsPractices {
   /* int a ;
    int b ;
    int c ;
          MethodsPractices(int i, int j, int k) {
          }
         // MethodsPractices() {
        // }
         int  sum(int i, int j, int k) {
             a = i ;
             b = j ;
             c = k ;
             int v = a + b + c;
             System.out.println("sum of three numbers is "+v);
         return v;
         }
    public static void main(String[] args) {
        int a = 89;
        int b = 9;
        int c = add(a, b);
        MethodsPractices myObj = new MethodsPractices( 67 ,7 ,7);
        myObj.sum(67,7,7);
        MethodsPractices myObj1 = new MethodsPractices(8,9,6);
        myObj1.sum(8,9,6);
     public static int add(int n1 , int n2){
    int s = ( n1 + n2);
    System.out.println("sum = "+s);
    return s;
    }*/
}
class NoVaragrs{
    public int sumNumber(int a, int b){
        return a+b;
    }
    public int sumNumber(int a, int b, int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        NoVaragrs obj = new NoVaragrs();
        System.out.println(obj.sumNumber(4,5));
        System.out.println(obj.sumNumber(5,5,3));
    }
}
