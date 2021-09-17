public class IntCharOverload {

    public void display( int n,char c)
     {
        System.out.println("int n: "+n+",  Char c: "+c);
     }

     public void display(char c, int n)
     {
        System.out.println("Char c: "+c+", int n: "+n);
     }
  public static void main(String[] args) {
      
    IntCharOverload intchartObj = new IntCharOverload();
     intchartObj.display(10, 'X');
     intchartObj.display('S', 50);
  }
    
}
