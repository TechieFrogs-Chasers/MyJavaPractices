public class eachlettercapital {

    public static void main(String[] args) {
        
        String x = "this is javatpoint";

        String[] arr = x.split(" "); //it will store one by one, split after space

        for(int i=0 ; i<arr.length; i++){

            char ch = arr[i].charAt(0); // all first letters stored

           String s1 = String.valueOf(ch).toUpperCase();

            String sub = arr[i].substring(1);

            

            System.out.print(s1+ sub+ " ");
        }


    }
    
}
