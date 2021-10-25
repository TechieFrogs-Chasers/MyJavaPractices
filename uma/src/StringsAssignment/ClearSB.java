public class ClearSB {

    public static void main(String[] args) {
        

        StringBuffer sb = new StringBuffer();
        sb.append("uma");
        sb.append(" devi");
        sb.append("  boppana");

        System.out.println("name is : "+sb);

       sb.delete(0, sb.length());
       System.out.println("name is : "+sb);


    }

    
}
