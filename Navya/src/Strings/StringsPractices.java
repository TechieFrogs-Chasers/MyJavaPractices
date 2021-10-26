package Strings;

//import java.util.concurrent.ForkJoinWorkerThread;

public class StringsPractices {
    public static void main(String[] args) {
        String name = "     Navya";
        String n1  = new String("Navya");
        System.out.println(name + " " + n1);
        char  ch[] = {'N','a','v','y','a'};
        System.out.println(ch);
        // By equalsTO() method
        String n2 = new String(ch);
        System.out.println(n2);
        System.out.println(name.equals(n1)); //name = "Navya" equalsTo n1 = "Navya" -> true
        System.out.println(name.equals(ch)); // name = "Navya" equalsTo ch = "Navya" -> flase beacuse of char in array
         name = name.concat(" Pasumarthi"); // name = name + " pasumarthi" -> Navya Pasumarthi
        System.out.println(name); // Prints name = Navya Pasumarthi
        System.out.println(name.equals(n1)); // name ="NavyaPasumarthi" EqualsTo n1 = "Navya "
        System.out.println(n1.equals(ch));//n1 = "Navya" equalsTo ch = "Navya" -> flase  because of char in array
        String n3 = "NAVYA";
        System.out.println(n3.equals(n1)); // n3 = "NAVYA" equalsTo n1 = "Navya" -> flase checks case scensetivity
        System.out.println(n3.equalsIgnoreCase(n1)); //n3 = "NAVYA" equalsTo n1 = "Navya" -> ture ignores case senscetivity
        // By == operator
        System.out.println(n1 == n3); // false n1 != n3 and refers the instance
        System.out.println(name == n1);// flase n1 = n3  it refers the instance  location
        // By compareTo( ) meethod;
        System.out.println(n1.compareTo(n3)); // It checks the n1 = "Navya" of acsii code and n3 = "NAVYA" -> N - N = 0 ; a - A = 97 - 65 = 32
        System.err.println(n1.compareToIgnoreCase(n3)); // it ignores the case n1 = n2 so it returns 0
        System.out.println(name.compareToIgnoreCase(n3));//Navya Pasumarthi -> "NAVYA"
        //SubString
        System.out.println(name.substring(5));
        System.out.println(name.substring(0, 5));
        //char  At(0)
        System.out.println(name.charAt(5));
        //Upper case to Lower case
        System.out.println(n3.toLowerCase());
        System.out.println(name.toUpperCase());
        // length of the string
        System.out.println(name.length());
        //string value 
        int a = 87;
        String s = String.valueOf(67);
        System.out.println(s + a);
        // string replace ( ) method ;
        String s1 =name.replace("Pasumarthi" , "chowdary" );
        System.out.println(s1);
        s1 = name.replaceAll("Navya", "Prabha");
        System.out.println(s1);
        s1 = name.replace("Prabha", "Navya");
        System.out.println(s1);
        System.out.println(name.contains("Navya"));
        System.out.println(name.contains("chowdary"));
        System.out.println(name.endsWith("i"));
        System.out.println(name.trim());
        System.out.println(name);
        String w = "Hello TO Splite World";
      //  String[] w1 = w.split(" ", 1);
       /* System.out.println(w);
        System.out.println(w.split(" ", 1));*/
        //format method
        String s3 = String.format("name is %s",n3);
        System.out.println(s3);
        String[] words = w.split("\\s" ,4);
        for(String w1 : words){
          System.out.println(w1);
        }
        System.out.println(name.intern());
        byte[] b = name.getBytes();
        for(int i = 0 ; i < b.length; i++){
          System.out.println(b[i]);
        }
        char ch1[] = new char[6];
      //  name.getChars(0, 8, ch1, 0);
       for(int i = 0 ; i< ch1.length; i++){
         System.out.println(ch1[i]);
       }
       System.out.println(name.isEmpty());
        }
}
