package MethodsAssignment;

public class PrintNumber {
    void printn(int i){
        System.out.println("i = "+i);
    }
    void printn(long a){
        System.out.println("a = "+a);
    }
    void printn(String name){
        System.out.println("Name = "+name);
    }
    void printn(byte b){
        System.out.println("b = "+b);
    }
    void printn(double k){
        System.out.println("k = "+k);
    }
    public static void main(String[] args) {
        PrintNumber obj = new PrintNumber();
        obj.printn(4);
        obj.printn(93435533456l);
        obj.printn("navya");
        obj.printn(567);
        obj.printn(68.454d);
    }
}
