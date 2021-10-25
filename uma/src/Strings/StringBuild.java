public class StringBuild {
   

    public static void main(String[] args) {
        
      StringBuilder sb = new StringBuilder();
      System.out.println(sb);
      System.out.println(sb.capacity());
      StringBuilder s = new StringBuilder("Ram");
      s.append("kumar"); // concat made easy
      System.out.println(s);

      sb.append("uma");
      System.out.println(sb);
      System.out.println(sb.isEmpty());//true if sb==0
      System.out.println(sb.capacity()); //16
      System.out.println(sb.subSequence(1, 3));// prints "ma" from "uma"(012 3)
      sb.append(" is learning java ");
      System.out.println(sb.length()+"  "+sb.capacity());//20  34 (16 *2 +2= 34)
      System.out.println(sb.toString());  //prints the whole string

      

    }
    
}
