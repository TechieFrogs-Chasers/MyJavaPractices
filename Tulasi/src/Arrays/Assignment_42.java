package Arrays;
import java.util.Arrays;
public class Assignment_42 {
    public static void main(String[] args) {

        char[] ch = {'a', 'e', 'i', 'o', 'u'};
        String str=String.valueOf(ch);
        System.out.println(str);

        String str1="Java is very hard!";
        char[] ch1 = str1.toCharArray();
        System.out.println(Arrays.toString(ch1));

    }
}
