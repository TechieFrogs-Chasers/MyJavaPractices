public class Debugging{
    public static void main(String[] args) {
        int p=10;
        System.out.println(p++ + p++);
        p++;
        System.out.println(p);
        int t=10;
        System.out.println(++t + t--);
        t++;
        System.out.println(t);
        int r=10;
        System.out.println(r-- + r--);
        r--;
        System.out.println(r);
        int s=10;
        System.out.println(--s + --s);
        s--;
        System.out.println(s);
        
    }
}