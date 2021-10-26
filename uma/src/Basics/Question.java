public class Question {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int j=20;
        int c= (a>b && a<j)? a:b;
        System.out.println(c);
        int d = (a<b || j==b )? a:b;
        System.out.println(d);
        int e = (a<=b)? a:b;
        System.out.println(e);
        int i= (a%b==2)? a:b;
        System.out.println(i);
        int k=(a/b==2)?a:b;
        System.out.println(k);
        


        }
}
