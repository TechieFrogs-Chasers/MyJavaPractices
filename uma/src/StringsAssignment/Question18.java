public class Question18 {
   
    public static void main(String[] args) {
        String str = "welcome";
        int count =0;
        for(int i=0;i<=str.length()-1;i++){
            
        count++;
        System.out.println("Char at "+i+" place "+str.charAt(i));
        }
        System.out.println(count);
    }
}
