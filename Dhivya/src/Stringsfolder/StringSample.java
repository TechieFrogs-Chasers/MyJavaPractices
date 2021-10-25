package Stringsfolder;

public class StringSample {
    

    public static void main(String[] args) {

        String s = "Dhivyas";
        String t = "Dhivyaa";
        System.out.println("r they equal ? : " +(s == t) );
        System.out.println("r they equal ? : " +(s.equals(t)) );

        System.out.println("r they equal ? : " +(s.compareTo(t)) );
        String d = new String("ANUs");
        String d1 = new String("ANUa");
        System.out.println("r they equal ? :"+ (d == d1));
        System.out.println("r they equal ? : " +(d.equals(d1)) );
        System.out.println("r they equal ? : " +(d.compareTo(d1)) );
        String i = "Javat";
        String j = "Java tall";
        System.out.println("r they equal ? : " +(i.compareToIgnoreCase(j)));
        System.out.println("r they equal ? : " +(i.compareTo(j)) );
        int a =22;
        int b = 30;
       


    }
    
}
