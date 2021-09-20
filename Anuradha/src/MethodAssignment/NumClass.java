class I{
    int i ;
  public void printNum(){
      System.out.println("The value of I is: "+i);
  }
}

class J extends I{
  int j ;
  public void printNum(){
      super.printNum();
    System.out.println("The value of J is: "+j);
}
}

public class NumClass {
    public static void main(String[] args) {
        J JObj = new J();
        JObj.i = 10;
        JObj.j = 20;
        JObj.printNum();
        
    }
    
}
