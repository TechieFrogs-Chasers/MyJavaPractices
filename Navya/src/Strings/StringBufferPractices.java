package Strings;

import java.util.StringTokenizer;

public class StringBufferPractices {
  public static void main(String[] args) {
     StringBuffer str1 = new StringBuffer();
     System.out.println(str1.capacity() + " "+ str1);
     StringBuffer str2 = new StringBuffer('a');
     System.out.println(str2);
     StringBuffer str3 = new StringBuffer(" Hello");
     System.out.println( str3.capacity()); // old capacity is 21
     str3.append(" I am good and i am java from theciFrogs");
     System.out.println(str3);
     str3.ensureCapacity(50); //old capacity 45*2+2
     System.out.println(str3.length()+" "+str3.capacity());
     str3.insert(0, "hii");
     System.out.println(str3);
     str3.reverse();
     System.out.println(str3);
     str3.replace(0, 3, "i am");
     System.out.println(str3);
     str3.delete(0, 3);
     System.out.println(str3);
     StringTokenizer str4 = new StringTokenizer(" hii i am navya");
     //str4.nextToken();
     System.out.println(str4.hasMoreTokens());
     
  }  
}
