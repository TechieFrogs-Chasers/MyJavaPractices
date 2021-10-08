package MethodsAssignment;

public class PrintNumber1 {
    void printn(int i ,char c){
        System.out.println(" i = "+ i +" " +" c = "+c);
    }
    void printn(char c , int i){
        System.out.println(" c = "+ c +" " +" i = "+i);
    }
    public static void main(String[] args) {
        PrintNumber1 obj = new PrintNumber1();
        obj.printn(9 , 'd');
        obj.printn('b', 4);
    }
}
