public class reverse {
    public static void main(String[] args) {
        
        String x = " sindhu ram";
        char[] ch = x.toCharArray();

        /*for(int i=0; i<x.length();i++){

            System.out.println(x.charAt(x.length()-i-1));
        }*/

        for(int i=ch.length-1; i>=0; i--){
            System.out.println(ch[i]);

            


        }
    }

    
    
}
