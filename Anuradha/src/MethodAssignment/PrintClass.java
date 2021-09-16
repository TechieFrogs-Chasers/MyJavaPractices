public class PrintClass {

   public  void printn(int n)
    {
     System.out.println("int n: "+n);
    }

    public void printn(int n, String s)
    {
        System.out.println("int n: "+n+", String s: "+s);
    }

     public void printn(String s,char c, int n)
     {
        System.out.println("int n: "+n+", String s: "+s+", Char c: "+c);
     }
  public static void main(String[] args) {
      PrintClass printObj = new PrintClass();
      printObj.printn(5);
      printObj.printn(10,"Anu");
      printObj.printn("Radha", 'A', 50);
  }
}
