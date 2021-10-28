import java.util.Scanner;

public class TCSNQTProgram4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a String and key to encrypt");
        String text = sc.nextLine();
        int key = sc.nextInt();
        customCeaserChiper(text,key);
        sc.close();
    }

    public static void  customCeaserChiper(String text, int key){
        char encrptedText[] = text.toCharArray();  //converting string to charArray

        for(int i = 0; i < encrptedText.length;i++)
        {
            encrptedText[i] =(char)(encrptedText[i] + key);//incrementing the characters by key places
        }

        String encryptedText = new String(encrptedText);// converting charArray to string
       System.out.println(encryptedText);

    }
    
}
