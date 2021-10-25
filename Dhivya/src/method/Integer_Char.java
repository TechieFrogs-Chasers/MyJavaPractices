package method;

public class Integer_Char {
    public static void main(String[] args) {
        Integer_Char obj = new Integer_Char();
        obj.Display('c', 5);
        obj.Display(60, 'a');
    }
    void Display(int i, char c){
        System.out.println("The Integer and Character: " + i+" ," +c);
    }
    void Display(char c, int i){
        System.err.println("The character and Integer: " + c+" , "+ i);
    }
}
