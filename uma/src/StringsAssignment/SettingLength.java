public class SettingLength {

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("uma");
        sb.append(" devi");
        sb.append("  boppana");

        System.out.println("name is : "+sb);

      sb.setLength(0);
      System.out.println("name is  :"+sb);
    }
    
}
