public class StringCapacity {

    public static void main(String[] args) {
        
        StringBuffer cap = new StringBuffer();
        System.out.println(cap);
        System.out.println(cap.capacity());  // default capacity is 16

       // System.out.println(cap.append("Java training"+" "+cap.capacity()));
       StringBuffer sb = new StringBuffer(20);
       System.out.println(sb);
       System.out.println(sb.capacity());  //capacity 20
       sb.append("In Java programming training");
       sb.ensureCapacity(20);
       System.out.println(sb+" "+sb.length()+"  "+sb.capacity()); //length  25 ,capacity 42(old capacity * 2 +2)i.e (20*2)+2=42

      
    }
    
}
