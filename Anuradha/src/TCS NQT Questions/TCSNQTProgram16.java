import java.util.Scanner;

public class TCSNQTProgram16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three words in separate lines:");
        String word1 = sc.nextLine();
        String word2 = sc.nextLine();
        String word3 = sc.nextLine();
        sc.close();

        word1 = word1.toLowerCase();
        word2 = word2.toLowerCase();
        word3 = word3.toUpperCase();

        char[] ch1 = word1.toCharArray();
        char[] ch2 = word2.toCharArray();

        // code for replace the vowels by %
        for (int i = 0; i < ch1.length; i++) {
            if (ch1[i] == 'a' || ch1[i] == 'e' || ch1[i] == 'i' || ch1[i] == 'o' || ch1[i] == 'u') {
                ch1[i] = '%';
            }
            System.out.print(ch1[i]);
        }
       
         // code for replace the constants by #
        for (int i = 0; i < ch2.length; i++) {
            if (!(ch2[i] == 'a' || ch2[i] == 'e' || ch2[i] == 'i' || ch2[i] == 'o' || ch2[i] == 'u')) {
                ch2[i] = '#';
            }
            System.out.print(ch2[i]);
        }
        

        System.out.print(word3);
    }
}