package If;

public class If {
    public static void main(String[] args) {
        int i=10;
        int j=15;
        if((i+j)>(i*i)){
            System.out.println("prin i value"+i);
        }
        else if((i+j)<(i-j)){
            System.out.println("Print j value"+" "+j);
        }
        else if ((i*j)<(i-j)) {
            System.out.println("Print i+j"+" "+(i+j));
        }
        else{
            System.out.println("Invalid");
        }
        
    }
}
