package BasicAssignment;

public class LargestNumber {
    public static void main(String[] args) {
        int a , b , c;
        a = 8;
        b = 8;
        c = 8;
        if (a > b && a > c){
            System.out.println(a+" It is a largest number");
        }
        else if (b > a && b > c){
            System.out.println(b+ " It is a largest number");
        }
        else if (c > a && c >b){
            System.out.println(c+" It is a largest number");
        }
        else 
        System.out.println("All are equal");
    }
}
