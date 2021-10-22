public class Question15 {
    public static void main(String[] args) {
        
        String line = "java";
        String f =line.substring(0, 1);
        String r = line.substring(1, line.length());

        f= f.toUpperCase();
        r=f+r;
        System.out.println(r);


    }
    
}
