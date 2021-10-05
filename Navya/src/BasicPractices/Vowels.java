package BasicPractices;
public class Vowels {
    public static void main(String[] args) {
        char  ch = 'i';
        switch (ch) {
            case 'a':
                case 'e' :
                case 'i' :
                case 'o' :
                case 'u' :
                System.out.println(ch+ " "+ "is vowel");
                break;
        
            default:
            System.out.println(ch +" is constant");
                break;}
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                    System.out.println(ch+ " " + "is vowels");
             }
             else {
                 System.out.println(ch+ " "+ "is constants");
             }
        
    }
    
}
