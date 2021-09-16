public class palindrome {
    public static void main(String[] args) {
      int num = 151;
      int total = 0;
      int temp = num;
      while(num != 0){
          total = total  * 10 + num % 10;
          num = num/10;
          System.out.println( total+" "+temp);
      }
        if(temp == total){
            System.out.println("the give number is palindrome");
        }
        else
        System.out.println("number is not palindrome");  
    }
}
