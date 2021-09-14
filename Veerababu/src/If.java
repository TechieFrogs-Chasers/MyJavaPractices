public class If {
    public static void main(String[] args) {
        int i = 15;
        int j = 16;
        if((i+j)< (i-j)&& (i*j)> (i/j)) {
            System.out.println("i is less than 14");
        }
    else if((i+j)> (i-j) & (i*j)> (i/j)) {
            System.out.println("i is greater than 15");
      }
        else
            System.out.println("Result");
    }
    
}
