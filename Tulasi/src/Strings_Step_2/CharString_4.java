package Strings_Step_2;
//4.WAP to check whether given character is available in the given string or not if character found print its index number too?
public class CharString_4 {
    public static void main(String[] args) {
        String name = "charString";
        System.out.println(name.contains(Character.toString('C')));
        System.out.println(name.contains(Character.toString('S')));

        if (name.contains(Character.toString('S'))) {
            System.out.println(name.indexOf('S'));
        } else {
            System.out.println("Given character is not available in the given string ");
        }

    }
}